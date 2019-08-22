package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionViewLicenseLicenseV5;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionViewLicenseV5 extends BlackDuckComponent {
    private String type;
    private ProjectVersionViewLicenseLicenseV5 license;
    private String licenseDisplay;
    private String mediaType = "application/vnd.blackducksoftware.project-detail-5+json";

    public String getType() {
    return type;
    }

    public void setType(String type) {
    this.type = type;
    }

    public ProjectVersionViewLicenseLicenseV5 getLicense() {
    return license;
    }

    public void setLicense(ProjectVersionViewLicenseLicenseV5 license) {
    this.license = license;
    }

    public String getLicenseDisplay() {
    return licenseDisplay;
    }

    public void setLicenseDisplay(String licenseDisplay) {
    this.licenseDisplay = licenseDisplay;
    }

	public String getMediaType() {
	return mediaType;
	}

}
