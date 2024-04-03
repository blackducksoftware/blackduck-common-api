/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class SettingsLicenseReviewView extends BlackDuckComponent {
    private Boolean licenseConflicts;
    private Boolean termFulfillment;

    public Boolean getLicenseConflicts() {
        return licenseConflicts;
    }

    public void setLicenseConflicts(Boolean licenseConflicts) {
        this.licenseConflicts = licenseConflicts;
    }

    public Boolean getTermFulfillment() {
        return termFulfillment;
    }

    public void setTermFulfillment(Boolean termFulfillment) {
        this.termFulfillment = termFulfillment;
    }

}
