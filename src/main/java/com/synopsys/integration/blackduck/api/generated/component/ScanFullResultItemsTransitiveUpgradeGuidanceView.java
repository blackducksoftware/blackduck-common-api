/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsTransitiveUpgradeGuidanceLongTermUpgradeGuidanceView;
import com.synopsys.integration.blackduck.api.generated.component.ScanFullResultItemsTransitiveUpgradeGuidanceShortTermUpgradeGuidanceView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ScanFullResultItemsTransitiveUpgradeGuidanceView extends BlackDuckComponent {
    private String externalId;
    private ScanFullResultItemsTransitiveUpgradeGuidanceLongTermUpgradeGuidanceView longTermUpgradeGuidance;
    private ScanFullResultItemsTransitiveUpgradeGuidanceShortTermUpgradeGuidanceView shortTermUpgradeGuidance;

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public ScanFullResultItemsTransitiveUpgradeGuidanceLongTermUpgradeGuidanceView getLongTermUpgradeGuidance() {
        return longTermUpgradeGuidance;
    }

    public void setLongTermUpgradeGuidance(ScanFullResultItemsTransitiveUpgradeGuidanceLongTermUpgradeGuidanceView longTermUpgradeGuidance) {
        this.longTermUpgradeGuidance = longTermUpgradeGuidance;
    }

    public ScanFullResultItemsTransitiveUpgradeGuidanceShortTermUpgradeGuidanceView getShortTermUpgradeGuidance() {
        return shortTermUpgradeGuidance;
    }

    public void setShortTermUpgradeGuidance(ScanFullResultItemsTransitiveUpgradeGuidanceShortTermUpgradeGuidanceView shortTermUpgradeGuidance) {
        this.shortTermUpgradeGuidance = shortTermUpgradeGuidance;
    }

}
