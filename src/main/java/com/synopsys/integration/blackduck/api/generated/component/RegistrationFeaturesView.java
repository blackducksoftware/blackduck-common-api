package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.RegistrationFeaturesFeatureType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class RegistrationFeaturesView extends BlackDuckComponent {
    private BigDecimal limitValue;
    private BigDecimal warningValue;
    private RegistrationFeaturesFeatureType feature;

    public BigDecimal getLimitValue() {
	    return limitValue;
    }

    public void setLimitValue(BigDecimal limitValue) {
	    this.limitValue = limitValue;
    }

    public BigDecimal getWarningValue() {
	    return warningValue;
    }

    public void setWarningValue(BigDecimal warningValue) {
	    this.warningValue = warningValue;
    }

    public RegistrationFeaturesFeatureType getFeature() {
	    return feature;
    }

    public void setFeature(RegistrationFeaturesFeatureType feature) {
	    this.feature = feature;
    }

}
