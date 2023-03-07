/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.DeveloperScansScanItemsTransitiveUpgradeGuidanceLongTermUpgradeGuidanceView;
import com.synopsys.integration.blackduck.api.generated.component.DeveloperScansScanItemsTransitiveUpgradeGuidanceShortTermUpgradeGuidanceView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class DeveloperScansScanItemsTransitiveUpgradeGuidanceView extends BlackDuckComponent {
    private String externalId;
    private DeveloperScansScanItemsTransitiveUpgradeGuidanceLongTermUpgradeGuidanceView longTermUpgradeGuidance;
    private DeveloperScansScanItemsTransitiveUpgradeGuidanceShortTermUpgradeGuidanceView shortTermUpgradeGuidance;

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public DeveloperScansScanItemsTransitiveUpgradeGuidanceLongTermUpgradeGuidanceView getLongTermUpgradeGuidance() {
        return longTermUpgradeGuidance;
    }

    public void setLongTermUpgradeGuidance(DeveloperScansScanItemsTransitiveUpgradeGuidanceLongTermUpgradeGuidanceView longTermUpgradeGuidance) {
        this.longTermUpgradeGuidance = longTermUpgradeGuidance;
    }

    public DeveloperScansScanItemsTransitiveUpgradeGuidanceShortTermUpgradeGuidanceView getShortTermUpgradeGuidance() {
        return shortTermUpgradeGuidance;
    }

    public void setShortTermUpgradeGuidance(DeveloperScansScanItemsTransitiveUpgradeGuidanceShortTermUpgradeGuidanceView shortTermUpgradeGuidance) {
        this.shortTermUpgradeGuidance = shortTermUpgradeGuidance;
    }

}
