package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

@Deprecated
/**
* RiskCountType is now called RiskPriorityType
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum RiskCountType {
	UNKNOWN,
	OK,
	LOW,
	MEDIUM,
	HIGH,
	CRITICAL;

	public String prettyPrint() {
	    return EnumUtils.prettyPrint(this);
	}

}
