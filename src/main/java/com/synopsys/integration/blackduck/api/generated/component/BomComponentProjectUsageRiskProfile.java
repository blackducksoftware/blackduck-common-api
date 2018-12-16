package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.BomComponentReleaseUsageRiskProfile;
import com.synopsys.integration.blackduck.api.generated.component.RiskProfile;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class BomComponentProjectUsageRiskProfile extends BlackDuckComponent {
    private java.util.List<Integer> bomViewEntryIds;
    private ComponentType componentType;
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

    public ComponentType getComponentType() {
        return componentType;
    }

    public void setComponentType(ComponentType componentType) {
        this.componentType = componentType;
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
