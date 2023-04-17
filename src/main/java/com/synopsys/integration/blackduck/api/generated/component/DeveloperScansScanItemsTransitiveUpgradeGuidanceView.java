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
    private String component;
    private String componentName;
    private String externalId;
    private DeveloperScansScanItemsTransitiveUpgradeGuidanceLongTermUpgradeGuidanceView longTermUpgradeGuidance;
    private String originExternalId;
    private String originExternalNamespace;
    private DeveloperScansScanItemsTransitiveUpgradeGuidanceShortTermUpgradeGuidanceView shortTermUpgradeGuidance;
    private String versionName;

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

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

    public String getOriginExternalId() {
        return originExternalId;
    }

    public void setOriginExternalId(String originExternalId) {
        this.originExternalId = originExternalId;
    }

    public String getOriginExternalNamespace() {
        return originExternalNamespace;
    }

    public void setOriginExternalNamespace(String originExternalNamespace) {
        this.originExternalNamespace = originExternalNamespace;
    }

    public DeveloperScansScanItemsTransitiveUpgradeGuidanceShortTermUpgradeGuidanceView getShortTermUpgradeGuidance() {
        return shortTermUpgradeGuidance;
    }

    public void setShortTermUpgradeGuidance(DeveloperScansScanItemsTransitiveUpgradeGuidanceShortTermUpgradeGuidanceView shortTermUpgradeGuidance) {
        this.shortTermUpgradeGuidance = shortTermUpgradeGuidance;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

}
