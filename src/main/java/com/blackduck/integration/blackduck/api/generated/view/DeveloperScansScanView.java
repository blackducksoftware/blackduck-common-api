/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.view;

import java.math.BigDecimal;

import com.blackduck.integration.blackduck.api.generated.component.DeveloperScansScanItemsView;
import com.blackduck.integration.blackduck.api.core.BlackDuckView;
import com.blackduck.integration.blackduck.api.generated.component.DeveloperScansScanProjectGroupDiffView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class DeveloperScansScanView extends BlackDuckView {
    private java.util.List<DeveloperScansScanItemsView> items;
    private DeveloperScansScanProjectGroupDiffView projectGroupDiff;
    private BigDecimal totalCount;

    public java.util.List<DeveloperScansScanItemsView> getItems() {
        return items;
    }

    public void setItems(java.util.List<DeveloperScansScanItemsView> items) {
        this.items = items;
    }

    public DeveloperScansScanProjectGroupDiffView getProjectGroupDiff() {
        return projectGroupDiff;
    }

    public void setProjectGroupDiff(DeveloperScansScanProjectGroupDiffView projectGroupDiff) {
        this.projectGroupDiff = projectGroupDiff;
    }

    public BigDecimal getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
    }

}
