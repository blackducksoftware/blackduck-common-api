/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.response;

import com.blackduck.integration.blackduck.api.core.BlackDuckResponse;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class HealthChecksLivenessView extends BlackDuckResponse {
    private Boolean healthy;

    public Boolean getHealthy() {
        return healthy;
    }

    public void setHealthy(Boolean healthy) {
        this.healthy = healthy;
    }

}
