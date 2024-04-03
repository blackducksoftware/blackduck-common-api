/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.FeaturesExpiringPolicyOverrides;
import com.synopsys.integration.blackduck.api.generated.component.FeaturesScm;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class Features extends BlackDuckComponent {
    private FeaturesExpiringPolicyOverrides expiringPolicyOverrides;
    private FeaturesScm scm;

    public FeaturesExpiringPolicyOverrides getExpiringPolicyOverrides() {
        return expiringPolicyOverrides;
    }

    public void setExpiringPolicyOverrides(FeaturesExpiringPolicyOverrides expiringPolicyOverrides) {
        this.expiringPolicyOverrides = expiringPolicyOverrides;
    }

    public FeaturesScm getScm() {
        return scm;
    }

    public void setScm(FeaturesScm scm) {
        this.scm = scm;
    }

}
