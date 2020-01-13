package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.generated.enumeration.RegistrationAttributesAttributeType;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import java.util.Optional;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class RegistrationAttributesView extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.status-4+json";

    private BigDecimal limitValue;
    private BigDecimal currentValue;
    private BigDecimal warningValue;
    private RegistrationAttributesAttributeType attribute;

    public BigDecimal getLimitValue() {
	return limitValue;
    }

    public void setLimitValue(BigDecimal limitValue) {
	this.limitValue = limitValue;
    }

    public BigDecimal getCurrentValue() {
	return currentValue;
    }

    public void setCurrentValue(BigDecimal currentValue) {
	this.currentValue = currentValue;
    }

    public BigDecimal getWarningValue() {
	return warningValue;
    }

    public void setWarningValue(BigDecimal warningValue) {
	this.warningValue = warningValue;
    }

    public RegistrationAttributesAttributeType getAttribute() {
	return attribute;
    }

    public void setAttribute(RegistrationAttributesAttributeType attribute) {
	this.attribute = attribute;
    }


    public String getMediaType() {
	return mediaType;
    }

}
