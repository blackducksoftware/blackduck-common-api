/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.enumeration;

import com.blackduck.integration.util.EnumUtils;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public enum SystemOauthClientGrantTypesType {
    AUTHORIZATION_CODE,
	CLIENT_CREDENTIALS,
	IMPLICIT,
	PASSWORD,
	REFRESH_TOKEN;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
