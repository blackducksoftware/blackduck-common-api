/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.view;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;
import com.blackduck.integration.blackduck.api.core.response.LinkBlackDuckResponse;
import com.blackduck.integration.blackduck.api.core.response.LinkSingleResponse;
import com.blackduck.integration.blackduck.api.core.response.UrlSingleResponse;
import com.blackduck.integration.blackduck.api.generated.component.ReportCreatedByView;
import com.blackduck.integration.blackduck.api.generated.enumeration.ReportFormatType;
import com.blackduck.integration.blackduck.api.generated.enumeration.ReportStatusType;
import com.blackduck.integration.blackduck.api.generated.enumeration.ReportType;
import com.blackduck.integration.blackduck.api.manual.response.BlackDuckStringResponse;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ReportView extends BlackDuckView {
    public static final Map<String, LinkBlackDuckResponse> links = new HashMap<>();

    public static final String CONTENT_LINK = "content";

    public static final LinkSingleResponse<BlackDuckStringResponse> CONTENT_LINK_RESPONSE = new LinkSingleResponse<BlackDuckStringResponse>(CONTENT_LINK, BlackDuckStringResponse.class);

    static {
        links.put(CONTENT_LINK, CONTENT_LINK_RESPONSE);
    }

    private java.util.Date createdAt;
    private ReportCreatedByView createdBy;
    private String fileName;
    private String fileNamePrefix;
    private BigDecimal fileSize;
    private java.util.Date finishedAt;
    private String locale;
    private ReportFormatType reportFormat;
    private ReportType reportType;
    private ReportStatusType status;
    private java.util.Date updatedAt;

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public ReportCreatedByView getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(ReportCreatedByView createdBy) {
        this.createdBy = createdBy;
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

    public BigDecimal getFileSize() {
        return fileSize;
    }

    public void setFileSize(BigDecimal fileSize) {
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

    public ReportStatusType getStatus() {
        return status;
    }

    public void setStatus(ReportStatusType status) {
        this.status = status;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UrlSingleResponse<BlackDuckStringResponse> metaContentLink() {
        return metaSingleResponse(CONTENT_LINK_RESPONSE);
    }

    public Optional<UrlSingleResponse<BlackDuckStringResponse>> metaContentLinkSafely() {
        return metaSingleResponseSafely(CONTENT_LINK_RESPONSE);
    }

}
