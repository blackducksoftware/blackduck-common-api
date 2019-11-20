package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.generated.enumeration.RegistrationMessagesMessageCodeType;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import java.util.Optional;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class RegistrationMessagesView extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.status-4+json";

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


    public String getMediaType() {
	return mediaType;
    }

}
