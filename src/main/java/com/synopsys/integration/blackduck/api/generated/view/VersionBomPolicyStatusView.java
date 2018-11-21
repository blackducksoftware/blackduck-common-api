package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionPolicyViolationDetails;
import com.synopsys.integration.blackduck.api.generated.component.NameValuePairView;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicySummaryStatusType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionBomPolicyStatusView extends BlackDuckView {
    private ComponentVersionPolicyViolationDetails componentVersionPolicyViolationDetails;
    private java.util.List<NameValuePairView> componentVersionStatusCounts;
    private PolicySummaryStatusType overallStatus;
    private java.util.Date updatedAt;

    public ComponentVersionPolicyViolationDetails getComponentVersionPolicyViolationDetails() {
        return componentVersionPolicyViolationDetails;
    }

    public void setComponentVersionPolicyViolationDetails(ComponentVersionPolicyViolationDetails componentVersionPolicyViolationDetails) {
        this.componentVersionPolicyViolationDetails = componentVersionPolicyViolationDetails;
    }

    public java.util.List<NameValuePairView> getComponentVersionStatusCounts() {
        return componentVersionStatusCounts;
    }

    public void setComponentVersionStatusCounts(java.util.List<NameValuePairView> componentVersionStatusCounts) {
        this.componentVersionStatusCounts = componentVersionStatusCounts;
    }

    public PolicySummaryStatusType getOverallStatus() {
        return overallStatus;
    }

    public void setOverallStatus(PolicySummaryStatusType overallStatus) {
        this.overallStatus = overallStatus;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
