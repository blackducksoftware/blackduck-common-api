package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

// Cvss3TemporalMetricsRemediationLevelType is now called VulnerabilityCvss3TemporalMetricsRemediationLevelType
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public enum Cvss3TemporalMetricsRemediationLevelType {
    NOT_DEFINED,
	OFFICIAL_FIX,
	TEMPORARY_FIX,
	UNAVAILABLE,
	WORKAROUND;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
