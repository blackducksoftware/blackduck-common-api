package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionLicenseLicensesLicenseFamilySummaryView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionLicenseLicensesLicenseView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseOwnershipType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentVersionLicenseLicensesView extends BlackDuckView {
    private ComponentVersionLicenseLicensesLicenseView license;
    private String name;
    private LicenseOwnershipType ownership;
    private java.util.List<ComponentVersionLicenseLicensesLicenseView> licenses;
    private String licenseDisplay;
    private ComponentVersionLicenseLicensesLicenseFamilySummaryView licenseFamilySummary;

    public ComponentVersionLicenseLicensesLicenseView getLicense() {
	    return license;
    }

    public void setLicense(ComponentVersionLicenseLicensesLicenseView license) {
	    this.license = license;
    }

    public String getName() {
	    return name;
    }

    public void setName(String name) {
	    this.name = name;
    }

    public LicenseOwnershipType getOwnership() {
	    return ownership;
    }

    public void setOwnership(LicenseOwnershipType ownership) {
	    this.ownership = ownership;
    }

    public java.util.List<ComponentVersionLicenseLicensesLicenseView> getLicenses() {
	    return licenses;
    }

    public void setLicenses(java.util.List<ComponentVersionLicenseLicensesLicenseView> licenses) {
	    this.licenses = licenses;
    }

    public String getLicenseDisplay() {
	    return licenseDisplay;
    }

    public void setLicenseDisplay(String licenseDisplay) {
	    this.licenseDisplay = licenseDisplay;
    }

    public ComponentVersionLicenseLicensesLicenseFamilySummaryView getLicenseFamilySummary() {
	    return licenseFamilySummary;
    }

    public void setLicenseFamilySummary(ComponentVersionLicenseLicensesLicenseFamilySummaryView licenseFamilySummary) {
	    this.licenseFamilySummary = licenseFamilySummary;
    }

}