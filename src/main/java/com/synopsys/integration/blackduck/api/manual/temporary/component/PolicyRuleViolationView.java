/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentPolicyStatusType;
import com.synopsys.integration.blackduck.api.generated.view.PolicyRuleView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PolicyRuleViolationView extends BlackDuckComponent {
    private ProjectVersionComponentPolicyStatusType approvalStatus;
    private String approvalStatusUrl;
    private java.util.List<UserSummary> overriddenBy;
    private PolicyRuleView policyRuleView;
    private java.util.List<UserSummary> updatedBy;

    public ProjectVersionComponentPolicyStatusType getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ProjectVersionComponentPolicyStatusType approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getApprovalStatusUrl() {
        return approvalStatusUrl;
    }

    public void setApprovalStatusUrl(String approvalStatusUrl) {
        this.approvalStatusUrl = approvalStatusUrl;
    }

    public java.util.List<UserSummary> getOverriddenBy() {
        return overriddenBy;
    }

    public void setOverriddenBy(java.util.List<UserSummary> overriddenBy) {
        this.overriddenBy = overriddenBy;
    }

    public PolicyRuleView getPolicyRuleView() {
        return policyRuleView;
    }

    public void setPolicyRuleView(PolicyRuleView policyRuleView) {
        this.policyRuleView = policyRuleView;
    }

    public java.util.List<UserSummary> getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(java.util.List<UserSummary> updatedBy) {
        this.updatedBy = updatedBy;
    }

}
