/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.manual.temporary.enumeration.ComponentApprovalStatusType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CustomComponentRequest extends BlackDuckComponent {
    private ComponentApprovalStatusType approvalStatus;
    private String description;
    private String name;
    private String notes;
    private String url;
    private CustomComponentVersionRequest version;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CustomComponentVersionRequest getVersion() {
        return version;
    }

    public void setVersion(CustomComponentVersionRequest version) {
        this.version = version;
    }

}
