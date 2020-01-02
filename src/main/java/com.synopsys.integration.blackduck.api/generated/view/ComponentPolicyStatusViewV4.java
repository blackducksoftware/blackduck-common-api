package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyStatusType;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentPolicyStatusViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-4+json";

    private PolicyStatusType approvalStatus;

    public PolicyStatusType getApprovalStatus() {
	return approvalStatus;
    }

    public void setApprovalStatus(PolicyStatusType approvalStatus) {
	this.approvalStatus = approvalStatus;
    }


    public String getMediaType() {
	return mediaType;
    }

}
