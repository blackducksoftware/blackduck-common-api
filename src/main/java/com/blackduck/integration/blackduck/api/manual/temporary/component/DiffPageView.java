/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.deprecated.component.VersionBomComponentDiffView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class DiffPageView extends BlackDuckComponent {
    private java.util.List<LegacyAppliedFilterView> appliedFilters;
    private java.util.List<VersionBomComponentDiffView> items;
    private Integer totalAddedComponentVersions;
    private Integer totalAddedComponents;
    private Integer totalChangedComponentVersions;
    private Integer totalChangedComponents;
    private Integer totalCount;
    private Integer totalRemovedComponentVersions;
    private Integer totalRemovedComponents;
    private Integer totalUnchangedComponentVersions;
    private Integer totalUnchangedComponents;

    public java.util.List<LegacyAppliedFilterView> getAppliedFilters() {
        return appliedFilters;
    }

    public void setAppliedFilters(java.util.List<LegacyAppliedFilterView> appliedFilters) {
        this.appliedFilters = appliedFilters;
    }

    public java.util.List<VersionBomComponentDiffView> getItems() {
        return items;
    }

    public void setItems(java.util.List<VersionBomComponentDiffView> items) {
        this.items = items;
    }

    public Integer getTotalAddedComponentVersions() {
        return totalAddedComponentVersions;
    }

    public void setTotalAddedComponentVersions(Integer totalAddedComponentVersions) {
        this.totalAddedComponentVersions = totalAddedComponentVersions;
    }

    public Integer getTotalAddedComponents() {
        return totalAddedComponents;
    }

    public void setTotalAddedComponents(Integer totalAddedComponents) {
        this.totalAddedComponents = totalAddedComponents;
    }

    public Integer getTotalChangedComponentVersions() {
        return totalChangedComponentVersions;
    }

    public void setTotalChangedComponentVersions(Integer totalChangedComponentVersions) {
        this.totalChangedComponentVersions = totalChangedComponentVersions;
    }

    public Integer getTotalChangedComponents() {
        return totalChangedComponents;
    }

    public void setTotalChangedComponents(Integer totalChangedComponents) {
        this.totalChangedComponents = totalChangedComponents;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalRemovedComponentVersions() {
        return totalRemovedComponentVersions;
    }

    public void setTotalRemovedComponentVersions(Integer totalRemovedComponentVersions) {
        this.totalRemovedComponentVersions = totalRemovedComponentVersions;
    }

    public Integer getTotalRemovedComponents() {
        return totalRemovedComponents;
    }

    public void setTotalRemovedComponents(Integer totalRemovedComponents) {
        this.totalRemovedComponents = totalRemovedComponents;
    }

    public Integer getTotalUnchangedComponentVersions() {
        return totalUnchangedComponentVersions;
    }

    public void setTotalUnchangedComponentVersions(Integer totalUnchangedComponentVersions) {
        this.totalUnchangedComponentVersions = totalUnchangedComponentVersions;
    }

    public Integer getTotalUnchangedComponents() {
        return totalUnchangedComponents;
    }

    public void setTotalUnchangedComponents(Integer totalUnchangedComponents) {
        this.totalUnchangedComponents = totalUnchangedComponents;
    }

}
