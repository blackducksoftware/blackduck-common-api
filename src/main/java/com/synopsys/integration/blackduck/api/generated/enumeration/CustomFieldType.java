package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

@Deprecated
/**
* CustomFieldType is now called CustomFieldTypeType
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum CustomFieldType {
	TEXT,
	TEXTAREA,
	DROPDOWN,
	RADIO,
	MULTISELECT,
	BOOLEAN,
	DATE;

	public String prettyPrint() {
	    return EnumUtils.prettyPrint(this);
	}

}
