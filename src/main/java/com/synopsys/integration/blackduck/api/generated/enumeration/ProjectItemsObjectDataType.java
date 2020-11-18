package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum ProjectItemsObjectDataType {
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
