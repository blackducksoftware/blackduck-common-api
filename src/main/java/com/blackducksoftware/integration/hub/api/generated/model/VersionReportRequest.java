package com.blackducksoftware.integration.hub.api.generated.model;

import com.blackducksoftware.integration.hub.api.HubModel;
import com.blackducksoftware.integration.hub.api.generated.enumeration.ReportFormatType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.ReportType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.VersionReportRequestCategoriesType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionReportRequest extends HubModel {
    public java.util.List<VersionReportRequestCategoriesType> categories;
    public ReportFormatType reportFormat;
    public ReportType reportType;
    public String reportUrl;
    public String url;
    public String versionId;

}
