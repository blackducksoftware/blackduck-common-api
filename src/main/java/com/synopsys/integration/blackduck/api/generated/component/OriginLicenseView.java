/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.OriginLicenseLicenseFamilySummaryView;
import com.synopsys.integration.blackduck.api.generated.component.OriginLicenseLicensesView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseOwnershipType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class OriginLicenseView extends BlackDuckComponent {
    private String license;
    private String licenseDisplay;
    private OriginLicenseLicenseFamilySummaryView licenseFamilySummary;
    private java.util.List<OriginLicenseLicensesView> licenses;
    private String name;
    private LicenseOwnershipType ownership;
    private LicenseType type;

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

    public OriginLicenseLicenseFamilySummaryView getLicenseFamilySummary() {
        return licenseFamilySummary;
    }

    public void setLicenseFamilySummary(OriginLicenseLicenseFamilySummaryView licenseFamilySummary) {
        this.licenseFamilySummary = licenseFamilySummary;
    }

    public java.util.List<OriginLicenseLicensesView> getLicenses() {
        return licenses;
    }

    public void setLicenses(java.util.List<OriginLicenseLicensesView> licenses) {
        this.licenses = licenses;
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

    public LicenseType getType() {
        return type;
    }

    public void setType(LicenseType type) {
        this.type = type;
    }

}
