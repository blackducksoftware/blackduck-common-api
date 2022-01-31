/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpressionView;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyRuleCategoryType;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyRuleScanModesType;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyRuleSeverityType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PolicyRuleView extends BlackDuckView {
    private PolicyRuleCategoryType category;
    private String description;
    private Boolean enabled;
    private PolicyRuleExpressionView expression;
    private String name;
    private Boolean overridable;
    private java.util.List<PolicyRuleScanModesType> scanModes;
    private PolicyRuleSeverityType severity;

    public PolicyRuleCategoryType getCategory() {
        return category;
    }

    public void setCategory(PolicyRuleCategoryType category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public java.util.List<PolicyRuleScanModesType> getScanModes() {
        return scanModes;
    }

    public void setScanModes(java.util.List<PolicyRuleScanModesType> scanModes) {
        this.scanModes = scanModes;
    }

    public PolicyRuleSeverityType getSeverity() {
        return severity;
    }

    public void setSeverity(PolicyRuleSeverityType severity) {
        this.severity = severity;
    }

}
