/**
 * blackduck-common-api
 *
 * Copyright (c) 2019 Synopsys, Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.RegistrationAttributeView;
import com.synopsys.integration.blackduck.api.generated.component.RegistrationFeatureView;
import com.synopsys.integration.blackduck.api.generated.component.RegistrationMessageView;
import com.synopsys.integration.blackduck.api.generated.enumeration.RegistrationStateType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RegistrationView extends BlackDuckView {
    private java.util.List<RegistrationAttributeView> attributes;
    private java.util.Date expirationDate;
    private java.util.Date expirationWarningDate;
    private java.util.List<RegistrationFeatureView> features;
    private java.util.List<RegistrationMessageView> messages;
    private String registrationId;
    private RegistrationStateType state;

    public java.util.List<RegistrationAttributeView> getAttributes() {
        return attributes;
    }

    public void setAttributes(java.util.List<RegistrationAttributeView> attributes) {
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

    public java.util.List<RegistrationFeatureView> getFeatures() {
        return features;
    }

    public void setFeatures(java.util.List<RegistrationFeatureView> features) {
        this.features = features;
    }

    public java.util.List<RegistrationMessageView> getMessages() {
        return messages;
    }

    public void setMessages(java.util.List<RegistrationMessageView> messages) {
        this.messages = messages;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public RegistrationStateType getState() {
        return state;
    }

    public void setState(RegistrationStateType state) {
        this.state = state;
    }

}
