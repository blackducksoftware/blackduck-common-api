package com.synopsys.integration.blackduck.api.generated.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentsViewV4 extends BlackDuckResponse {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-4+json";

    private String componentName;
    private String versionName;
    private String version;
    private String component;
    private String variant;
    private String originId;

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

    public String getVersion() {
	return version;
    }

    public void setVersion(String version) {
	this.version = version;
    }

    public String getComponent() {
	return component;
    }

    public void setComponent(String component) {
	this.component = component;
    }

    public String getVariant() {
	return variant;
    }

    public void setVariant(String variant) {
	this.variant = variant;
    }

    public String getOriginId() {
	return originId;
    }

    public void setOriginId(String originId) {
	this.originId = originId;
    }


    public String getMediaType() {
	return mediaType;
    }

}
