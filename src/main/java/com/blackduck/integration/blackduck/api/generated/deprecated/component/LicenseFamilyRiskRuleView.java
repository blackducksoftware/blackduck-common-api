/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.deprecated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.enumeration.ProjectVersionDistributionType;
import com.blackduck.integration.blackduck.api.generated.enumeration.RiskPriorityType;
import com.blackduck.integration.blackduck.api.generated.enumeration.UsageType;

// LicenseFamilyRiskRuleView from the previous API is now called LicenseFamilyRiskRulesView
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public class LicenseFamilyRiskRuleView extends BlackDuckComponent {
    private ProjectVersionDistributionType releaseDistribution;
    private RiskPriorityType riskPriority;
    private UsageType usage;

    public ProjectVersionDistributionType getReleaseDistribution() {
        return releaseDistribution;
    }

    public void setReleaseDistribution(ProjectVersionDistributionType releaseDistribution) {
        this.releaseDistribution = releaseDistribution;
    }

    public RiskPriorityType getRiskPriority() {
        return riskPriority;
    }

    public void setRiskPriority(RiskPriorityType riskPriority) {
        this.riskPriority = riskPriority;
    }

    public UsageType getUsage() {
        return usage;
    }

    public void setUsage(UsageType usage) {
        this.usage = usage;
    }

}
