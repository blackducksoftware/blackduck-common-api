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
public class ComponentVersionRiskProfileVersionDataView extends BlackDuckComponent {
    private BigDecimal newerReleasesCount;
    private java.util.Date releasedOn;

    public BigDecimal getNewerReleasesCount() {
        return newerReleasesCount;
    }

    public void setNewerReleasesCount(BigDecimal newerReleasesCount) {
        this.newerReleasesCount = newerReleasesCount;
    }

    public java.util.Date getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
        this.releasedOn = releasedOn;
    }

}
