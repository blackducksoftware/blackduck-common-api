package com.synopsys.integration.blackduck.api.generated.component;

import java.util.List;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionVulnerableBomComponentsItemsLicenseLicensesView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionLicenseType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionVulnerableBomComponentsItemsLicenseView extends BlackDuckComponent {
    private String licenseDisplay;
    private ProjectVersionLicenseType type;
    private java.util.List<ProjectVersionVulnerableBomComponentsItemsLicenseLicensesView> licenses;

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

    public java.util.List<ProjectVersionVulnerableBomComponentsItemsLicenseLicensesView> getLicenses() {
	    return licenses;
    }

    public void setLicenses(java.util.List<ProjectVersionVulnerableBomComponentsItemsLicenseLicensesView> licenses) {
	    this.licenses = licenses;
    }

}
