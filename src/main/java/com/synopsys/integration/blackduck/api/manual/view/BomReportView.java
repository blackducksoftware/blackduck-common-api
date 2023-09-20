package com.synopsys.integration.blackduck.api.manual.view;

import java.util.List;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;

/**
 * Class representing the BDH reponse for a Bill of Materials report download request
 * The blackduck API uses this to map the JSON response into it.
 */
public class BomReportView extends BlackDuckResponse{

  private List<BomReportContentView> reportContent;

  public List<BomReportContentView> getReportContent() {
    return reportContent;
  }

  public void setReportContent(List<BomReportContentView> reportContent) {
    this.reportContent = reportContent;
  }
 
}