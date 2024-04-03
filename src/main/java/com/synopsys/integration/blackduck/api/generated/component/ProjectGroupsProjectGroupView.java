/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.response.LinkBlackDuckResponse;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectGroupsProjectGroupView extends BlackDuckComponent {
    private java.util.Date createdAt;
    private BigDecimal depth;
    private String description;
    private BigDecimal directChildProjectCount;
    private BigDecimal directChildProjectGroupCount;
    private String name;
    private java.util.Date updatedAt;

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public BigDecimal getDepth() {
        return depth;
    }

    public void setDepth(BigDecimal depth) {
        this.depth = depth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getDirectChildProjectCount() {
        return directChildProjectCount;
    }

    public void setDirectChildProjectCount(BigDecimal directChildProjectCount) {
        this.directChildProjectCount = directChildProjectCount;
    }

    public BigDecimal getDirectChildProjectGroupCount() {
        return directChildProjectGroupCount;
    }

    public void setDirectChildProjectGroupCount(BigDecimal directChildProjectGroupCount) {
        this.directChildProjectGroupCount = directChildProjectGroupCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
