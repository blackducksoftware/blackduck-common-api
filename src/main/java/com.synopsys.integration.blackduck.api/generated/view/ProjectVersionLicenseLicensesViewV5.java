package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionLicenseLicensesTypeType;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionLicenseLicensesLicenseFamilySummaryView;
import java.util.List;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionLicenseLicensesView;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionLicenseLicensesViewV5 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.project-detail-5+json";

    private String licenseDisplay;
    private ProjectVersionLicenseLicensesTypeType type;
    private java.util.List<ProjectVersionLicenseLicensesView> licenses;
    private String license;
    private String ownership;
    private String name;
    private ProjectVersionLicenseLicensesLicenseFamilySummaryView licenseFamilySummary;

    public String getLicenseDisplay() {
	return licenseDisplay;
    }

    public void setLicenseDisplay(String licenseDisplay) {
	this.licenseDisplay = licenseDisplay;
    }

    public ProjectVersionLicenseLicensesTypeType getType() {
	return type;
    }

    public void setType(ProjectVersionLicenseLicensesTypeType type) {
	this.type = type;
    }

    public java.util.List<ProjectVersionLicenseLicensesView> getLicenses() {
	return licenses;
    }

    public void setLicenses(java.util.List<ProjectVersionLicenseLicensesView> licenses) {
	this.licenses = licenses;
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


    public String getMediaType() {
	return mediaType;
    }

}
