/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.view;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;
import com.blackduck.integration.blackduck.api.generated.component.RiskProfileCountsView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RiskProfileView extends BlackDuckView {
    private java.util.List<RiskProfileCountsView> counts;

    public java.util.List<RiskProfileCountsView> getCounts() {
        return counts;
    }

    public void setCounts(java.util.List<RiskProfileCountsView> counts) {
        this.counts = counts;
    }

}
