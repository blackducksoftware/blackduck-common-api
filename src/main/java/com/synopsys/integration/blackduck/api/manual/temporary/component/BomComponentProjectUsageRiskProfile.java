/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentVersionType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class BomComponentProjectUsageRiskProfile extends BlackDuckComponent {
    private java.util.List<Integer> bomViewEntryIds;
    private ComponentVersionType componentVersionType;
    private String id;
    private String name;
    private java.util.List<BomComponentReleaseUsageRiskProfile> releasesUsed;
    private Integer releasesUsedCount;
    private RiskProfile riskProfile;
    private Integer usedCount;

    public java.util.List<Integer> getBomViewEntryIds() {
        return bomViewEntryIds;
    }

    public void setBomViewEntryIds(java.util.List<Integer> bomViewEntryIds) {
        this.bomViewEntryIds = bomViewEntryIds;
    }

    public ComponentVersionType getComponentVersionType() {
        return componentVersionType;
    }

    public void setComponentVersionType(ComponentVersionType componentVersionType) {
        this.componentVersionType = componentVersionType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<BomComponentReleaseUsageRiskProfile> getReleasesUsed() {
        return releasesUsed;
    }

    public void setReleasesUsed(java.util.List<BomComponentReleaseUsageRiskProfile> releasesUsed) {
        this.releasesUsed = releasesUsed;
    }

    public Integer getReleasesUsedCount() {
        return releasesUsedCount;
    }

    public void setReleasesUsedCount(Integer releasesUsedCount) {
        this.releasesUsedCount = releasesUsedCount;
    }

    public RiskProfile getRiskProfile() {
        return riskProfile;
    }

    public void setRiskProfile(RiskProfile riskProfile) {
        this.riskProfile = riskProfile;
    }

    public Integer getUsedCount() {
        return usedCount;
    }

    public void setUsedCount(Integer usedCount) {
        this.usedCount = usedCount;
    }

}
