/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.generated.enumeration.LicenseType;
import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionVulnerableBomComponentsItemsLicenseView extends BlackDuckComponent {
    private String licenseDisplay;
    private java.util.List<ProjectVersionVulnerableBomComponentsItemsLicenseLicensesView> licenses;
    private LicenseType type;

    public String getLicenseDisplay() {
        return licenseDisplay;
    }

    public void setLicenseDisplay(String licenseDisplay) {
        this.licenseDisplay = licenseDisplay;
    }

    public java.util.List<ProjectVersionVulnerableBomComponentsItemsLicenseLicensesView> getLicenses() {
        return licenses;
    }

    public void setLicenses(java.util.List<ProjectVersionVulnerableBomComponentsItemsLicenseLicensesView> licenses) {
        this.licenses = licenses;
    }

    public LicenseType getType() {
        return type;
    }

    public void setType(LicenseType type) {
        this.type = type;
    }

}
