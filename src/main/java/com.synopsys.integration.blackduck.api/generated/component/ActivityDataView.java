package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentActivityDataTrendingType;

@Deprecated
// ActivityDataView is now called ProjectVersionComponentActivityDataView
//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ActivityDataView extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-4+json";

    private BigDecimal commitCount12Month;
    private ProjectVersionComponentActivityDataTrendingType trending;
    private BigDecimal newerReleases;
    private BigDecimal contributorCount12Month;
    private String lastCommitDate;

    public BigDecimal getCommitCount12Month() {
	return commitCount12Month;
    }

    public void setCommitCount12Month(BigDecimal commitCount12Month) {
	this.commitCount12Month = commitCount12Month;
    }

    public ProjectVersionComponentActivityDataTrendingType getTrending() {
	return trending;
    }

    public void setTrending(ProjectVersionComponentActivityDataTrendingType trending) {
	this.trending = trending;
    }

    public BigDecimal getNewerReleases() {
	return newerReleases;
    }

    public void setNewerReleases(BigDecimal newerReleases) {
	this.newerReleases = newerReleases;
    }

    public BigDecimal getContributorCount12Month() {
	return contributorCount12Month;
    }

    public void setContributorCount12Month(BigDecimal contributorCount12Month) {
	this.contributorCount12Month = contributorCount12Month;
    }

    public String getLastCommitDate() {
	return lastCommitDate;
    }

    public void setLastCommitDate(String lastCommitDate) {
	this.lastCommitDate = lastCommitDate;
    }


    public String getMediaType() {
	return mediaType;
    }

}
