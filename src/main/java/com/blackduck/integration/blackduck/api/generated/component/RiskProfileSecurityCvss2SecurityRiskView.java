/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RiskProfileSecurityCvss2SecurityRiskView extends BlackDuckComponent {
    private java.util.List<RiskProfileSecurityCvss2SecurityRiskCountsView> counts;

    public java.util.List<RiskProfileSecurityCvss2SecurityRiskCountsView> getCounts() {
        return counts;
    }

    public void setCounts(java.util.List<RiskProfileSecurityCvss2SecurityRiskCountsView> counts) {
        this.counts = counts;
    }

}
