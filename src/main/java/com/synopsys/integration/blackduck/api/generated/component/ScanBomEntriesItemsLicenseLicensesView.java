package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ScanBomEntriesItemsLicenseLicensesView extends BlackDuckComponent {
    private String license;
    private String name;
    private LicenseType type;
    private java.util.List<String> licenses;
    private String licenseDisplay;

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

    public LicenseType getType() {
	    return type;
    }

    public void setType(LicenseType type) {
	    this.type = type;
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

}