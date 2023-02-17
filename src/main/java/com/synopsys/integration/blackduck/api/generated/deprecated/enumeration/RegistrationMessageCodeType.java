/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

// RegistrationMessageCodeType is now called RegistrationMessagesMessageCodeType
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public enum RegistrationMessageCodeType {
    ACTIVATE_REGISTRATION_ERROR,
	DATE_PARSING_ERROR,
	EXPIRATION_DATE_WARNING,
	INSTALLATION_INCOMPLETE_ERROR,
	INVALID_LICENSE_USAGE_WINDOW,
	INVALID_REGISTRATION_ERROR,
	NETWORK_FAILURE_ERROR,
	REFRESH_REGISTRATION_ERROR;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
