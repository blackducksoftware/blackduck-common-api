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
public class OriginUpgradeGuidanceView extends BlackDuckComponent {
    private String component;
    private String componentName;
    private OriginUpgradeGuidanceLongTermView longTerm;
    private String origin;
    private String originExternalId;
    private String originExternalNamespace;
    private String originName;
    private OriginUpgradeGuidanceShortTermView shortTerm;
    private String version;
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

    public OriginUpgradeGuidanceLongTermView getLongTerm() {
        return longTerm;
    }

    public void setLongTerm(OriginUpgradeGuidanceLongTermView longTerm) {
        this.longTerm = longTerm;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
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

    public String getOriginName() {
        return originName;
    }

    public void setOriginName(String originName) {
        this.originName = originName;
    }

    public OriginUpgradeGuidanceShortTermView getShortTerm() {
        return shortTerm;
    }

    public void setShortTerm(OriginUpgradeGuidanceShortTermView shortTerm) {
        this.shortTerm = shortTerm;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

}
