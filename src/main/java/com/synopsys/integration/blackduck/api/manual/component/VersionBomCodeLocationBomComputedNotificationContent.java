/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.component;

public class VersionBomCodeLocationBomComputedNotificationContent extends NotificationContentComponent {
    private String projectVersion;
    private String codeLocation;
    private String scanSummary;
    private String snippetScanSummary;

    public String getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
    }

    public String getCodeLocation() {
        return codeLocation;
    }

    public void setCodeLocation(String codeLocation) {
        this.codeLocation = codeLocation;
    }

    public String getScanSummary() {
        return scanSummary;
    }

    public void setScanSummary(String scanSummary) {
        this.scanSummary = scanSummary;
    }

    public String getSnippetScanSummary() {
        return snippetScanSummary;
    }

    public void setSnippetScanSummary(String snippetScanSummary) {
        this.snippetScanSummary = snippetScanSummary;
    }

}
