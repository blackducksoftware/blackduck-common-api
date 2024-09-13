/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

public class AffectedProjectVersion extends BlackDuckComponent {
    private String projectName;
    private String projectVersionName;
    private String projectVersion;
    private String componentIssueUrl;
    private String bomComponent;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectVersionName() {
        return projectVersionName;
    }

    public void setProjectVersionName(String projectVersionName) {
        this.projectVersionName = projectVersionName;
    }

    public String getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
    }

    public String getComponentIssueUrl() {
        return componentIssueUrl;
    }

    public void setComponentIssueUrl(String componentIssueUrl) {
        this.componentIssueUrl = componentIssueUrl;
    }

    public String getBomComponent() {
        return bomComponent;
    }

    public void setBomComponent(String bomComponent) {
        this.bomComponent = bomComponent;
    }

}
