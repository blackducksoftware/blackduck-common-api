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
public class ComponentMigrationsComponentOrVersionView extends BlackDuckComponent {
    private java.util.List<String> appliedFilters;
    private java.util.List<ComponentMigrationsComponentOrVersionItemsView> items;
    private BigDecimal totalCount;

    public java.util.List<String> getAppliedFilters() {
        return appliedFilters;
    }

    public void setAppliedFilters(java.util.List<String> appliedFilters) {
        this.appliedFilters = appliedFilters;
    }

    public java.util.List<ComponentMigrationsComponentOrVersionItemsView> getItems() {
        return items;
    }

    public void setItems(java.util.List<ComponentMigrationsComponentOrVersionItemsView> items) {
        this.items = items;
    }

    public BigDecimal getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
    }

}
