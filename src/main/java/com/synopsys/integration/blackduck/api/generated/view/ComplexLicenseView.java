package com.synopsys.integration.blackduck.api.generated.view;

import java.util.List;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionLicenseType;

@Deprecated
/**
* ComplexLicenseView is now called ProjectVersionLicenseView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComplexLicenseView extends BlackDuckView {
    private String license;
    private java.util.List<String> licenses;
    private ProjectVersionLicenseType type;

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

    public ProjectVersionLicenseType getType() {
	    return type;
    }

    public void setType(ProjectVersionLicenseType type) {
	    this.type = type;
    }

}
