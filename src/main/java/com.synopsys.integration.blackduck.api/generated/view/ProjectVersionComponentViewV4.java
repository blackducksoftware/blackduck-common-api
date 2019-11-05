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
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseFamilyLicenseFamilyRiskRulesUsageType;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentActivityDataView;
import com.synopsys.integration.blackduck.api.generated.view.RiskProfileView;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.OriginView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.VersionBomComponentMatchType;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.VersionBomOriginView;
import java.math.BigDecimal;
import java.util.List;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.VersionBomPolicyRuleView;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyStatusType;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentLicensesView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentReviewedDetailsView;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.VersionBomComponentReviewStatusType;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.MatchedFileView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionComponentViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-4+json";

	public static final Map<String, LinkResponse> links = new HashMap<>();
        public static final String ORIGINS_LINK = "origins";
        public static final String POLICY_RULES_LINK = "policy-rules";
        public static final String MATCHED_FILES_LINK = "matched-files";

	public static final LinkMultipleResponses<OriginView> ORIGINS_LINK_RESPONSE = new LinkMultipleResponses<OriginView>(ORIGINS_LINK, OriginView.class);
	public static final LinkMultipleResponses<VersionBomPolicyRuleView> POLICY_RULES_LINK_RESPONSE = new LinkMultipleResponses<VersionBomPolicyRuleView>(POLICY_RULES_LINK, VersionBomPolicyRuleView.class);
	public static final LinkMultipleResponses<MatchedFileView> MATCHED_FILES_LINK_RESPONSE = new LinkMultipleResponses<MatchedFileView>(MATCHED_FILES_LINK, MatchedFileView.class);

    static {
	links.put(ORIGINS_LINK, ORIGINS_LINK_RESPONSE);
	links.put(POLICY_RULES_LINK, POLICY_RULES_LINK_RESPONSE);
	links.put(MATCHED_FILES_LINK, MATCHED_FILES_LINK_RESPONSE);
    }

    private java.util.List<VersionBomComponentMatchType> matchTypes;
    private RiskProfileView operationalRiskProfile;
    private java.util.List<VersionBomOriginView> origins;
    private RiskProfileView securityRiskProfile;
    private java.util.Date releasedOn;
    private java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> usages;
    private RiskProfileView versionRiskProfile;
    private ProjectVersionComponentActivityDataView activityData;
    private String componentName;
    private PolicyStatusType approvalStatus;
    private RiskProfileView licenseRiskProfile;
    private String componentVersion;
    private PolicyStatusType policyStatus;
    private RiskProfileView activityRiskProfile;
    private java.util.List<ProjectVersionComponentLicensesView> licenses;
    private BigDecimal totalFileMatchCount;
    private VersionBomComponentReviewStatusType reviewStatus;
    private String component;
    private String componentVersionName;
    private ProjectVersionComponentReviewedDetailsView reviewedDetails;

    public java.util.List<VersionBomComponentMatchType> getMatchTypes() {
	return matchTypes;
    }

    public void setMatchTypes(java.util.List<VersionBomComponentMatchType> matchTypes) {
	this.matchTypes = matchTypes;
    }

    public RiskProfileView getOperationalRiskProfile() {
	return operationalRiskProfile;
    }

    public void setOperationalRiskProfile(RiskProfileView operationalRiskProfile) {
	this.operationalRiskProfile = operationalRiskProfile;
    }

    public java.util.List<VersionBomOriginView> getOrigins() {
	return origins;
    }

    public void setOrigins(java.util.List<VersionBomOriginView> origins) {
	this.origins = origins;
    }

    public RiskProfileView getSecurityRiskProfile() {
	return securityRiskProfile;
    }

    public void setSecurityRiskProfile(RiskProfileView securityRiskProfile) {
	this.securityRiskProfile = securityRiskProfile;
    }

    public java.util.Date getReleasedOn() {
	return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
	this.releasedOn = releasedOn;
    }

    public java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> getUsages() {
	return usages;
    }

    public void setUsages(java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> usages) {
	this.usages = usages;
    }

    public RiskProfileView getVersionRiskProfile() {
	return versionRiskProfile;
    }

    public void setVersionRiskProfile(RiskProfileView versionRiskProfile) {
	this.versionRiskProfile = versionRiskProfile;
    }

    public ProjectVersionComponentActivityDataView getActivityData() {
	return activityData;
    }

    public void setActivityData(ProjectVersionComponentActivityDataView activityData) {
	this.activityData = activityData;
    }

    public String getComponentName() {
	return componentName;
    }

    public void setComponentName(String componentName) {
	this.componentName = componentName;
    }

    public PolicyStatusType getApprovalStatus() {
	return approvalStatus;
    }

    public void setApprovalStatus(PolicyStatusType approvalStatus) {
	this.approvalStatus = approvalStatus;
    }

    public RiskProfileView getLicenseRiskProfile() {
	return licenseRiskProfile;
    }

    public void setLicenseRiskProfile(RiskProfileView licenseRiskProfile) {
	this.licenseRiskProfile = licenseRiskProfile;
    }

    public String getComponentVersion() {
	return componentVersion;
    }

    public void setComponentVersion(String componentVersion) {
	this.componentVersion = componentVersion;
    }

    public PolicyStatusType getPolicyStatus() {
	return policyStatus;
    }

    public void setPolicyStatus(PolicyStatusType policyStatus) {
	this.policyStatus = policyStatus;
    }

    public RiskProfileView getActivityRiskProfile() {
	return activityRiskProfile;
    }

    public void setActivityRiskProfile(RiskProfileView activityRiskProfile) {
	this.activityRiskProfile = activityRiskProfile;
    }

    public java.util.List<ProjectVersionComponentLicensesView> getLicenses() {
	return licenses;
    }

    public void setLicenses(java.util.List<ProjectVersionComponentLicensesView> licenses) {
	this.licenses = licenses;
    }

    public BigDecimal getTotalFileMatchCount() {
	return totalFileMatchCount;
    }

    public void setTotalFileMatchCount(BigDecimal totalFileMatchCount) {
	this.totalFileMatchCount = totalFileMatchCount;
    }

    public VersionBomComponentReviewStatusType getReviewStatus() {
	return reviewStatus;
    }

    public void setReviewStatus(VersionBomComponentReviewStatusType reviewStatus) {
	this.reviewStatus = reviewStatus;
    }

    public String getComponent() {
	return component;
    }

    public void setComponent(String component) {
	this.component = component;
    }

    public String getComponentVersionName() {
	return componentVersionName;
    }

    public void setComponentVersionName(String componentVersionName) {
	this.componentVersionName = componentVersionName;
    }

    public ProjectVersionComponentReviewedDetailsView getReviewedDetails() {
	return reviewedDetails;
    }

    public void setReviewedDetails(ProjectVersionComponentReviewedDetailsView reviewedDetails) {
	this.reviewedDetails = reviewedDetails;
    }


    public String getMediaType() {
	return mediaType;
    }

}
