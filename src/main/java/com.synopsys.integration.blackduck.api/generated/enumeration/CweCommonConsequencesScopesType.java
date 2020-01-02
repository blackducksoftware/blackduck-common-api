package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum CweCommonConsequencesScopesType {
	CONFIDENTIALITY,
	INTEGRITY,
	AVAILABILITY,
	ACCESS_CONTROL,
	NON_REPUDIATION,
	ACCOUNTABILITY,
	AUTHENTICATION,
	AUTHORIZATION,
	OTHER;

	private String mediaType = "application/vnd.blackducksoftware.vulnerability-4+json";

	public String getMediaType() {
	return mediaType;
	}

	public String prettyPrint() {
	return EnumUtils.prettyPrint(this);
	}

} 