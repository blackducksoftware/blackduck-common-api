package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComparisonItemsView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionComparisonView extends BlackDuckComponent {
    private BigDecimal totalCount;
    private java.util.List<ProjectVersionComparisonItemsView> items;
    private BigDecimal totalRemovedComponentVersions;
    private BigDecimal totalUnchangedComponents;
    private BigDecimal totalUnchangedComponentVersions;
    private BigDecimal totalChangedComponentVersions;
    private BigDecimal totalRemovedComponents;
    private BigDecimal totalAddedComponentVersions;
    private BigDecimal totalChangedComponents;
    private BigDecimal totalAddedComponents;

    public BigDecimal getTotalCount() {
	    return totalCount;
    }

    public void setTotalCount(BigDecimal totalCount) {
	    this.totalCount = totalCount;
    }

    public java.util.List<ProjectVersionComparisonItemsView> getItems() {
	    return items;
    }

    public void setItems(java.util.List<ProjectVersionComparisonItemsView> items) {
	    this.items = items;
    }

    public BigDecimal getTotalRemovedComponentVersions() {
	    return totalRemovedComponentVersions;
    }

    public void setTotalRemovedComponentVersions(BigDecimal totalRemovedComponentVersions) {
	    this.totalRemovedComponentVersions = totalRemovedComponentVersions;
    }

    public BigDecimal getTotalUnchangedComponents() {
	    return totalUnchangedComponents;
    }

    public void setTotalUnchangedComponents(BigDecimal totalUnchangedComponents) {
	    this.totalUnchangedComponents = totalUnchangedComponents;
    }

    public BigDecimal getTotalUnchangedComponentVersions() {
	    return totalUnchangedComponentVersions;
    }

    public void setTotalUnchangedComponentVersions(BigDecimal totalUnchangedComponentVersions) {
	    this.totalUnchangedComponentVersions = totalUnchangedComponentVersions;
    }

    public BigDecimal getTotalChangedComponentVersions() {
	    return totalChangedComponentVersions;
    }

    public void setTotalChangedComponentVersions(BigDecimal totalChangedComponentVersions) {
	    this.totalChangedComponentVersions = totalChangedComponentVersions;
    }

    public BigDecimal getTotalRemovedComponents() {
	    return totalRemovedComponents;
    }

    public void setTotalRemovedComponents(BigDecimal totalRemovedComponents) {
	    this.totalRemovedComponents = totalRemovedComponents;
    }

    public BigDecimal getTotalAddedComponentVersions() {
	    return totalAddedComponentVersions;
    }

    public void setTotalAddedComponentVersions(BigDecimal totalAddedComponentVersions) {
	    this.totalAddedComponentVersions = totalAddedComponentVersions;
    }

    public BigDecimal getTotalChangedComponents() {
	    return totalChangedComponents;
    }

    public void setTotalChangedComponents(BigDecimal totalChangedComponents) {
	    this.totalChangedComponents = totalChangedComponents;
    }

    public BigDecimal getTotalAddedComponents() {
	    return totalAddedComponents;
    }

    public void setTotalAddedComponents(BigDecimal totalAddedComponents) {
	    this.totalAddedComponents = totalAddedComponents;
    }

}
