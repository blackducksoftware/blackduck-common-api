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

import java.util.HashMap;
import java.util.Map;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionDistributionType;
import com.synopsys.integration.blackduck.api.generated.view.CodeLocationView;
import com.synopsys.integration.blackduck.api.generated.view.IssueView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionComponentView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionLicenseView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionPolicyStatusView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionVulnerableBomComponentsView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectView;
import com.synopsys.integration.blackduck.api.manual.temporary.enumeration.ProjectVersionPhaseType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionView extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String CODELOCATIONS_LINK = "codelocations";
    public static final String COMPONENTS_LINK = "components";
    public static final String ISSUES_LINK = "issues";
    public static final String LICENSEREPORTS_LINK = "licenseReports";
    public static final String POLICY_STATUS_LINK = "policy-status";
    public static final String PROJECT_LINK = "project";
    public static final String VULNERABLE_COMPONENTS_LINK = "vulnerable-components";

    public static final LinkMultipleResponses<CodeLocationView> CODELOCATIONS_LINK_RESPONSE = new LinkMultipleResponses<CodeLocationView>(CODELOCATIONS_LINK, CodeLocationView.class);
    public static final LinkMultipleResponses<ProjectVersionComponentView> COMPONENTS_LINK_RESPONSE = new LinkMultipleResponses<ProjectVersionComponentView>(COMPONENTS_LINK, ProjectVersionComponentView.class);
    public static final LinkMultipleResponses<IssueView> ISSUES_LINK_RESPONSE = new LinkMultipleResponses<IssueView>(ISSUES_LINK, IssueView.class);
    public static final LinkMultipleResponses<ReportView> LICENSEREPORTS_LINK_RESPONSE = new LinkMultipleResponses<ReportView>(LICENSEREPORTS_LINK, ReportView.class);
    public static final LinkSingleResponse<ProjectVersionPolicyStatusView> POLICY_STATUS_LINK_RESPONSE = new LinkSingleResponse<ProjectVersionPolicyStatusView>(POLICY_STATUS_LINK, ProjectVersionPolicyStatusView.class);
    public static final LinkSingleResponse<ProjectView> PROJECT_LINK_RESPONSE = new LinkSingleResponse<ProjectView>(PROJECT_LINK, ProjectView.class);
    public static final LinkMultipleResponses<ProjectVersionVulnerableBomComponentsView> VULNERABLE_COMPONENTS_LINK_RESPONSE = new LinkMultipleResponses<ProjectVersionVulnerableBomComponentsView>(VULNERABLE_COMPONENTS_LINK, ProjectVersionVulnerableBomComponentsView.class);

    static {
        links.put(CODELOCATIONS_LINK, CODELOCATIONS_LINK_RESPONSE);
        links.put(COMPONENTS_LINK, COMPONENTS_LINK_RESPONSE);
        links.put(ISSUES_LINK, ISSUES_LINK_RESPONSE);
        links.put(LICENSEREPORTS_LINK, LICENSEREPORTS_LINK_RESPONSE);
        links.put(POLICY_STATUS_LINK, POLICY_STATUS_LINK_RESPONSE);
        links.put(PROJECT_LINK, PROJECT_LINK_RESPONSE);
        links.put(VULNERABLE_COMPONENTS_LINK, VULNERABLE_COMPONENTS_LINK_RESPONSE);
    }

    private java.util.Date createdAt;
    private String createdBy;
    private String createdByUser;
    private ProjectVersionDistributionType distribution;
    private ProjectVersionLicenseView license;
    private String nickname;
    private ProjectVersionPhaseType phase;
    private String releaseComments;
    private java.util.Date releasedOn;
    private java.util.Date settingUpdatedAt;
    private String settingUpdatedBy;
    private String settingUpdatedByUser;
    private String source;
    private String versionName;

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
        this.createdByUser = createdByUser;
    }

    public ProjectVersionDistributionType getDistribution() {
        return distribution;
    }

    public void setDistribution(ProjectVersionDistributionType distribution) {
        this.distribution = distribution;
    }

    public ProjectVersionLicenseView getLicense() {
        return license;
    }

    public void setLicense(ProjectVersionLicenseView license) {
        this.license = license;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public ProjectVersionPhaseType getPhase() {
        return phase;
    }

    public void setPhase(ProjectVersionPhaseType phase) {
        this.phase = phase;
    }

    public String getReleaseComments() {
        return releaseComments;
    }

    public void setReleaseComments(String releaseComments) {
        this.releaseComments = releaseComments;
    }

    public java.util.Date getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
        this.releasedOn = releasedOn;
    }

    public java.util.Date getSettingUpdatedAt() {
        return settingUpdatedAt;
    }

    public void setSettingUpdatedAt(java.util.Date settingUpdatedAt) {
        this.settingUpdatedAt = settingUpdatedAt;
    }

    public String getSettingUpdatedBy() {
        return settingUpdatedBy;
    }

    public void setSettingUpdatedBy(String settingUpdatedBy) {
        this.settingUpdatedBy = settingUpdatedBy;
    }

    public String getSettingUpdatedByUser() {
        return settingUpdatedByUser;
    }

    public void setSettingUpdatedByUser(String settingUpdatedByUser) {
        this.settingUpdatedByUser = settingUpdatedByUser;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

}
