package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionViewLicenseLicenseLicenseFamilySummaryV5;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionViewLicenseLicenseV5 extends BlackDuckComponent {
    private String license;
    private String name;
    private ProjectVersionViewLicenseLicenseLicenseFamilySummaryV5 licenseFamilySummary;
    private java.util.List<String> licenses;
    private String mediaType = "application/vnd.blackducksoftware.project-detail-5+json";

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

    public ProjectVersionViewLicenseLicenseLicenseFamilySummaryV5 getLicenseFamilySummary() {
    return licenseFamilySummary;
    }

    public void setLicenseFamilySummary(ProjectVersionViewLicenseLicenseLicenseFamilySummaryV5 licenseFamilySummary) {
    this.licenseFamilySummary = licenseFamilySummary;
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
