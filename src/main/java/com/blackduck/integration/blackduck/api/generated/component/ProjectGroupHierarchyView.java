/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import java.math.BigDecimal;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectGroupHierarchyView extends BlackDuckComponent {
    private BigDecimal depth;
    private String projectGroupName;
    private String projectGroupUrl;

    public BigDecimal getDepth() {
        return depth;
    }

    public void setDepth(BigDecimal depth) {
        this.depth = depth;
    }

    public String getProjectGroupName() {
        return projectGroupName;
    }

    public void setProjectGroupName(String projectGroupName) {
        this.projectGroupName = projectGroupName;
    }

    public String getProjectGroupUrl() {
        return projectGroupUrl;
    }

    public void setProjectGroupUrl(String projectGroupUrl) {
        this.projectGroupUrl = projectGroupUrl;
    }

}
