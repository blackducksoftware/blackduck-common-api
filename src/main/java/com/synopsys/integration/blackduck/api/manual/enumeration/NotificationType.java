/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.enumeration;

import com.synopsys.integration.util.EnumUtils;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public enum NotificationType {
    BOM_EDIT,
    COMPONENT_UNKNOWN_VERSION,
    LICENSE_LIMIT,
    POLICY_OVERRIDE,
    PROJECT,
    PROJECT_VERSION,
    RULE_VIOLATION,
    RULE_VIOLATION_CLEARED,
    VERSION_BOM_CODE_LOCATION_BOM_COMPUTED,
    VULNERABILITY;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
