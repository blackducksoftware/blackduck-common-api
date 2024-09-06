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
public class ScanFullResultItemsOverriddenPoliciesPartialView extends BlackDuckComponent {
    private String policyName;
    private java.util.List<String> vulnerabilityIds;

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public java.util.List<String> getVulnerabilityIds() {
        return vulnerabilityIds;
    }

    public void setVulnerabilityIds(java.util.List<String> vulnerabilityIds) {
        this.vulnerabilityIds = vulnerabilityIds;
    }

}
