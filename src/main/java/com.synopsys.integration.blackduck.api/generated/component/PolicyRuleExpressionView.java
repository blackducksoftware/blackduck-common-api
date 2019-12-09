package com.synopsys.integration.blackduck.api.generated.component;

import java.util.List;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpressionExpressionsView;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

/**
* PolicyRuleExpressionView is now called PolicyRuleExpressionExpressionsView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class PolicyRuleExpressionView extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-6+json";

    private java.util.List<PolicyRuleExpressionExpressionsView> expressions;
    private String operator;

    public java.util.List<PolicyRuleExpressionExpressionsView> getExpressions() {
	return expressions;
    }

    public void setExpressions(java.util.List<PolicyRuleExpressionExpressionsView> expressions) {
	this.expressions = expressions;
    }

    public String getOperator() {
	return operator;
    }

    public void setOperator(String operator) {
	this.operator = operator;
    }


    public String getMediaType() {
	return mediaType;
    }

}
