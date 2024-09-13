/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.view;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;
import com.blackduck.integration.blackduck.api.generated.component.OriginDependencyPathsItemsPathView;

import java.math.BigDecimal;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class OriginDependencyPathsView extends BlackDuckView {
    private BigDecimal count;
    private java.util.List<OriginDependencyPathsItemsPathView> path;
    private String type;

    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    public java.util.List<OriginDependencyPathsItemsPathView> getPath() {
        return path;
    }

    public void setPath(java.util.List<OriginDependencyPathsItemsPathView> path) {
        this.path = path;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
