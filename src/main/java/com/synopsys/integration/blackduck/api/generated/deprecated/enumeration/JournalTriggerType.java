package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

@Deprecated
/**
* JournalTriggerType is now called ProjectItemsTriggerDataType
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum JournalTriggerType {
	USER,
	POLICY,
	SCAN;

	public String prettyPrint() {
	    return EnumUtils.prettyPrint(this);
	}

}
