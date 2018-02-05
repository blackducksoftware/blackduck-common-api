package com.blackducksoftware.integration.hub.api.generated.model;

import com.blackducksoftware.integration.hub.api.HubModel;
import com.blackducksoftware.integration.hub.api.generated.enumeration.Cvss2TemporalMetricsRemediationLevel;
import com.blackducksoftware.integration.hub.api.generated.enumeration.Cvss3TemporalMetricsExploitability;
import com.blackducksoftware.integration.hub.api.generated.enumeration.Cvss3TemporalMetricsReportConfidence;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class Cvss3TemporalMetricsView extends HubModel {
    public Cvss3TemporalMetricsExploitability exploitability;
    public Cvss2TemporalMetricsRemediationLevel remediationLevel;
    public Cvss3TemporalMetricsReportConfidence reportConfidence;
    public java.math.BigDecimal score;

}
