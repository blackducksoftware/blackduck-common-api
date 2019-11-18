package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

@Deprecated
// ComplexLicenseType is now called ProjectVersionComponentLicensesLicenseTypeType
//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public enum ComplexLicenseType {
	CONJUNCTIVE,
	DISJUNCTIVE;

	private String mediaType = "application/vnd.blackducksoftware.bill-of-materials-4+json";

	public String getMediaType() {
	return mediaType;
	}

	public String prettyPrint() {
	return EnumUtils.prettyPrint(this);
	}

} 