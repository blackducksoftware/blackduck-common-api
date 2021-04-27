/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
/*
* blackduck-common-api
*
* Copyright (c) 2021 Synopsys, Inc.
*
* Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
*/
package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public enum RegistrationMessagesMessageCodeType {
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
