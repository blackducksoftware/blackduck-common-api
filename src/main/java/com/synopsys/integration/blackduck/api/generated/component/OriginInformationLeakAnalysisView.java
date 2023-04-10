/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.OriginInformationLeakAnalysisItemsView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class OriginInformationLeakAnalysisView extends BlackDuckComponent {
    private java.util.List<String> appliedFilters;
    private java.util.List<OriginInformationLeakAnalysisItemsView> items;
    private BigDecimal totalCount;

    public java.util.List<String> getAppliedFilters() {
        return appliedFilters;
    }

    public void setAppliedFilters(java.util.List<String> appliedFilters) {
        this.appliedFilters = appliedFilters;
    }

    public java.util.List<OriginInformationLeakAnalysisItemsView> getItems() {
        return items;
    }

    public void setItems(java.util.List<OriginInformationLeakAnalysisItemsView> items) {
        this.items = items;
    }

    public BigDecimal getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
    }

}
