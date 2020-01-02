package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

@Deprecated
/**
* RiskCountType is now called ComponentVersionRiskProfileRiskDataCountsCountTypeType
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum RiskCountType {
	UNKNOWN,
	OK,
	LOW,
	MEDIUM,
	HIGH,
	CRITICAL;

	private String mediaType = "application/vnd.blackducksoftware.component-detail-4+json";

	public String getMediaType() {
	return mediaType;
	}

	public String prettyPrint() {
	return EnumUtils.prettyPrint(this);
	}

} 