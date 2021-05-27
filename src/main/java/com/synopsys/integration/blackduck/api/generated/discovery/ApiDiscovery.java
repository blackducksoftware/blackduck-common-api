package com.synopsys.integration.blackduck.api.generated.discovery;

import com.synopsys.integration.blackduck.api.core.BlackDuckPath;
import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.response.UrlMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.UrlSingleResponse;
import com.synopsys.integration.blackduck.api.generated.response.ComponentsView;
import com.synopsys.integration.blackduck.api.generated.response.CurrentVersionView;
import com.synopsys.integration.blackduck.api.generated.response.CweView;
import com.synopsys.integration.blackduck.api.generated.response.HealthChecksLivenessView;
import com.synopsys.integration.blackduck.api.generated.view.AnnouncementBannerView;
import com.synopsys.integration.blackduck.api.generated.view.CodeLocationView;
import com.synopsys.integration.blackduck.api.generated.view.CustomFieldObjectView;
import com.synopsys.integration.blackduck.api.generated.view.GraphComponentImportEventsView;
import com.synopsys.integration.blackduck.api.generated.view.JobView;
import com.synopsys.integration.blackduck.api.generated.view.LicenseFamilyView;
import com.synopsys.integration.blackduck.api.generated.view.LicenseReportsReportView;
import com.synopsys.integration.blackduck.api.generated.view.LicenseTermCategoryView;
import com.synopsys.integration.blackduck.api.generated.view.LicenseTermView;
import com.synopsys.integration.blackduck.api.generated.view.LicenseView;
import com.synopsys.integration.blackduck.api.generated.view.ManageAnnouncementBannerView;
import com.synopsys.integration.blackduck.api.generated.view.PolicyRuleView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectView;
import com.synopsys.integration.blackduck.api.generated.view.RegistrationView;
import com.synopsys.integration.blackduck.api.generated.view.ReportContentsView;
import com.synopsys.integration.blackduck.api.generated.view.RoleView;
import com.synopsys.integration.blackduck.api.generated.view.ScanBomEntriesView;
import com.synopsys.integration.blackduck.api.generated.view.ScanView;
import com.synopsys.integration.blackduck.api.generated.view.UserGroupView;
import com.synopsys.integration.blackduck.api.generated.view.UserView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityReportsReportView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityView;
import com.synopsys.integration.blackduck.api.manual.response.BlackDuckStringResponse;
import com.synopsys.integration.blackduck.api.manual.view.NotificationView;
import com.synopsys.integration.rest.HttpUrl;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ApiDiscovery {
    public static final BlackDuckPath<AnnouncementBannerView> ANNOUNCEMENT_PATH = new BlackDuckPath("/api/announcement", AnnouncementBannerView.class, false);
    public static final BlackDuckPath<GraphComponentImportEventsView> BOM_IMPORT_PATH = new BlackDuckPath("/api/bom-import", GraphComponentImportEventsView.class, false);
    public static final BlackDuckPath<CodeLocationView> CODELOCATIONS_PATH = new BlackDuckPath("/api/codelocations", CodeLocationView.class, true);
    public static final BlackDuckPath<ComponentsView> COMPONENTS_PATH = new BlackDuckPath("/api/components", ComponentsView.class, true);
    public static final BlackDuckPath<UserView> CURRENT_USER_PATH = new BlackDuckPath("/api/current-user", UserView.class, false);
    public static final BlackDuckPath<CurrentVersionView> CURRENT_VERSION_PATH = new BlackDuckPath("/api/current-version", CurrentVersionView.class, false);
    public static final BlackDuckPath<CustomFieldObjectView> CUSTOM_FIELDS_PATH = new BlackDuckPath("/api/custom-fields", CustomFieldObjectView.class, true);
    public static final BlackDuckPath<CweView> CWES_PATH = new BlackDuckPath("/api/cwes", CweView.class, false);
    public static final BlackDuckPath<BlackDuckResponse> DEVELOPER_SCANS_PATH = new BlackDuckPath("/api/developer-scans", BlackDuckResponse.class, false);
    public static final BlackDuckPath<HealthChecksLivenessView> HEALTH_CHECKS_PATH = new BlackDuckPath("/api/health-checks", HealthChecksLivenessView.class, false);
    public static final BlackDuckPath<BlackDuckResponse> INTELLIGENT_PERSISTENCE_SCANS_PATH = new BlackDuckPath("/api/intelligent-persistence-scans", BlackDuckResponse.class, false);
    public static final BlackDuckPath<JobView> JOBS_PATH = new BlackDuckPath("/api/jobs", JobView.class, true);
    public static final BlackDuckPath<ProjectView> JOURNAL_PATH = new BlackDuckPath("/api/journal", ProjectView.class, false);
    public static final BlackDuckPath<LicenseFamilyView> LICENSE_FAMILIES_PATH = new BlackDuckPath("/api/license-families", LicenseFamilyView.class, true);
    public static final BlackDuckPath<LicenseTermCategoryView> LICENSE_TERM_CATEGORIES_PATH = new BlackDuckPath("/api/license-term-categories", LicenseTermCategoryView.class, true);
    public static final BlackDuckPath<LicenseTermView> LICENSE_TERMS_PATH = new BlackDuckPath("/api/license-terms", LicenseTermView.class, true);
    public static final BlackDuckPath<LicenseView> LICENSES_PATH = new BlackDuckPath("/api/licenses", LicenseView.class, true);
    public static final BlackDuckPath<ManageAnnouncementBannerView> MANAGE_ANNOUNCEMENT_PATH = new BlackDuckPath("/api/manage-announcement", ManageAnnouncementBannerView.class, false);
    public static final BlackDuckPath<NotificationView> NOTIFICATIONS_PATH = new BlackDuckPath("/api/notifications", NotificationView.class, true);
    public static final BlackDuckPath<PolicyRuleView> POLICY_RULES_PATH = new BlackDuckPath("/api/policy-rules", PolicyRuleView.class, true);
    public static final BlackDuckPath<ProjectView> PROJECTS_PATH = new BlackDuckPath("/api/projects", ProjectView.class, true);
    public static final BlackDuckPath<RegistrationView> REGISTRATION_PATH = new BlackDuckPath("/api/registration", RegistrationView.class, false);
    public static final BlackDuckPath<ReportContentsView> REPORTS_PATH = new BlackDuckPath("/api/reports", ReportContentsView.class, false);
    public static final BlackDuckPath<RoleView> ROLES_PATH = new BlackDuckPath("/api/roles", RoleView.class, true);
    public static final BlackDuckPath<ScanBomEntriesView> SCAN_PATH = new BlackDuckPath("/api/scan", ScanBomEntriesView.class, false);
    public static final BlackDuckPath<ScanView> SCAN_SUMMARIES_PATH = new BlackDuckPath("/api/scan-summaries", ScanView.class, false);
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

    public UrlMultipleResponses<ComponentsView> metaComponentsLink() {
        return metaMultipleResponses(COMPONENTS_PATH);
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

    public UrlSingleResponse<BlackDuckResponse> metaDeveloperScansLink() {
        return metaSingleResponse(DEVELOPER_SCANS_PATH);
    }

    public UrlSingleResponse<HealthChecksLivenessView> metaHealthChecksLink() {
        return metaSingleResponse(HEALTH_CHECKS_PATH);
    }

    public UrlSingleResponse<BlackDuckResponse> metaIntelligentPersistenceScansLink() {
        return metaSingleResponse(INTELLIGENT_PERSISTENCE_SCANS_PATH);
    }

    public UrlMultipleResponses<JobView> metaJobsLink() {
        return metaMultipleResponses(JOBS_PATH);
    }

    public UrlSingleResponse<ProjectView> metaJournalLink() {
        return metaSingleResponse(JOURNAL_PATH);
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

    public UrlSingleResponse<ManageAnnouncementBannerView> metaManageAnnouncementLink() {
        return metaSingleResponse(MANAGE_ANNOUNCEMENT_PATH);
    }

    public UrlMultipleResponses<NotificationView> metaNotificationsLink() {
        return metaMultipleResponses(NOTIFICATIONS_PATH);
    }

    public UrlMultipleResponses<PolicyRuleView> metaPolicyRulesLink() {
        return metaMultipleResponses(POLICY_RULES_PATH);
    }

    public UrlMultipleResponses<ProjectView> metaProjectsLink() {
        return metaMultipleResponses(PROJECTS_PATH);
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

    public UrlSingleResponse<ScanBomEntriesView> metaScanLink() {
        return metaSingleResponse(SCAN_PATH);
    }

    public UrlSingleResponse<ScanView> metaScanSummariesLink() {
        return metaSingleResponse(SCAN_SUMMARIES_PATH);
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
