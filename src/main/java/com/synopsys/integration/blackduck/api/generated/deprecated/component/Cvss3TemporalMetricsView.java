package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.VulnerabilityCvss3TemporalMetricsExploitabilityType;
import com.synopsys.integration.blackduck.api.generated.enumeration.VulnerabilityCvss3TemporalMetricsRemediationLevelType;
import com.synopsys.integration.blackduck.api.generated.enumeration.VulnerabilityCvss3TemporalMetricsReportConfidenceType;

@Deprecated
/**
* Cvss3TemporalMetricsView from the previous API is now called VulnerabilityCvss3TemporalMetricsView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class Cvss3TemporalMetricsView extends BlackDuckComponent {
    private BigDecimal score;
    private VulnerabilityCvss3TemporalMetricsExploitabilityType exploitability;
    private VulnerabilityCvss3TemporalMetricsRemediationLevelType remediationLevel;
    private VulnerabilityCvss3TemporalMetricsReportConfidenceType reportConfidence;

    public BigDecimal getScore() {
	    return score;
    }

    public void setScore(BigDecimal score) {
	    this.score = score;
    }

    public VulnerabilityCvss3TemporalMetricsExploitabilityType getExploitability() {
	    return exploitability;
    }

    public void setExploitability(VulnerabilityCvss3TemporalMetricsExploitabilityType exploitability) {
	    this.exploitability = exploitability;
    }

    public VulnerabilityCvss3TemporalMetricsRemediationLevelType getRemediationLevel() {
	    return remediationLevel;
    }

    public void setRemediationLevel(VulnerabilityCvss3TemporalMetricsRemediationLevelType remediationLevel) {
	    this.remediationLevel = remediationLevel;
    }

    public VulnerabilityCvss3TemporalMetricsReportConfidenceType getReportConfidence() {
	    return reportConfidence;
    }

    public void setReportConfidence(VulnerabilityCvss3TemporalMetricsReportConfidenceType reportConfidence) {
	    this.reportConfidence = reportConfidence;
    }

}
