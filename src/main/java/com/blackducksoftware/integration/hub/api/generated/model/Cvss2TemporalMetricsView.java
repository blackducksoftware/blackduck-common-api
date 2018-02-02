package com.blackducksoftware.integration.hub.api.generated.model;

import com.blackducksoftware.integration.hub.api.HubModel;
import com.blackducksoftware.integration.hub.api.generated.enumeration.Cvss2TemporalMetricsExploitabilityEnum;
import com.blackducksoftware.integration.hub.api.generated.enumeration.Cvss2TemporalMetricsRemediationLevelEnum;
import com.blackducksoftware.integration.hub.api.generated.enumeration.Cvss2TemporalMetricsReportConfidenceEnum;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class Cvss2TemporalMetricsView extends HubModel {
    public Cvss2TemporalMetricsExploitabilityEnum exploitability;
    public Cvss2TemporalMetricsRemediationLevelEnum remediationLevel;
    public Cvss2TemporalMetricsReportConfidenceEnum reportConfidence;
    public java.math.BigDecimal score;

}
