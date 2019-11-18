package com.synopsys.integration.blackduck.api.generated.view;

import java.util.List;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionLicenseLicensesView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentLicensesLicenseTypeType;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionLicenseLicensesViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.project-detail-4+json";

    private String licenseDisplay;
    private ProjectVersionComponentLicensesLicenseTypeType type;
    private String license;
    private String codeSharing;
    private String ownership;
    private String name;
    private java.util.List<ProjectVersionLicenseLicensesView> licenses;

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

    public String getLicense() {
	return license;
    }

    public void setLicense(String license) {
	this.license = license;
    }

    public String getCodeSharing() {
	return codeSharing;
    }

    public void setCodeSharing(String codeSharing) {
	this.codeSharing = codeSharing;
    }

    public String getOwnership() {
	return ownership;
    }

    public void setOwnership(String ownership) {
	this.ownership = ownership;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public java.util.List<ProjectVersionLicenseLicensesView> getLicenses() {
	return licenses;
    }

    public void setLicenses(java.util.List<ProjectVersionLicenseLicensesView> licenses) {
	this.licenses = licenses;
    }


    public String getMediaType() {
	return mediaType;
    }

}
