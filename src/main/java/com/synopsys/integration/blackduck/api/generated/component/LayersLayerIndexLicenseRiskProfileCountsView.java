/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.RiskPriorityType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LayersLayerIndexLicenseRiskProfileCountsView extends BlackDuckComponent {
    private BigDecimal count;
    private RiskPriorityType countType;

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public RiskPriorityType getCountType() {
        return countType;
    }

    public void setCountType(RiskPriorityType countType) {
        this.countType = countType;
    }

}
