/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseType;
import com.synopsys.integration.blackduck.api.generated.view.ComponentVersionLicenseLicensesView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionLicenseView extends BlackDuckView {
    private String licenseDisplay;
    private java.util.List<ComponentVersionLicenseLicensesView> licenses;
    private LicenseType type;

    public String getLicenseDisplay() {
        return licenseDisplay;
    }

    public void setLicenseDisplay(String licenseDisplay) {
        this.licenseDisplay = licenseDisplay;
    }

    public java.util.List<ComponentVersionLicenseLicensesView> getLicenses() {
        return licenses;
    }

    public void setLicenses(java.util.List<ComponentVersionLicenseLicensesView> licenses) {
        this.licenses = licenses;
    }

    public LicenseType getType() {
        return type;
    }

    public void setType(LicenseType type) {
        this.type = type;
    }

}
