/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
/*
* blackduck-common-api
*
* Copyright (c) 2021 Synopsys, Inc.
*
* Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
*/
package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComparisonItemsView;

// VersionBomComponentDiffView from the previous API is now called ProjectVersionComparisonView
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public class VersionBomComponentDiffView extends BlackDuckComponent {
    private java.util.List<ProjectVersionComparisonItemsView> items;
    private BigDecimal totalAddedComponentVersions;
    private BigDecimal totalAddedComponents;
    private BigDecimal totalChangedComponentVersions;
    private BigDecimal totalChangedComponents;
    private BigDecimal totalCount;
    private BigDecimal totalRemovedComponentVersions;
    private BigDecimal totalRemovedComponents;
    private BigDecimal totalUnchangedComponentVersions;
    private BigDecimal totalUnchangedComponents;

    public java.util.List<ProjectVersionComparisonItemsView> getItems() {
        return items;
    }

    public void setItems(java.util.List<ProjectVersionComparisonItemsView> items) {
        this.items = items;
    }

    public BigDecimal getTotalAddedComponentVersions() {
        return totalAddedComponentVersions;
    }

    public void setTotalAddedComponentVersions(BigDecimal totalAddedComponentVersions) {
        this.totalAddedComponentVersions = totalAddedComponentVersions;
    }

    public BigDecimal getTotalAddedComponents() {
        return totalAddedComponents;
    }

    public void setTotalAddedComponents(BigDecimal totalAddedComponents) {
        this.totalAddedComponents = totalAddedComponents;
    }

    public BigDecimal getTotalChangedComponentVersions() {
        return totalChangedComponentVersions;
    }

    public void setTotalChangedComponentVersions(BigDecimal totalChangedComponentVersions) {
        this.totalChangedComponentVersions = totalChangedComponentVersions;
    }

    public BigDecimal getTotalChangedComponents() {
        return totalChangedComponents;
    }

    public void setTotalChangedComponents(BigDecimal totalChangedComponents) {
        this.totalChangedComponents = totalChangedComponents;
    }

    public BigDecimal getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
    }

    public BigDecimal getTotalRemovedComponentVersions() {
        return totalRemovedComponentVersions;
    }

    public void setTotalRemovedComponentVersions(BigDecimal totalRemovedComponentVersions) {
        this.totalRemovedComponentVersions = totalRemovedComponentVersions;
    }

    public BigDecimal getTotalRemovedComponents() {
        return totalRemovedComponents;
    }

    public void setTotalRemovedComponents(BigDecimal totalRemovedComponents) {
        this.totalRemovedComponents = totalRemovedComponents;
    }

    public BigDecimal getTotalUnchangedComponentVersions() {
        return totalUnchangedComponentVersions;
    }

    public void setTotalUnchangedComponentVersions(BigDecimal totalUnchangedComponentVersions) {
        this.totalUnchangedComponentVersions = totalUnchangedComponentVersions;
    }

    public BigDecimal getTotalUnchangedComponents() {
        return totalUnchangedComponents;
    }

    public void setTotalUnchangedComponents(BigDecimal totalUnchangedComponents) {
        this.totalUnchangedComponents = totalUnchangedComponents;
    }

}
