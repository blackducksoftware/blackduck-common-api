package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.Cvss3TemporalMetricsExploitabilityType;
import com.synopsys.integration.blackduck.api.generated.enumeration.Cvss3TemporalMetricsRemediationLevelType;
import com.synopsys.integration.blackduck.api.generated.enumeration.Cvss3TemporalMetricsReportConfidenceType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class Cvss3TemporalMetricsView extends BlackDuckComponent {
    private Cvss3TemporalMetricsExploitabilityType exploitability;
    private Cvss3TemporalMetricsRemediationLevelType remediationLevel;
    private Cvss3TemporalMetricsReportConfidenceType reportConfidence;
    private java.math.BigDecimal score;

    public Cvss3TemporalMetricsExploitabilityType getExploitability() {
        return exploitability;
    }

    public void setExploitability(Cvss3TemporalMetricsExploitabilityType exploitability) {
        this.exploitability = exploitability;
    }

    public Cvss3TemporalMetricsRemediationLevelType getRemediationLevel() {
        return remediationLevel;
    }

    public void setRemediationLevel(Cvss3TemporalMetricsRemediationLevelType remediationLevel) {
        this.remediationLevel = remediationLevel;
    }

    public Cvss3TemporalMetricsReportConfidenceType getReportConfidence() {
        return reportConfidence;
    }

    public void setReportConfidence(Cvss3TemporalMetricsReportConfidenceType reportConfidence) {
        this.reportConfidence = reportConfidence;
    }

    public java.math.BigDecimal getScore() {
        return score;
    }

    public void setScore(java.math.BigDecimal score) {
        this.score = score;
    }

}
