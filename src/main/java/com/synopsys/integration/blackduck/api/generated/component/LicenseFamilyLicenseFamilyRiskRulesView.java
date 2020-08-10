package com.synopsys.integration.blackduck.api.generated.component;

import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentVersionRiskProfileRiskDataCountsCountType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseFamilyLicenseFamilyRiskRulesReleaseDistributionType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseFamilyLicenseFamilyRiskRulesUsageType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class LicenseFamilyLicenseFamilyRiskRulesView extends BlackDuckComponent {
    private ComponentVersionRiskProfileRiskDataCountsCountType riskPriority;
    private LicenseFamilyLicenseFamilyRiskRulesReleaseDistributionType releaseDistribution;
    private LicenseFamilyLicenseFamilyRiskRulesUsageType usage;

    public ComponentVersionRiskProfileRiskDataCountsCountType getRiskPriority() {
	    return riskPriority;
    }

    public void setRiskPriority(ComponentVersionRiskProfileRiskDataCountsCountType riskPriority) {
	    this.riskPriority = riskPriority;
    }

    public LicenseFamilyLicenseFamilyRiskRulesReleaseDistributionType getReleaseDistribution() {
	    return releaseDistribution;
    }

    public void setReleaseDistribution(LicenseFamilyLicenseFamilyRiskRulesReleaseDistributionType releaseDistribution) {
	    this.releaseDistribution = releaseDistribution;
    }

    public LicenseFamilyLicenseFamilyRiskRulesUsageType getUsage() {
	    return usage;
    }

    public void setUsage(LicenseFamilyLicenseFamilyRiskRulesUsageType usage) {
	    this.usage = usage;
    }

}
