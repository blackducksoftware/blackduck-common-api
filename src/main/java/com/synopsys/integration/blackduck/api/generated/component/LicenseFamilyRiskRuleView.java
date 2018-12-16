package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.MatchedFileUsagesType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionDistributionType;
import com.synopsys.integration.blackduck.api.generated.enumeration.RiskCountType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseFamilyRiskRuleView extends BlackDuckComponent {
    private ProjectVersionDistributionType releaseDistribution;
    private RiskCountType riskPriority;
    private MatchedFileUsagesType usage;

    public ProjectVersionDistributionType getReleaseDistribution() {
        return releaseDistribution;
    }

    public void setReleaseDistribution(ProjectVersionDistributionType releaseDistribution) {
        this.releaseDistribution = releaseDistribution;
    }

    public RiskCountType getRiskPriority() {
        return riskPriority;
    }

    public void setRiskPriority(RiskCountType riskPriority) {
        this.riskPriority = riskPriority;
    }

    public MatchedFileUsagesType getUsage() {
        return usage;
    }

    public void setUsage(MatchedFileUsagesType usage) {
        this.usage = usage;
    }

}
