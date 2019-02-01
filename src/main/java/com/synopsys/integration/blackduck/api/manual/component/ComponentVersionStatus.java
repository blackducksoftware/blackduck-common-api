/**
 * blackduck-common-api
 *
 * Copyright (C) 2019 Black Duck Software, Inc.
 * http://www.blackducksoftware.com/
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.blackduck.api.manual.component;

import java.util.List;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

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
