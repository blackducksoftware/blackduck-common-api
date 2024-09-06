/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class Features extends BlackDuckComponent {
    private FeaturesCodeLocationAutoUnmapping codeLocationAutoUnmapping;
    private FeaturesExpiringPolicyOverrides expiringPolicyOverrides;
    private FeaturesRollupSubProjectRisk rollupSubProjectRisk;
    private FeaturesScm scm;

    public FeaturesCodeLocationAutoUnmapping getCodeLocationAutoUnmapping() {
        return codeLocationAutoUnmapping;
    }

    public void setCodeLocationAutoUnmapping(FeaturesCodeLocationAutoUnmapping codeLocationAutoUnmapping) {
        this.codeLocationAutoUnmapping = codeLocationAutoUnmapping;
    }

    public FeaturesExpiringPolicyOverrides getExpiringPolicyOverrides() {
        return expiringPolicyOverrides;
    }

    public void setExpiringPolicyOverrides(FeaturesExpiringPolicyOverrides expiringPolicyOverrides) {
        this.expiringPolicyOverrides = expiringPolicyOverrides;
    }

    public FeaturesRollupSubProjectRisk getRollupSubProjectRisk() {
        return rollupSubProjectRisk;
    }

    public void setRollupSubProjectRisk(FeaturesRollupSubProjectRisk rollupSubProjectRisk) {
        this.rollupSubProjectRisk = rollupSubProjectRisk;
    }

    public FeaturesScm getScm() {
        return scm;
    }

    public void setScm(FeaturesScm scm) {
        this.scm = scm;
    }

}
