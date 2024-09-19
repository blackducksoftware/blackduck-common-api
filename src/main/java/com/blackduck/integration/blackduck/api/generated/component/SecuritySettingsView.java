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
public class SecuritySettingsView extends BlackDuckComponent {
    private BigDecimal complexity;
    private Boolean enabled;
    private BigDecimal maximumLength;
    private BigDecimal minimumLength;

    public BigDecimal getComplexity() {
        return complexity;
    }

    public void setComplexity(BigDecimal complexity) {
        this.complexity = complexity;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public BigDecimal getMaximumLength() {
        return maximumLength;
    }

    public void setMaximumLength(BigDecimal maximumLength) {
        this.maximumLength = maximumLength;
    }

    public BigDecimal getMinimumLength() {
        return minimumLength;
    }

    public void setMinimumLength(BigDecimal minimumLength) {
        this.minimumLength = minimumLength;
    }

}
