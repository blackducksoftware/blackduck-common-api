package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ReportContentsReportContentView extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.report-4+json";

    private String fileContent;
    private String fileName;
    private String fileNamePrefix;

    public String getFileContent() {
	return fileContent;
    }

    public void setFileContent(String fileContent) {
	this.fileContent = fileContent;
    }

    public String getFileName() {
	return fileName;
    }

    public void setFileName(String fileName) {
	this.fileName = fileName;
    }

    public String getFileNamePrefix() {
	return fileNamePrefix;
    }

    public void setFileNamePrefix(String fileNamePrefix) {
	this.fileNamePrefix = fileNamePrefix;
    }


    public String getMediaType() {
	return mediaType;
    }

}
