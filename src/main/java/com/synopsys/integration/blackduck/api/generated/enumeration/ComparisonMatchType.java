package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum ComparisonMatchType {
	MANUAL,
	FILE,
	DEPENDENCY,
	PARTIAL_FILE,
	SNIPPET;

	public String prettyPrint() {
	    return EnumUtils.prettyPrint(this);
	}

}