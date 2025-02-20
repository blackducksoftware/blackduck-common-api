package com.synopsys.integration.blackduck.api.manual.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

/**
 * Class for a report creation request mapped to a JSON payload by Blackduck API
 * for a HTTP POST request, e.g.
 *   {"reportFormat":"JSON","reportType":"SBOM","sbomType":"SPDX_22"}
 */
public class ReportBomRequest extends BlackDuckComponent {
    private String reportFormat;
    private String reportType;
    private String sbomType;

    public String getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(String reportFormat) {
        this.reportFormat = reportFormat;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public String getSbomType() {
        return sbomType;
    }

    public void setSbomType(String sbomType) {
        this.sbomType = sbomType;
    }

}
