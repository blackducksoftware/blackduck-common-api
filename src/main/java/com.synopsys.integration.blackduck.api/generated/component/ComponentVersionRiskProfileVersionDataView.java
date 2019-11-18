package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import java.util.Optional;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionRiskProfileVersionDataView extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-5+json";

    private BigDecimal newerReleasesCount;
    private String releasedOn;

    public BigDecimal getNewerReleasesCount() {
	return newerReleasesCount;
    }

    public void setNewerReleasesCount(BigDecimal newerReleasesCount) {
	this.newerReleasesCount = newerReleasesCount;
    }

    public String getReleasedOn() {
	return releasedOn;
    }

    public void setReleasedOn(String releasedOn) {
	this.releasedOn = releasedOn;
    }


    public String getMediaType() {
	return mediaType;
    }

}
