/**
 * Mule Clarizen Cloud Connector
 *
 * (c) 2003-2014 MuleSoft, Inc. The software in this package is published under
 * the terms of the CPAL v1.0 license, a copy of which has been included with this
 * distribution in the LICENSE.md file.
 */

import com.clarizen.api.ConditionList
import com.clarizen.api.queries.*

new Or(
conditions: 
        new ConditionList( condition: [ 
                    new Compare(
                          leftExpression: new FieldExpression( fieldName: "Name" ),
                          rightExpression: new ConstantExpression ( value: "New Task testing--107" ),
                          operator: "CONTAINS" ),
                    new Compare(
                          leftExpression: new FieldExpression( fieldName: "Name" ),
                          rightExpression: new ConstantExpression ( value: "New Task testing--108" ),
                          operator: "CONTAINS" )
                              ]
                  )
)