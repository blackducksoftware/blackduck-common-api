/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.discovery;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckPath;
import com.synopsys.integration.blackduck.api.core.response.BlackDuckPathMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.BlackDuckPathResponse;
import com.synopsys.integration.blackduck.api.core.response.BlackDuckPathSingleResponse;
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

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ApiDiscovery {
    public static final Map<BlackDuckPath, BlackDuckPathResponse> paths = new HashMap<>();

    public static final BlackDuckPath ANNOUNCEMENT_PATH = new BlackDuckPath("/api/announcement");
    public static final BlackDuckPath BOM_IMPORT_PATH = new BlackDuckPath("/api/bom-import");
    public static final BlackDuckPath CODELOCATIONS_PATH = new BlackDuckPath("/api/codelocations");
    public static final BlackDuckPath COMPONENTS_PATH = new BlackDuckPath("/api/components");
    public static final BlackDuckPath CURRENT_USER_PATH = new BlackDuckPath("/api/current-user");
    public static final BlackDuckPath CURRENT_VERSION_PATH = new BlackDuckPath("/api/current-version");
    public static final BlackDuckPath CUSTOM_FIELDS_PATH = new BlackDuckPath("/api/custom-fields");
    public static final BlackDuckPath CWES_PATH = new BlackDuckPath("/api/cwes");
    public static final BlackDuckPath HEALTH_CHECKS_PATH = new BlackDuckPath("/api/health-checks");
    public static final BlackDuckPath JOBS_PATH = new BlackDuckPath("/api/jobs");
    public static final BlackDuckPath JOURNAL_PATH = new BlackDuckPath("/api/journal");
    public static final BlackDuckPath LICENSE_FAMILIES_PATH = new BlackDuckPath("/api/license-families");
    public static final BlackDuckPath LICENSE_TERM_CATEGORIES_PATH = new BlackDuckPath("/api/license-term-categories");
    public static final BlackDuckPath LICENSE_TERMS_PATH = new BlackDuckPath("/api/license-terms");
    public static final BlackDuckPath LICENSES_PATH = new BlackDuckPath("/api/licenses");
    public static final BlackDuckPath MANAGE_ANNOUNCEMENT_PATH = new BlackDuckPath("/api/manage-announcement");
    public static final BlackDuckPath NOTIFICATIONS_PATH = new BlackDuckPath("/api/notifications");
    public static final BlackDuckPath POLICY_RULES_PATH = new BlackDuckPath("/api/policy-rules");
    public static final BlackDuckPath PROJECTS_PATH = new BlackDuckPath("/api/projects");
    public static final BlackDuckPath REGISTRATION_PATH = new BlackDuckPath("/api/registration");
    public static final BlackDuckPath REPORTS_PATH = new BlackDuckPath("/api/reports");
    public static final BlackDuckPath ROLES_PATH = new BlackDuckPath("/api/roles");
    public static final BlackDuckPath SCAN_PATH = new BlackDuckPath("/api/scan");
    public static final BlackDuckPath SCAN_SUMMARIES_PATH = new BlackDuckPath("/api/scan-summaries");
    public static final BlackDuckPath USERGROUPS_PATH = new BlackDuckPath("/api/usergroups");
    public static final BlackDuckPath USERS_PATH = new BlackDuckPath("/api/users");
    public static final BlackDuckPath VERSIONS_PATH = new BlackDuckPath("/api/versions");
    public static final BlackDuckPath VULNERABILITIES_PATH = new BlackDuckPath("/api/vulnerabilities");
    public static final BlackDuckPath VULNERABILITY_REPORTS_PATH = new BlackDuckPath("/api/vulnerability-reports");

    public static final BlackDuckPathSingleResponse<AnnouncementBannerView> ANNOUNCEMENT_PATH_RESPONSE = new BlackDuckPathSingleResponse<AnnouncementBannerView>(ANNOUNCEMENT_PATH, AnnouncementBannerView.class);
    public static final BlackDuckPathSingleResponse<GraphComponentImportEventsView> BOM_IMPORT_PATH_RESPONSE = new BlackDuckPathSingleResponse<GraphComponentImportEventsView>(BOM_IMPORT_PATH, GraphComponentImportEventsView.class);
    public static final BlackDuckPathMultipleResponses<CodeLocationView> CODELOCATIONS_PATH_RESPONSE = new BlackDuckPathMultipleResponses<CodeLocationView>(CODELOCATIONS_PATH, CodeLocationView.class);
    public static final BlackDuckPathMultipleResponses<ComponentsView> COMPONENTS_PATH_RESPONSE = new BlackDuckPathMultipleResponses<ComponentsView>(COMPONENTS_PATH, ComponentsView.class);
    public static final BlackDuckPathSingleResponse<UserView> CURRENT_USER_PATH_RESPONSE = new BlackDuckPathSingleResponse<UserView>(CURRENT_USER_PATH, UserView.class);
    public static final BlackDuckPathSingleResponse<CurrentVersionView> CURRENT_VERSION_PATH_RESPONSE = new BlackDuckPathSingleResponse<CurrentVersionView>(CURRENT_VERSION_PATH, CurrentVersionView.class);
    public static final BlackDuckPathMultipleResponses<CustomFieldObjectView> CUSTOM_FIELDS_PATH_RESPONSE = new BlackDuckPathMultipleResponses<CustomFieldObjectView>(CUSTOM_FIELDS_PATH, CustomFieldObjectView.class);
    public static final BlackDuckPathSingleResponse<CweView> CWES_PATH_RESPONSE = new BlackDuckPathSingleResponse<CweView>(CWES_PATH, CweView.class);
    public static final BlackDuckPathSingleResponse<HealthChecksLivenessView> HEALTH_CHECKS_PATH_RESPONSE = new BlackDuckPathSingleResponse<HealthChecksLivenessView>(HEALTH_CHECKS_PATH, HealthChecksLivenessView.class);
    public static final BlackDuckPathMultipleResponses<JobView> JOBS_PATH_RESPONSE = new BlackDuckPathMultipleResponses<JobView>(JOBS_PATH, JobView.class);
    public static final BlackDuckPathSingleResponse<ProjectView> JOURNAL_PATH_RESPONSE = new BlackDuckPathSingleResponse<ProjectView>(JOURNAL_PATH, ProjectView.class);
    public static final BlackDuckPathMultipleResponses<LicenseFamilyView> LICENSE_FAMILIES_PATH_RESPONSE = new BlackDuckPathMultipleResponses<LicenseFamilyView>(LICENSE_FAMILIES_PATH, LicenseFamilyView.class);
    public static final BlackDuckPathMultipleResponses<LicenseTermCategoryView> LICENSE_TERM_CATEGORIES_PATH_RESPONSE = new BlackDuckPathMultipleResponses<LicenseTermCategoryView>(LICENSE_TERM_CATEGORIES_PATH, LicenseTermCategoryView.class);
    public static final BlackDuckPathMultipleResponses<LicenseTermView> LICENSE_TERMS_PATH_RESPONSE = new BlackDuckPathMultipleResponses<LicenseTermView>(LICENSE_TERMS_PATH, LicenseTermView.class);
    public static final BlackDuckPathMultipleResponses<LicenseView> LICENSES_PATH_RESPONSE = new BlackDuckPathMultipleResponses<LicenseView>(LICENSES_PATH, LicenseView.class);
    public static final BlackDuckPathSingleResponse<ManageAnnouncementBannerView> MANAGE_ANNOUNCEMENT_PATH_RESPONSE = new BlackDuckPathSingleResponse<ManageAnnouncementBannerView>(MANAGE_ANNOUNCEMENT_PATH, ManageAnnouncementBannerView.class);
    public static final BlackDuckPathMultipleResponses<NotificationView> NOTIFICATIONS_PATH_RESPONSE = new BlackDuckPathMultipleResponses<NotificationView>(NOTIFICATIONS_PATH, NotificationView.class);
    public static final BlackDuckPathMultipleResponses<PolicyRuleView> POLICY_RULES_PATH_RESPONSE = new BlackDuckPathMultipleResponses<PolicyRuleView>(POLICY_RULES_PATH, PolicyRuleView.class);
    public static final BlackDuckPathMultipleResponses<ProjectView> PROJECTS_PATH_RESPONSE = new BlackDuckPathMultipleResponses<ProjectView>(PROJECTS_PATH, ProjectView.class);
    public static final BlackDuckPathSingleResponse<RegistrationView> REGISTRATION_PATH_RESPONSE = new BlackDuckPathSingleResponse<RegistrationView>(REGISTRATION_PATH, RegistrationView.class);
    public static final BlackDuckPathSingleResponse<ReportContentsView> REPORTS_PATH_RESPONSE = new BlackDuckPathSingleResponse<ReportContentsView>(REPORTS_PATH, ReportContentsView.class);
    public static final BlackDuckPathMultipleResponses<RoleView> ROLES_PATH_RESPONSE = new BlackDuckPathMultipleResponses<RoleView>(ROLES_PATH, RoleView.class);
    public static final BlackDuckPathSingleResponse<ScanBomEntriesView> SCAN_PATH_RESPONSE = new BlackDuckPathSingleResponse<ScanBomEntriesView>(SCAN_PATH, ScanBomEntriesView.class);
    public static final BlackDuckPathSingleResponse<ScanView> SCAN_SUMMARIES_PATH_RESPONSE = new BlackDuckPathSingleResponse<ScanView>(SCAN_SUMMARIES_PATH, ScanView.class);
    public static final BlackDuckPathMultipleResponses<UserGroupView> USERGROUPS_PATH_RESPONSE = new BlackDuckPathMultipleResponses<UserGroupView>(USERGROUPS_PATH, UserGroupView.class);
    public static final BlackDuckPathMultipleResponses<UserView> USERS_PATH_RESPONSE = new BlackDuckPathMultipleResponses<UserView>(USERS_PATH, UserView.class);
    public static final BlackDuckPathMultipleResponses<LicenseReportsReportView> VERSIONS_PATH_RESPONSE = new BlackDuckPathMultipleResponses<LicenseReportsReportView>(VERSIONS_PATH, LicenseReportsReportView.class);
    public static final BlackDuckPathSingleResponse<VulnerabilityView> VULNERABILITIES_PATH_RESPONSE = new BlackDuckPathSingleResponse<VulnerabilityView>(VULNERABILITIES_PATH, VulnerabilityView.class);
    public static final BlackDuckPathMultipleResponses<VulnerabilityReportsReportView> VULNERABILITY_REPORTS_PATH_RESPONSE = new BlackDuckPathMultipleResponses<VulnerabilityReportsReportView>(VULNERABILITY_REPORTS_PATH, VulnerabilityReportsReportView.class);

    static {
        paths.put(ANNOUNCEMENT_PATH, ANNOUNCEMENT_PATH_RESPONSE);
        paths.put(BOM_IMPORT_PATH, BOM_IMPORT_PATH_RESPONSE);
        paths.put(CODELOCATIONS_PATH, CODELOCATIONS_PATH_RESPONSE);
        paths.put(COMPONENTS_PATH, COMPONENTS_PATH_RESPONSE);
        paths.put(CURRENT_USER_PATH, CURRENT_USER_PATH_RESPONSE);
        paths.put(CURRENT_VERSION_PATH, CURRENT_VERSION_PATH_RESPONSE);
        paths.put(CUSTOM_FIELDS_PATH, CUSTOM_FIELDS_PATH_RESPONSE);
        paths.put(CWES_PATH, CWES_PATH_RESPONSE);
        paths.put(HEALTH_CHECKS_PATH, HEALTH_CHECKS_PATH_RESPONSE);
        paths.put(JOBS_PATH, JOBS_PATH_RESPONSE);
        paths.put(JOURNAL_PATH, JOURNAL_PATH_RESPONSE);
        paths.put(LICENSE_FAMILIES_PATH, LICENSE_FAMILIES_PATH_RESPONSE);
        paths.put(LICENSE_TERM_CATEGORIES_PATH, LICENSE_TERM_CATEGORIES_PATH_RESPONSE);
        paths.put(LICENSE_TERMS_PATH, LICENSE_TERMS_PATH_RESPONSE);
        paths.put(LICENSES_PATH, LICENSES_PATH_RESPONSE);
        paths.put(MANAGE_ANNOUNCEMENT_PATH, MANAGE_ANNOUNCEMENT_PATH_RESPONSE);
        paths.put(NOTIFICATIONS_PATH, NOTIFICATIONS_PATH_RESPONSE);
        paths.put(POLICY_RULES_PATH, POLICY_RULES_PATH_RESPONSE);
        paths.put(PROJECTS_PATH, PROJECTS_PATH_RESPONSE);
        paths.put(REGISTRATION_PATH, REGISTRATION_PATH_RESPONSE);
        paths.put(REPORTS_PATH, REPORTS_PATH_RESPONSE);
        paths.put(ROLES_PATH, ROLES_PATH_RESPONSE);
        paths.put(SCAN_PATH, SCAN_PATH_RESPONSE);
        paths.put(SCAN_SUMMARIES_PATH, SCAN_SUMMARIES_PATH_RESPONSE);
        paths.put(USERGROUPS_PATH, USERGROUPS_PATH_RESPONSE);
        paths.put(USERS_PATH, USERS_PATH_RESPONSE);
        paths.put(VERSIONS_PATH, VERSIONS_PATH_RESPONSE);
        paths.put(VULNERABILITIES_PATH, VULNERABILITIES_PATH_RESPONSE);
        paths.put(VULNERABILITY_REPORTS_PATH, VULNERABILITY_REPORTS_PATH_RESPONSE);
    }

}
