package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.RegistrationFeatureType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RegistrationFeatureView extends BlackDuckComponent {
    private RegistrationFeatureType feature;
    private Long limitValue;
    private Long warningValue;

    public RegistrationFeatureType getFeature() {
        return feature;
    }

    public void setFeature(RegistrationFeatureType feature) {
        this.feature = feature;
    }

    public Long getLimitValue() {
        return limitValue;
    }

    public void setLimitValue(Long limitValue) {
        this.limitValue = limitValue;
    }

    public Long getWarningValue() {
        return warningValue;
    }

    public void setWarningValue(Long warningValue) {
        this.warningValue = warningValue;
    }

}
