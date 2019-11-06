package com.synopsys.integration.blackduck.api.generated.component;

import java.util.List;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentLicensesLicenseTypeType;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentLicensesView;
import java.util.Optional;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionComponentLicensesView extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-6+json";

    private ProjectVersionComponentLicensesLicenseTypeType licenseType;
    private String spdxId;
    private String license;
    private java.util.List<ProjectVersionComponentLicensesView> licenses;
    private String licenseDisplay;

    public ProjectVersionComponentLicensesLicenseTypeType getLicenseType() {
	return licenseType;
    }

    public void setLicenseType(ProjectVersionComponentLicensesLicenseTypeType licenseType) {
	this.licenseType = licenseType;
    }

    public String getSpdxId() {
	return spdxId;
    }

    public void setSpdxId(String spdxId) {
	this.spdxId = spdxId;
    }

    public String getLicense() {
	return license;
    }

    public void setLicense(String license) {
	this.license = license;
    }

    public java.util.List<ProjectVersionComponentLicensesView> getLicenses() {
	return licenses;
    }

    public void setLicenses(java.util.List<ProjectVersionComponentLicensesView> licenses) {
	this.licenses = licenses;
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
