package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

@Deprecated
/**
* VersionDataView from the previous API is now called ComponentVersionRiskProfileVersionDataView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class VersionDataView extends BlackDuckComponent {
    private java.util.Date releasedOn;
    private BigDecimal newerReleasesCount;

    public java.util.Date getReleasedOn() {
	    return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
	    this.releasedOn = releasedOn;
    }

    public BigDecimal getNewerReleasesCount() {
	    return newerReleasesCount;
    }

    public void setNewerReleasesCount(BigDecimal newerReleasesCount) {
	    this.newerReleasesCount = newerReleasesCount;
    }

}
