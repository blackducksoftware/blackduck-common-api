package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionComponentViewLicensesV4 extends BlackDuckComponent {
    private String licenseDisplay;
    private String license;
    private String licenseType;
    private java.util.List<String> licenses;
    private String mediaType = "application/vnd.blackducksoftware.bill-of-materials-4+json";

    public String getLicenseDisplay() {
    return licenseDisplay;
    }

    public void setLicenseDisplay(String licenseDisplay) {
    this.licenseDisplay = licenseDisplay;
    }

    public String getLicense() {
    return license;
    }

    public void setLicense(String license) {
    this.license = license;
    }

    public String getLicenseType() {
    return licenseType;
    }

    public void setLicenseType(String licenseType) {
    this.licenseType = licenseType;
    }

    public java.util.List<String> getLicenses() {
    return licenses;
    }

    public void setLicenses(java.util.List<String> licenses) {
    this.licenses = licenses;
    }

	public String getMediaType() {
	return mediaType;
	}

}
