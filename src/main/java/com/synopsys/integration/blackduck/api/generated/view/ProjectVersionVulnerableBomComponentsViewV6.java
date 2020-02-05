/**
 * blackduck-common-api
 *
 * Copyright (c) 2020 Synopsys, Inc.
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
package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionLicenseView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionVulnerableBomComponentsItemsVulnerabilityWithRemediationView;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionVulnerableBomComponentsViewV6 extends BlackDuckView {
	public static final String MEDIA_TYPE = "application/vnd.blackducksoftware.bill-of-materials-6+json";

    private String componentVersionName;
    private String componentVersionOriginName;
    private String componentName;
    private ProjectVersionVulnerableBomComponentsItemsVulnerabilityWithRemediationView vulnerabilityWithRemediation;
    private String componentVersionOriginId;
    private ProjectVersionLicenseView license;
    private String componentVersion;

    public String getComponentVersionName() {
	    return componentVersionName;
    }

    public void setComponentVersionName(String componentVersionName) {
	    this.componentVersionName = componentVersionName;
    }

    public String getComponentVersionOriginName() {
	    return componentVersionOriginName;
    }

    public void setComponentVersionOriginName(String componentVersionOriginName) {
	    this.componentVersionOriginName = componentVersionOriginName;
    }

    public String getComponentName() {
	    return componentName;
    }

    public void setComponentName(String componentName) {
	    this.componentName = componentName;
    }

    public ProjectVersionVulnerableBomComponentsItemsVulnerabilityWithRemediationView getVulnerabilityWithRemediation() {
	    return vulnerabilityWithRemediation;
    }

    public void setVulnerabilityWithRemediation(ProjectVersionVulnerableBomComponentsItemsVulnerabilityWithRemediationView vulnerabilityWithRemediation) {
	    this.vulnerabilityWithRemediation = vulnerabilityWithRemediation;
    }

    public String getComponentVersionOriginId() {
	    return componentVersionOriginId;
    }

    public void setComponentVersionOriginId(String componentVersionOriginId) {
	    this.componentVersionOriginId = componentVersionOriginId;
    }

    public ProjectVersionLicenseView getLicense() {
	    return license;
    }

    public void setLicense(ProjectVersionLicenseView license) {
	    this.license = license;
    }

    public String getComponentVersion() {
	    return componentVersion;
    }

    public void setComponentVersion(String componentVersion) {
	    this.componentVersion = componentVersion;
    }


    public String getMediaType() {
	    return MEDIA_TYPE;
    }
}
