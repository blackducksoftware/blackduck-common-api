package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionViewLicenseLicenseV4 extends BlackDuckComponent {
    private String license;
    private String name;
    private String ownership;
    private String codeSharing;
    private java.util.List<String> licenses;
    private String licenseDisplay;
    private String mediaType = "application/vnd.blackducksoftware.project-detail-4+json";

    public String getLicense() {
    return license;
    }

    public void setLicense(String license) {
    this.license = license;
    }

    public String getName() {
    return name;
    }

    public void setName(String name) {
    this.name = name;
    }

    public String getOwnership() {
    return ownership;
    }

    public void setOwnership(String ownership) {
    this.ownership = ownership;
    }

    public String getCodeSharing() {
    return codeSharing;
    }

    public void setCodeSharing(String codeSharing) {
    this.codeSharing = codeSharing;
    }

    public java.util.List<String> getLicenses() {
    return licenses;
    }

    public void setLicenses(java.util.List<String> licenses) {
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
