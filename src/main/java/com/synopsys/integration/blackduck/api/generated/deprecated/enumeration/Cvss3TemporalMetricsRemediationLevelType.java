package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

@Deprecated
/**
* Cvss3TemporalMetricsRemediationLevelType is now called VulnerabilityCvss3TemporalMetricsRemediationLevelType
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum Cvss3TemporalMetricsRemediationLevelType {
	NOT_DEFINED,
	UNAVAILABLE,
	WORKAROUND,
	TEMPORARY_FIX,
	OFFICIAL_FIX;

	public String prettyPrint() {
	    return EnumUtils.prettyPrint(this);
	}

}
