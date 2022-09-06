/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.view;

import java.util.Set;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.manual.temporary.view.PolicyViolationView;

public class PolicyViolationLicenseView extends BlackDuckView {
    private String licenseName;
    private Set<PolicyViolationView> violatingPolicies;
    private String errorMessage;
    private String warningMessage;

    public String getLicenseName() {
        return licenseName;
    }

    public Set<PolicyViolationView> getViolatingPolicies() {
        return violatingPolicies;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getWarningMessage() {
        return warningMessage;
    }
}
