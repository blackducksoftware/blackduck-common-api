package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

@Deprecated
/**
* VersionBomComponentDiffComponentStateType is now called ProjectVersionComparisonItemsComponentStateType
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum VersionBomComponentDiffComponentStateType {
	UNCHANGED,
	ADDED,
	REMOVED,
	CHANGED;

	public String prettyPrint() {
	    return EnumUtils.prettyPrint(this);
	}

}
