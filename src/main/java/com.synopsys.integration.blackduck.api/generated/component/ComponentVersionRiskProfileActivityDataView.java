package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentVersionRiskProfileActivityDataTrendingType;
import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import java.util.Optional;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentVersionRiskProfileActivityDataView extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-6+json";

    private BigDecimal commitCount12Month;
    private BigDecimal newerReleases;
    private ComponentVersionRiskProfileActivityDataTrendingType trending;
    private BigDecimal contributorCount12Month;
    private java.util.Date lastCommitDate;

    public BigDecimal getCommitCount12Month() {
	return commitCount12Month;
    }

    public void setCommitCount12Month(BigDecimal commitCount12Month) {
	this.commitCount12Month = commitCount12Month;
    }

    public BigDecimal getNewerReleases() {
	return newerReleases;
    }

    public void setNewerReleases(BigDecimal newerReleases) {
	this.newerReleases = newerReleases;
    }

    public ComponentVersionRiskProfileActivityDataTrendingType getTrending() {
	return trending;
    }

    public void setTrending(ComponentVersionRiskProfileActivityDataTrendingType trending) {
	this.trending = trending;
    }

    public BigDecimal getContributorCount12Month() {
	return contributorCount12Month;
    }

    public void setContributorCount12Month(BigDecimal contributorCount12Month) {
	this.contributorCount12Month = contributorCount12Month;
    }

    public java.util.Date getLastCommitDate() {
	return lastCommitDate;
    }

    public void setLastCommitDate(java.util.Date lastCommitDate) {
	this.lastCommitDate = lastCommitDate;
    }


    public String getMediaType() {
	return mediaType;
    }

}
