/**
 * blackduck-common-api
 *
 * Copyright (c) 2019 Synopsys, Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.blackduck.api.manual.throwaway.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.LegacyAppliedFilterView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.VersionBomComponentDiffView;

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
