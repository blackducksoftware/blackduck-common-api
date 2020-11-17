package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.component.OriginLicenseView;
import com.synopsys.integration.blackduck.api.generated.enumeration.OriginSourceType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class OriginView extends BlackDuckView {
    private String originId;
    private String originUrl;
    private String externalId;
    private java.util.Date releasedOn;
    private String originName;
    private OriginSourceType source;
    private OriginLicenseView license;
    private String externalNamespace;
    private String versionName;

    public String getOriginId() {
	    return originId;
    }

    public void setOriginId(String originId) {
	    this.originId = originId;
    }

    public String getOriginUrl() {
	    return originUrl;
    }

    public void setOriginUrl(String originUrl) {
	    this.originUrl = originUrl;
    }

    public String getExternalId() {
	    return externalId;
    }

    public void setExternalId(String externalId) {
	    this.externalId = externalId;
    }

    public java.util.Date getReleasedOn() {
	    return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
	    this.releasedOn = releasedOn;
    }

    public String getOriginName() {
	    return originName;
    }

    public void setOriginName(String originName) {
	    this.originName = originName;
    }

    public OriginSourceType getSource() {
	    return source;
    }

    public void setSource(OriginSourceType source) {
	    this.source = source;
    }

    public OriginLicenseView getLicense() {
	    return license;
    }

    public void setLicense(OriginLicenseView license) {
	    this.license = license;
    }

    public String getExternalNamespace() {
	    return externalNamespace;
    }

    public void setExternalNamespace(String externalNamespace) {
	    this.externalNamespace = externalNamespace;
    }

    public String getVersionName() {
	    return versionName;
    }

    public void setVersionName(String versionName) {
	    this.versionName = versionName;
    }

}
