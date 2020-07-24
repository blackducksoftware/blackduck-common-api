package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentVersionRemediatingFixesPreviousVulnerabilitiesView extends BlackDuckComponent {
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

}
