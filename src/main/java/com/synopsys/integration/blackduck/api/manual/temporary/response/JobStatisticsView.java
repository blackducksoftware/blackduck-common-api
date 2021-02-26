/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.blackduck.api.manual.temporary.component.Duration;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class JobStatisticsView extends BlackDuckResponse {
    private Duration averageRuntime;
    private String jobType;
    private Long totalFailures;
    private Long totalInProgress;
    private Long totalRuns;
    private Long totalSuccesses;

    public Duration getAverageRuntime() {
        return averageRuntime;
    }

    public void setAverageRuntime(Duration averageRuntime) {
        this.averageRuntime = averageRuntime;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public Long getTotalFailures() {
        return totalFailures;
    }

    public void setTotalFailures(Long totalFailures) {
        this.totalFailures = totalFailures;
    }

    public Long getTotalInProgress() {
        return totalInProgress;
    }

    public void setTotalInProgress(Long totalInProgress) {
        this.totalInProgress = totalInProgress;
    }

    public Long getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(Long totalRuns) {
        this.totalRuns = totalRuns;
    }

    public Long getTotalSuccesses() {
        return totalSuccesses;
    }

    public void setTotalSuccesses(Long totalSuccesses) {
        this.totalSuccesses = totalSuccesses;
    }

}
