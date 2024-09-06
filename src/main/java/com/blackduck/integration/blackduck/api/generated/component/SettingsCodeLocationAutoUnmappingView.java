/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.manual.temporary.enumeration.ProjectVersionPhaseType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class SettingsCodeLocationAutoUnmappingView extends BlackDuckComponent {
    private Boolean autoUnmappingEnabled;
    private BigDecimal autoUnmappingGracePeriodInDays;
    private java.util.List<ProjectVersionPhaseType> autoUnmappingReleasePhaseFilter;
    private BigDecimal autoUnmappingRetentionPeriodInDays;

    public Boolean getAutoUnmappingEnabled() {
        return autoUnmappingEnabled;
    }

    public void setAutoUnmappingEnabled(Boolean autoUnmappingEnabled) {
        this.autoUnmappingEnabled = autoUnmappingEnabled;
    }

    public BigDecimal getAutoUnmappingGracePeriodInDays() {
        return autoUnmappingGracePeriodInDays;
    }

    public void setAutoUnmappingGracePeriodInDays(BigDecimal autoUnmappingGracePeriodInDays) {
        this.autoUnmappingGracePeriodInDays = autoUnmappingGracePeriodInDays;
    }

    public java.util.List<ProjectVersionPhaseType> getAutoUnmappingReleasePhaseFilter() {
        return autoUnmappingReleasePhaseFilter;
    }

    public void setAutoUnmappingReleasePhaseFilter(java.util.List<ProjectVersionPhaseType> autoUnmappingReleasePhaseFilter) {
        this.autoUnmappingReleasePhaseFilter = autoUnmappingReleasePhaseFilter;
    }

    public BigDecimal getAutoUnmappingRetentionPeriodInDays() {
        return autoUnmappingRetentionPeriodInDays;
    }

    public void setAutoUnmappingRetentionPeriodInDays(BigDecimal autoUnmappingRetentionPeriodInDays) {
        this.autoUnmappingRetentionPeriodInDays = autoUnmappingRetentionPeriodInDays;
    }

}
