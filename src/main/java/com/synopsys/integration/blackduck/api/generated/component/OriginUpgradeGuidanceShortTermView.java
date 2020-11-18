package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.OriginUpgradeGuidanceShortTermVulnerabilityRiskView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class OriginUpgradeGuidanceShortTermView extends BlackDuckComponent {
    private String version;
    private String origin;
    private String originName;
    private OriginUpgradeGuidanceShortTermVulnerabilityRiskView vulnerabilityRisk;
    private String versionName;
    private String originExternalId;
    private String originExternalNamespace;

    public String getVersion() {
	    return version;
    }

    public void setVersion(String version) {
	    this.version = version;
    }

    public String getOrigin() {
	    return origin;
    }

    public void setOrigin(String origin) {
	    this.origin = origin;
    }

    public String getOriginName() {
	    return originName;
    }

    public void setOriginName(String originName) {
	    this.originName = originName;
    }

    public OriginUpgradeGuidanceShortTermVulnerabilityRiskView getVulnerabilityRisk() {
	    return vulnerabilityRisk;
    }

    public void setVulnerabilityRisk(OriginUpgradeGuidanceShortTermVulnerabilityRiskView vulnerabilityRisk) {
	    this.vulnerabilityRisk = vulnerabilityRisk;
    }

    public String getVersionName() {
	    return versionName;
    }

    public void setVersionName(String versionName) {
	    this.versionName = versionName;
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

}