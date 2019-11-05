/**
 * blackduck-common-api
 *
 * Copyright (c) 2019 Synopsys, Inc.
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
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionComponentView;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.IssueView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionLicenseView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.ProjectVersionPhaseType;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionPolicyStatusView;
import com.synopsys.integration.blackduck.api.generated.view.CodeLocationView;
import com.synopsys.integration.blackduck.api.core.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionCustomFieldView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseFamilyLicenseFamilyRiskRulesReleaseDistributionType;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.VulnerableComponentView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.project-detail-4+json";

	public static final Map<String, LinkResponse> links = new HashMap<>();
        public static final String VULNERABLE_COMPONENTS_LINK = "vulnerable-components";
        public static final String COMPONENTS_LINK = "components";
        public static final String CUSTOM_FIELDS_LINK = "custom-fields";
        public static final String ISSUES_LINK = "issues";
        public static final String CODELOCATIONS_LINK = "codelocations";
        public static final String PROJECT_LINK = "project";
        public static final String LICENSEREPORTS_LINK = "licenseReports";
        public static final String POLICY_STATUS_LINK = "policy-status";

	public static final LinkMultipleResponses<VulnerableComponentView> VULNERABLE_COMPONENTS_LINK_RESPONSE = new LinkMultipleResponses<VulnerableComponentView>(VULNERABLE_COMPONENTS_LINK, VulnerableComponentView.class);
	public static final LinkMultipleResponses<ProjectVersionComponentView> COMPONENTS_LINK_RESPONSE = new LinkMultipleResponses<ProjectVersionComponentView>(COMPONENTS_LINK, ProjectVersionComponentView.class);
	public static final LinkMultipleResponses<ProjectVersionCustomFieldView> CUSTOM_FIELDS_LINK_RESPONSE = new LinkMultipleResponses<ProjectVersionCustomFieldView>(CUSTOM_FIELDS_LINK, ProjectVersionCustomFieldView.class);
	public static final LinkMultipleResponses<IssueView> ISSUES_LINK_RESPONSE = new LinkMultipleResponses<IssueView>(ISSUES_LINK, IssueView.class);
	public static final LinkMultipleResponses<CodeLocationView> CODELOCATIONS_LINK_RESPONSE = new LinkMultipleResponses<CodeLocationView>(CODELOCATIONS_LINK, CodeLocationView.class);
	public static final LinkSingleResponse<ProjectView> PROJECT_LINK_RESPONSE = new LinkSingleResponse<ProjectView>(PROJECT_LINK, ProjectView.class);
	public static final LinkMultipleResponses<ReportView> LICENSEREPORTS_LINK_RESPONSE = new LinkMultipleResponses<ReportView>(LICENSEREPORTS_LINK, ReportView.class);
	public static final LinkSingleResponse<ProjectVersionPolicyStatusView> POLICY_STATUS_LINK_RESPONSE = new LinkSingleResponse<ProjectVersionPolicyStatusView>(POLICY_STATUS_LINK, ProjectVersionPolicyStatusView.class);

    static {
	links.put(VULNERABLE_COMPONENTS_LINK, VULNERABLE_COMPONENTS_LINK_RESPONSE);
	links.put(COMPONENTS_LINK, COMPONENTS_LINK_RESPONSE);
	links.put(CUSTOM_FIELDS_LINK, CUSTOM_FIELDS_LINK_RESPONSE);
	links.put(ISSUES_LINK, ISSUES_LINK_RESPONSE);
	links.put(CODELOCATIONS_LINK, CODELOCATIONS_LINK_RESPONSE);
	links.put(PROJECT_LINK, PROJECT_LINK_RESPONSE);
	links.put(LICENSEREPORTS_LINK, LICENSEREPORTS_LINK_RESPONSE);
	links.put(POLICY_STATUS_LINK, POLICY_STATUS_LINK_RESPONSE);
    }

    private String settingUpdatedByUser;
    private String createdBy;
    private String source;
    private String createdByUser;
    private String settingUpdatedBy;
    private java.util.Date releasedOn;
    private String releaseComments;
    private String nickname;
    private ProjectVersionLicenseView license;
    private String versionName;
    private java.util.Date createdAt;
    private ProjectVersionPhaseType phase;
    private LicenseFamilyLicenseFamilyRiskRulesReleaseDistributionType distribution;
    private String settingUpdatedAt;

    public String getSettingUpdatedByUser() {
	return settingUpdatedByUser;
    }

    public void setSettingUpdatedByUser(String settingUpdatedByUser) {
	this.settingUpdatedByUser = settingUpdatedByUser;
    }

    public String getCreatedBy() {
	return createdBy;
    }

    public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
    }

    public String getSource() {
	return source;
    }

    public void setSource(String source) {
	this.source = source;
    }

    public String getCreatedByUser() {
	return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
	this.createdByUser = createdByUser;
    }

    public String getSettingUpdatedBy() {
	return settingUpdatedBy;
    }

    public void setSettingUpdatedBy(String settingUpdatedBy) {
	this.settingUpdatedBy = settingUpdatedBy;
    }

    public java.util.Date getReleasedOn() {
	return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
	this.releasedOn = releasedOn;
    }

    public String getReleaseComments() {
	return releaseComments;
    }

    public void setReleaseComments(String releaseComments) {
	this.releaseComments = releaseComments;
    }

    public String getNickname() {
	return nickname;
    }

    public void setNickname(String nickname) {
	this.nickname = nickname;
    }

    public ProjectVersionLicenseView getLicense() {
	return license;
    }

    public void setLicense(ProjectVersionLicenseView license) {
	this.license = license;
    }

    public String getVersionName() {
	return versionName;
    }

    public void setVersionName(String versionName) {
	this.versionName = versionName;
    }

    public java.util.Date getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
	this.createdAt = createdAt;
    }

    public ProjectVersionPhaseType getPhase() {
	return phase;
    }

    public void setPhase(ProjectVersionPhaseType phase) {
	this.phase = phase;
    }

    public LicenseFamilyLicenseFamilyRiskRulesReleaseDistributionType getDistribution() {
	return distribution;
    }

    public void setDistribution(LicenseFamilyLicenseFamilyRiskRulesReleaseDistributionType distribution) {
	this.distribution = distribution;
    }

    public String getSettingUpdatedAt() {
	return settingUpdatedAt;
    }

    public void setSettingUpdatedAt(String settingUpdatedAt) {
	this.settingUpdatedAt = settingUpdatedAt;
    }


    public String getMediaType() {
	return mediaType;
    }

}
