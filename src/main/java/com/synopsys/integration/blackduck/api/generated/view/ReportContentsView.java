/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ReportContentsReportContentView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ReportContentsView extends BlackDuckView {
    private java.util.List<ReportContentsReportContentView> reportContent;

    public java.util.List<ReportContentsReportContentView> getReportContent() {
        return reportContent;
    }

    public void setReportContent(java.util.List<ReportContentsReportContentView> reportContent) {
        this.reportContent = reportContent;
    }

}
