package com.blackducksoftware.integration.hub.api.generated.model;

import com.blackducksoftware.integration.hub.api.HubModel;
import com.blackducksoftware.integration.hub.api.generated.enumeration.Report;
import com.blackducksoftware.integration.hub.api.generated.enumeration.ReportFormat;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionBasedReportRequest extends HubModel {
    public ReportFormat reportFormat;
    public Report reportType;
    public String reportUrl;
    public String url;
    public String versionId;

}
