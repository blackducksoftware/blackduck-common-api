package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionComponentVersionLicensesView extends BlackDuckComponent {
    private String license;
    private String spdxId;
    private java.util.List<String> licenses;
    private LicenseType licenseType;
    private String licenseDisplay;

    public String getLicense() {
	    return license;
    }

    public void setLicense(String license) {
	    this.license = license;
    }

    public String getSpdxId() {
	    return spdxId;
    }

    public void setSpdxId(String spdxId) {
	    this.spdxId = spdxId;
    }

    public java.util.List<String> getLicenses() {
	    return licenses;
    }

    public void setLicenses(java.util.List<String> licenses) {
	    this.licenses = licenses;
    }

    public LicenseType getLicenseType() {
	    return licenseType;
    }

    public void setLicenseType(LicenseType licenseType) {
	    this.licenseType = licenseType;
    }

    public String getLicenseDisplay() {
	    return licenseDisplay;
    }

    public void setLicenseDisplay(String licenseDisplay) {
	    this.licenseDisplay = licenseDisplay;
    }

}
