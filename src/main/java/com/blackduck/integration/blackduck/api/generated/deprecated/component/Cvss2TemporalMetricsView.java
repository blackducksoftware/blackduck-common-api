/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.deprecated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.enumeration.VulnerabilityCvss2TemporalMetricsExploitabilityType;
import com.blackduck.integration.blackduck.api.generated.enumeration.VulnerabilityCvss2TemporalMetricsRemediationLevelType;
import com.blackduck.integration.blackduck.api.generated.enumeration.VulnerabilityCvss2TemporalMetricsReportConfidenceType;

import java.math.BigDecimal;

// Cvss2TemporalMetricsView from the previous API is now called VulnerabilityCvss2TemporalMetricsView
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public class Cvss2TemporalMetricsView extends BlackDuckComponent {
    private VulnerabilityCvss2TemporalMetricsExploitabilityType exploitability;
    private VulnerabilityCvss2TemporalMetricsRemediationLevelType remediationLevel;
    private VulnerabilityCvss2TemporalMetricsReportConfidenceType reportConfidence;
    private BigDecimal score;

    public VulnerabilityCvss2TemporalMetricsExploitabilityType getExploitability() {
        return exploitability;
    }

    public void setExploitability(VulnerabilityCvss2TemporalMetricsExploitabilityType exploitability) {
        this.exploitability = exploitability;
    }

    public VulnerabilityCvss2TemporalMetricsRemediationLevelType getRemediationLevel() {
        return remediationLevel;
    }

    public void setRemediationLevel(VulnerabilityCvss2TemporalMetricsRemediationLevelType remediationLevel) {
        this.remediationLevel = remediationLevel;
    }

    public VulnerabilityCvss2TemporalMetricsReportConfidenceType getReportConfidence() {
        return reportConfidence;
    }

    public void setReportConfidence(VulnerabilityCvss2TemporalMetricsReportConfidenceType reportConfidence) {
        this.reportConfidence = reportConfidence;
    }

    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

}
