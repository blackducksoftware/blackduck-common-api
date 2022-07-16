/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PurgeTokensJobStatusView extends BlackDuckComponent {
    private Boolean jobEnabled;
    private BigDecimal maxWeeks;
    private BigDecimal minWeeks;
    private BigDecimal purgeWeeks;
    private String startTime;

    public Boolean getJobEnabled() {
        return jobEnabled;
    }

    public void setJobEnabled(Boolean jobEnabled) {
        this.jobEnabled = jobEnabled;
    }

    public BigDecimal getMaxWeeks() {
        return maxWeeks;
    }

    public void setMaxWeeks(BigDecimal maxWeeks) {
        this.maxWeeks = maxWeeks;
    }

    public BigDecimal getMinWeeks() {
        return minWeeks;
    }

    public void setMinWeeks(BigDecimal minWeeks) {
        this.minWeeks = minWeeks;
    }

    public BigDecimal getPurgeWeeks() {
        return purgeWeeks;
    }

    public void setPurgeWeeks(BigDecimal purgeWeeks) {
        this.purgeWeeks = purgeWeeks;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

}
