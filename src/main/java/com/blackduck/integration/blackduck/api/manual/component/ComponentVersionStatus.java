/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

import java.util.List;

public class ComponentVersionStatus extends BlackDuckComponent {
    private String componentName;
    private String componentVersionName;
    private String bomComponentVersionPolicyStatus;
    private String componentIssueLink;
    private List<String> policies;
    private String bomComponent;

    // If version is specified, componentVersion will be populated
    // otherwise it will be null
    private String componentVersion;

    // If version is not specified, component will be populated
    // otherwise it will be null
    private String component;

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

    public String getBomComponentVersionPolicyStatus() {
        return bomComponentVersionPolicyStatus;
    }

    public void setBomComponentVersionPolicyStatus(String bomComponentVersionPolicyStatus) {
        this.bomComponentVersionPolicyStatus = bomComponentVersionPolicyStatus;
    }

    public String getComponentIssueLink() {
        return componentIssueLink;
    }

    public void setComponentIssueLink(String componentIssueLink) {
        this.componentIssueLink = componentIssueLink;
    }

    public List<String> getPolicies() {
        return policies;
    }

    public void setPolicies(List<String> policies) {
        this.policies = policies;
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
