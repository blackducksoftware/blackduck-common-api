/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.view;

import java.util.Set;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;

public class PolicyViolationLicenseView extends BlackDuckView {
    private String licenseName;
    private Set<String> violatingPolicyNames;
    private Set<PolicyViolationComponentView> components;
    private String errorMessage;
    private String warningMessage;

    public String getLicenseName() {
        return licenseName;
    }

    public Set<String> getViolatingPolicyNames() {
        return violatingPolicyNames;
    }

    public Set<PolicyViolationComponentView> getComponents() {
        return components;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getWarningMessage() {
        return warningMessage;
    }
}
