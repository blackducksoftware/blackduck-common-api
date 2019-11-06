package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionLicenseLicensesLicenseFamilySummaryView;
import java.util.List;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentLicensesLicenseTypeType;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionLicenseLicensesView;
import java.util.Optional;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionLicenseLicensesViewV5 extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.project-detail-5+json";

    private java.util.List<ProjectVersionLicenseLicensesView> licenses;
    private String licenseDisplay;
    private String name;
    private ProjectVersionLicenseLicensesLicenseFamilySummaryView licenseFamilySummary;
    private ProjectVersionComponentLicensesLicenseTypeType type;
    private String license;
    private String ownership;

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

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public ProjectVersionLicenseLicensesLicenseFamilySummaryView getLicenseFamilySummary() {
	return licenseFamilySummary;
    }

    public void setLicenseFamilySummary(ProjectVersionLicenseLicensesLicenseFamilySummaryView licenseFamilySummary) {
	this.licenseFamilySummary = licenseFamilySummary;
    }

    public ProjectVersionComponentLicensesLicenseTypeType getType() {
	return type;
    }

    public void setType(ProjectVersionComponentLicensesLicenseTypeType type) {
	this.type = type;
    }

    public String getLicense() {
	return license;
    }

    public void setLicense(String license) {
	this.license = license;
    }

    public String getOwnership() {
	return ownership;
    }

    public void setOwnership(String ownership) {
	this.ownership = ownership;
    }


    public String getMediaType() {
	return mediaType;
    }

}
