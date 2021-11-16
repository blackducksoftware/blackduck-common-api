/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkBlackDuckResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentPolicyStatusType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentPolicyStatusView extends BlackDuckView {
    private ProjectVersionComponentPolicyStatusType approvalStatus;

    public ProjectVersionComponentPolicyStatusType getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ProjectVersionComponentPolicyStatusType approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

}
