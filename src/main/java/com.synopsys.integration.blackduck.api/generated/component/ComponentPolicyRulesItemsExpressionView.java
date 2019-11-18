package com.synopsys.integration.blackduck.api.generated.component;

import java.util.List;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ComponentPolicyRulesItemsExpressionExpressionsView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentPolicyRulesItemsExpressionView extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-6+json";

    private java.util.List<ComponentPolicyRulesItemsExpressionExpressionsView> expressions;
    private String operator;

    public java.util.List<ComponentPolicyRulesItemsExpressionExpressionsView> getExpressions() {
	return expressions;
    }

    public void setExpressions(java.util.List<ComponentPolicyRulesItemsExpressionExpressionsView> expressions) {
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
