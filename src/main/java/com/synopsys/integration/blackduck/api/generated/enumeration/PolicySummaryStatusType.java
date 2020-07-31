package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

@Deprecated
/**
* PolicySummaryStatusType is now called PolicyStatusType
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum PolicySummaryStatusType {
	NOT_IN_VIOLATION,
	IN_VIOLATION_OVERRIDDEN,
	IN_VIOLATION;

	public String prettyPrint() {
	    return EnumUtils.prettyPrint(this);
	}

}
