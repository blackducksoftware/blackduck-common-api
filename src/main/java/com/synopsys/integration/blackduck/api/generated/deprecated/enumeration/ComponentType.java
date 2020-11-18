package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

@Deprecated
/**
* ComponentType is now called ComponentVersionType
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum ComponentType {
	PROJECT,
	COMPONENT;

	public String prettyPrint() {
	    return EnumUtils.prettyPrint(this);
	}

}
