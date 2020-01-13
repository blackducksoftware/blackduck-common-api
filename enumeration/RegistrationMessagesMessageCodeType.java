package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum RegistrationMessagesMessageCodeType {
	ACTIVATE_REGISTRATION_ERROR,
	DATE_PARSING_ERROR,
	EXPIRATION_DATE_WARNING,
	INSTALLATION_INCOMPLETE_ERROR,
	INVALID_REGISTRATION_ERROR,
	INVALID_LICENSE_USAGE_WINDOW,
	NETWORK_FAILURE_ERROR,
	REFRESH_REGISTRATION_ERROR;

	private String mediaType = "application/vnd.blackducksoftware.status-4+json";

	public String getMediaType() {
	return mediaType;
	}

	public String prettyPrint() {
	return EnumUtils.prettyPrint(this);
	}

} 