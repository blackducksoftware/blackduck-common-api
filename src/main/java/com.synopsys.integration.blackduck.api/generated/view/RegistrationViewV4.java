package com.synopsys.integration.blackduck.api.generated.view;

import java.util.List;
import com.synopsys.integration.blackduck.api.generated.component.RegistrationAttributesView;
import com.synopsys.integration.blackduck.api.generated.enumeration.RegistrationStateType;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.RegistrationFeaturesView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.component.RegistrationMessagesView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class RegistrationViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.status-4+json";

    private java.util.List<RegistrationAttributesView> attributes;
    private String registrationId;
    private java.util.List<RegistrationMessagesView> messages;
    private java.util.Date expirationWarningDate;
    private RegistrationStateType state;
    private java.util.Date expirationDate;
    private java.util.List<RegistrationFeaturesView> features;

    public java.util.List<RegistrationAttributesView> getAttributes() {
	return attributes;
    }

    public void setAttributes(java.util.List<RegistrationAttributesView> attributes) {
	this.attributes = attributes;
    }

    public String getRegistrationId() {
	return registrationId;
    }

    public void setRegistrationId(String registrationId) {
	this.registrationId = registrationId;
    }

    public java.util.List<RegistrationMessagesView> getMessages() {
	return messages;
    }

    public void setMessages(java.util.List<RegistrationMessagesView> messages) {
	this.messages = messages;
    }

    public java.util.Date getExpirationWarningDate() {
	return expirationWarningDate;
    }

    public void setExpirationWarningDate(java.util.Date expirationWarningDate) {
	this.expirationWarningDate = expirationWarningDate;
    }

    public RegistrationStateType getState() {
	return state;
    }

    public void setState(RegistrationStateType state) {
	this.state = state;
    }

    public java.util.Date getExpirationDate() {
	return expirationDate;
    }

    public void setExpirationDate(java.util.Date expirationDate) {
	this.expirationDate = expirationDate;
    }

    public java.util.List<RegistrationFeaturesView> getFeatures() {
	return features;
    }

    public void setFeatures(java.util.List<RegistrationFeaturesView> features) {
	this.features = features;
    }


    public String getMediaType() {
	return mediaType;
    }

}
