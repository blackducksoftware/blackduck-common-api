package com.synopsys.integration.blackduck.api.generated.view;

import java.util.List;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionLicenseLicensesLicenseFamilySummaryView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionLicenseType;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionLicenseLicensesView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionLicenseLicensesViewV5 extends BlackDuckView {
    private String licenseDisplay;
    private ProjectVersionLicenseType type;
    private String license;
    private String ownership;
    private String name;
    private ProjectVersionLicenseLicensesLicenseFamilySummaryView licenseFamilySummary;
    private java.util.List<ProjectVersionLicenseLicensesView> licenses;

    public String getLicenseDisplay() {
	    return licenseDisplay;
    }

    public void setLicenseDisplay(String licenseDisplay) {
	    this.licenseDisplay = licenseDisplay;
    }

    public ProjectVersionLicenseType getType() {
	    return type;
    }

    public void setType(ProjectVersionLicenseType type) {
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

    public java.util.List<ProjectVersionLicenseLicensesView> getLicenses() {
	    return licenses;
    }

    public void setLicenses(java.util.List<ProjectVersionLicenseLicensesView> licenses) {
	    this.licenses = licenses;
    }

}
