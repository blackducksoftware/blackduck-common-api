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
package com.synopsys.integration.blackduck.api.generated.deprecated.view;

import java.util.HashMap;
import java.util.Map;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionVulnerableBomComponentsItemsLicenseView;
import com.synopsys.integration.blackduck.api.generated.view.ComponentMatchedFilesView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionVulnerableBomComponentsItemsVulnerabilityWithRemediationView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityView;

@Deprecated
/**
* VulnerableComponentView from the previous API is now called ProjectVersionVulnerableBomComponentsView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class VulnerableComponentView extends BlackDuckView {
	public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String MATCHED_FILES_LINK = "matched-files";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";

	public static final LinkMultipleResponses<ComponentMatchedFilesView> MATCHED_FILES_LINK_RESPONSE = new LinkMultipleResponses<ComponentMatchedFilesView>(MATCHED_FILES_LINK, ComponentMatchedFilesView.class);
	public static final LinkMultipleResponses<VulnerabilityView> VULNERABILITIES_LINK_RESPONSE = new LinkMultipleResponses<VulnerabilityView>(VULNERABILITIES_LINK, VulnerabilityView.class);

    static {
	    links.put(MATCHED_FILES_LINK, MATCHED_FILES_LINK_RESPONSE);
	    links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
    }

    private Boolean ignored;
    private ProjectVersionVulnerableBomComponentsItemsLicenseView license;
    private ProjectVersionVulnerableBomComponentsItemsVulnerabilityWithRemediationView vulnerabilityWithRemediation;
    private String componentVersion;
    private String componentName;
    private String componentVersionName;
    private String componentVersionOriginName;
    private String componentVersionOriginId;

    public Boolean getIgnored() {
	    return ignored;
    }

    public void setIgnored(Boolean ignored) {
	    this.ignored = ignored;
    }

    public ProjectVersionVulnerableBomComponentsItemsLicenseView getLicense() {
	    return license;
    }

    public void setLicense(ProjectVersionVulnerableBomComponentsItemsLicenseView license) {
	    this.license = license;
    }

    public ProjectVersionVulnerableBomComponentsItemsVulnerabilityWithRemediationView getVulnerabilityWithRemediation() {
	    return vulnerabilityWithRemediation;
    }

    public void setVulnerabilityWithRemediation(ProjectVersionVulnerableBomComponentsItemsVulnerabilityWithRemediationView vulnerabilityWithRemediation) {
	    this.vulnerabilityWithRemediation = vulnerabilityWithRemediation;
    }

    public String getComponentVersion() {
	    return componentVersion;
    }

    public void setComponentVersion(String componentVersion) {
	    this.componentVersion = componentVersion;
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

    public String getComponentVersionOriginName() {
	    return componentVersionOriginName;
    }

    public void setComponentVersionOriginName(String componentVersionOriginName) {
	    this.componentVersionOriginName = componentVersionOriginName;
    }

    public String getComponentVersionOriginId() {
	    return componentVersionOriginId;
    }

    public void setComponentVersionOriginId(String componentVersionOriginId) {
	    this.componentVersionOriginId = componentVersionOriginId;
    }

}
