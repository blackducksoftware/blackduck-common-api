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
public class ScanFullResultItemsTransitiveUpgradeGuidanceView extends BlackDuckComponent {
    private String component;
    private String componentName;
    private String externalId;
    private ScanFullResultItemsTransitiveUpgradeGuidanceLongTermUpgradeGuidanceView longTermUpgradeGuidance;
    private String originExternalId;
    private String originExternalNamespace;
    private ScanFullResultItemsTransitiveUpgradeGuidanceShortTermUpgradeGuidanceView shortTermUpgradeGuidance;
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

    public ScanFullResultItemsTransitiveUpgradeGuidanceLongTermUpgradeGuidanceView getLongTermUpgradeGuidance() {
        return longTermUpgradeGuidance;
    }

    public void setLongTermUpgradeGuidance(ScanFullResultItemsTransitiveUpgradeGuidanceLongTermUpgradeGuidanceView longTermUpgradeGuidance) {
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

    public ScanFullResultItemsTransitiveUpgradeGuidanceShortTermUpgradeGuidanceView getShortTermUpgradeGuidance() {
        return shortTermUpgradeGuidance;
    }

    public void setShortTermUpgradeGuidance(ScanFullResultItemsTransitiveUpgradeGuidanceShortTermUpgradeGuidanceView shortTermUpgradeGuidance) {
        this.shortTermUpgradeGuidance = shortTermUpgradeGuidance;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

}
