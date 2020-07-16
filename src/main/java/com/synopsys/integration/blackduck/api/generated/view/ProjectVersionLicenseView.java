package com.synopsys.integration.blackduck.api.generated.view;

import java.util.List;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionLicenseType;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionLicenseLicensesView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionLicenseView extends BlackDuckView {
    private String licenseDisplay;
    private ProjectVersionLicenseType type;
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

    public java.util.List<ProjectVersionLicenseLicensesView> getLicenses() {
	    return licenses;
    }

    public void setLicenses(java.util.List<ProjectVersionLicenseLicensesView> licenses) {
	    this.licenses = licenses;
    }

}
