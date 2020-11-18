package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.OriginUpgradeGuidanceLongTermView;
import com.synopsys.integration.blackduck.api.generated.component.OriginUpgradeGuidanceShortTermView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class OriginUpgradeGuidanceView extends BlackDuckComponent {
    private String component;
    private String origin;
    private String version;
    private String originName;
    private OriginUpgradeGuidanceLongTermView longTerm;
    private OriginUpgradeGuidanceShortTermView shortTerm;
    private String originExternalId;
    private String componentName;
    private String versionName;
    private String originExternalNamespace;

    public String getComponent() {
	    return component;
    }

    public void setComponent(String component) {
	    this.component = component;
    }

    public String getOrigin() {
	    return origin;
    }

    public void setOrigin(String origin) {
	    this.origin = origin;
    }

    public String getVersion() {
	    return version;
    }

    public void setVersion(String version) {
	    this.version = version;
    }

    public String getOriginName() {
	    return originName;
    }

    public void setOriginName(String originName) {
	    this.originName = originName;
    }

    public OriginUpgradeGuidanceLongTermView getLongTerm() {
	    return longTerm;
    }

    public void setLongTerm(OriginUpgradeGuidanceLongTermView longTerm) {
	    this.longTerm = longTerm;
    }

    public OriginUpgradeGuidanceShortTermView getShortTerm() {
	    return shortTerm;
    }

    public void setShortTerm(OriginUpgradeGuidanceShortTermView shortTerm) {
	    this.shortTerm = shortTerm;
    }

    public String getOriginExternalId() {
	    return originExternalId;
    }

    public void setOriginExternalId(String originExternalId) {
	    this.originExternalId = originExternalId;
    }

    public String getComponentName() {
	    return componentName;
    }

    public void setComponentName(String componentName) {
	    this.componentName = componentName;
    }

    public String getVersionName() {
	    return versionName;
    }

    public void setVersionName(String versionName) {
	    this.versionName = versionName;
    }

    public String getOriginExternalNamespace() {
	    return originExternalNamespace;
    }

    public void setOriginExternalNamespace(String originExternalNamespace) {
	    this.originExternalNamespace = originExternalNamespace;
    }

}
