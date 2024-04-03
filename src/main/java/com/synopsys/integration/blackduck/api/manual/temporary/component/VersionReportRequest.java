/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ReportFormatType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ReportType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ReportType;
import com.synopsys.integration.blackduck.api.manual.temporary.enumeration.VersionReportRequestCategoriesType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionReportRequest extends BlackDuckComponent {
    private java.util.List<VersionReportRequestCategoriesType> categories;
    private ReportFormatType reportFormat;
    private ReportType reportType;
    private String reportUrl;
    private String url;
    private String versionId;

    public java.util.List<VersionReportRequestCategoriesType> getCategories() {
        return categories;
    }

    public void setCategories(java.util.List<VersionReportRequestCategoriesType> categories) {
        this.categories = categories;
    }

    public ReportFormatType getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(ReportFormatType reportFormat) {
        this.reportFormat = reportFormat;
    }

    public ReportType getLicenseReportsReportReportType() {
        return reportType;
    }

    public void setLicenseReportsReportReportType(ReportType LicenseReportsReportReportType) {
        this.reportType = LicenseReportsReportReportType;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

}
