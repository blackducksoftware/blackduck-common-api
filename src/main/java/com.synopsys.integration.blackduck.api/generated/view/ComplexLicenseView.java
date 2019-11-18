package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentLicensesLicenseTypeType;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;

@Deprecated
// ComplexLicenseView is now called ProjectVersionLicenseLicensesView
//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComplexLicenseView extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-4+json";

    private String licenseDisplay;
    private ProjectVersionComponentLicensesLicenseTypeType type;
    private String ownership;

    public String getLicenseDisplay() {
	return licenseDisplay;
    }

    public void setLicenseDisplay(String licenseDisplay) {
	this.licenseDisplay = licenseDisplay;
    }

    public ProjectVersionComponentLicensesLicenseTypeType getType() {
	return type;
    }

    public void setType(ProjectVersionComponentLicensesLicenseTypeType type) {
	this.type = type;
    }

    public String getOwnership() {
	return ownership;
    }

    public void setOwnership(String ownership) {
	this.ownership = ownership;
    }


    public String getMediaType() {
	return mediaType;
    }

}
