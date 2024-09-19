/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.generated.enumeration.LicenseOwnershipType;
import com.blackduck.integration.blackduck.api.generated.enumeration.LicenseType;
import com.blackduck.integration.blackduck.api.generated.enumeration.ScanFullResultItemsLicensesLicenseFamilyNameType;
import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionComponentVersionLicensesView extends BlackDuckComponent {
    private String license;
    private String licenseDisplay;
    private ScanFullResultItemsLicensesLicenseFamilyNameType licenseFamilyName;
    private LicenseType licenseType;
    private java.util.List<ProjectVersionComponentVersionLicensesView> licenses;
    private LicenseOwnershipType ownership;
    private String spdxId;

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicenseDisplay() {
        return licenseDisplay;
    }

    public void setLicenseDisplay(String licenseDisplay) {
        this.licenseDisplay = licenseDisplay;
    }

    public ScanFullResultItemsLicensesLicenseFamilyNameType getLicenseFamilyName() {
        return licenseFamilyName;
    }

    public void setLicenseFamilyName(ScanFullResultItemsLicensesLicenseFamilyNameType licenseFamilyName) {
        this.licenseFamilyName = licenseFamilyName;
    }

    public LicenseType getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
    }

    public java.util.List<ProjectVersionComponentVersionLicensesView> getLicenses() {
        return licenses;
    }

    public void setLicenses(java.util.List<ProjectVersionComponentVersionLicensesView> licenses) {
        this.licenses = licenses;
    }

    public LicenseOwnershipType getOwnership() {
        return ownership;
    }

    public void setOwnership(LicenseOwnershipType ownership) {
        this.ownership = ownership;
    }

    public String getSpdxId() {
        return spdxId;
    }

    public void setSpdxId(String spdxId) {
        this.spdxId = spdxId;
    }

}
