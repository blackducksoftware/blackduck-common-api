/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class SettingsDetectView extends BlackDuckComponent {
    private java.util.List<String> allVersions;
    private Boolean allowDowngrade;
    private String detectUri;
    private String errorMessage;
    private java.util.List<String> majorVersions;
    private String selectedVersion;
    private Boolean useInternalHosting;
    private Boolean useMajorVersion;

    public java.util.List<String> getAllVersions() {
        return allVersions;
    }

    public void setAllVersions(java.util.List<String> allVersions) {
        this.allVersions = allVersions;
    }

    public Boolean getAllowDowngrade() {
        return allowDowngrade;
    }

    public void setAllowDowngrade(Boolean allowDowngrade) {
        this.allowDowngrade = allowDowngrade;
    }

    public String getDetectUri() {
        return detectUri;
    }

    public void setDetectUri(String detectUri) {
        this.detectUri = detectUri;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public java.util.List<String> getMajorVersions() {
        return majorVersions;
    }

    public void setMajorVersions(java.util.List<String> majorVersions) {
        this.majorVersions = majorVersions;
    }

    public String getSelectedVersion() {
        return selectedVersion;
    }

    public void setSelectedVersion(String selectedVersion) {
        this.selectedVersion = selectedVersion;
    }

    public Boolean getUseInternalHosting() {
        return useInternalHosting;
    }

    public void setUseInternalHosting(Boolean useInternalHosting) {
        this.useInternalHosting = useInternalHosting;
    }

    public Boolean getUseMajorVersion() {
        return useMajorVersion;
    }

    public void setUseMajorVersion(Boolean useMajorVersion) {
        this.useMajorVersion = useMajorVersion;
    }

}
