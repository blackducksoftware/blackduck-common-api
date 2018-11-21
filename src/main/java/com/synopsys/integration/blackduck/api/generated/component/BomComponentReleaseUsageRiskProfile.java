package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.EntityKey;
import com.synopsys.integration.blackduck.api.generated.component.RiskProfile;
import com.synopsys.integration.blackduck.api.generated.component.Version;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class BomComponentReleaseUsageRiskProfile extends BlackDuckComponent {
    private java.util.List<Integer> bomViewEntryIds;
    private EntityKey entityKey;
    private RiskProfile riskProfile;
    private Integer usedCount;
    private Version version;

    public java.util.List<Integer> getBomViewEntryIds() {
        return bomViewEntryIds;
    }

    public void setBomViewEntryIds(java.util.List<Integer> bomViewEntryIds) {
        this.bomViewEntryIds = bomViewEntryIds;
    }

    public EntityKey getEntityKey() {
        return entityKey;
    }

    public void setEntityKey(EntityKey entityKey) {
        this.entityKey = entityKey;
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

    public Version getVersion() {
        return version;
    }

    public void setVersion(Version version) {
        this.version = version;
    }

}
