package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentLicensesView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionComponentLicensesView extends BlackDuckComponent {
    private String license;
    private String spdxId;
    private java.util.List<ProjectVersionComponentLicensesView> licenses;
    private String licenseDisplay;
    private LicenseType licenseType;

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

    public java.util.List<ProjectVersionComponentLicensesView> getLicenses() {
	    return licenses;
    }

    public void setLicenses(java.util.List<ProjectVersionComponentLicensesView> licenses) {
	    this.licenses = licenses;
    }

    public String getLicenseDisplay() {
	    return licenseDisplay;
    }

    public void setLicenseDisplay(String licenseDisplay) {
	    this.licenseDisplay = licenseDisplay;
    }

    public LicenseType getLicenseType() {
	    return licenseType;
    }

    public void setLicenseType(LicenseType licenseType) {
	    this.licenseType = licenseType;
    }

}
