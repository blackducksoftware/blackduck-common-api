package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpressionParameter;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PolicyRuleExpressionView extends BlackDuckComponent {
    private String name;
    private String operation;
    private PolicyRuleExpressionParameter parameters;

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

    public PolicyRuleExpressionParameter getParameters() {
        return parameters;
    }

    public void setParameters(PolicyRuleExpressionParameter parameters) {
        this.parameters = parameters;
    }

}
