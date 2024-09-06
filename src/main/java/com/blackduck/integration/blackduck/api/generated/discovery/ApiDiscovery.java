/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.discovery;

import com.blackduck.integration.blackduck.api.core.BlackDuckPath;
import com.blackduck.integration.blackduck.api.core.BlackDuckResponse;
import com.blackduck.integration.blackduck.api.core.response.UrlMultipleResponses;
import com.blackduck.integration.blackduck.api.core.response.UrlSingleResponse;
import com.blackduck.integration.blackduck.api.generated.response.ComponentsView;
import com.blackduck.integration.blackduck.api.generated.response.CurrentVersionView;
import com.blackduck.integration.blackduck.api.generated.response.CweView;
import com.blackduck.integration.blackduck.api.generated.response.HealthChecksLivenessView;
import com.blackduck.integration.blackduck.api.manual.response.BlackDuckStringResponse;
import com.blackduck.integration.blackduck.api.manual.view.NotificationView;
import com.blackduck.integration.blackduck.api.manual.view.ProjectView;
import com.blackduck.integration.blackduck.api.generated.view.AnnouncementBannerView;
import com.blackduck.integration.blackduck.api.generated.view.CodeLocationView;
import com.blackduck.integration.blackduck.api.generated.view.ComponentMigrationsView;
import com.blackduck.integration.blackduck.api.generated.view.ComponentVulnerabilityBomView;
import com.blackduck.integration.blackduck.api.generated.view.CpesView;
import com.blackduck.integration.blackduck.api.generated.view.CustomFieldObjectView;
import com.blackduck.integration.blackduck.api.generated.view.ExternalConfigDetectUriView;
import com.blackduck.integration.blackduck.api.generated.view.FileSourceContentsSha1View;
import com.blackduck.integration.blackduck.api.generated.view.GraphComponentImportEventsView;
import com.blackduck.integration.blackduck.api.generated.view.HistoriesView;
import com.blackduck.integration.blackduck.api.generated.view.IntegrationGithubView;
import com.blackduck.integration.blackduck.api.generated.view.JobView;
import com.blackduck.integration.blackduck.api.generated.view.LicenseDashboardView;
import com.blackduck.integration.blackduck.api.generated.view.LicenseFamilyView;
import com.blackduck.integration.blackduck.api.generated.view.LicenseReportsReportView;
import com.blackduck.integration.blackduck.api.generated.view.LicenseTermCategoryView;
import com.blackduck.integration.blackduck.api.generated.view.LicenseTermView;
import com.blackduck.integration.blackduck.api.generated.view.LicenseView;
import com.blackduck.integration.blackduck.api.generated.view.LiteDashboardView;
import com.blackduck.integration.blackduck.api.generated.view.LiteProjectsProjectView;
import com.blackduck.integration.blackduck.api.generated.view.LiteVersionsProjectVersionView;
import com.blackduck.integration.blackduck.api.generated.view.LwBomProjectVersionsProjectVersionView;
import com.blackduck.integration.blackduck.api.generated.view.LwBomProjectsView;
import com.blackduck.integration.blackduck.api.generated.view.LwBomsView;
import com.blackduck.integration.blackduck.api.generated.view.ManageAnnouncementBannerView;
import com.blackduck.integration.blackduck.api.generated.view.ManagementSettingsView;
import com.blackduck.integration.blackduck.api.generated.view.OriginDependencyPathsView;
import com.blackduck.integration.blackduck.api.generated.view.PolicyRuleView;
import com.blackduck.integration.blackduck.api.generated.view.ProjectGroupsView;
import com.blackduck.integration.blackduck.api.generated.view.PurgeTokensView;
import com.blackduck.integration.blackduck.api.generated.view.RegistrationView;
import com.blackduck.integration.blackduck.api.generated.view.ReportContentsView;
import com.blackduck.integration.blackduck.api.generated.view.RoleView;
import com.blackduck.integration.blackduck.api.generated.view.RuntimesView;
import com.blackduck.integration.blackduck.api.generated.view.SbomFieldsScopesView;
import com.blackduck.integration.blackduck.api.generated.view.ScanMonitorView;
import com.blackduck.integration.blackduck.api.generated.view.ScanReadinessView;
import com.blackduck.integration.blackduck.api.generated.view.ScanView;
import com.blackduck.integration.blackduck.api.generated.view.SearchKbPurlComponentView;
import com.blackduck.integration.blackduck.api.generated.view.SettingsAnalysisView;
import com.blackduck.integration.blackduck.api.generated.view.SsoConfigurationView;
import com.blackduck.integration.blackduck.api.generated.view.SystemOauthClientView;
import com.blackduck.integration.blackduck.api.generated.view.TokensView;
import com.blackduck.integration.blackduck.api.generated.view.ToolsView;
import com.blackduck.integration.blackduck.api.generated.view.UserGroupView;
import com.blackduck.integration.blackduck.api.generated.view.UserView;
import com.blackduck.integration.blackduck.api.generated.view.VulnerabilityReportsReportView;
import com.blackduck.integration.blackduck.api.generated.view.VulnerabilityView;
import com.synopsys.integration.rest.HttpUrl;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ApiDiscovery {
    public static final BlackDuckPath<AnnouncementBannerView> ANNOUNCEMENT_PATH = new BlackDuckPath("/api/announcement", AnnouncementBannerView.class, false);
    public static final BlackDuckPath<GraphComponentImportEventsView> BOM_IMPORT_PATH = new BlackDuckPath("/api/bom-import", GraphComponentImportEventsView.class, false);
    public static final BlackDuckPath<CodeLocationView> CODELOCATIONS_PATH = new BlackDuckPath("/api/codelocations", CodeLocationView.class, true);
    public static final BlackDuckPath<ComponentMigrationsView> COMPONENT_MIGRATIONS_PATH = new BlackDuckPath("/api/component-migrations", ComponentMigrationsView.class, false);
    public static final BlackDuckPath<ComponentsView> COMPONENTS_PATH = new BlackDuckPath("/api/components", ComponentsView.class, true);
    public static final BlackDuckPath<CpesView> CPES_PATH = new BlackDuckPath("/api/cpes", CpesView.class, false);
    public static final BlackDuckPath<UserView> CURRENT_USER_PATH = new BlackDuckPath("/api/current-user", UserView.class, false);
    public static final BlackDuckPath<CurrentVersionView> CURRENT_VERSION_PATH = new BlackDuckPath("/api/current-version", CurrentVersionView.class, false);
    public static final BlackDuckPath<CustomFieldObjectView> CUSTOM_FIELDS_PATH = new BlackDuckPath("/api/custom-fields", CustomFieldObjectView.class, true);
    public static final BlackDuckPath<CweView> CWES_PATH = new BlackDuckPath("/api/cwes", CweView.class, false);
    public static final BlackDuckPath<com.blackduck.integration.blackduck.api.manual.view.DeveloperScansScanView> DEVELOPER_SCANS_PATH = new BlackDuckPath("/api/developer-scans", com.blackduck.integration.blackduck.api.manual.view.DeveloperScansScanView.class, false);
    public static final BlackDuckPath<ExternalConfigDetectUriView> EXTERNAL_CONFIG_PATH = new BlackDuckPath("/api/external-config", ExternalConfigDetectUriView.class, false);
    public static final BlackDuckPath<FileSourceContentsSha1View> FILE_SOURCE_CONTENTS_PATH = new BlackDuckPath("/api/file-source-contents", FileSourceContentsSha1View.class, false);
    public static final BlackDuckPath<HealthChecksLivenessView> HEALTH_CHECKS_PATH = new BlackDuckPath("/api/health-checks", HealthChecksLivenessView.class, false);
    public static final BlackDuckPath<IntegrationGithubView> INTEGRATION_PATH = new BlackDuckPath("/api/integration", IntegrationGithubView.class, false);
    public static final BlackDuckPath<BlackDuckResponse> INTELLIGENT_PERSISTENCE_SCANS_PATH = new BlackDuckPath("/api/intelligent-persistence-scans", BlackDuckResponse.class, false);
    public static final BlackDuckPath<JobView> JOBS_PATH = new BlackDuckPath("/api/jobs", JobView.class, true);
    public static final BlackDuckPath<HistoriesView> JOBS_HISTORIES_PATH = new BlackDuckPath("/api/jobs-histories", HistoriesView.class, false);
    public static final BlackDuckPath<RuntimesView> JOBS_RUNTIMES_PATH = new BlackDuckPath("/api/jobs-runtimes", RuntimesView.class, false);
    public static final BlackDuckPath<com.blackduck.integration.blackduck.api.manual.view.ProjectView> JOURNAL_PATH = new BlackDuckPath("/api/journal", com.blackduck.integration.blackduck.api.manual.view.ProjectView.class, false);
    public static final BlackDuckPath<LicenseDashboardView> LICENSE_DASHBOARD_PATH = new BlackDuckPath("/api/license-dashboard", LicenseDashboardView.class, false);
    public static final BlackDuckPath<LicenseFamilyView> LICENSE_FAMILIES_PATH = new BlackDuckPath("/api/license-families", LicenseFamilyView.class, true);
    public static final BlackDuckPath<LicenseTermCategoryView> LICENSE_TERM_CATEGORIES_PATH = new BlackDuckPath("/api/license-term-categories", LicenseTermCategoryView.class, true);
    public static final BlackDuckPath<LicenseTermView> LICENSE_TERMS_PATH = new BlackDuckPath("/api/license-terms", LicenseTermView.class, true);
    public static final BlackDuckPath<LicenseView> LICENSES_PATH = new BlackDuckPath("/api/licenses", LicenseView.class, true);
    public static final BlackDuckPath<ComponentVulnerabilityBomView> LITE_COMPONENTS_PATH = new BlackDuckPath("/api/lite-components", ComponentVulnerabilityBomView.class, false);
    public static final BlackDuckPath<LiteDashboardView> LITE_DASHBOARD_PATH = new BlackDuckPath("/api/lite-dashboard", LiteDashboardView.class, false);
    public static final BlackDuckPath<LiteProjectsProjectView> LITE_PROJECTS_PATH = new BlackDuckPath("/api/lite-projects", LiteProjectsProjectView.class, false);
    public static final BlackDuckPath<LiteVersionsProjectVersionView> LITE_VERSIONS_PATH = new BlackDuckPath("/api/lite-versions", LiteVersionsProjectVersionView.class, false);
    public static final BlackDuckPath<LwBomProjectVersionsProjectVersionView> LW_BOM_PROJECT_VERSIONS_PATH = new BlackDuckPath("/api/lw-bom-project-versions", LwBomProjectVersionsProjectVersionView.class, false);
    public static final BlackDuckPath<LwBomProjectsView> LW_BOM_PROJECTS_PATH = new BlackDuckPath("/api/lw-bom-projects", LwBomProjectsView.class, false);
    public static final BlackDuckPath<LwBomsView> LW_BOMS_PATH = new BlackDuckPath("/api/lw-boms", LwBomsView.class, false);
    public static final BlackDuckPath<ManageAnnouncementBannerView> MANAGE_ANNOUNCEMENT_PATH = new BlackDuckPath("/api/manage-announcement", ManageAnnouncementBannerView.class, false);
    public static final BlackDuckPath<NotificationView> NOTIFICATIONS_PATH = new BlackDuckPath("/api/notifications", NotificationView.class, true);
    public static final BlackDuckPath<ManagementSettingsView> PASSWORD_PATH = new BlackDuckPath("/api/password", ManagementSettingsView.class, false);
    public static final BlackDuckPath<PolicyRuleView> POLICY_RULES_PATH = new BlackDuckPath("/api/policy-rules", PolicyRuleView.class, true);
    public static final BlackDuckPath<OriginDependencyPathsView> PROJECT_PATH = new BlackDuckPath("/api/project", OriginDependencyPathsView.class, false);
    public static final BlackDuckPath<ProjectGroupsView> PROJECT_GROUPS_PATH = new BlackDuckPath("/api/project-groups", ProjectGroupsView.class, false);
    public static final BlackDuckPath<com.blackduck.integration.blackduck.api.manual.view.ProjectView> PROJECTS_PATH = new BlackDuckPath("/api/projects", com.blackduck.integration.blackduck.api.manual.view.ProjectView.class, true);
    public static final BlackDuckPath<PurgeTokensView> PURGE_TOKENS_PATH = new BlackDuckPath("/api/purge-tokens", PurgeTokensView.class, false);
    public static final BlackDuckPath<RegistrationView> REGISTRATION_PATH = new BlackDuckPath("/api/registration", RegistrationView.class, false);
    public static final BlackDuckPath<ReportContentsView> REPORTS_PATH = new BlackDuckPath("/api/reports", ReportContentsView.class, false);
    public static final BlackDuckPath<RoleView> ROLES_PATH = new BlackDuckPath("/api/roles", RoleView.class, true);
    public static final BlackDuckPath<SbomFieldsScopesView> SBOM_FIELDS_PATH = new BlackDuckPath("/api/sbom-fields", SbomFieldsScopesView.class, false);
    public static final BlackDuckPath<ScanMonitorView> SCAN_MONITOR_PATH = new BlackDuckPath("/api/scan-monitor", ScanMonitorView.class, false);
    public static final BlackDuckPath<ScanReadinessView> SCAN_READINESS_PATH = new BlackDuckPath("/api/scan-readiness", ScanReadinessView.class, false);
    public static final BlackDuckPath<ScanView> SCAN_SUMMARIES_PATH = new BlackDuckPath("/api/scan-summaries", ScanView.class, false);
    public static final BlackDuckPath<SearchKbPurlComponentView> SEARCH_PATH = new BlackDuckPath("/api/search", SearchKbPurlComponentView.class, false);
    public static final BlackDuckPath<SettingsAnalysisView> SETTINGS_PATH = new BlackDuckPath("/api/settings", SettingsAnalysisView.class, false);
    public static final BlackDuckPath<SsoConfigurationView> SSO_PATH = new BlackDuckPath("/api/sso", SsoConfigurationView.class, false);
    public static final BlackDuckPath<SystemOauthClientView> SYSTEM_OAUTH_CLIENT_PATH = new BlackDuckPath("/api/system-oauth-client", SystemOauthClientView.class, false);
    public static final BlackDuckPath<TokensView> TOKENS_PATH = new BlackDuckPath("/api/tokens", TokensView.class, false);
    public static final BlackDuckPath<ToolsView> TOOLS_PATH = new BlackDuckPath("/api/tools", ToolsView.class, false);
    public static final BlackDuckPath<BlackDuckStringResponse> UPLOADS_PATH = new BlackDuckPath("/api/uploads", BlackDuckStringResponse.class, false);
    public static final BlackDuckPath<UserGroupView> USERGROUPS_PATH = new BlackDuckPath("/api/usergroups", UserGroupView.class, true);
    public static final BlackDuckPath<UserView> USERS_PATH = new BlackDuckPath("/api/users", UserView.class, true);
    public static final BlackDuckPath<LicenseReportsReportView> VERSIONS_PATH = new BlackDuckPath("/api/versions", LicenseReportsReportView.class, true);
    public static final BlackDuckPath<VulnerabilityView> VULNERABILITIES_PATH = new BlackDuckPath("/api/vulnerabilities", VulnerabilityView.class, false);
    public static final BlackDuckPath<VulnerabilityReportsReportView> VULNERABILITY_REPORTS_PATH = new BlackDuckPath("/api/vulnerability-reports", VulnerabilityReportsReportView.class, true);

    private final HttpUrl blackDuckUrl;

    public ApiDiscovery(HttpUrl blackDuckUrl) {
        this.blackDuckUrl = blackDuckUrl;
    }

    public UrlSingleResponse<AnnouncementBannerView> metaAnnouncementLink() {
        return metaSingleResponse(ANNOUNCEMENT_PATH);
    }

    public UrlSingleResponse<GraphComponentImportEventsView> metaBomImportLink() {
        return metaSingleResponse(BOM_IMPORT_PATH);
    }

    public UrlMultipleResponses<CodeLocationView> metaCodelocationsLink() {
        return metaMultipleResponses(CODELOCATIONS_PATH);
    }

    public UrlSingleResponse<ComponentMigrationsView> metaComponentMigrationsLink() {
        return metaSingleResponse(COMPONENT_MIGRATIONS_PATH);
    }

    public UrlMultipleResponses<ComponentsView> metaComponentsLink() {
        return metaMultipleResponses(COMPONENTS_PATH);
    }

    public UrlSingleResponse<CpesView> metaCpesLink() {
        return metaSingleResponse(CPES_PATH);
    }

    public UrlSingleResponse<UserView> metaCurrentUserLink() {
        return metaSingleResponse(CURRENT_USER_PATH);
    }

    public UrlSingleResponse<CurrentVersionView> metaCurrentVersionLink() {
        return metaSingleResponse(CURRENT_VERSION_PATH);
    }

    public UrlMultipleResponses<CustomFieldObjectView> metaCustomFieldsLink() {
        return metaMultipleResponses(CUSTOM_FIELDS_PATH);
    }

    public UrlSingleResponse<CweView> metaCwesLink() {
        return metaSingleResponse(CWES_PATH);
    }

    public UrlSingleResponse<com.blackduck.integration.blackduck.api.manual.view.DeveloperScansScanView> metaDeveloperScansLink() {
        return metaSingleResponse(DEVELOPER_SCANS_PATH);
    }

    public UrlSingleResponse<ExternalConfigDetectUriView> metaExternalConfigLink() {
        return metaSingleResponse(EXTERNAL_CONFIG_PATH);
    }

    public UrlSingleResponse<FileSourceContentsSha1View> metaFileSourceContentsLink() {
        return metaSingleResponse(FILE_SOURCE_CONTENTS_PATH);
    }

    public UrlSingleResponse<HealthChecksLivenessView> metaHealthChecksLink() {
        return metaSingleResponse(HEALTH_CHECKS_PATH);
    }

    public UrlSingleResponse<IntegrationGithubView> metaIntegrationLink() {
        return metaSingleResponse(INTEGRATION_PATH);
    }

    public UrlSingleResponse<BlackDuckResponse> metaIntelligentPersistenceScansLink() {
        return metaSingleResponse(INTELLIGENT_PERSISTENCE_SCANS_PATH);
    }

    public UrlMultipleResponses<JobView> metaJobsLink() {
        return metaMultipleResponses(JOBS_PATH);
    }

    public UrlSingleResponse<HistoriesView> metaJobsHistoriesLink() {
        return metaSingleResponse(JOBS_HISTORIES_PATH);
    }

    public UrlSingleResponse<RuntimesView> metaJobsRuntimesLink() {
        return metaSingleResponse(JOBS_RUNTIMES_PATH);
    }

    public UrlSingleResponse<com.blackduck.integration.blackduck.api.manual.view.ProjectView> metaJournalLink() {
        return metaSingleResponse(JOURNAL_PATH);
    }

    public UrlSingleResponse<LicenseDashboardView> metaLicenseDashboardLink() {
        return metaSingleResponse(LICENSE_DASHBOARD_PATH);
    }

    public UrlMultipleResponses<LicenseFamilyView> metaLicenseFamiliesLink() {
        return metaMultipleResponses(LICENSE_FAMILIES_PATH);
    }

    public UrlMultipleResponses<LicenseTermCategoryView> metaLicenseTermCategoriesLink() {
        return metaMultipleResponses(LICENSE_TERM_CATEGORIES_PATH);
    }

    public UrlMultipleResponses<LicenseTermView> metaLicenseTermsLink() {
        return metaMultipleResponses(LICENSE_TERMS_PATH);
    }

    public UrlMultipleResponses<LicenseView> metaLicensesLink() {
        return metaMultipleResponses(LICENSES_PATH);
    }

    public UrlSingleResponse<ComponentVulnerabilityBomView> metaLiteComponentsLink() {
        return metaSingleResponse(LITE_COMPONENTS_PATH);
    }

    public UrlSingleResponse<LiteDashboardView> metaLiteDashboardLink() {
        return metaSingleResponse(LITE_DASHBOARD_PATH);
    }

    public UrlSingleResponse<LiteProjectsProjectView> metaLiteProjectsLink() {
        return metaSingleResponse(LITE_PROJECTS_PATH);
    }

    public UrlSingleResponse<LiteVersionsProjectVersionView> metaLiteVersionsLink() {
        return metaSingleResponse(LITE_VERSIONS_PATH);
    }

    public UrlSingleResponse<LwBomProjectVersionsProjectVersionView> metaLwBomProjectVersionsLink() {
        return metaSingleResponse(LW_BOM_PROJECT_VERSIONS_PATH);
    }

    public UrlSingleResponse<LwBomProjectsView> metaLwBomProjectsLink() {
        return metaSingleResponse(LW_BOM_PROJECTS_PATH);
    }

    public UrlSingleResponse<LwBomsView> metaLwBomsLink() {
        return metaSingleResponse(LW_BOMS_PATH);
    }

    public UrlSingleResponse<ManageAnnouncementBannerView> metaManageAnnouncementLink() {
        return metaSingleResponse(MANAGE_ANNOUNCEMENT_PATH);
    }

    public UrlMultipleResponses<NotificationView> metaNotificationsLink() {
        return metaMultipleResponses(NOTIFICATIONS_PATH);
    }

    public UrlSingleResponse<ManagementSettingsView> metaPasswordLink() {
        return metaSingleResponse(PASSWORD_PATH);
    }

    public UrlMultipleResponses<PolicyRuleView> metaPolicyRulesLink() {
        return metaMultipleResponses(POLICY_RULES_PATH);
    }

    public UrlSingleResponse<OriginDependencyPathsView> metaProjectLink() {
        return metaSingleResponse(PROJECT_PATH);
    }

    public UrlSingleResponse<ProjectGroupsView> metaProjectGroupsLink() {
        return metaSingleResponse(PROJECT_GROUPS_PATH);
    }

    public UrlMultipleResponses<ProjectView> metaProjectsLink() {
        return metaMultipleResponses(PROJECTS_PATH);
    }

    public UrlSingleResponse<PurgeTokensView> metaPurgeTokensLink() {
        return metaSingleResponse(PURGE_TOKENS_PATH);
    }

    public UrlSingleResponse<RegistrationView> metaRegistrationLink() {
        return metaSingleResponse(REGISTRATION_PATH);
    }

    public UrlSingleResponse<ReportContentsView> metaReportsLink() {
        return metaSingleResponse(REPORTS_PATH);
    }

    public UrlMultipleResponses<RoleView> metaRolesLink() {
        return metaMultipleResponses(ROLES_PATH);
    }

    public UrlSingleResponse<SbomFieldsScopesView> metaSbomFieldsLink() {
        return metaSingleResponse(SBOM_FIELDS_PATH);
    }

    public UrlSingleResponse<ScanMonitorView> metaScanMonitorLink() {
        return metaSingleResponse(SCAN_MONITOR_PATH);
    }

    public UrlSingleResponse<ScanReadinessView> metaScanReadinessLink() {
        return metaSingleResponse(SCAN_READINESS_PATH);
    }

    public UrlSingleResponse<ScanView> metaScanSummariesLink() {
        return metaSingleResponse(SCAN_SUMMARIES_PATH);
    }

    public UrlSingleResponse<SearchKbPurlComponentView> metaSearchLink() {
        return metaSingleResponse(SEARCH_PATH);
    }

    public UrlSingleResponse<SettingsAnalysisView> metaSettingsLink() {
        return metaSingleResponse(SETTINGS_PATH);
    }

    public UrlSingleResponse<SsoConfigurationView> metaSsoLink() {
        return metaSingleResponse(SSO_PATH);
    }

    public UrlSingleResponse<SystemOauthClientView> metaSystemOauthClientLink() {
        return metaSingleResponse(SYSTEM_OAUTH_CLIENT_PATH);
    }

    public UrlSingleResponse<TokensView> metaTokensLink() {
        return metaSingleResponse(TOKENS_PATH);
    }

    public UrlSingleResponse<ToolsView> metaToolsLink() {
        return metaSingleResponse(TOOLS_PATH);
    }

    public UrlSingleResponse<BlackDuckStringResponse> metaUploadsLink() {
        return metaSingleResponse(UPLOADS_PATH);
    }

    public UrlMultipleResponses<UserGroupView> metaUsergroupsLink() {
        return metaMultipleResponses(USERGROUPS_PATH);
    }

    public UrlMultipleResponses<UserView> metaUsersLink() {
        return metaMultipleResponses(USERS_PATH);
    }

    public UrlMultipleResponses<LicenseReportsReportView> metaVersionsLink() {
        return metaMultipleResponses(VERSIONS_PATH);
    }

    public UrlSingleResponse<VulnerabilityView> metaVulnerabilitiesLink() {
        return metaSingleResponse(VULNERABILITIES_PATH);
    }

    public UrlMultipleResponses<VulnerabilityReportsReportView> metaVulnerabilityReportsLink() {
        return metaMultipleResponses(VULNERABILITY_REPORTS_PATH);
    }

    public <T extends BlackDuckResponse> UrlSingleResponse<T> metaSingleResponse(BlackDuckPath<T> blackDuckPath) {
        HttpUrl url = getUrl(blackDuckPath);
        return new UrlSingleResponse<>(url, blackDuckPath.getResponseClass());
    }

    public <T extends BlackDuckResponse> UrlMultipleResponses<T> metaMultipleResponses(BlackDuckPath<T> blackDuckPath) {
        HttpUrl url = getUrl(blackDuckPath);
        return new UrlMultipleResponses<>(url, blackDuckPath.getResponseClass());
    }

    public HttpUrl getUrl(BlackDuckPath blackDuckPath) {
        return blackDuckPath.getFullBlackDuckUrl(blackDuckUrl);
    }

}
