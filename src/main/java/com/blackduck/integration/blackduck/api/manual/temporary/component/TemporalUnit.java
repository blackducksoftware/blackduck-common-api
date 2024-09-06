/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class TemporalUnit extends BlackDuckComponent {
    private Boolean dateBased;
    private Boolean durationEstimated;
    private Boolean timeBased;

    public Boolean getDateBased() {
        return dateBased;
    }

    public void setDateBased(Boolean dateBased) {
        this.dateBased = dateBased;
    }

    public Boolean getDurationEstimated() {
        return durationEstimated;
    }

    public void setDurationEstimated(Boolean durationEstimated) {
        this.durationEstimated = durationEstimated;
    }

    public Boolean getTimeBased() {
        return timeBased;
    }

    public void setTimeBased(Boolean timeBased) {
        this.timeBased = timeBased;
    }

}
