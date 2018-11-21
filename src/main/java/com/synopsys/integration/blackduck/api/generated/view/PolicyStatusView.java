package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicySummaryStatusType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PolicyStatusView extends BlackDuckView {
    private PolicySummaryStatusType approvalStatus;
    private String comment;

    public PolicySummaryStatusType getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(PolicySummaryStatusType approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
