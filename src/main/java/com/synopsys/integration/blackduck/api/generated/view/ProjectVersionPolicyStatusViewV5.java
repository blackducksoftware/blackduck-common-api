package com.synopsys.integration.blackduck.api.generated.view;

import java.util.List;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyStatusType;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.NameValuePairView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionPolicyStatusViewV5 extends BlackDuckView {
    private java.util.List<NameValuePairView> componentVersionStatusCounts;
    private PolicyStatusType overallStatus;
    private ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView componentVersionPolicyViolationDetails;
    private java.util.Date updatedAt;

    public java.util.List<NameValuePairView> getComponentVersionStatusCounts() {
	    return componentVersionStatusCounts;
    }

    public void setComponentVersionStatusCounts(java.util.List<NameValuePairView> componentVersionStatusCounts) {
	    this.componentVersionStatusCounts = componentVersionStatusCounts;
    }

    public PolicyStatusType getOverallStatus() {
	    return overallStatus;
    }

    public void setOverallStatus(PolicyStatusType overallStatus) {
	    this.overallStatus = overallStatus;
    }

    public ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView getComponentVersionPolicyViolationDetails() {
	    return componentVersionPolicyViolationDetails;
    }

    public void setComponentVersionPolicyViolationDetails(ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView componentVersionPolicyViolationDetails) {
	    this.componentVersionPolicyViolationDetails = componentVersionPolicyViolationDetails;
    }

    public java.util.Date getUpdatedAt() {
	    return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
	    this.updatedAt = updatedAt;
    }

}
