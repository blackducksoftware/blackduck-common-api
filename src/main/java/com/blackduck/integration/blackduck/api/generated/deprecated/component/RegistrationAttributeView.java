/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.deprecated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.enumeration.RegistrationAttributesAttributeType;

import java.math.BigDecimal;

// RegistrationAttributeView from the previous API is now called RegistrationAttributesView
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public class RegistrationAttributeView extends BlackDuckComponent {
    private RegistrationAttributesAttributeType attribute;
    private BigDecimal currentValue;
    private BigDecimal limitValue;
    private BigDecimal warningValue;

    public RegistrationAttributesAttributeType getAttribute() {
        return attribute;
    }

    public void setAttribute(RegistrationAttributesAttributeType attribute) {
        this.attribute = attribute;
    }

    public BigDecimal getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(BigDecimal currentValue) {
        this.currentValue = currentValue;
    }

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

}
