/**
 * blackduck-common-api
 *
 * Copyright (c) 2019 Synopsys, Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.CodeLocationProgress;
import com.synopsys.integration.blackduck.api.generated.enumeration.CodeLocationStatusType;

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
