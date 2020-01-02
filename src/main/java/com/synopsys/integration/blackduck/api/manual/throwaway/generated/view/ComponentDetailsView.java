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
package com.synopsys.integration.blackduck.api.manual.throwaway.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.ComponentApprovalStatusType;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.ComponentType;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.OriginSourceType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentDetailsView extends BlackDuckView {
    private ComponentApprovalStatusType approvalStatus;
    private String description;
    private String name;
    private String notes;
    private OriginSourceType source;
    private ComponentType type;
    private java.util.Date updatedAt;
    private String updatedBy;
    private String updatedByUrl;
    private String url;
    private Long versionCount;

    public ComponentApprovalStatusType getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ComponentApprovalStatusType approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public OriginSourceType getSource() {
        return source;
    }

    public void setSource(OriginSourceType source) {
        this.source = source;
    }

    public ComponentType getType() {
        return type;
    }

    public void setType(ComponentType type) {
        this.type = type;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedByUrl() {
        return updatedByUrl;
    }

    public void setUpdatedByUrl(String updatedByUrl) {
        this.updatedByUrl = updatedByUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getVersionCount() {
        return versionCount;
    }

    public void setVersionCount(Long versionCount) {
        this.versionCount = versionCount;
    }

}
