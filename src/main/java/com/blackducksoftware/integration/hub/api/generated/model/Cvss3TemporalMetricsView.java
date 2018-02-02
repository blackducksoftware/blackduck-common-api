package com.blackducksoftware.integration.hub.api.generated.model;

import com.blackducksoftware.integration.hub.api.HubModel;
import com.blackducksoftware.integration.hub.api.generated.enumeration.Cvss3TemporalMetricsExploitabilityEnum;
import com.blackducksoftware.integration.hub.api.generated.enumeration.Cvss3TemporalMetricsRemediationLevelEnum;
import com.blackducksoftware.integration.hub.api.generated.enumeration.Cvss3TemporalMetricsReportConfidenceEnum;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class Cvss3TemporalMetricsView extends HubModel {
    public Cvss3TemporalMetricsExploitabilityEnum exploitability;
    public Cvss3TemporalMetricsRemediationLevelEnum remediationLevel;
    public Cvss3TemporalMetricsReportConfidenceEnum reportConfidence;
    public java.math.BigDecimal score;

}
