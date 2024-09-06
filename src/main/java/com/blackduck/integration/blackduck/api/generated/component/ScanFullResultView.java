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
public class ScanFullResultView extends BlackDuckComponent {
    private java.util.List<ScanFullResultItemsView> items;
    private ScanFullResultProjectGroupDiffView projectGroupDiff;
    private BigDecimal totalCount;

    public java.util.List<ScanFullResultItemsView> getItems() {
        return items;
    }

    public void setItems(java.util.List<ScanFullResultItemsView> items) {
        this.items = items;
    }

    public ScanFullResultProjectGroupDiffView getProjectGroupDiff() {
        return projectGroupDiff;
    }

    public void setProjectGroupDiff(ScanFullResultProjectGroupDiffView projectGroupDiff) {
        this.projectGroupDiff = projectGroupDiff;
    }

    public BigDecimal getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
    }

}
