/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.component;

import java.util.List;

public class RuleViolationNotificationContent extends NotificationContentComponent {
    private String projectName;
    private String projectVersionName;
    private String projectVersion;
    private int componentVersionsInViolation;
    private List<ComponentVersionStatus> componentVersionStatuses;
    private List<PolicyInfo> policyInfos;

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

    public int getComponentVersionsInViolation() {
        return componentVersionsInViolation;
    }

    public void setComponentVersionsInViolation(int componentVersionsInViolation) {
        this.componentVersionsInViolation = componentVersionsInViolation;
    }

    public List<ComponentVersionStatus> getComponentVersionStatuses() {
        return componentVersionStatuses;
    }

    public void setComponentVersionStatuses(List<ComponentVersionStatus> componentVersionStatuses) {
        this.componentVersionStatuses = componentVersionStatuses;
    }

    public List<PolicyInfo> getPolicyInfos() {
        return policyInfos;
    }

    public void setPolicyInfos(List<PolicyInfo> policyInfos) {
        this.policyInfos = policyInfos;
    }

}
