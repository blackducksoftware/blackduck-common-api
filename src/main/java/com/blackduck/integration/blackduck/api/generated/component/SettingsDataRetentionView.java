/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

import java.math.BigDecimal;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class SettingsDataRetentionView extends BlackDuckComponent {
    private BigDecimal autoRemovalGraceDays;
    private java.util.List<String> autoRemovalPhaseSet;
    private BigDecimal autoRemovalRetentionDays;
    private Boolean enableAutoRemoval;
    private BigDecimal unmappedCodeLocationRetentionDays;

    public BigDecimal getAutoRemovalGraceDays() {
        return autoRemovalGraceDays;
    }

    public void setAutoRemovalGraceDays(BigDecimal autoRemovalGraceDays) {
        this.autoRemovalGraceDays = autoRemovalGraceDays;
    }

    public java.util.List<String> getAutoRemovalPhaseSet() {
        return autoRemovalPhaseSet;
    }

    public void setAutoRemovalPhaseSet(java.util.List<String> autoRemovalPhaseSet) {
        this.autoRemovalPhaseSet = autoRemovalPhaseSet;
    }

    public BigDecimal getAutoRemovalRetentionDays() {
        return autoRemovalRetentionDays;
    }

    public void setAutoRemovalRetentionDays(BigDecimal autoRemovalRetentionDays) {
        this.autoRemovalRetentionDays = autoRemovalRetentionDays;
    }

    public Boolean getEnableAutoRemoval() {
        return enableAutoRemoval;
    }

    public void setEnableAutoRemoval(Boolean enableAutoRemoval) {
        this.enableAutoRemoval = enableAutoRemoval;
    }

    public BigDecimal getUnmappedCodeLocationRetentionDays() {
        return unmappedCodeLocationRetentionDays;
    }

    public void setUnmappedCodeLocationRetentionDays(BigDecimal unmappedCodeLocationRetentionDays) {
        this.unmappedCodeLocationRetentionDays = unmappedCodeLocationRetentionDays;
    }

}
