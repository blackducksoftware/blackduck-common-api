package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.RegistrationAttributeType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RegistrationAttributeView extends BlackDuckComponent {
    private RegistrationAttributeType attribute;
    private Long currentValue;
    private Long limitValue;
    private Long warningValue;

    public RegistrationAttributeType getAttribute() {
        return attribute;
    }

    public void setAttribute(RegistrationAttributeType attribute) {
        this.attribute = attribute;
    }

    public Long getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Long currentValue) {
        this.currentValue = currentValue;
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
