package com.synopsys.integration.blackduck.api.generated.component;

import java.util.List;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

@Deprecated
/**
* PolicyRuleExpressionParameter is now called PolicyRuleExpressionExpressionsParametersView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class PolicyRuleExpressionParameter extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.policy-4+json";

    private java.util.List<String> values;

    public java.util.List<String> getValues() {
	return values;
    }

    public void setValues(java.util.List<String> values) {
	this.values = values;
    }


    public String getMediaType() {
	return mediaType;
    }

}
