package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum UsageType {
	SOURCE_CODE,
	STATICALLY_LINKED,
	DYNAMICALLY_LINKED,
	SEPARATE_WORK,
	MERELY_AGGREGATED,
	IMPLEMENTATION_OF_STANDARD,
	PREREQUISITE,
	DEV_TOOL_EXCLUDED;

	public String prettyPrint() {
	    return EnumUtils.prettyPrint(this);
	}

}
