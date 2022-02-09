package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentMigrationsItemsView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentMigrationsView extends BlackDuckView {
    private java.util.List<String> appliedFilters;
    private java.util.List<ComponentMigrationsItemsView> items;
    private BigDecimal totalCount;

    public java.util.List<String> getAppliedFilters() {
        return appliedFilters;
    }

    public void setAppliedFilters(java.util.List<String> appliedFilters) {
        this.appliedFilters = appliedFilters;
    }

    public java.util.List<ComponentMigrationsItemsView> getItems() {
        return items;
    }

    public void setItems(java.util.List<ComponentMigrationsItemsView> items) {
        this.items = items;
    }

    public BigDecimal getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
    }

}
