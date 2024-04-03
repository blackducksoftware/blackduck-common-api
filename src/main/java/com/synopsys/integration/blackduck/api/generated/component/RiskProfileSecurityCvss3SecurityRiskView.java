/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.RiskProfileSecurityCvss3SecurityRiskCountsView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RiskProfileSecurityCvss3SecurityRiskView extends BlackDuckComponent {
    private java.util.List<RiskProfileSecurityCvss3SecurityRiskCountsView> counts;

    public java.util.List<RiskProfileSecurityCvss3SecurityRiskCountsView> getCounts() {
        return counts;
    }

    public void setCounts(java.util.List<RiskProfileSecurityCvss3SecurityRiskCountsView> counts) {
        this.counts = counts;
    }

}
