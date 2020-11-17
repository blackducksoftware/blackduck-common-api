package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

@Deprecated
/**
* RegistrationMessageCodeType is now called RegistrationMessagesMessageCodeType
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum RegistrationMessageCodeType {
	ACTIVATE_REGISTRATION_ERROR,
	DATE_PARSING_ERROR,
	EXPIRATION_DATE_WARNING,
	INSTALLATION_INCOMPLETE_ERROR,
	INVALID_REGISTRATION_ERROR,
	INVALID_LICENSE_USAGE_WINDOW,
	NETWORK_FAILURE_ERROR,
	REFRESH_REGISTRATION_ERROR;

	public String prettyPrint() {
	    return EnumUtils.prettyPrint(this);
	}

}
