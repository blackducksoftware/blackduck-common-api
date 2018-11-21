package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public enum NotificationType {
    BOM_EDIT,
    LICENSE_LIMIT,
    POLICY_OVERRIDE,
    RULE_VIOLATION,
    RULE_VIOLATION_CLEARED,
    VERSION_BOM_CODE_LOCATION_BOM_COMPUTED,
    VULNERABILITY;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
