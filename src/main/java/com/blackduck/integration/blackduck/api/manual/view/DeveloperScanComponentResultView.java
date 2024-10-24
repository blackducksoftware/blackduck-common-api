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

// DeveloperScanComponentResultView now has generated class available through the DeveloperScansScanView
@Deprecated
public class DeveloperScanComponentResultView extends BlackDuckView {
    public static final String CURRENT_MEDIA_TYPE = "application/vnd.blackducksoftware.scan-4+json";

    private String componentName;
    private String versionName;
    private String componentIdentifier;
    private Set<String> violatingPolicyNames;
    private Set<PolicyViolationVulnerabilityView> policyViolationVulnerabilities;
    private Set<PolicyViolationLicenseView> policyViolationLicenses;
    private String errorMessage;
    private String warningMessage;

    public String getComponentName() {
        return componentName;
    }

    public String getVersionName() {
        return versionName;
    }

    public String getComponentIdentifier() {
        return componentIdentifier;
    }

    public Set<String> getViolatingPolicyNames() {
        return violatingPolicyNames;
    }

    public Set<PolicyViolationVulnerabilityView> getPolicyViolationVulnerabilities() {
        return policyViolationVulnerabilities;
    }

    public Set<PolicyViolationLicenseView> getPolicyViolationLicenses() {
        return policyViolationLicenses;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public String getWarningMessage() {
        return warningMessage;
    }
}
