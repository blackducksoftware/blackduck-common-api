/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.deprecated.enumeration;

import com.blackduck.integration.util.EnumUtils;

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
