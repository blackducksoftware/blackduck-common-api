/**
 * blackduck-common-api
 *
 * Copyright (c) 2020 Synopsys, Inc.
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
package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.enumeration.ScanStatusType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ScanViewV4 extends BlackDuckView {

    private String statusMessage;
    private java.util.Date createdAt;
    private BigDecimal scanSize;
    private String serverVersion;
    private ScanStatusType status;
    private java.util.Date updatedAt;

    public String getStatusMessage() {
	    return statusMessage;
    }

    public void setStatusMessage(String statusMessage) {
	    this.statusMessage = statusMessage;
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

    public String getServerVersion() {
	    return serverVersion;
    }

    public void setServerVersion(String serverVersion) {
	    this.serverVersion = serverVersion;
    }

    public ScanStatusType getStatus() {
	    return status;
    }

    public void setStatus(ScanStatusType status) {
	    this.status = status;
    }

    public java.util.Date getUpdatedAt() {
	    return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
	    this.updatedAt = updatedAt;
    }

}
