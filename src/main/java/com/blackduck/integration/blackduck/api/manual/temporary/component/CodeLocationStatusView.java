/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.component;

import com.blackduck.integration.blackduck.api.manual.temporary.enumeration.CodeLocationStatusType;
import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CodeLocationStatusView extends BlackDuckComponent {
    private java.util.Date createdAt;
    private String operationName;
    private String operationNameCode;
    private CodeLocationProgress progress;
    private Long scanSize;
    private CodeLocationStatusType status;
    private String statusMessage;
    private java.util.Date updatedAt;

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getOperationName() {
        return operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getOperationNameCode() {
        return operationNameCode;
    }

    public void setOperationNameCode(String operationNameCode) {
        this.operationNameCode = operationNameCode;
    }

    public CodeLocationProgress getProgress() {
        return progress;
    }

    public void setProgress(CodeLocationProgress progress) {
        this.progress = progress;
    }

    public Long getScanSize() {
        return scanSize;
    }

    public void setScanSize(Long scanSize) {
        this.scanSize = scanSize;
    }

    public CodeLocationStatusType getStatus() {
        return status;
    }

    public void setStatus(CodeLocationStatusType status) {
        this.status = status;
    }

    public String getStatusMessage() {
        return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
