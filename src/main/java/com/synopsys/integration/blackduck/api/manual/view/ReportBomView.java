package com.synopsys.integration.blackduck.api.manual.view;

import java.util.List;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;

/**
 * Class representing the BDH reponse for a Bill of Materials report download request
 * The blackduck API uses this to map the JSON response into it.
 */
public class ReportBomView extends BlackDuckResponse{

  private List<ReportBomContentView> reportContent;

  public List<ReportBomContentView> getReportContent() {
    return reportContent;
  }

  public void setReportContent(List<ReportBomContentView> reportContent) {
    this.reportContent = reportContent;
  }
 
}