/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.view;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;
import com.blackduck.integration.blackduck.api.generated.component.PolicyRuleExpressionView;
import com.blackduck.integration.blackduck.api.generated.enumeration.PolicyRuleSeverityType;
import com.blackduck.integration.blackduck.api.generated.enumeration.ProjectVersionComponentPolicyStatusType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentPolicyRulesView extends BlackDuckView {
    private String comment;
    private java.util.Date createdAt;
    private String createdBy;
    private String createdByUser;
    private String description;
    private Boolean enabled;
    private PolicyRuleExpressionView expression;
    private String name;
    private Boolean overridable;
    private String overrideExpiresAt;
    private ProjectVersionComponentPolicyStatusType policyApprovalStatus;
    private PolicyRuleSeverityType severity;
    private java.util.Date updatedAt;
    private String updatedBy;
    private String updatedByUser;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
        this.createdByUser = createdByUser;
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

    public String getOverrideExpiresAt() {
        return overrideExpiresAt;
    }

    public void setOverrideExpiresAt(String overrideExpiresAt) {
        this.overrideExpiresAt = overrideExpiresAt;
    }

    public ProjectVersionComponentPolicyStatusType getPolicyApprovalStatus() {
        return policyApprovalStatus;
    }

    public void setPolicyApprovalStatus(ProjectVersionComponentPolicyStatusType policyApprovalStatus) {
        this.policyApprovalStatus = policyApprovalStatus;
    }

    public PolicyRuleSeverityType getSeverity() {
        return severity;
    }

    public void setSeverity(PolicyRuleSeverityType severity) {
        this.severity = severity;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedByUser() {
        return updatedByUser;
    }

    public void setUpdatedByUser(String updatedByUser) {
        this.updatedByUser = updatedByUser;
    }

}
