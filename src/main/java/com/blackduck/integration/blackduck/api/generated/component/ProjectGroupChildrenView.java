/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectGroupChildrenView extends BlackDuckComponent {
    private BigDecimal childProjectGroupsCount;
    private BigDecimal childProjectsCount;
    private java.util.Date createdAt;
    private String description;
    private Boolean isProject;
    private String name;
    private java.util.List<ProjectGroupChildrenItemsPathView> path;
    private java.util.Date updatedAt;
    private BigDecimal versionsCount;

    public BigDecimal getChildProjectGroupsCount() {
        return childProjectGroupsCount;
    }

    public void setChildProjectGroupsCount(BigDecimal childProjectGroupsCount) {
        this.childProjectGroupsCount = childProjectGroupsCount;
    }

    public BigDecimal getChildProjectsCount() {
        return childProjectsCount;
    }

    public void setChildProjectsCount(BigDecimal childProjectsCount) {
        this.childProjectsCount = childProjectsCount;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsProject() {
        return isProject;
    }

    public void setIsProject(Boolean isProject) {
        this.isProject = isProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<ProjectGroupChildrenItemsPathView> getPath() {
        return path;
    }

    public void setPath(java.util.List<ProjectGroupChildrenItemsPathView> path) {
        this.path = path;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public BigDecimal getVersionsCount() {
        return versionsCount;
    }

    public void setVersionsCount(BigDecimal versionsCount) {
        this.versionsCount = versionsCount;
    }

}
