/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.enumeration.LicenseOwnershipType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionVulnerableBomComponentsItemsLicenseLicensesView extends BlackDuckComponent {
    private String license;
    private String licenseDisplay;
    private java.util.List<String> licenses;
    private String name;
    private LicenseOwnershipType ownership;

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

    public java.util.List<String> getLicenses() {
        return licenses;
    }

    public void setLicenses(java.util.List<String> licenses) {
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

}
