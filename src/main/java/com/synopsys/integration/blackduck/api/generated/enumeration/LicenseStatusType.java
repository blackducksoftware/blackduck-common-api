package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum LicenseStatusType {
	UNREVIEWED,
	IN_REVIEW,
	REVIEWED,
	APPROVED,
	CONDITIONALLY_APPROVED,
	REJECTED,
	DEPRECATED;

	public String prettyPrint() {
	    return EnumUtils.prettyPrint(this);
	}

}