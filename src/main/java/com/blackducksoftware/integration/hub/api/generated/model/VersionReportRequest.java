package com.blackducksoftware.integration.hub.api.generated.model;

import com.blackducksoftware.integration.hub.api.HubModel;
import com.blackducksoftware.integration.hub.api.generated.enumeration.VersionReportRequestCategoriesEnum;
import com.blackducksoftware.integration.hub.api.generated.enumeration.VersionReportRequestReportEnum;
import com.blackducksoftware.integration.hub.api.generated.enumeration.VersionReportRequestReportFormatEnum;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionReportRequest extends HubModel {
    public java.util.List<VersionReportRequestCategoriesEnum> categories;
    public VersionReportRequestReportFormatEnum reportFormat;
    public VersionReportRequestReportEnum reportType;
    public String reportUrl;
    public String url;
    public String versionId;

}
