/**
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
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
package com.synopsys.integration.blackduck.api.manual.view;

import java.util.Set;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;

public class DeveloperScanComponentResultView extends BlackDuckView {
    private String componentName;
    private String versionName;
    private Set<String> violatingPolicyNames;
    private Set<PolicyViolationVulnerabilityView> vulnerabilities;
    private Set<PolicyViolationLicenseView> licenses;

    public String getComponentName() {
        return componentName;
    }

    public String getVersionName() {
        return versionName;
    }

    public Set<String> getViolatingPolicyNames() {
        return violatingPolicyNames;
    }

    public Set<PolicyViolationVulnerabilityView> getVulnerabilities() {
        return vulnerabilities;
    }

    public Set<PolicyViolationLicenseView> getLicenses() {
        return licenses;
    }
}
