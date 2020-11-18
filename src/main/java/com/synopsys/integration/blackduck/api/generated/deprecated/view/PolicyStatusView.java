package com.synopsys.integration.blackduck.api.generated.deprecated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentPolicyStatusType;

@Deprecated
/**
* PolicyStatusView from the previous API is now called ComponentPolicyStatusView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class PolicyStatusView extends BlackDuckView {
    private ProjectVersionComponentPolicyStatusType approvalStatus;

    public ProjectVersionComponentPolicyStatusType getApprovalStatus() {
	    return approvalStatus;
    }

    public void setApprovalStatus(ProjectVersionComponentPolicyStatusType approvalStatus) {
	    this.approvalStatus = approvalStatus;
    }

}
