/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RiskProfileSecurityView extends BlackDuckComponent {
    private RiskProfileSecurityCvss2SecurityRiskView cvss2SecurityRisk;
    private RiskProfileSecurityCvss3SecurityRiskView cvss3SecurityRisk;

    public RiskProfileSecurityCvss2SecurityRiskView getCvss2SecurityRisk() {
        return cvss2SecurityRisk;
    }

    public void setCvss2SecurityRisk(RiskProfileSecurityCvss2SecurityRiskView cvss2SecurityRisk) {
        this.cvss2SecurityRisk = cvss2SecurityRisk;
    }

    public RiskProfileSecurityCvss3SecurityRiskView getCvss3SecurityRisk() {
        return cvss3SecurityRisk;
    }

    public void setCvss3SecurityRisk(RiskProfileSecurityCvss3SecurityRiskView cvss3SecurityRisk) {
        this.cvss3SecurityRisk = cvss3SecurityRisk;
    }

}
