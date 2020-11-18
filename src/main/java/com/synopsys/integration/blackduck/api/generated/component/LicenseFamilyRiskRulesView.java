package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionDistributionType;
import com.synopsys.integration.blackduck.api.generated.enumeration.RiskPriorityType;
import com.synopsys.integration.blackduck.api.generated.enumeration.UsageType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class LicenseFamilyRiskRulesView extends BlackDuckComponent {
    private UsageType usage;
    private RiskPriorityType riskPriority;
    private ProjectVersionDistributionType releaseDistribution;

    public UsageType getUsage() {
	    return usage;
    }

    public void setUsage(UsageType usage) {
	    this.usage = usage;
    }

    public RiskPriorityType getRiskPriority() {
	    return riskPriority;
    }

    public void setRiskPriority(RiskPriorityType riskPriority) {
	    this.riskPriority = riskPriority;
    }

    public ProjectVersionDistributionType getReleaseDistribution() {
	    return releaseDistribution;
    }

    public void setReleaseDistribution(ProjectVersionDistributionType releaseDistribution) {
	    this.releaseDistribution = releaseDistribution;
    }

}