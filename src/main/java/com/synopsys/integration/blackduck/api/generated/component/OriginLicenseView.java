package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class OriginLicenseView extends BlackDuckComponent {
    private LicenseType type;
    private String license;
    private java.util.List<String> licenses;

    public LicenseType getType() {
	    return type;
    }

    public void setType(LicenseType type) {
	    this.type = type;
    }

    public String getLicense() {
	    return license;
    }

    public void setLicense(String license) {
	    this.license = license;
    }

    public java.util.List<String> getLicenses() {
	    return licenses;
    }

    public void setLicenses(java.util.List<String> licenses) {
	    this.licenses = licenses;
    }

}
