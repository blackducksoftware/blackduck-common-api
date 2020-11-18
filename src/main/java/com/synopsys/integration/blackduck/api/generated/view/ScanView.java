package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.ScanStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ScanType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ScanView extends BlackDuckView {
    private String hostName;
    private BigDecimal matchCount;
    private BigDecimal fileCount;
    private java.util.Date createdAt;
    private BigDecimal scanSize;
    private java.util.Date updatedAt;
    private ScanType scanType;
    private ScanStatusType status;
    private String serverVersion;
    private String statusMessage;
    private String createdByUserName;
    private String baseDirectory;
    private BigDecimal directoryCount;

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

    public BigDecimal getFileCount() {
	    return fileCount;
    }

    public void setFileCount(BigDecimal fileCount) {
	    this.fileCount = fileCount;
    }

    public java.util.Date getCreatedAt() {
	    return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
	    this.createdAt = createdAt;
    }

    public BigDecimal getScanSize() {
	    return scanSize;
    }

    public void setScanSize(BigDecimal scanSize) {
	    this.scanSize = scanSize;
    }

    public java.util.Date getUpdatedAt() {
	    return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
	    this.updatedAt = updatedAt;
    }

    public ScanType getScanType() {
	    return scanType;
    }

    public void setScanType(ScanType scanType) {
	    this.scanType = scanType;
    }

    public ScanStatusType getStatus() {
	    return status;
    }

    public void setStatus(ScanStatusType status) {
	    this.status = status;
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

    public String getCreatedByUserName() {
	    return createdByUserName;
    }

    public void setCreatedByUserName(String createdByUserName) {
	    this.createdByUserName = createdByUserName;
    }

    public String getBaseDirectory() {
	    return baseDirectory;
    }

    public void setBaseDirectory(String baseDirectory) {
	    this.baseDirectory = baseDirectory;
    }

    public BigDecimal getDirectoryCount() {
	    return directoryCount;
    }

    public void setDirectoryCount(BigDecimal directoryCount) {
	    this.directoryCount = directoryCount;
    }

}
