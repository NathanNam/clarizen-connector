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