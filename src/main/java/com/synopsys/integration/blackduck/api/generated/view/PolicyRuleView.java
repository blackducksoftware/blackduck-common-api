package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpressionView;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyRuleCategoryType;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyRuleSeverityType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class PolicyRuleView extends BlackDuckView {
    private String name;
    private PolicyRuleCategoryType category;
    private Boolean enabled;
    private PolicyRuleExpressionView expression;
    private PolicyRuleSeverityType severity;
    private String description;
    private Boolean overridable;

    public String getName() {
	    return name;
    }

    public void setName(String name) {
	    this.name = name;
    }

    public PolicyRuleCategoryType getCategory() {
	    return category;
    }

    public void setCategory(PolicyRuleCategoryType category) {
	    this.category = category;
    }

    public Boolean getEnabled() {
	    return enabled;
    }

    public void setEnabled(Boolean enabled) {
	    this.enabled = enabled;
    }

    public PolicyRuleExpressionView getExpression() {
	    return expression;
    }

    public void setExpression(PolicyRuleExpressionView expression) {
	    this.expression = expression;
    }

    public PolicyRuleSeverityType getSeverity() {
	    return severity;
    }

    public void setSeverity(PolicyRuleSeverityType severity) {
	    this.severity = severity;
    }

    public String getDescription() {
	    return description;
    }

    public void setDescription(String description) {
	    this.description = description;
    }

    public Boolean getOverridable() {
	    return overridable;
    }

    public void setOverridable(Boolean overridable) {
	    this.overridable = overridable;
    }

}
