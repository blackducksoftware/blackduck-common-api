/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.deprecated.view;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;
import com.blackduck.integration.blackduck.api.generated.enumeration.ProjectVersionComponentPolicyStatusType;

// PolicyStatusView from the previous API is now called ComponentPolicyStatusView
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public class PolicyStatusView extends BlackDuckView {
    private ProjectVersionComponentPolicyStatusType approvalStatus;

    public ProjectVersionComponentPolicyStatusType getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ProjectVersionComponentPolicyStatusType approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

}
