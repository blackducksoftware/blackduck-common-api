package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ActivityDataTrendingType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ActivityDataView extends BlackDuckComponent {
    private Long commitCount12Month;
    private Long contributorCount12Month;
    private java.util.Date lastCommitDate;
    private ActivityDataTrendingType trending;

    public Long getCommitCount12Month() {
        return commitCount12Month;
    }

    public void setCommitCount12Month(Long commitCount12Month) {
        this.commitCount12Month = commitCount12Month;
    }

    public Long getContributorCount12Month() {
        return contributorCount12Month;
    }

    public void setContributorCount12Month(Long contributorCount12Month) {
        this.contributorCount12Month = contributorCount12Month;
    }

    public java.util.Date getLastCommitDate() {
        return lastCommitDate;
    }

    public void setLastCommitDate(java.util.Date lastCommitDate) {
        this.lastCommitDate = lastCommitDate;
    }

    public ActivityDataTrendingType getTrending() {
        return trending;
    }

    public void setTrending(ActivityDataTrendingType trending) {
        this.trending = trending;
    }

}
