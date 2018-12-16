package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.Cvss2TemporalMetricsExploitabilityType;
import com.synopsys.integration.blackduck.api.generated.enumeration.Cvss2TemporalMetricsReportConfidenceType;
import com.synopsys.integration.blackduck.api.generated.enumeration.Cvss3TemporalMetricsRemediationLevelType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class Cvss2TemporalMetricsView extends BlackDuckComponent {
    private Cvss2TemporalMetricsExploitabilityType exploitability;
    private Cvss3TemporalMetricsRemediationLevelType remediationLevel;
    private Cvss2TemporalMetricsReportConfidenceType reportConfidence;
    private java.math.BigDecimal score;

    public Cvss2TemporalMetricsExploitabilityType getExploitability() {
        return exploitability;
    }

    public void setExploitability(Cvss2TemporalMetricsExploitabilityType exploitability) {
        this.exploitability = exploitability;
    }

    public Cvss3TemporalMetricsRemediationLevelType getRemediationLevel() {
        return remediationLevel;
    }

    public void setRemediationLevel(Cvss3TemporalMetricsRemediationLevelType remediationLevel) {
        this.remediationLevel = remediationLevel;
    }

    public Cvss2TemporalMetricsReportConfidenceType getReportConfidence() {
        return reportConfidence;
    }

    public void setReportConfidence(Cvss2TemporalMetricsReportConfidenceType reportConfidence) {
        this.reportConfidence = reportConfidence;
    }

    public java.math.BigDecimal getScore() {
        return score;
    }

    public void setScore(java.math.BigDecimal score) {
        this.score = score;
    }

}
