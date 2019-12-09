package com.synopsys.integration.blackduck.api.generated.view;

import java.util.List;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionLicenseTypeType;

@Deprecated
/**
* ComplexLicenseView is now called ProjectVersionLicenseView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComplexLicenseView extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-4+json";

    private String license;
    private java.util.List<String> licenses;
    private ProjectVersionLicenseTypeType type;

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

    public ProjectVersionLicenseTypeType getType() {
	return type;
    }

    public void setType(ProjectVersionLicenseTypeType type) {
	this.type = type;
    }


    public String getMediaType() {
	return mediaType;
    }

}
