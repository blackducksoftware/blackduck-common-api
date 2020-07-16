package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyStatusType;

@Deprecated
/**
* PolicyStatusView is now called ComponentPolicyStatusView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class PolicyStatusView extends BlackDuckView {
    private PolicyStatusType approvalStatus;

    public PolicyStatusType getApprovalStatus() {
	    return approvalStatus;
    }

    public void setApprovalStatus(PolicyStatusType approvalStatus) {
	    this.approvalStatus = approvalStatus;
    }

}
