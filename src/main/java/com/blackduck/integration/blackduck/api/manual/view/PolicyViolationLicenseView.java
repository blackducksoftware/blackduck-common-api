/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.view;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;

import java.util.Set;

public class PolicyViolationLicenseView extends BlackDuckView {
    private String licenseName;
    private Set<String> violatingPolicyNames;
    private String errorMessage;
    private String warningMessage;

    public String getLicenseName() {
        return licenseName;
    }

    public Set<String> getViolatingPolicyNames() {
        return violatingPolicyNames;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getWarningMessage() {
        return warningMessage;
    }
}
