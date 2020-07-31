package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyStatusType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentPolicyStatusViewV4 extends BlackDuckView {
    private PolicyStatusType approvalStatus;

    public PolicyStatusType getApprovalStatus() {
	    return approvalStatus;
    }

    public void setApprovalStatus(PolicyStatusType approvalStatus) {
	    this.approvalStatus = approvalStatus;
    }

}
