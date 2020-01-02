package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyStatusType;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpressionView;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyRuleSeverityType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentPolicyRulesViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-4+json";

    private Boolean enabled;
    private String description;
    private PolicyRuleExpressionView expression;
    private String name;
    private String updatedBy;
    private String updatedByUser;
    private java.util.Date createdAt;
    private String comment;
    private PolicyStatusType policyApprovalStatus;
    private Boolean overridable;
    private String createdBy;
    private String createdByUser;
    private PolicyRuleSeverityType severity;
    private java.util.Date updatedAt;

    public Boolean getEnabled() {
	return enabled;
    }

    public void setEnabled(Boolean enabled) {
	this.enabled = enabled;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
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

    public java.util.Date getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
	this.createdAt = createdAt;
    }

    public String getComment() {
	return comment;
    }

    public void setComment(String comment) {
	this.comment = comment;
    }

    public PolicyStatusType getPolicyApprovalStatus() {
	return policyApprovalStatus;
    }

    public void setPolicyApprovalStatus(PolicyStatusType policyApprovalStatus) {
	this.policyApprovalStatus = policyApprovalStatus;
    }

    public Boolean getOverridable() {
	return overridable;
    }

    public void setOverridable(Boolean overridable) {
	this.overridable = overridable;
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


    public String getMediaType() {
	return mediaType;
    }

}
