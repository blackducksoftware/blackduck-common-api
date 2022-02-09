package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

// Cvss3TemporalMetricsReportConfidenceType is now called VulnerabilityCvss3TemporalMetricsReportConfidenceType
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public enum Cvss3TemporalMetricsReportConfidenceType {
    CONFIRMED,
	NOT_DEFINED,
	REASONABLE,
	UNKNOWN;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
