/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectLwBomProjectVersionsView extends BlackDuckComponent {
    private java.util.Date bomUpdatedAt;
    private java.util.Date createdAt;
    private String lwProjectId;
    private String name;
    private java.util.List<ProjectLwBomProjectVersionsItemsPolicyResultsView> policyResults;
    private java.util.Date updatedAt;

    public java.util.Date getBomUpdatedAt() {
        return bomUpdatedAt;
    }

    public void setBomUpdatedAt(java.util.Date bomUpdatedAt) {
        this.bomUpdatedAt = bomUpdatedAt;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getLwProjectId() {
        return lwProjectId;
    }

    public void setLwProjectId(String lwProjectId) {
        this.lwProjectId = lwProjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<ProjectLwBomProjectVersionsItemsPolicyResultsView> getPolicyResults() {
        return policyResults;
    }

    public void setPolicyResults(java.util.List<ProjectLwBomProjectVersionsItemsPolicyResultsView> policyResults) {
        this.policyResults = policyResults;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
