package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

@Deprecated
/**
* PolicySummaryStatusType is now called PolicyStatusType
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum PolicySummaryStatusType {
	NOT_IN_VIOLATION,
	IN_VIOLATION_OVERRIDDEN,
	IN_VIOLATION;

	private String mediaType = "application/vnd.blackducksoftware.bill-of-materials-4+json";

	public String getMediaType() {
	return mediaType;
	}

	public String prettyPrint() {
	return EnumUtils.prettyPrint(this);
	}

} 