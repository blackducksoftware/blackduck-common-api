/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionUpgradeGuidanceLongTermVulnerabilityRiskView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionUpgradeGuidanceLongTermView extends BlackDuckComponent {
    private String origin;
    private String originExternalId;
    private String originExternalNamespace;
    private String originName;
    private String version;
    private String versionName;
    private ComponentVersionUpgradeGuidanceLongTermVulnerabilityRiskView vulnerabilityRisk;

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

    public ComponentVersionUpgradeGuidanceLongTermVulnerabilityRiskView getVulnerabilityRisk() {
        return vulnerabilityRisk;
    }

    public void setVulnerabilityRisk(ComponentVersionUpgradeGuidanceLongTermVulnerabilityRiskView vulnerabilityRisk) {
        this.vulnerabilityRisk = vulnerabilityRisk;
    }

}
