package com.synopsys.integration.blackduck.api.generated.component;

import java.util.List;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionLicenseType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class OriginLicenseView extends BlackDuckComponent {
    private java.util.List<String> licenses;
    private ProjectVersionLicenseType type;
    private String license;

    public java.util.List<String> getLicenses() {
	    return licenses;
    }

    public void setLicenses(java.util.List<String> licenses) {
	    this.licenses = licenses;
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

}
