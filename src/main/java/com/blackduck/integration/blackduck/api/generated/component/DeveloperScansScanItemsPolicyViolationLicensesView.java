/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class DeveloperScansScanItemsPolicyViolationLicensesView extends BlackDuckComponent {
    private String licenseFamilyName;
    private String name;
    private java.util.List<DeveloperScansScanItemsPolicyViolationLicensesViolatingPoliciesView> violatingPolicies;

    public String getLicenseFamilyName() {
        return licenseFamilyName;
    }

    public void setLicenseFamilyName(String licenseFamilyName) {
        this.licenseFamilyName = licenseFamilyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<DeveloperScansScanItemsPolicyViolationLicensesViolatingPoliciesView> getViolatingPolicies() {
        return violatingPolicies;
    }

    public void setViolatingPolicies(java.util.List<DeveloperScansScanItemsPolicyViolationLicensesViolatingPoliciesView> violatingPolicies) {
        this.violatingPolicies = violatingPolicies;
    }

}
