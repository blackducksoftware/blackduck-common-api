package com.synopsys.integration.blackduck.api.manual.view;

import com.google.gson.JsonObject;
import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;

/**
 * Class representing an entry on the BDH reponse for a Bill of Materials report 
 * download request. The blackduck API uses this to map the JSON response into it.
 */
public class ReportBomContentView extends BlackDuckResponse {
  private String fileName;
  private JsonObject fileContent;
  private String fileNamePrefix;

  public String getFileName() {
    return fileName;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public JsonObject getFileContent() {
    return fileContent;
  }
  
  public void setFileContent(JsonObject fileContent) {
    this.fileContent = fileContent;
  }
  
  public String getFileNamePrefix() {
    return fileNamePrefix;
  }

  public void setFileNamePrefix(String fileNamePrefix) {
    this.fileNamePrefix = fileNamePrefix;
  }  
}
