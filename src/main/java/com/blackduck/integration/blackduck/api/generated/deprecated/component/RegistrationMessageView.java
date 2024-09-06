/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.deprecated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.enumeration.RegistrationMessagesMessageCodeType;

// RegistrationMessageView from the previous API is now called RegistrationMessagesView
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public class RegistrationMessageView extends BlackDuckComponent {
    private String message;
    private RegistrationMessagesMessageCodeType messageCode;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RegistrationMessagesMessageCodeType getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(RegistrationMessagesMessageCodeType messageCode) {
        this.messageCode = messageCode;
    }

}
