package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpressionValue;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PolicyRuleExpression extends BlackDuckComponent {
    private String name;
    private String operation;
    private java.util.List<PolicyRuleExpressionValue> values;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public java.util.List<PolicyRuleExpressionValue> getValues() {
        return values;
    }

    public void setValues(java.util.List<PolicyRuleExpressionValue> values) {
        this.values = values;
    }

}
