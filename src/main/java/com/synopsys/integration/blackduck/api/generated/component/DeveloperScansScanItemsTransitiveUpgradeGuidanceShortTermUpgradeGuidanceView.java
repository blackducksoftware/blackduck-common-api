/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.DeveloperScansScanItemsTransitiveUpgradeGuidanceShortTermUpgradeGuidanceVulnerabilityRiskView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class DeveloperScansScanItemsTransitiveUpgradeGuidanceShortTermUpgradeGuidanceView extends BlackDuckComponent {
    private String versionName;
    private DeveloperScansScanItemsTransitiveUpgradeGuidanceShortTermUpgradeGuidanceVulnerabilityRiskView vulnerabilityRisk;

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public DeveloperScansScanItemsTransitiveUpgradeGuidanceShortTermUpgradeGuidanceVulnerabilityRiskView getVulnerabilityRisk() {
        return vulnerabilityRisk;
    }

    public void setVulnerabilityRisk(DeveloperScansScanItemsTransitiveUpgradeGuidanceShortTermUpgradeGuidanceVulnerabilityRiskView vulnerabilityRisk) {
        this.vulnerabilityRisk = vulnerabilityRisk;
    }

}
