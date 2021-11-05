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
public enum ProjectItemsObjectDataType {
    COMPONENT,
	KB_COMPONENT,
	KB_COMPONENT_VERSION,
	LICENSE_TERM,
	POLICY,
	PROJECT,
	SCAN,
	SNIPPET,
	SOURCE_FILE,
	USER,
	USER_GROUP,
	VERSION,
	VULNERABILITY;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
