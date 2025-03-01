/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.view;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;
import com.blackduck.integration.blackduck.api.generated.component.RegistrationAttributesView;
import com.blackduck.integration.blackduck.api.generated.component.RegistrationFeaturesView;
import com.blackduck.integration.blackduck.api.generated.component.RegistrationMessagesView;
import com.blackduck.integration.blackduck.api.generated.enumeration.RegistrationStateType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RegistrationView extends BlackDuckView {
    private java.util.List<RegistrationAttributesView> attributes;
    private java.util.Date expirationDate;
    private java.util.Date expirationWarningDate;
    private java.util.List<RegistrationFeaturesView> features;
    private java.util.List<RegistrationMessagesView> messages;
    private String registrationId;
    private String serviceStatus;
    private java.util.Date startDate;
    private RegistrationStateType state;

    public java.util.List<RegistrationAttributesView> getAttributes() {
        return attributes;
    }

    public void setAttributes(java.util.List<RegistrationAttributesView> attributes) {
        this.attributes = attributes;
    }

    public java.util.Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public java.util.Date getExpirationWarningDate() {
        return expirationWarningDate;
    }

    public void setExpirationWarningDate(java.util.Date expirationWarningDate) {
        this.expirationWarningDate = expirationWarningDate;
    }

    public java.util.List<RegistrationFeaturesView> getFeatures() {
        return features;
    }

    public void setFeatures(java.util.List<RegistrationFeaturesView> features) {
        this.features = features;
    }

    public java.util.List<RegistrationMessagesView> getMessages() {
        return messages;
    }

    public void setMessages(java.util.List<RegistrationMessagesView> messages) {
        this.messages = messages;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public String getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(String serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public java.util.Date getStartDate() {
        return startDate;
    }

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    public RegistrationStateType getState() {
        return state;
    }

    public void setState(RegistrationStateType state) {
        this.state = state;
    }

}
