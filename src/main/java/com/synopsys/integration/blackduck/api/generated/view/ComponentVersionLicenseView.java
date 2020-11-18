package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseType;
import com.synopsys.integration.blackduck.api.generated.view.ComponentVersionLicenseLicensesView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentVersionLicenseView extends BlackDuckView {
    private LicenseType type;
    private java.util.List<ComponentVersionLicenseLicensesView> licenses;
    private String licenseDisplay;

    public LicenseType getType() {
	    return type;
    }

    public void setType(LicenseType type) {
	    this.type = type;
    }

    public java.util.List<ComponentVersionLicenseLicensesView> getLicenses() {
	    return licenses;
    }

    public void setLicenses(java.util.List<ComponentVersionLicenseLicensesView> licenses) {
	    this.licenses = licenses;
    }

    public String getLicenseDisplay() {
	    return licenseDisplay;
    }

    public void setLicenseDisplay(String licenseDisplay) {
	    this.licenseDisplay = licenseDisplay;
    }

}
