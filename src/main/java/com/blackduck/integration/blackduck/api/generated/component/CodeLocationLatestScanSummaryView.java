/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.enumeration.ScanStateType;
import com.blackduck.integration.blackduck.api.generated.enumeration.ScanTransitionReasonType;
import com.blackduck.integration.blackduck.api.generated.enumeration.ScanType;

import java.math.BigDecimal;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CodeLocationLatestScanSummaryView extends BlackDuckComponent {
    private String baseDirectory;
    private java.util.Date createdAt;
    private String createdByUserName;
    private BigDecimal directoryCount;
    private String errorCode;
    private BigDecimal fileCount;
    private String hostName;
    private BigDecimal matchCount;
    private Boolean retainUnmatchedFiles;
    private BigDecimal scanSize;
    private ScanStateType scanState;
    private ScanType scanType;
    private String serverVersion;
    private String statusMessage;
    private ScanTransitionReasonType transitionReason;
    private java.util.Date updatedAt;

    public String getBaseDirectory() {
        return baseDirectory;
    }

    public void setBaseDirectory(String baseDirectory) {
        this.baseDirectory = baseDirectory;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedByUserName() {
        return createdByUserName;
    }

    public void setCreatedByUserName(String createdByUserName) {
        this.createdByUserName = createdByUserName;
    }

    public BigDecimal getDirectoryCount() {
        return directoryCount;
    }

    public void setDirectoryCount(BigDecimal directoryCount) {
        this.directoryCount = directoryCount;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public BigDecimal getFileCount() {
        return fileCount;
    }

    public void setFileCount(BigDecimal fileCount) {
        this.fileCount = fileCount;
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public BigDecimal getMatchCount() {
        return matchCount;
    }

    public void setMatchCount(BigDecimal matchCount) {
        this.matchCount = matchCount;
    }

    public Boolean getRetainUnmatchedFiles() {
        return retainUnmatchedFiles;
    }

    public void setRetainUnmatchedFiles(Boolean retainUnmatchedFiles) {
        this.retainUnmatchedFiles = retainUnmatchedFiles;
    }

    public BigDecimal getScanSize() {
        return scanSize;
    }

    public void setScanSize(BigDecimal scanSize) {
        this.scanSize = scanSize;
    }

    public ScanStateType getScanState() {
        return scanState;
    }

    public void setScanState(ScanStateType scanState) {
        this.scanState = scanState;
    }

    public ScanType getScanType() {
        return scanType;
    }

    public void setScanType(ScanType scanType) {
        this.scanType = scanType;
    }

    public String getServerVersion() {
        return serverVersion;
    }

    public void setServerVersion(String serverVersion) {
        this.serverVersion = serverVersion;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public ScanTransitionReasonType getTransitionReason() {
        return transitionReason;
    }

    public void setTransitionReason(ScanTransitionReasonType transitionReason) {
        this.transitionReason = transitionReason;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
