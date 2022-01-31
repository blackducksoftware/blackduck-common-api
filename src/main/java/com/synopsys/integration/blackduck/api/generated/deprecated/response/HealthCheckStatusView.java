/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.deprecated.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;

// HealthCheckStatusView from the previous API is now called HealthChecksLivenessView
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public class HealthCheckStatusView extends BlackDuckResponse {
    private Boolean healthy;

    public Boolean getHealthy() {
        return healthy;
    }

    public void setHealthy(Boolean healthy) {
        this.healthy = healthy;
    }

}
