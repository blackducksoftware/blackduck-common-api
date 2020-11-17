package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

@Deprecated
/**
* ReportFileContent from the previous API is now called ReportContentsReportContentView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ReportFileContent extends BlackDuckComponent {
    private String fileName;
    private String fileContent;
    private String fileNamePrefix;

    public String getFileName() {
	    return fileName;
    }

    public void setFileName(String fileName) {
	    this.fileName = fileName;
    }

    public String getFileContent() {
	    return fileContent;
    }

    public void setFileContent(String fileContent) {
	    this.fileContent = fileContent;
    }

    public String getFileNamePrefix() {
	    return fileNamePrefix;
    }

    public void setFileNamePrefix(String fileNamePrefix) {
	    this.fileNamePrefix = fileNamePrefix;
    }

}
