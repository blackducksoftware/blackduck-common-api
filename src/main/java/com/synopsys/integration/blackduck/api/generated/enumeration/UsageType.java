package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public enum UsageType {
    DEV_TOOL_EXCLUDED,
	DYNAMICALLY_LINKED,
	IMPLEMENTATION_OF_STANDARD,
	MERELY_AGGREGATED,
	PREREQUISITE,
	SEPARATE_WORK,
	SOURCE_CODE,
	STATICALLY_LINKED;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
