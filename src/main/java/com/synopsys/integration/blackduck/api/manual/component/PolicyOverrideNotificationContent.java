/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.component;

import java.util.List;

public class PolicyOverrideNotificationContent extends NotificationContentComponent {
    private String projectName;
    private String projectVersionName;
    private String projectVersion;
    private String componentName;
    private String componentVersionName;
    private String firstName;
    private String lastName;
    private List<PolicyInfo> policyInfos;
    private List<String> policies;
    private String bomComponentVersionPolicyStatus;
    private String bomComponent;

    // If version is specified, componentVersion will be populated
    // otherwise it will be null
    private String componentVersion;

    // If version is not specified, component will be populated
    // otherwise it will be null
    private String component;

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

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getComponentVersionName() {
        return componentVersionName;
    }

    public void setComponentVersionName(String componentVersionName) {
        this.componentVersionName = componentVersionName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<PolicyInfo> getPolicyInfos() {
        return policyInfos;
    }

    public void setPolicyInfos(List<PolicyInfo> policyInfos) {
        this.policyInfos = policyInfos;
    }

    public List<String> getPolicies() {
        return policies;
    }

    public void setPolicies(List<String> policies) {
        this.policies = policies;
    }

    public String getBomComponentVersionPolicyStatus() {
        return bomComponentVersionPolicyStatus;
    }

    public void setBomComponentVersionPolicyStatus(String bomComponentVersionPolicyStatus) {
        this.bomComponentVersionPolicyStatus = bomComponentVersionPolicyStatus;
    }

    public String getBomComponent() {
        return bomComponent;
    }

    public void setBomComponent(String bomComponent) {
        this.bomComponent = bomComponent;
    }

    public String getComponentVersion() {
        return componentVersion;
    }

    public void setComponentVersion(String componentVersion) {
        this.componentVersion = componentVersion;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }
}
