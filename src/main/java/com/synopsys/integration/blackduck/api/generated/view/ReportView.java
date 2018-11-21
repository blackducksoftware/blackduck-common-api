package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.LinkStringResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.ReportFormatType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ReportType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ReportView extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String DOWNLOAD_LINK = "download";
    public static final String CONTENT_LINK = "content";

    public static final LinkStringResponse CONTENT_LINK_RESPONSE = new LinkStringResponse(CONTENT_LINK, String.class);

    static {
        links.put(CONTENT_LINK, CONTENT_LINK_RESPONSE);
    }

    private java.util.Date createdAt;
    private String createdBy;
    private String createdByUser;
    private String fileName;
    private String fileNamePrefix;
    private Long fileSize;
    private java.util.Date finishedAt;
    private String locale;
    private ReportFormatType reportFormat;
    private ReportType reportType;
    private java.util.Date updatedAt;

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
        this.createdByUser = createdByUser;
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

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public java.util.Date getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(java.util.Date finishedAt) {
        this.finishedAt = finishedAt;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public ReportFormatType getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(ReportFormatType reportFormat) {
        this.reportFormat = reportFormat;
    }

    public ReportType getReportType() {
        return reportType;
    }

    public void setReportType(ReportType reportType) {
        this.reportType = reportType;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
