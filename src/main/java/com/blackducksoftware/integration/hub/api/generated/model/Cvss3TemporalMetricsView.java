package com.blackducksoftware.integration.hub.api.generated.model;

import com.blackducksoftware.integration.hub.api.core.HubModel;
import com.blackducksoftware.integration.hub.api.generated.enumeration.Cvss2TemporalMetricsRemediationLevelType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.Cvss3TemporalMetricsExploitabilityType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.Cvss3TemporalMetricsReportConfidenceType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class Cvss3TemporalMetricsView extends HubModel {
    public Cvss3TemporalMetricsExploitabilityType exploitability;
    public Cvss2TemporalMetricsRemediationLevelType remediationLevel;
    public Cvss3TemporalMetricsReportConfidenceType reportConfidence;
    public java.math.BigDecimal score;

}
