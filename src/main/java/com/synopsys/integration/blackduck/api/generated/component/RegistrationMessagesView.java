/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.RegistrationMessagesMessageCodeType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RegistrationMessagesView extends BlackDuckComponent {
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
