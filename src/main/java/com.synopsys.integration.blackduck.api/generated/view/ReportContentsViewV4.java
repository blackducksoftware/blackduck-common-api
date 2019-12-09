package com.synopsys.integration.blackduck.api.generated.view;

import java.util.List;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ReportContentsReportContentView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ReportContentsViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.report-4+json";

    private java.util.List<ReportContentsReportContentView> reportContent;

    public java.util.List<ReportContentsReportContentView> getReportContent() {
	return reportContent;
    }

    public void setReportContent(java.util.List<ReportContentsReportContentView> reportContent) {
	this.reportContent = reportContent;
    }


    public String getMediaType() {
	return mediaType;
    }

}
