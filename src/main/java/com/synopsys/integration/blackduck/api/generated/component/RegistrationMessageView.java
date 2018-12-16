package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.RegistrationMessageCodeType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RegistrationMessageView extends BlackDuckComponent {
    private String message;
    private RegistrationMessageCodeType messageCode;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public RegistrationMessageCodeType getMessageCode() {
        return messageCode;
    }

    public void setMessageCode(RegistrationMessageCodeType messageCode) {
        this.messageCode = messageCode;
    }

}
