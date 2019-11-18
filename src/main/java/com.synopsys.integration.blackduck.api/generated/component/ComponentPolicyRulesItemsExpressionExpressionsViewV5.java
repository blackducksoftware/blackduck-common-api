package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.generated.component.ComponentPolicyRulesItemsExpressionExpressionsParametersView;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentPolicyRulesItemsExpressionExpressionsViewV5 extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-5+json";

    private String name;
    private String operation;
    private ComponentPolicyRulesItemsExpressionExpressionsParametersView parameters;

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

    public ComponentPolicyRulesItemsExpressionExpressionsParametersView getParameters() {
	return parameters;
    }

    public void setParameters(ComponentPolicyRulesItemsExpressionExpressionsParametersView parameters) {
	this.parameters = parameters;
    }


    public String getMediaType() {
	return mediaType;
    }

}
