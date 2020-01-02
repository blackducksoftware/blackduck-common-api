package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum RegistrationAttributesAttributeType {
	CODEBASE_MANAGED_LINES_OF_CODE,
	INDEXED_LINES_OF_CODE,
	MANAGED_CODEBASE_BYTES_NEW,
	USER_LIMIT,
	CUSTOM_PROJECT_LIMIT,
	PROJECT_RELEASE_LIMIT,
	CODE_LOCATION_LIMIT,
	CODE_LOCATION_BYTES_LIMIT;

	private String mediaType = "application/vnd.blackducksoftware.status-4+json";

	public String getMediaType() {
	return mediaType;
	}

	public String prettyPrint() {
	return EnumUtils.prettyPrint(this);
	}

} 