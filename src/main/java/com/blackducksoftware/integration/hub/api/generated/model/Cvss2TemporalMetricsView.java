package com.blackducksoftware.integration.hub.api.generated.model;

import com.blackducksoftware.integration.hub.api.HubModel;
import com.blackducksoftware.integration.hub.api.generated.enumeration.Cvss2TemporalMetricsExploitability;
import com.blackducksoftware.integration.hub.api.generated.enumeration.Cvss2TemporalMetricsRemediationLevel;
import com.blackducksoftware.integration.hub.api.generated.enumeration.Cvss2TemporalMetricsReportConfidence;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class Cvss2TemporalMetricsView extends HubModel {
    public Cvss2TemporalMetricsExploitability exploitability;
    public Cvss2TemporalMetricsRemediationLevel remediationLevel;
    public Cvss2TemporalMetricsReportConfidence reportConfidence;
    public java.math.BigDecimal score;

}
