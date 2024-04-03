/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.RegistrationFeaturesFeatureType;
import com.synopsys.integration.blackduck.api.generated.enumeration.RegistrationFeaturesStateType;

// RegistrationFeatureView from the previous API is now called RegistrationFeaturesView
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public class RegistrationFeatureView extends BlackDuckComponent {
    private RegistrationFeaturesFeatureType feature;
    private BigDecimal limitValue;
    private RegistrationFeaturesStateType state;
    private BigDecimal warningValue;

    public RegistrationFeaturesFeatureType getFeature() {
        return feature;
    }

    public void setFeature(RegistrationFeaturesFeatureType feature) {
        this.feature = feature;
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
