/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkBlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.UrlMultipleResponses;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentActivityDataView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentLicensesView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentReviewedDetailsView;
import com.synopsys.integration.blackduck.api.generated.enumeration.MatchType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentPolicyStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentReviewStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentType;
import com.synopsys.integration.blackduck.api.generated.enumeration.UsageType;
import com.synopsys.integration.blackduck.api.generated.view.ComponentMatchedFilesView;
import com.synopsys.integration.blackduck.api.generated.view.ComponentPolicyRulesView;
import com.synopsys.integration.blackduck.api.generated.view.IssueView;
import com.synopsys.integration.blackduck.api.generated.view.OriginView;
import com.synopsys.integration.blackduck.api.generated.view.RiskProfileView;
import com.synopsys.integration.blackduck.api.manual.temporary.component.VersionBomOriginView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionComponentView extends BlackDuckView {
    public static final Map<String, LinkBlackDuckResponse> links = new HashMap<>();

    public static final String COMPONENT_ISSUES_LINK = "component-issues";
    public static final String MATCHED_FILES_LINK = "matched-files";
    public static final String ORIGINS_LINK = "origins";
    public static final String POLICY_RULES_LINK = "policy-rules";

    public static final LinkMultipleResponses<IssueView> COMPONENT_ISSUES_LINK_RESPONSE = new LinkMultipleResponses<IssueView>(COMPONENT_ISSUES_LINK, IssueView.class);
    public static final LinkMultipleResponses<ComponentMatchedFilesView> MATCHED_FILES_LINK_RESPONSE = new LinkMultipleResponses<ComponentMatchedFilesView>(MATCHED_FILES_LINK, ComponentMatchedFilesView.class);
    public static final LinkMultipleResponses<OriginView> ORIGINS_LINK_RESPONSE = new LinkMultipleResponses<OriginView>(ORIGINS_LINK, OriginView.class);
    public static final LinkMultipleResponses<ComponentPolicyRulesView> POLICY_RULES_LINK_RESPONSE = new LinkMultipleResponses<ComponentPolicyRulesView>(POLICY_RULES_LINK, ComponentPolicyRulesView.class);

    static {
        links.put(COMPONENT_ISSUES_LINK, COMPONENT_ISSUES_LINK_RESPONSE);
        links.put(MATCHED_FILES_LINK, MATCHED_FILES_LINK_RESPONSE);
        links.put(ORIGINS_LINK, ORIGINS_LINK_RESPONSE);
        links.put(POLICY_RULES_LINK, POLICY_RULES_LINK_RESPONSE);
    }

    private ProjectVersionComponentActivityDataView activityData;
    private RiskProfileView activityRiskProfile;
    private ProjectVersionComponentPolicyStatusType approvalStatus;
    private String attributionStatement;
    private String component;
    private String componentModification;
    private Boolean componentModified;
    private String componentName;
    private String componentPurpose;
    private ProjectVersionComponentType componentType;
    private String componentVersion;
    private String componentVersionName;
    private Boolean ignored;
    private Boolean inAttributionReport;
    private RiskProfileView licenseRiskProfile;
    private java.util.List<ProjectVersionComponentLicensesView> licenses;
    private Boolean manuallyAdjusted;
    private java.util.List<MatchType> matchTypes;
    private RiskProfileView operationalRiskProfile;
    private java.util.List<VersionBomOriginView> origins;
    private ProjectVersionComponentPolicyStatusType policyStatus;
    private java.util.Date releasedOn;
    private ProjectVersionComponentReviewStatusType reviewStatus;
    private ProjectVersionComponentReviewedDetailsView reviewedDetails;
    private RiskProfileView securityRiskProfile;
    private BigDecimal totalFileMatchCount;
    private java.util.List<UsageType> usages;
    private RiskProfileView versionRiskProfile;

    public ProjectVersionComponentActivityDataView getActivityData() {
        return activityData;
    }

    public void setActivityData(ProjectVersionComponentActivityDataView activityData) {
        this.activityData = activityData;
    }

    public RiskProfileView getActivityRiskProfile() {
        return activityRiskProfile;
    }

    public void setActivityRiskProfile(RiskProfileView activityRiskProfile) {
        this.activityRiskProfile = activityRiskProfile;
    }

    public ProjectVersionComponentPolicyStatusType getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ProjectVersionComponentPolicyStatusType approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getAttributionStatement() {
        return attributionStatement;
    }

    public void setAttributionStatement(String attributionStatement) {
        this.attributionStatement = attributionStatement;
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

    public ProjectVersionComponentType getComponentType() {
        return componentType;
    }

    public void setComponentType(ProjectVersionComponentType componentType) {
        this.componentType = componentType;
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

    public Boolean getIgnored() {
        return ignored;
    }

    public void setIgnored(Boolean ignored) {
        this.ignored = ignored;
    }

    public Boolean getInAttributionReport() {
        return inAttributionReport;
    }

    public void setInAttributionReport(Boolean inAttributionReport) {
        this.inAttributionReport = inAttributionReport;
    }

    public RiskProfileView getLicenseRiskProfile() {
        return licenseRiskProfile;
    }

    public void setLicenseRiskProfile(RiskProfileView licenseRiskProfile) {
        this.licenseRiskProfile = licenseRiskProfile;
    }

    public java.util.List<ProjectVersionComponentLicensesView> getLicenses() {
        return licenses;
    }

    public void setLicenses(java.util.List<ProjectVersionComponentLicensesView> licenses) {
        this.licenses = licenses;
    }

    public Boolean getManuallyAdjusted() {
        return manuallyAdjusted;
    }

    public void setManuallyAdjusted(Boolean manuallyAdjusted) {
        this.manuallyAdjusted = manuallyAdjusted;
    }

    public java.util.List<MatchType> getMatchTypes() {
        return matchTypes;
    }

    public void setMatchTypes(java.util.List<MatchType> matchTypes) {
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

    public ProjectVersionComponentPolicyStatusType getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(ProjectVersionComponentPolicyStatusType policyStatus) {
        this.policyStatus = policyStatus;
    }

    public java.util.Date getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
        this.releasedOn = releasedOn;
    }

    public ProjectVersionComponentReviewStatusType getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(ProjectVersionComponentReviewStatusType reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public ProjectVersionComponentReviewedDetailsView getReviewedDetails() {
        return reviewedDetails;
    }

    public void setReviewedDetails(ProjectVersionComponentReviewedDetailsView reviewedDetails) {
        this.reviewedDetails = reviewedDetails;
    }

    public RiskProfileView getSecurityRiskProfile() {
        return securityRiskProfile;
    }

    public void setSecurityRiskProfile(RiskProfileView securityRiskProfile) {
        this.securityRiskProfile = securityRiskProfile;
    }

    public BigDecimal getTotalFileMatchCount() {
        return totalFileMatchCount;
    }

    public void setTotalFileMatchCount(BigDecimal totalFileMatchCount) {
        this.totalFileMatchCount = totalFileMatchCount;
    }

    public java.util.List<UsageType> getUsages() {
        return usages;
    }

    public void setUsages(java.util.List<UsageType> usages) {
        this.usages = usages;
    }

    public RiskProfileView getVersionRiskProfile() {
        return versionRiskProfile;
    }

    public void setVersionRiskProfile(RiskProfileView versionRiskProfile) {
        this.versionRiskProfile = versionRiskProfile;
    }

    public UrlMultipleResponses<IssueView> metaComponentIssuesLink() {
        return metaMultipleResponses(COMPONENT_ISSUES_LINK_RESPONSE);
    }

    public UrlMultipleResponses<ComponentMatchedFilesView> metaMatchedFilesLink() {
        return metaMultipleResponses(MATCHED_FILES_LINK_RESPONSE);
    }

    public UrlMultipleResponses<OriginView> metaOriginsLink() {
        return metaMultipleResponses(ORIGINS_LINK_RESPONSE);
    }

    public UrlMultipleResponses<ComponentPolicyRulesView> metaPolicyRulesLink() {
        return metaMultipleResponses(POLICY_RULES_LINK_RESPONSE);
    }

}
