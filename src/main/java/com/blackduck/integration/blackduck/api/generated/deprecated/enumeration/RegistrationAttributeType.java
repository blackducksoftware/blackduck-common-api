/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.deprecated.enumeration;

import com.blackduck.integration.util.EnumUtils;

// RegistrationAttributeType is now called RegistrationAttributesAttributeType
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public enum RegistrationAttributeType {
    CODEBASE_MANAGED_LINES_OF_CODE,
	CODE_LOCATION_BYTES_LIMIT,
	CODE_LOCATION_LIMIT,
	CUSTOM_PROJECT_LIMIT,
	INDEXED_LINES_OF_CODE,
	MANAGED_CODEBASE_BYTES_NEW,
	PROJECT_RELEASE_LIMIT,
	USER_LIMIT;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
