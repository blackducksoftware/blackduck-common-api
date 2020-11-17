package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

@Deprecated
/**
* MatchedFileUsagesType is now called UsageType
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum MatchedFileUsagesType {
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
