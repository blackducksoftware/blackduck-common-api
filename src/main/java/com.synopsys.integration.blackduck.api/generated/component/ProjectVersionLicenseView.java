package com.synopsys.integration.blackduck.api.generated.component;

import java.util.List;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionLicenseLicensesView;
import java.util.Optional;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionLicenseView extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.project-detail-5+json";

    private java.util.List<ProjectVersionLicenseLicensesView> licenses;
    private String licenseDisplay;
    private String type;

    public java.util.List<ProjectVersionLicenseLicensesView> getLicenses() {
	return licenses;
    }

    public void setLicenses(java.util.List<ProjectVersionLicenseLicensesView> licenses) {
	this.licenses = licenses;
    }

    public String getLicenseDisplay() {
	return licenseDisplay;
    }

    public void setLicenseDisplay(String licenseDisplay) {
	this.licenseDisplay = licenseDisplay;
    }

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }


    public String getMediaType() {
	return mediaType;
    }

}
