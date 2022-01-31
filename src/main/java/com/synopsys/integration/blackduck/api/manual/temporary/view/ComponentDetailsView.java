/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentVersionType;
import com.synopsys.integration.blackduck.api.manual.temporary.enumeration.ComponentApprovalStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.OriginSourceType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentDetailsView extends BlackDuckView {
    private ComponentApprovalStatusType approvalStatus;
    private String description;
    private String name;
    private String notes;
    private OriginSourceType source;
    private ComponentVersionType type;
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

    public ComponentVersionType getType() {
        return type;
    }

    public void setType(ComponentVersionType type) {
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
