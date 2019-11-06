package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView;
import java.util.List;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.NameValuePairView;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionPolicyStatusViewV5 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-5+json";

    private String overallStatus;
    private ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView componentVersionPolicyViolationDetails;
    private String updatedAt;
    private java.util.List<NameValuePairView> componentVersionStatusCounts;

    public String getOverallStatus() {
	return overallStatus;
    }

    public void setOverallStatus(String overallStatus) {
	this.overallStatus = overallStatus;
    }

    public ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView getComponentVersionPolicyViolationDetails() {
	return componentVersionPolicyViolationDetails;
    }

    public void setComponentVersionPolicyViolationDetails(ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView componentVersionPolicyViolationDetails) {
	this.componentVersionPolicyViolationDetails = componentVersionPolicyViolationDetails;
    }

    public String getUpdatedAt() {
	return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
	this.updatedAt = updatedAt;
    }

    public java.util.List<NameValuePairView> getComponentVersionStatusCounts() {
	return componentVersionStatusCounts;
    }

    public void setComponentVersionStatusCounts(java.util.List<NameValuePairView> componentVersionStatusCounts) {
	this.componentVersionStatusCounts = componentVersionStatusCounts;
    }


    public String getMediaType() {
	return mediaType;
    }

}
