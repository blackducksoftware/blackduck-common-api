package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import java.util.Optional;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentVersionRemediatingFixesPreviousVulnerabilitiesView extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-5+json";

    private java.util.Date releasedOn;
    private BigDecimal vulnerabilityCount;
    private String name;
    private String componentVersion;

    public java.util.Date getReleasedOn() {
	return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
	this.releasedOn = releasedOn;
    }

    public BigDecimal getVulnerabilityCount() {
	return vulnerabilityCount;
    }

    public void setVulnerabilityCount(BigDecimal vulnerabilityCount) {
	this.vulnerabilityCount = vulnerabilityCount;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getComponentVersion() {
	return componentVersion;
    }

    public void setComponentVersion(String componentVersion) {
	this.componentVersion = componentVersion;
    }


    public String getMediaType() {
	return mediaType;
    }

}
