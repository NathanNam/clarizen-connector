/**
 * Mule Clarizen Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

package org.mule.modules.clarizen.api;

import java.util.Date;
import java.util.Locale;
import java.util.Calendar;
import java.util.TimeZone;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParsePosition;

import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.converters.AbstractConverter;

public class ClarizenDateConverter extends AbstractConverter {

        private String[] patterns;
        private String displayPatterns;
        private Locale locale;
        private TimeZone timeZone;
        private boolean useLocaleFormat;

        public String getDisplayPatterns() {
            return displayPatterns;
        }

        public Locale getLocale() {
            return locale;
        }

        public TimeZone getTimeZone() {
            return timeZone;
        }

        public boolean isUseLocaleFormat() {
            return useLocaleFormat;
        }

        public void setDisplayPatterns(String displayPatterns) {
            this.displayPatterns = displayPatterns;
        }

        public void setLocale(Locale locale) {
            this.locale = locale;
        }

        public void setTimeZone(TimeZone timeZone) {
            this.timeZone = timeZone;
        }

        public void setUseLocaleFormat(boolean useLocaleFormat) {
            this.useLocaleFormat = useLocaleFormat;
        }

        /**
         * 
         */
        public ClarizenDateConverter() {
            super();
        }

        /**
         *
         */
        public ClarizenDateConverter(Object defaultValue) {
            super(defaultValue);
        }

        /**
         * Set a date format pattern to use to convert
         * dates to/from a <code>java.lang.String</code>.
         *
         * @see SimpleDateFormat
         * @param pattern The format pattern.
         */
        public void setPattern(String pattern) {
            setPatterns(new String[] {pattern});
        }

        /**
         * Return the date format patterns used to convert
         * dates to/from a <code>java.lang.String</code>
         * (or <code>null</code> if none specified).
         *
         * @see SimpleDateFormat
         * @return Array of format patterns.
         */
        public String[] getPatterns() {
            return patterns; 
        }

        /**
         * Set the date format patterns to use to convert
         * dates to/from a <code>java.lang.String</code>.
         *
         * @see SimpleDateFormat
         * @param patterns Array of format patterns.
         */
        public void setPatterns(String[] patterns) {
            this.patterns = patterns;
            if (patterns != null && patterns.length > 1) {
                StringBuffer buffer = new StringBuffer();
                for (int i = 0; i < patterns.length; i++) {
                    if (i > 0) {
                        buffer.append(", ");
                    }
                    buffer.append(patterns[i]);
                }
                displayPatterns = buffer.toString();
            }
        }

        /**
         *
         */
        protected String convertToString(Object value) throws Throwable {

            return value.toString();
        }

        /**
         * Convert the input object into a Date object of the
         * specified type.
         * <p>
         * This method handles conversions between the following
         * types:
         * <ul>
         *     <li><code>javax.xml.datatype.XMLGregorianCalendar</code></li>
         *     <li><code>java.util.Date</code></li>
         *     <li><code>java.util.Calendar</code></li>
         *     <li><code>java.sql.Date</code></li>
         *     <li><code>java.sql.Time</code></li>
         *     <li><code>java.sql.Timestamp</code></li>
         * </ul>
         *
         * It also handles conversion from a <code>String</code> to
         * any of the above types.
         * <p>
         *
         * For <code>String</code> conversion, if the converter has been configured
         * with one or more patterns (using <code>setPatterns()</code>), then
         * the conversion is attempted with each of the specified patterns.
         * Otherwise the default <code>DateFormat</code> for the default locale
         * (and <i>style</i> if configured) will be used.
         *
         * @param targetType Data type to which this value should be converted.
         * @param value The input value to be converted.
         * @return The converted value.
         * @throws Exception if conversion cannot be performed successfully
         */
        @SuppressWarnings("rawtypes")
        protected Object convertToType(Class targetType, Object value) throws Exception {

            Class sourceType = value.getClass();

            // For XMLGregorianCalendar
            if (value instanceof XMLGregorianCalendar) {
                XMLGregorianCalendar gregorianCalendar = (XMLGregorianCalendar) value;
                return toDate(targetType, gregorianCalendar.toGregorianCalendar().getTime().getTime());
            }
            
            // Handle java.sql.Timestamp
            if (value instanceof java.sql.Timestamp) {

                // ---------------------- JDK 1.3 Fix ----------------------
                // N.B. Prior to JDK 1.4 the Timestamp's getTime() method
                //      didn't include the milliseconds. The following code
                //      ensures it works consistently accross JDK versions
                java.sql.Timestamp timestamp = (java.sql.Timestamp)value;
                long timeInMillis = ((timestamp.getTime() / 1000) * 1000);
                timeInMillis += timestamp.getNanos() / 1000000;
                // ---------------------- JDK 1.3 Fix ----------------------
                return toDate(targetType, timeInMillis);
            }

            // Handle Date (includes java.sql.Date & java.sql.Time)
            if (value instanceof Date) {
                Date date = (Date)value;
                return toDate(targetType, date.getTime());
            }

            // Handle Calendar
            if (value instanceof Calendar) {
                Calendar calendar = (Calendar)value;
                return toDate(targetType, calendar.getTime().getTime());
            }

            // Handle Long
            if (value instanceof Long) {
                Long longObj = (Long)value;
                return toDate(targetType, longObj.longValue());
            }

            // Convert all other types to String & handle
            String stringValue = value.toString().trim();
            if (stringValue.length() == 0) {
                return handleMissing(targetType);
            }

            // Parse the Date/Time
            if (useLocaleFormat) {
                Calendar calendar = null;
                if (patterns != null && patterns.length > 0) {
                    calendar = parse(sourceType, targetType, stringValue);
                } else {
                    DateFormat format = getFormat(locale, timeZone);
                    calendar = parse(sourceType, targetType, stringValue, format);
                }
                if (Calendar.class.isAssignableFrom(targetType)) {
                    return calendar;
                } else {
                    return toDate(targetType, calendar.getTime().getTime());
                }
            }

            // Default String conversion
            return toDate(targetType, stringValue);

        }

        /**
         * Convert a long value to the specified Date type for this
         * <i>Converter</i>.
         * <p>
         *
         * This method handles conversion to the following types:
         * <ul>
         *     <li><code>java.util.Date</code></li>
         *     <li><code>java.util.Calendar</code></li>
         *     <li><code>java.sql.Date</code></li>
         *     <li><code>java.sql.Time</code></li>
         *     <li><code>java.sql.Timestamp</code></li>
         * </ul>
         *
         * @param type The Date type to convert to
         * @param value The long value to convert.
         * @return The converted date value.
         */
        @SuppressWarnings("rawtypes")
        private Object toDate(Class type, long value) {

            // java.util.Date
            if (type.equals(Date.class)) {
                return new Date(value);
            }

            // java.sql.Date
            if (type.equals(java.sql.Date.class)) {
                return new java.sql.Date(value);
            }

            // java.sql.Time
            if (type.equals(java.sql.Time.class)) {
                return new java.sql.Time(value);
            }

            // java.sql.Timestamp
            if (type.equals(java.sql.Timestamp.class)) {
                return new java.sql.Timestamp(value);
            }

            // java.util.Calendar
            if (type.equals(Calendar.class)) {
                Calendar calendar = null;
                if (locale == null && timeZone == null) {
                    calendar = Calendar.getInstance();
                } else if (locale == null) {
                    calendar = Calendar.getInstance(timeZone);
                } else if (timeZone == null) {
                    calendar = Calendar.getInstance(locale);
                } else {
                    calendar = Calendar.getInstance(timeZone, locale);
                }
                calendar.setTime(new Date(value));
                calendar.setLenient(false);
                return calendar;
            }

            String msg = classToString(getClass()) + " cannot handle conversion to '"
                       + classToString(type) + "'";
            throw new ConversionException(msg);
        }

        /**
         * Default String to Date conversion.
         * <p>
         * This method handles conversion from a String to the following types:
         * <ul>
         *     <li><code>java.sql.Date</code></li>
         *     <li><code>java.sql.Time</code></li>
         *     <li><code>java.sql.Timestamp</code></li>
         * </ul>
         * <p>
         * <strong>N.B.</strong> No default String conversion
         * mechanism is provided for <code>java.util.Date</code>
         * and <code>java.util.Calendar</code> type.
         *
         * @param type The Number type to convert to
         * @param value The String value to convert.
         * @return The converted Number value.
         */
        @SuppressWarnings("rawtypes")
        private Object toDate(Class type, String value) {
            // java.sql.Date
            if (type.equals(java.sql.Date.class)) {
                try {
                    return java.sql.Date.valueOf(value);
                } catch (IllegalArgumentException e) {
                    throw new ConversionException(
                            "String must be in JDBC format [yyyy-MM-dd] to create a java.sql.Date");
                }
            }

            // java.sql.Time
            if (type.equals(java.sql.Time.class)) {
                try {
                    return java.sql.Time.valueOf(value);
                } catch (IllegalArgumentException e) {
                    throw new ConversionException(
                            "String must be in JDBC format [HH:mm:ss] to create a java.sql.Time");
                }
            }

            // java.sql.Timestamp
            if (type.equals(java.sql.Timestamp.class)) {
                try {
                    return java.sql.Timestamp.valueOf(value);
                } catch (IllegalArgumentException e) {
                    throw new ConversionException(
                            "String must be in JDBC format [yyyy-MM-dd HH:mm:ss.fffffffff] " +
                            "to create a java.sql.Timestamp");
                }
            }

            String msg = classToString(getClass()) + " does not support default String to '"
                       + classToString(type) + "' conversion.";
            throw new ConversionException(msg);
        }

        /**
         * Return a <code>DateFormat<code> for the Locale.
         * @param locale The Locale to create the Format with (may be null)
         * @param timeZone The Time Zone create the Format with (may be null)
         *
         * @return A Date Format.
         */
        protected DateFormat getFormat(Locale locale, TimeZone timeZone) {
            DateFormat format = null;
            if (locale == null) {
                format = DateFormat.getDateInstance(DateFormat.SHORT);
            } else {
                format = DateFormat.getDateInstance(DateFormat.SHORT, locale);
            }
            if (timeZone != null) {
                format.setTimeZone(timeZone);
            }
            return format;
        }

        /**
         * Create a date format for the specified pattern.
         *
         * @param pattern The date pattern
         * @return The DateFormat
         */
        private DateFormat getFormat(String pattern) {
            DateFormat format = new SimpleDateFormat(pattern);
            if (timeZone != null) {
                format.setTimeZone(timeZone);
            }
            return format;
        }

        /**
         * Parse a String date value using the set of patterns.
         *
         * @param sourceType The type of the value being converted
         * @param targetType The type to convert the value to.
         * @param value The String date value.
         *
         * @return The converted Date object.
         * @throws Exception if an error occurs parsing the date.
         */
        @SuppressWarnings("rawtypes")
        private Calendar parse(Class sourceType, Class targetType, String value) throws Exception {
            Exception firstEx = null;
            for (int i = 0; i < patterns.length; i++) {
                try {
                    DateFormat format = getFormat(patterns[i]);
                    Calendar calendar = parse(sourceType, targetType, value, format);
                    return calendar;
                } catch (Exception ex) {
                    if (firstEx == null) {
                        firstEx = ex;
                    }
                }
            }
            if (patterns.length > 1) {
                throw new ConversionException("Error converting '" + classToString(sourceType) + "' to '" + classToString(targetType)
                        + "' using  patterns '" + displayPatterns + "'");
            } else {
                throw firstEx;
            }
        }

        /**
         * Parse a String into a <code>Calendar</code> object
         * using the specified <code>DateFormat</code>.
         *
         * @param sourceType The type of the value being converted
         * @param targetType The type to convert the value to
         * @param value The String date value.
         * @param format The DateFormat to parse the String value.
         *
         * @return The converted Calendar object.
         * @throws ConversionException if the String cannot be converted.
         */
        @SuppressWarnings("rawtypes")
        private Calendar parse(Class sourceType, Class targetType, String value, DateFormat format) {
            format.setLenient(false);
            ParsePosition pos = new ParsePosition(0);
            Date parsedDate = format.parse(value, pos); // ignore the result (use the Calendar)
            if (pos.getErrorIndex() >= 0 || pos.getIndex() != value.length() || parsedDate == null) {
                String msg = "Error converting '" + classToString(sourceType) + "' to '" + classToString(targetType) + "'";
                if (format instanceof SimpleDateFormat) {
                    msg += " using pattern '" + ((SimpleDateFormat)format).toPattern() + "'";
                }
                throw new ConversionException(msg);
            }
            Calendar calendar = format.getCalendar();
            return calendar;
        }

        /**
         * Provide a String representation of this date/time converter.
         *
         * @return A String representation of this date/time converter
         */
        public String toString() {
            StringBuffer buffer = new StringBuffer();
            buffer.append(classToString(getClass()));
            buffer.append("[UseDefault=");
            buffer.append(isUseDefault());
            buffer.append(", UseLocaleFormat=");
            buffer.append(useLocaleFormat);
            if (displayPatterns != null) {
                buffer.append(", Patterns={");
                buffer.append(displayPatterns);
                buffer.append('}');
            }
            if (locale != null) {
                buffer.append(", Locale=");
                buffer.append(locale);
            }
            if (timeZone != null) {
                buffer.append(", TimeZone=");
                buffer.append(timeZone);
            }
            buffer.append(']');
            return buffer.toString();
        }

        @Override
        protected Class<?> getDefaultType() {
            return XMLGregorianCalendar.class;
        }
        
        /**
         * Provide a String representation of a <code>java.lang.Class</code>.
         * @param type The <code>java.lang.Class</code>.
         * @return The String representation.
         */
        @SuppressWarnings("rawtypes")
        public String classToString(Class type) {
            String typeName = null;
            if (type == null) {
                typeName = "null";
            } else if (type.isArray()) {
                Class elementType = type.getComponentType();
                int count = 1;
                while (elementType.isArray()) {
                    elementType = elementType .getComponentType();
                    count++;
                }
                typeName = elementType.getName();
                for (int i = 0; i < count; i++) {
                    typeName += "[]";
                }
            } else {
                typeName = type.getName();
            }
            if (typeName.startsWith("java.lang.") ||
                typeName.startsWith("java.util.") ||
                typeName.startsWith("java.math.")) {
                typeName = typeName.substring("java.lang.".length());
            }
            return typeName;
        }
}