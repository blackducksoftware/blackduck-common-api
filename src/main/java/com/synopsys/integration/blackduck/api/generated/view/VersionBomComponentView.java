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

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.generated.component.ActivityDataView;
import com.synopsys.integration.blackduck.api.generated.component.ReviewedDetails;
import com.synopsys.integration.blackduck.api.generated.component.VersionBomLicenseView;
import com.synopsys.integration.blackduck.api.generated.component.VersionBomOriginView;
import com.synopsys.integration.blackduck.api.generated.enumeration.MatchedFileUsagesType;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicySummaryStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.VersionBomComponentMatchType;
import com.synopsys.integration.blackduck.api.generated.enumeration.VersionBomComponentReviewStatusType;
import com.synopsys.integration.blackduck.api.generated.response.UserCommentView;
import com.synopsys.integration.blackduck.api.generated.view.IssueView;
import com.synopsys.integration.blackduck.api.generated.view.MatchedFileView;
import com.synopsys.integration.blackduck.api.generated.view.RiskProfileView;
import com.synopsys.integration.blackduck.api.generated.view.VersionBomPolicyRuleView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerableComponentView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionBomComponentView extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String POLICY_RULES_LINK = "policy-rules";
    public static final String MATCHED_FILES_LINK = "matched-files";
    public static final String COMMENTS_LINK = "comments";
    public static final String COMPONENT_ISSUES_LINK = "component-issues";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";
    public static final String VULNERABLE_COMPONENTS_LINK = "vulnerable-components";

    public static final LinkMultipleResponses<VersionBomPolicyRuleView> POLICY_RULES_LINK_RESPONSE = new LinkMultipleResponses<VersionBomPolicyRuleView>(POLICY_RULES_LINK, VersionBomPolicyRuleView.class);
    public static final LinkMultipleResponses<MatchedFileView> MATCHED_FILES_LINK_RESPONSE = new LinkMultipleResponses<MatchedFileView>(MATCHED_FILES_LINK, MatchedFileView.class);
    public static final LinkMultipleResponses<UserCommentView> COMMENTS_LINK_RESPONSE = new LinkMultipleResponses<UserCommentView>(COMMENTS_LINK, UserCommentView.class);
    public static final LinkSingleResponse<IssueView> COMPONENT_ISSUES_LINK_RESPONSE = new LinkSingleResponse<IssueView>(COMPONENT_ISSUES_LINK, IssueView.class);
    public static final LinkMultipleResponses<VulnerabilityView> VULNERABILITIES_LINK_RESPONSE = new LinkMultipleResponses<VulnerabilityView>(VULNERABILITIES_LINK, VulnerabilityView.class);
    public static final LinkMultipleResponses<VulnerableComponentView> VULNERABLE_COMPONENTS_LINK_RESPONSE = new LinkMultipleResponses<VulnerableComponentView>(VULNERABLE_COMPONENTS_LINK, VulnerableComponentView.class);

    static {
        links.put(POLICY_RULES_LINK, POLICY_RULES_LINK_RESPONSE);
        links.put(MATCHED_FILES_LINK, MATCHED_FILES_LINK_RESPONSE);
        links.put(COMMENTS_LINK, COMMENTS_LINK_RESPONSE);
        links.put(COMPONENT_ISSUES_LINK, COMPONENT_ISSUES_LINK_RESPONSE);
        links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
        links.put(VULNERABLE_COMPONENTS_LINK, VULNERABLE_COMPONENTS_LINK_RESPONSE);
    }

    private ActivityDataView activityData;
    private RiskProfileView activityRiskProfile;
    private PolicySummaryStatusType approvalStatus;
    private String component;
    private String componentModification;
    private Boolean componentModified;
    private String componentName;
    private String componentPurpose;
    private String componentVersion;
    private String componentVersionName;
    private RiskProfileView licenseRiskProfile;
    private java.util.List<VersionBomLicenseView> licenses;
    private java.util.List<VersionBomComponentMatchType> matchTypes;
    private RiskProfileView operationalRiskProfile;
    private java.util.List<VersionBomOriginView> origins;
    private PolicySummaryStatusType policyStatus;
    private java.util.Date releasedOn;
    private VersionBomComponentReviewStatusType reviewStatus;
    private ReviewedDetails reviewedDetails;
    private RiskProfileView securityRiskProfile;
    private Long totalFileMatchCount;
    private java.util.List<MatchedFileUsagesType> usages;
    private RiskProfileView versionRiskProfile;

    public ActivityDataView getActivityData() {
        return activityData;
    }

    public void setActivityData(ActivityDataView activityData) {
        this.activityData = activityData;
    }

    public RiskProfileView getActivityRiskProfile() {
        return activityRiskProfile;
    }

    public void setActivityRiskProfile(RiskProfileView activityRiskProfile) {
        this.activityRiskProfile = activityRiskProfile;
    }

    public PolicySummaryStatusType getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(PolicySummaryStatusType approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getComponentModification() {
        return componentModification;
    }

    public void setComponentModification(String componentModification) {
        this.componentModification = componentModification;
    }

    public Boolean getComponentModified() {
        return componentModified;
    }

    public void setComponentModified(Boolean componentModified) {
        this.componentModified = componentModified;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getComponentPurpose() {
        return componentPurpose;
    }

    public void setComponentPurpose(String componentPurpose) {
        this.componentPurpose = componentPurpose;
    }

    public String getComponentVersion() {
        return componentVersion;
    }

    public void setComponentVersion(String componentVersion) {
        this.componentVersion = componentVersion;
    }

    public String getComponentVersionName() {
        return componentVersionName;
    }

    public void setComponentVersionName(String componentVersionName) {
        this.componentVersionName = componentVersionName;
    }

    public RiskProfileView getLicenseRiskProfile() {
        return licenseRiskProfile;
    }

    public void setLicenseRiskProfile(RiskProfileView licenseRiskProfile) {
        this.licenseRiskProfile = licenseRiskProfile;
    }

    public java.util.List<VersionBomLicenseView> getLicenses() {
        return licenses;
    }

    public void setLicenses(java.util.List<VersionBomLicenseView> licenses) {
        this.licenses = licenses;
    }

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

    public PolicySummaryStatusType getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(PolicySummaryStatusType policyStatus) {
        this.policyStatus = policyStatus;
    }

    public java.util.Date getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
        this.releasedOn = releasedOn;
    }

    public VersionBomComponentReviewStatusType getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(VersionBomComponentReviewStatusType reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public ReviewedDetails getReviewedDetails() {
        return reviewedDetails;
    }

    public void setReviewedDetails(ReviewedDetails reviewedDetails) {
        this.reviewedDetails = reviewedDetails;
    }

    public RiskProfileView getSecurityRiskProfile() {
        return securityRiskProfile;
    }

    public void setSecurityRiskProfile(RiskProfileView securityRiskProfile) {
        this.securityRiskProfile = securityRiskProfile;
    }

    public Long getTotalFileMatchCount() {
        return totalFileMatchCount;
    }

    public void setTotalFileMatchCount(Long totalFileMatchCount) {
        this.totalFileMatchCount = totalFileMatchCount;
    }

    public java.util.List<MatchedFileUsagesType> getUsages() {
        return usages;
    }

    public void setUsages(java.util.List<MatchedFileUsagesType> usages) {
        this.usages = usages;
    }

    public RiskProfileView getVersionRiskProfile() {
        return versionRiskProfile;
    }

    public void setVersionRiskProfile(RiskProfileView versionRiskProfile) {
        this.versionRiskProfile = versionRiskProfile;
    }

}
