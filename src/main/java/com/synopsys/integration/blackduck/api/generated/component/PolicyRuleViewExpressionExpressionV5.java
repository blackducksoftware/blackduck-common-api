package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleViewExpressionExpressionParametersV5;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PolicyRuleViewExpressionExpressionV5 extends BlackDuckComponent {
    private String name;
    private String operation;
    private PolicyRuleViewExpressionExpressionParametersV5 parameters;
    private String mediaType = "application/vnd.blackducksoftware.policy-5+json";

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

    public PolicyRuleViewExpressionExpressionParametersV5 getParameters() {
    return parameters;
    }

    public void setParameters(PolicyRuleViewExpressionExpressionParametersV5 parameters) {
    this.parameters = parameters;
    }

	public String getMediaType() {
	return mediaType;
	}

}
