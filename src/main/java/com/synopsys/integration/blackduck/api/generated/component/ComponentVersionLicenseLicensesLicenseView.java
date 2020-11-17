package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionLicenseLicensesLicenseLicenseFamilyView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseSourceType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseStatusType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentVersionLicenseLicensesLicenseView extends BlackDuckComponent {
    private String notes;
    private String name;
    private ComponentVersionLicenseLicensesLicenseLicenseFamilyView licenseFamily;
    private LicenseStatusType licenseStatus;
    private LicenseSourceType licenseSource;
    private java.util.Date expirationDate;

    public String getNotes() {
	    return notes;
    }

    public void setNotes(String notes) {
	    this.notes = notes;
    }

    public String getName() {
	    return name;
    }

    public void setName(String name) {
	    this.name = name;
    }

    public ComponentVersionLicenseLicensesLicenseLicenseFamilyView getLicenseFamily() {
	    return licenseFamily;
    }

    public void setLicenseFamily(ComponentVersionLicenseLicensesLicenseLicenseFamilyView licenseFamily) {
	    this.licenseFamily = licenseFamily;
    }

    public LicenseStatusType getLicenseStatus() {
	    return licenseStatus;
    }

    public void setLicenseStatus(LicenseStatusType licenseStatus) {
	    this.licenseStatus = licenseStatus;
    }

    public LicenseSourceType getLicenseSource() {
	    return licenseSource;
    }

    public void setLicenseSource(LicenseSourceType licenseSource) {
	    this.licenseSource = licenseSource;
    }

    public java.util.Date getExpirationDate() {
	    return expirationDate;
    }

    public void setExpirationDate(java.util.Date expirationDate) {
	    this.expirationDate = expirationDate;
    }

}
