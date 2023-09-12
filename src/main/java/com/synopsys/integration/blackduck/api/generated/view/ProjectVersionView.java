/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkBlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.core.response.UrlMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.UrlSingleResponse;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionAutoUnmappingStatusView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionDistributionType;
import com.synopsys.integration.blackduck.api.generated.view.CodeLocationView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionBomStatusView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionComponentVersionView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionIssuesView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionLicenseView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionPolicyRulesView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionPolicyStatusView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionReportView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionVulnerableBomComponentsView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectView;
import com.synopsys.integration.blackduck.api.generated.view.ReportView;
import com.synopsys.integration.blackduck.api.manual.temporary.enumeration.ProjectVersionPhaseType;
import com.synopsys.integration.blackduck.api.manual.temporary.response.VersionRiskProfileView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionView extends BlackDuckView {
    public static final Map<String, LinkBlackDuckResponse> links = new HashMap<>();

    public static final String ACTIVE_POLICY_RULES_LINK = "active-policy-rules";
    public static final String BOM_STATUS_LINK = "bom-status";
    public static final String CODELOCATIONS_LINK = "codelocations";
    public static final String COMPONENTS_LINK = "components";
    public static final String ISSUES_LINK = "issues";
    public static final String LICENSE_REPORTS_LINK = "licenseReports";
    public static final String POLICY_STATUS_LINK = "policy-status";
    public static final String PROJECT_LINK = "project";
    public static final String REPORTS_LINK = "reports";
    public static final String RISK_PROFILE_LINK = "riskProfile";
    public static final String VERSION_REPORT_LINK = "versionReport";
    public static final String VULNERABLE_COMPONENTS_LINK = "vulnerable-components";

    public static final LinkMultipleResponses<ProjectVersionPolicyRulesView> ACTIVE_POLICY_RULES_LINK_RESPONSE = new LinkMultipleResponses<ProjectVersionPolicyRulesView>(ACTIVE_POLICY_RULES_LINK, ProjectVersionPolicyRulesView.class);
    public static final LinkMultipleResponses<ProjectVersionBomStatusView> BOM_STATUS_LINK_RESPONSE = new LinkMultipleResponses<ProjectVersionBomStatusView>(BOM_STATUS_LINK, ProjectVersionBomStatusView.class);
    public static final LinkMultipleResponses<CodeLocationView> CODELOCATIONS_LINK_RESPONSE = new LinkMultipleResponses<CodeLocationView>(CODELOCATIONS_LINK, CodeLocationView.class);
    public static final LinkMultipleResponses<ProjectVersionComponentVersionView> COMPONENTS_LINK_RESPONSE = new LinkMultipleResponses<ProjectVersionComponentVersionView>(COMPONENTS_LINK, ProjectVersionComponentVersionView.class);
    public static final LinkMultipleResponses<ProjectVersionIssuesView> ISSUES_LINK_RESPONSE = new LinkMultipleResponses<ProjectVersionIssuesView>(ISSUES_LINK, ProjectVersionIssuesView.class);
    public static final LinkMultipleResponses<ProjectVersionReportView> LICENSE_REPORTS_LINK_RESPONSE = new LinkMultipleResponses<ProjectVersionReportView>(LICENSE_REPORTS_LINK, ProjectVersionReportView.class);
    public static final LinkSingleResponse<ProjectVersionPolicyStatusView> POLICY_STATUS_LINK_RESPONSE = new LinkSingleResponse<ProjectVersionPolicyStatusView>(POLICY_STATUS_LINK, ProjectVersionPolicyStatusView.class);
    public static final LinkSingleResponse<ProjectView> PROJECT_LINK_RESPONSE = new LinkSingleResponse<ProjectView>(PROJECT_LINK, ProjectView.class);
    public static final LinkMultipleResponses<ReportView> REPORTS_LINK_RESPONSE = new LinkMultipleResponses<ReportView>(REPORTS_LINK, ReportView.class);
    public static final LinkSingleResponse<VersionRiskProfileView> RISK_PROFILE_LINK_RESPONSE = new LinkSingleResponse<VersionRiskProfileView>(RISK_PROFILE_LINK, VersionRiskProfileView.class);
    public static final LinkMultipleResponses<ProjectVersionReportView> VERSION_REPORT_LINK_RESPONSE = new LinkMultipleResponses<ProjectVersionReportView>(VERSION_REPORT_LINK, ProjectVersionReportView.class);
    public static final LinkMultipleResponses<ProjectVersionVulnerableBomComponentsView> VULNERABLE_COMPONENTS_LINK_RESPONSE = new LinkMultipleResponses<ProjectVersionVulnerableBomComponentsView>(VULNERABLE_COMPONENTS_LINK, ProjectVersionVulnerableBomComponentsView.class);

    static {
        links.put(ACTIVE_POLICY_RULES_LINK, ACTIVE_POLICY_RULES_LINK_RESPONSE);
        links.put(BOM_STATUS_LINK, BOM_STATUS_LINK_RESPONSE);
        links.put(CODELOCATIONS_LINK, CODELOCATIONS_LINK_RESPONSE);
        links.put(COMPONENTS_LINK, COMPONENTS_LINK_RESPONSE);
        links.put(ISSUES_LINK, ISSUES_LINK_RESPONSE);
        links.put(LICENSE_REPORTS_LINK, LICENSE_REPORTS_LINK_RESPONSE);
        links.put(POLICY_STATUS_LINK, POLICY_STATUS_LINK_RESPONSE);
        links.put(PROJECT_LINK, PROJECT_LINK_RESPONSE);
        links.put(REPORTS_LINK, REPORTS_LINK_RESPONSE);
        links.put(RISK_PROFILE_LINK, RISK_PROFILE_LINK_RESPONSE);
        links.put(VERSION_REPORT_LINK, VERSION_REPORT_LINK_RESPONSE);
        links.put(VULNERABLE_COMPONENTS_LINK, VULNERABLE_COMPONENTS_LINK_RESPONSE);
    }

    private ProjectVersionAutoUnmappingStatusView autoUnmappingStatus;
    private String branch;
    private Boolean codeLocationProtection;
    private java.util.Date createdAt;
    private String createdBy;
    private String createdByUser;
    private ProjectVersionDistributionType distribution;
    private ProjectVersionLicenseView license;
    private String nickname;
    private ProjectVersionPhaseType phase;
    private Boolean protectedFromDeletion;
    private String releaseComments;
    private java.util.Date releasedOn;
    private java.util.Date scheduledDeletionDate;
    private java.util.Date settingUpdatedAt;
    private String settingUpdatedBy;
    private String settingUpdatedByUser;
    private String source;
    private String versionName;

    public ProjectVersionAutoUnmappingStatusView getAutoUnmappingStatus() {
        return autoUnmappingStatus;
    }

    public void setAutoUnmappingStatus(ProjectVersionAutoUnmappingStatusView autoUnmappingStatus) {
        this.autoUnmappingStatus = autoUnmappingStatus;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public Boolean getCodeLocationProtection() {
        return codeLocationProtection;
    }

    public void setCodeLocationProtection(Boolean codeLocationProtection) {
        this.codeLocationProtection = codeLocationProtection;
    }

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

    public Boolean getProtectedFromDeletion() {
        return protectedFromDeletion;
    }

    public void setProtectedFromDeletion(Boolean protectedFromDeletion) {
        this.protectedFromDeletion = protectedFromDeletion;
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

    public java.util.Date getScheduledDeletionDate() {
        return scheduledDeletionDate;
    }

    public void setScheduledDeletionDate(java.util.Date scheduledDeletionDate) {
        this.scheduledDeletionDate = scheduledDeletionDate;
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

    public UrlMultipleResponses<ProjectVersionPolicyRulesView> metaActivePolicyRulesLink() {
        return metaMultipleResponses(ACTIVE_POLICY_RULES_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<ProjectVersionPolicyRulesView>> metaActivePolicyRulesLinkSafely() {
        return metaMultipleResponsesSafely(ACTIVE_POLICY_RULES_LINK_RESPONSE);
    }

    public UrlMultipleResponses<ProjectVersionBomStatusView> metaBomStatusLink() {
        return metaMultipleResponses(BOM_STATUS_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<ProjectVersionBomStatusView>> metaBomStatusLinkSafely() {
        return metaMultipleResponsesSafely(BOM_STATUS_LINK_RESPONSE);
    }

    public UrlMultipleResponses<CodeLocationView> metaCodelocationsLink() {
        return metaMultipleResponses(CODELOCATIONS_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<CodeLocationView>> metaCodelocationsLinkSafely() {
        return metaMultipleResponsesSafely(CODELOCATIONS_LINK_RESPONSE);
    }

    public UrlMultipleResponses<ProjectVersionComponentVersionView> metaComponentsLink() {
        return metaMultipleResponses(COMPONENTS_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<ProjectVersionComponentVersionView>> metaComponentsLinkSafely() {
        return metaMultipleResponsesSafely(COMPONENTS_LINK_RESPONSE);
    }

    public UrlMultipleResponses<ProjectVersionIssuesView> metaIssuesLink() {
        return metaMultipleResponses(ISSUES_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<ProjectVersionIssuesView>> metaIssuesLinkSafely() {
        return metaMultipleResponsesSafely(ISSUES_LINK_RESPONSE);
    }

    public UrlMultipleResponses<ProjectVersionReportView> metaLicenseReportsLink() {
        return metaMultipleResponses(LICENSE_REPORTS_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<ProjectVersionReportView>> metaLicenseReportsLinkSafely() {
        return metaMultipleResponsesSafely(LICENSE_REPORTS_LINK_RESPONSE);
    }

    public UrlSingleResponse<ProjectVersionPolicyStatusView> metaPolicyStatusLink() {
        return metaSingleResponse(POLICY_STATUS_LINK_RESPONSE);
    }

    public Optional<UrlSingleResponse<ProjectVersionPolicyStatusView>> metaPolicyStatusLinkSafely() {
        return metaSingleResponseSafely(POLICY_STATUS_LINK_RESPONSE);
    }

    public UrlSingleResponse<ProjectView> metaProjectLink() {
        return metaSingleResponse(PROJECT_LINK_RESPONSE);
    }

    public Optional<UrlSingleResponse<ProjectView>> metaProjectLinkSafely() {
        return metaSingleResponseSafely(PROJECT_LINK_RESPONSE);
    }

    public UrlMultipleResponses<ReportView> metaReportsLink() {
        return metaMultipleResponses(REPORTS_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<ReportView>> metaReportsLinkSafely() {
        return metaMultipleResponsesSafely(REPORTS_LINK_RESPONSE);
    }

    public UrlSingleResponse<VersionRiskProfileView> metaRiskProfileLink() {
        return metaSingleResponse(RISK_PROFILE_LINK_RESPONSE);
    }

    public Optional<UrlSingleResponse<VersionRiskProfileView>> metaRiskProfileLinkSafely() {
        return metaSingleResponseSafely(RISK_PROFILE_LINK_RESPONSE);
    }

    public UrlMultipleResponses<ProjectVersionReportView> metaVersionReportLink() {
        return metaMultipleResponses(VERSION_REPORT_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<ProjectVersionReportView>> metaVersionReportLinkSafely() {
        return metaMultipleResponsesSafely(VERSION_REPORT_LINK_RESPONSE);
    }

    public UrlMultipleResponses<ProjectVersionVulnerableBomComponentsView> metaVulnerableComponentsLink() {
        return metaMultipleResponses(VULNERABLE_COMPONENTS_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<ProjectVersionVulnerableBomComponentsView>> metaVulnerableComponentsLinkSafely() {
        return metaMultipleResponsesSafely(VULNERABLE_COMPONENTS_LINK_RESPONSE);
    }

}
