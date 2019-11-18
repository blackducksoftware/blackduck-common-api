package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpressionExpressionsParametersView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PolicyRuleExpressionExpressionsViewV5 extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.policy-5+json";

    private String name;
    private PolicyRuleExpressionExpressionsParametersView parameters;
    private String operation;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public PolicyRuleExpressionExpressionsParametersView getParameters() {
	return parameters;
    }

    public void setParameters(PolicyRuleExpressionExpressionsParametersView parameters) {
	this.parameters = parameters;
    }

    public String getOperation() {
	return operation;
    }

    public void setOperation(String operation) {
	this.operation = operation;
    }


    public String getMediaType() {
	return mediaType;
    }

}
