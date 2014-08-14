/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

package org.mule.modules.clarizen.api.model;

import java.util.Date;

import com.clarizen.api.EntityId;
import com.clarizen.api.Money;

public class User extends ClarizenEntity {

    private EntityId id;
    private String name;
    private EntityId entityType;
    private String displayName;
    private org.mule.modules.clarizen.api.model.flat.StateFlat state;
    private org.mule.modules.clarizen.api.model.flat.PhaseFlat phase;
    private Double availability;
    private Integer stopwatchesCount;
    private String officeFax;
    private String businessAddress;
    private String homeAddress;
    private org.mule.modules.clarizen.api.model.flat.RegionFlat region;
    private String userName;
    private Date lastLogin;
    private Boolean admin;
    private org.mule.modules.clarizen.api.model.flat.TimeZoneFlat timeZone;
    private Boolean externalUser;
    private org.mule.modules.clarizen.api.model.flat.UserFlat directManager;
    private Boolean allowEmails;
    private Boolean sendInvitationMail;
    private String position;
    private Boolean subscribeToProjectNotifications;
    private org.mule.modules.clarizen.api.model.flat.LanguageFlat language;
    private org.mule.modules.clarizen.api.model.flat.JobTitleFlat jobTitle;
    private Boolean superUser;
    private Boolean financial;
    private String twitterUserName;
    private String internalId;
    private String twitterLastMessageId;
    private String googleUserName;
    private String firstName;
    private String signature;
    private String lastName;
    private String email;
    private String officePhone;
    private String mobilePhone;
    private org.mule.modules.clarizen.api.model.flat.LicenseTypeFlat licenseType;
    private Money costRegularRate;
    private Money costOvertimeRate;
    private Money revenueRegularRate;
    private Money revenueOvertimeRate;
    private Boolean freeForChat;

    public EntityId getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public EntityId getEntityType() {
        return entityType;
    }
    public String getDisplayName() {
        return displayName;
    }
    public org.mule.modules.clarizen.api.model.flat.StateFlat getState() {
        return state;
    }
    public org.mule.modules.clarizen.api.model.flat.PhaseFlat getPhase() {
        return phase;
    }
    public Double getAvailability() {
        return availability;
    }
    public Integer getStopwatchesCount() {
        return stopwatchesCount;
    }
    public String getOfficeFax() {
        return officeFax;
    }
    public String getBusinessAddress() {
        return businessAddress;
    }
    public String getHomeAddress() {
        return homeAddress;
    }
    public org.mule.modules.clarizen.api.model.flat.RegionFlat getRegion() {
        return region;
    }
    public String getUserName() {
        return userName;
    }
    public Date getLastLogin() {
        return lastLogin;
    }
    public Boolean getAdmin() {
        return admin;
    }
    public org.mule.modules.clarizen.api.model.flat.TimeZoneFlat getTimeZone() {
        return timeZone;
    }
    public Boolean getExternalUser() {
        return externalUser;
    }
    public org.mule.modules.clarizen.api.model.flat.UserFlat getDirectManager() {
        return directManager;
    }
    public Boolean getAllowEmails() {
        return allowEmails;
    }
    public Boolean getSendInvitationMail() {
        return sendInvitationMail;
    }
    public String getPosition() {
        return position;
    }
    public Boolean getSubscribeToProjectNotifications() {
        return subscribeToProjectNotifications;
    }
    public org.mule.modules.clarizen.api.model.flat.LanguageFlat getLanguage() {
        return language;
    }
    public org.mule.modules.clarizen.api.model.flat.JobTitleFlat getJobTitle() {
        return jobTitle;
    }
    public Boolean getSuperUser() {
        return superUser;
    }
    public Boolean getFinancial() {
        return financial;
    }
    public String getTwitterUserName() {
        return twitterUserName;
    }
    public String getInternalId() {
        return internalId;
    }
    public String getTwitterLastMessageId() {
        return twitterLastMessageId;
    }
    public String getGoogleUserName() {
        return googleUserName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getSignature() {
        return signature;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getOfficePhone() {
        return officePhone;
    }
    public String getMobilePhone() {
        return mobilePhone;
    }
    public org.mule.modules.clarizen.api.model.flat.LicenseTypeFlat getLicenseType() {
        return licenseType;
    }
    public Money getCostRegularRate() {
        return costRegularRate;
    }
    public Money getCostOvertimeRate() {
        return costOvertimeRate;
    }
    public Money getRevenueRegularRate() {
        return revenueRegularRate;
    }
    public Money getRevenueOvertimeRate() {
        return revenueOvertimeRate;
    }
    public Boolean getFreeForChat() {
        return freeForChat;
    }
    public void setId(EntityId id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEntityType(EntityId entityType) {
        this.entityType = entityType;
    }
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }
    public void setState(org.mule.modules.clarizen.api.model.flat.StateFlat state) {
        this.state = state;
    }
    public void setPhase(org.mule.modules.clarizen.api.model.flat.PhaseFlat phase) {
        this.phase = phase;
    }
    public void setAvailability(Double availability) {
        this.availability = availability;
    }
    public void setStopwatchesCount(Integer stopwatchesCount) {
        this.stopwatchesCount = stopwatchesCount;
    }
    public void setOfficeFax(String officeFax) {
        this.officeFax = officeFax;
    }
    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }
    public void setRegion(org.mule.modules.clarizen.api.model.flat.RegionFlat region) {
        this.region = region;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }
    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }
    public void setTimeZone(
            org.mule.modules.clarizen.api.model.flat.TimeZoneFlat timeZone) {
        this.timeZone = timeZone;
    }
    public void setExternalUser(Boolean externalUser) {
        this.externalUser = externalUser;
    }
    public void setDirectManager(
            org.mule.modules.clarizen.api.model.flat.UserFlat directManager) {
        this.directManager = directManager;
    }
    public void setAllowEmails(Boolean allowEmails) {
        this.allowEmails = allowEmails;
    }
    public void setSendInvitationMail(Boolean sendInvitationMail) {
        this.sendInvitationMail = sendInvitationMail;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setSubscribeToProjectNotifications(
            Boolean subscribeToProjectNotifications) {
        this.subscribeToProjectNotifications = subscribeToProjectNotifications;
    }
    public void setLanguage(
            org.mule.modules.clarizen.api.model.flat.LanguageFlat language) {
        this.language = language;
    }
    public void setJobTitle(
            org.mule.modules.clarizen.api.model.flat.JobTitleFlat jobTitle) {
        this.jobTitle = jobTitle;
    }
    public void setSuperUser(Boolean superUser) {
        this.superUser = superUser;
    }
    public void setFinancial(Boolean financial) {
        this.financial = financial;
    }
    public void setTwitterUserName(String twitterUserName) {
        this.twitterUserName = twitterUserName;
    }
    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }
    public void setTwitterLastMessageId(String twitterLastMessageId) {
        this.twitterLastMessageId = twitterLastMessageId;
    }
    public void setGoogleUserName(String googleUserName) {
        this.googleUserName = googleUserName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setSignature(String signature) {
        this.signature = signature;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }
    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
    public void setLicenseType(
            org.mule.modules.clarizen.api.model.flat.LicenseTypeFlat licenseType) {
        this.licenseType = licenseType;
    }
    public void setCostRegularRate(Money costRegularRate) {
        this.costRegularRate = costRegularRate;
    }
    public void setCostOvertimeRate(Money costOvertimeRate) {
        this.costOvertimeRate = costOvertimeRate;
    }
    public void setRevenueRegularRate(Money revenueRegularRate) {
        this.revenueRegularRate = revenueRegularRate;
    }
    public void setRevenueOvertimeRate(Money revenueOvertimeRate) {
        this.revenueOvertimeRate = revenueOvertimeRate;
    }
    public void setFreeForChat(Boolean freeForChat) {
        this.freeForChat = freeForChat;
    }
}
