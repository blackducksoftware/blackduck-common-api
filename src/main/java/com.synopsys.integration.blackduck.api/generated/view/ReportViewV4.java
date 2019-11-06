package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ReportReportFormatType;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.LinkStringResponse;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ReportViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.report-4+json";

	public static final Map<String, LinkResponse> links = new HashMap<>();
        public static final String CONTENT_LINK = "content";

	public static final LinkStringResponse CONTENT_LINK_RESPONSE = new LinkStringResponse(CONTENT_LINK, String.class);

    static {
	links.put(CONTENT_LINK, CONTENT_LINK_RESPONSE);
    }

    private String reportType;
    private ReportReportFormatType reportFormat;
    private String createdByUser;
    private String fileNamePrefix;
    private java.util.Date finishedAt;
    private BigDecimal fileSize;
    private String fileName;
    private java.util.Date createdAt;
    private String updatedAt;
    private String createdBy;
    private String locale;

    public String getReportType() {
	return reportType;
    }

    public void setReportType(String reportType) {
	this.reportType = reportType;
    }

    public ReportReportFormatType getReportFormat() {
	return reportFormat;
    }

    public void setReportFormat(ReportReportFormatType reportFormat) {
	this.reportFormat = reportFormat;
    }

    public String getCreatedByUser() {
	return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
	this.createdByUser = createdByUser;
    }

    public String getFileNamePrefix() {
	return fileNamePrefix;
    }

    public void setFileNamePrefix(String fileNamePrefix) {
	this.fileNamePrefix = fileNamePrefix;
    }

    public java.util.Date getFinishedAt() {
	return finishedAt;
    }

    public void setFinishedAt(java.util.Date finishedAt) {
	this.finishedAt = finishedAt;
    }

    public BigDecimal getFileSize() {
	return fileSize;
    }

    public void setFileSize(BigDecimal fileSize) {
	this.fileSize = fileSize;
    }

    public String getFileName() {
	return fileName;
    }

    public void setFileName(String fileName) {
	this.fileName = fileName;
    }

    public java.util.Date getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
	this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
	return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
	this.updatedAt = updatedAt;
    }

    public String getCreatedBy() {
	return createdBy;
    }

    public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
    }

    public String getLocale() {
	return locale;
    }

    public void setLocale(String locale) {
	this.locale = locale;
    }


    public String getMediaType() {
	return mediaType;
    }

}
