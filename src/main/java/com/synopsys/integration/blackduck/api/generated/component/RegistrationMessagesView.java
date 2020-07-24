package com.synopsys.integration.blackduck.api.generated.component;

import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.RegistrationMessagesMessageCodeType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class RegistrationMessagesView extends BlackDuckComponent {
    private RegistrationMessagesMessageCodeType messageCode;
    private String message;

    public RegistrationMessagesMessageCodeType getMessageCode() {
	    return messageCode;
    }

    public void setMessageCode(RegistrationMessagesMessageCodeType messageCode) {
	    this.messageCode = messageCode;
    }

    public String getMessage() {
	    return message;
    }

    public void setMessage(String message) {
	    this.message = message;
    }

}
