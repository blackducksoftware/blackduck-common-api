package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyRuleSeverityType;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleViewExpressionV4;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PolicyRuleViewV4 extends BlackDuckView {
    private PolicyRuleSeverityType severity;
    private PolicyRuleViewExpressionV4 expression;
    private String name;
    private Boolean overridable;
    private String description;
    private Object _meta;
    private Boolean enabled;
    private String mediaType = "application/vnd.blackducksoftware.policy-4+json";

    public PolicyRuleSeverityType getSeverity() {
    return severity;
    }

    public void setSeverity(PolicyRuleSeverityType severity) {
    this.severity = severity;
    }

    public PolicyRuleViewExpressionV4 getExpression() {
    return expression;
    }

    public void setExpression(PolicyRuleViewExpressionV4 expression) {
    this.expression = expression;
    }

    public String getName() {
    return name;
    }

    public void setName(String name) {
    this.name = name;
    }

    public Boolean getOverridable() {
    return overridable;
    }

    public void setOverridable(Boolean overridable) {
    this.overridable = overridable;
    }

    public String getDescription() {
    return description;
    }

    public void setDescription(String description) {
    this.description = description;
    }

    public Object get_meta() {
    return _meta;
    }

    public void set_meta(Object _meta) {
    this._meta = _meta;
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
