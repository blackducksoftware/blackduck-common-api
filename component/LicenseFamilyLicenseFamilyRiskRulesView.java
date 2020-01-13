package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseFamilyLicenseFamilyRiskRulesUsageType;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseFamilyLicenseFamilyRiskRulesReleaseDistributionType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentVersionRiskProfileRiskDataCountsCountTypeType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class LicenseFamilyLicenseFamilyRiskRulesView extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-5+json";

    private ComponentVersionRiskProfileRiskDataCountsCountTypeType riskPriority;
    private LicenseFamilyLicenseFamilyRiskRulesReleaseDistributionType releaseDistribution;
    private LicenseFamilyLicenseFamilyRiskRulesUsageType usage;

    public ComponentVersionRiskProfileRiskDataCountsCountTypeType getRiskPriority() {
	return riskPriority;
    }

    public void setRiskPriority(ComponentVersionRiskProfileRiskDataCountsCountTypeType riskPriority) {
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


    public String getMediaType() {
	return mediaType;
    }

}
