package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum LicenseFamilyLicenseFamilyRiskRulesReleaseDistributionType {
	EXTERNAL,
	SAAS,
	INTERNAL,
	OPENSOURCE;

	private String mediaType = "application/vnd.blackducksoftware.component-detail-5+json";

	public String getMediaType() {
	return mediaType;
	}

	public String prettyPrint() {
	return EnumUtils.prettyPrint(this);
	}

} 