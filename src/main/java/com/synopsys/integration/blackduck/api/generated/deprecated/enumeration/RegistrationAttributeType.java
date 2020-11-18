package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

@Deprecated
/**
* RegistrationAttributeType is now called RegistrationAttributesAttributeType
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum RegistrationAttributeType {
	CODEBASE_MANAGED_LINES_OF_CODE,
	INDEXED_LINES_OF_CODE,
	MANAGED_CODEBASE_BYTES_NEW,
	USER_LIMIT,
	CUSTOM_PROJECT_LIMIT,
	PROJECT_RELEASE_LIMIT,
	CODE_LOCATION_LIMIT,
	CODE_LOCATION_BYTES_LIMIT;

	public String prettyPrint() {
	    return EnumUtils.prettyPrint(this);
	}

}
