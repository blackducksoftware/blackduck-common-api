package com.synopsys.integration.blackduck.api.generated.component;

import java.util.List;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseOwnershipType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionVulnerableBomComponentsItemsLicenseLicensesViewV6 extends BlackDuckComponent {
    private String licenseDisplay;
    private java.util.List<String> licenses;
    private LicenseOwnershipType ownership;
    private String license;
    private String name;

    public String getLicenseDisplay() {
	    return licenseDisplay;
    }

    public void setLicenseDisplay(String licenseDisplay) {
	    this.licenseDisplay = licenseDisplay;
    }

    public java.util.List<String> getLicenses() {
	    return licenses;
    }

    public void setLicenses(java.util.List<String> licenses) {
	    this.licenses = licenses;
    }

    public LicenseOwnershipType getOwnership() {
	    return ownership;
    }

    public void setOwnership(LicenseOwnershipType ownership) {
	    this.ownership = ownership;
    }

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

}
