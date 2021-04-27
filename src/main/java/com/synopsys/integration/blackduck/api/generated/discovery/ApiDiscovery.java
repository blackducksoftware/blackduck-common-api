/*
* blackduck-common-api
*
* Copyright (c) 2021 Synopsys, Inc.
*
* Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
*/
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
import com.synopsys.integration.blackduck.api.manual.view.NotificationView;
import com.synopsys.integration.exception.IntegrationException;
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
    public static final BlackDuckPath<HealthChecksLivenessView> HEALTH_CHECKS_PATH = new BlackDuckPath("/api/health-checks", HealthChecksLivenessView.class, false);
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
    public static final BlackDuckPath<UserGroupView> USERGROUPS_PATH = new BlackDuckPath("/api/usergroups", UserGroupView.class, true);
    public static final BlackDuckPath<UserView> USERS_PATH = new BlackDuckPath("/api/users", UserView.class, true);
    public static final BlackDuckPath<LicenseReportsReportView> VERSIONS_PATH = new BlackDuckPath("/api/versions", LicenseReportsReportView.class, true);
    public static final BlackDuckPath<VulnerabilityView> VULNERABILITIES_PATH = new BlackDuckPath("/api/vulnerabilities", VulnerabilityView.class, false);
    public static final BlackDuckPath<VulnerabilityReportsReportView> VULNERABILITY_REPORTS_PATH = new BlackDuckPath("/api/vulnerability-reports", VulnerabilityReportsReportView.class, true);

    private final HttpUrl blackDuckUrl;

    public ApiDiscovery(HttpUrl blackDuckUrl) {
        this.blackDuckUrl = blackDuckUrl;
    }

    public <T extends BlackDuckResponse> UrlSingleResponse<T> metaSingleResponse(BlackDuckPath<T> blackDuckPath) throws IntegrationException {
        HttpUrl url = blackDuckPath.getFullBlackDuckUrl(blackDuckUrl);
        return new UrlSingleResponse<>(url, blackDuckPath.getResponseClass());
    }

    public <T extends BlackDuckResponse> UrlMultipleResponses<T> metaMultipleResponses(BlackDuckPath<T> blackDuckPath) throws IntegrationException {
        HttpUrl url = blackDuckPath.getFullBlackDuckUrl(blackDuckUrl);
        return new UrlMultipleResponses<>(url, blackDuckPath.getResponseClass());
    }

}
