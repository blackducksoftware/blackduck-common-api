package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

@Deprecated
/**
* JournalObjectType is now called ProjectItemsObjectDataType
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum JournalObjectType {
	COMPONENT,
	KB_COMPONENT,
	KB_COMPONENT_VERSION,
	POLICY,
	USER,
	USER_GROUP,
	PROJECT,
	SCAN,
	SNIPPET,
	SOURCE_FILE,
	VERSION,
	VULNERABILITY,
	LICENSE_TERM;

	public String prettyPrint() {
	    return EnumUtils.prettyPrint(this);
	}

}
