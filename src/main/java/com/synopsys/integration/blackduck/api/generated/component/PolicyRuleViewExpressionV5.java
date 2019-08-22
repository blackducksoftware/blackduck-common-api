package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleViewExpressionExpressionV5;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PolicyRuleViewExpressionV5 extends BlackDuckComponent {
    private String operator;
    private PolicyRuleViewExpressionExpressionV5 expression;
    private String mediaType = "application/vnd.blackducksoftware.policy-5+json";

    public String getOperator() {
    return operator;
    }

    public void setOperator(String operator) {
    this.operator = operator;
    }

    public PolicyRuleViewExpressionExpressionV5 getExpression() {
    return expression;
    }

    public void setExpression(PolicyRuleViewExpressionExpressionV5 expression) {
    this.expression = expression;
    }

	public String getMediaType() {
	return mediaType;
	}

}
