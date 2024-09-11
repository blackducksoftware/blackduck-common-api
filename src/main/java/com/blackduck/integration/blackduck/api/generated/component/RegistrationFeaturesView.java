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
import com.blackduck.integration.blackduck.api.generated.enumeration.RegistrationFeaturesFeatureType;
import com.blackduck.integration.blackduck.api.generated.enumeration.RegistrationFeaturesStateType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RegistrationFeaturesView extends BlackDuckComponent {
    private RegistrationFeaturesFeatureType feature;
    private Boolean hidden;
    private BigDecimal limitValue;
    private RegistrationFeaturesStateType state;
    private BigDecimal warningValue;

    public RegistrationFeaturesFeatureType getFeature() {
        return feature;
    }

    public void setFeature(RegistrationFeaturesFeatureType feature) {
        this.feature = feature;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public BigDecimal getLimitValue() {
        return limitValue;
    }

    public void setLimitValue(BigDecimal limitValue) {
        this.limitValue = limitValue;
    }

    public RegistrationFeaturesStateType getState() {
        return state;
    }

    public void setState(RegistrationFeaturesStateType state) {
        this.state = state;
    }

    public BigDecimal getWarningValue() {
        return warningValue;
    }

    public void setWarningValue(BigDecimal warningValue) {
        this.warningValue = warningValue;
    }

}
