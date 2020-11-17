package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

@Deprecated
/**
* CweCommonConsequenceScopesType is now called CweCommonConsequencesScopesType
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum CweCommonConsequenceScopesType {
	CONFIDENTIALITY,
	INTEGRITY,
	AVAILABILITY,
	ACCESS_CONTROL,
	NON_REPUDIATION,
	ACCOUNTABILITY,
	AUTHENTICATION,
	AUTHORIZATION,
	OTHER;

	public String prettyPrint() {
	    return EnumUtils.prettyPrint(this);
	}

}
