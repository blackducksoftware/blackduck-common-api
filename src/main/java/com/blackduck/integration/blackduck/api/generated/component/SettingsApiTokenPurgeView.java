/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class SettingsApiTokenPurgeView extends BlackDuckComponent {
    private Boolean apiTokenPurgeJobEnabled;
    private BigDecimal apiTokenPurgeWeeks;

    public Boolean getApiTokenPurgeJobEnabled() {
        return apiTokenPurgeJobEnabled;
    }

    public void setApiTokenPurgeJobEnabled(Boolean apiTokenPurgeJobEnabled) {
        this.apiTokenPurgeJobEnabled = apiTokenPurgeJobEnabled;
    }

    public BigDecimal getApiTokenPurgeWeeks() {
        return apiTokenPurgeWeeks;
    }

    public void setApiTokenPurgeWeeks(BigDecimal apiTokenPurgeWeeks) {
        this.apiTokenPurgeWeeks = apiTokenPurgeWeeks;
    }

}
