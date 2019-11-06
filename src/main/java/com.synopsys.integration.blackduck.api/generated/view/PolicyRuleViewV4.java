package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpressionView;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyRuleSeverityType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PolicyRuleViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.policy-4+json";

    private String name;
    private String description;
    private PolicyRuleSeverityType severity;
    private PolicyRuleExpressionView expression;
    private Boolean overridable;
    private Boolean enabled;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public PolicyRuleSeverityType getSeverity() {
	return severity;
    }

    public void setSeverity(PolicyRuleSeverityType severity) {
	this.severity = severity;
    }

    public PolicyRuleExpressionView getExpression() {
	return expression;
    }

    public void setExpression(PolicyRuleExpressionView expression) {
	this.expression = expression;
    }

    public Boolean getOverridable() {
	return overridable;
    }

    public void setOverridable(Boolean overridable) {
	this.overridable = overridable;
    }

    public Boolean getEnabled() {
	return enabled;
    }

    public void setEnabled(Boolean enabled) {
	this.enabled = enabled;
    }


    public String getMediaType() {
	return mediaType;
    }

}
