/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.discovery;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import com.synopsys.integration.rest.HttpUrl;
import com.synopsys.integration.rest.request.Request;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class BlackDuckMediaTypeDiscovery {
    public static final String DEFAULT_MEDIA_TYPE = "application/json";
    public static final String UUID_REGEX = "\\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b";
    public static final Set<String> VALUES_TO_REPLACE = new HashSet<>(Arrays.asList(null, DEFAULT_MEDIA_TYPE));

    public static final String VND_BLACKDUCKSOFTWARE_ADMIN_4_JSON = "application/vnd.blackducksoftware.admin-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_ADMIN_5_JSON = "application/vnd.blackducksoftware.admin-5+json";
    public static final String VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON = "application/vnd.blackducksoftware.bill-of-materials-6+json";
    public static final String VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_4_JSON = "application/vnd.blackducksoftware.component-detail-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON = "application/vnd.blackducksoftware.component-detail-5+json";
    public static final String VND_BLACKDUCKSOFTWARE_COPYRIGHT_4_JSON = "application/vnd.blackducksoftware.copyright-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_INTEGRATION_SCM_CONFIGURATION_1_JSON = "application/vnd.blackducksoftware.integration-scm-configuration-1+json";
    public static final String VND_BLACKDUCKSOFTWARE_INTERNAL_1_JSON = "application/vnd.blackducksoftware.internal-1+json";
    public static final String VND_BLACKDUCKSOFTWARE_JOB_HISTORY_PAGE_1_JSON = "application/vnd.blackducksoftware.job-history-page-1+json";
    public static final String VND_BLACKDUCKSOFTWARE_JOB_SCHEDULE_1_JSON = "application/vnd.blackducksoftware.job-schedule-1+json";
    public static final String VND_BLACKDUCKSOFTWARE_JOB_SCHEDULE_PAGE_1_JSON = "application/vnd.blackducksoftware.job-schedule-page-1+json";
    public static final String VND_BLACKDUCKSOFTWARE_JOURNAL_4_JSON = "application/vnd.blackducksoftware.journal-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_LW_BILL_OF_MATERIALS_1_JSON = "application/vnd.blackducksoftware.lw-bill-of-materials-1+json";
    public static final String VND_BLACKDUCKSOFTWARE_LW_BILL_OF_MATERIALS_2_JSON = "application/vnd.blackducksoftware.lw-bill-of-materials-2+json";
    public static final String VND_BLACKDUCKSOFTWARE_NOTIFICATION_4_JSON = "application/vnd.blackducksoftware.notification-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_POLICY_5_JSON = "application/vnd.blackducksoftware.policy-5+json";
    public static final String VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON = "application/vnd.blackducksoftware.project-detail-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON = "application/vnd.blackducksoftware.project-detail-5+json";
    public static final String VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_7_JSON = "application/vnd.blackducksoftware.project-detail-7+json";
    public static final String VND_BLACKDUCKSOFTWARE_REPORT_4_JSON = "application/vnd.blackducksoftware.report-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_SCAN_4_JSON = "application/vnd.blackducksoftware.scan-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_SCAN_6_JSON = "application/vnd.blackducksoftware.scan-6+json";
    public static final String VND_BLACKDUCKSOFTWARE_SCAN_MONITOR_1_JSON = "application/vnd.blackducksoftware.scan-monitor-1+json";
    public static final String VND_BLACKDUCKSOFTWARE_SCAN_READINESS_1_JSON = "application/vnd.blackducksoftware.scan-readiness-1+json";
    public static final String VND_BLACKDUCKSOFTWARE_SOURCE_VIEW_1_JSON = "application/vnd.blackducksoftware.source-view-1+json";
    public static final String VND_BLACKDUCKSOFTWARE_STATUS_4_JSON = "application/vnd.blackducksoftware.status-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_SYSTEM_ANNOUNCEMENT_1_JSON = "application/vnd.blackducksoftware.system-announcement-1+json";
    public static final String VND_BLACKDUCKSOFTWARE_TOOL_VIEW_1_JSON = "application/vnd.blackducksoftware.tool-view-1+json";
    public static final String VND_BLACKDUCKSOFTWARE_USER_4_JSON = "application/vnd.blackducksoftware.user-4+json";
    public static final String VND_BLACKDUCKSOFTWARE_VULNERABILITY_4_JSON = "application/vnd.blackducksoftware.vulnerability-4+json";
    public static final String TEXT_PLAIN = "text/plain";

    public static final String API_ANNOUNCEMENT_BANNER = String.format("/api/announcement/banner");
    public static final String API_ANNOUNCEMENT_BANNER_WITH_ID = String.format("/api/announcement/banner/%s", UUID_REGEX);
    public static final String API_ANNOUNCEMENT_FOOTER = String.format("/api/announcement/footer");
    public static final String API_ANNOUNCEMENT_FOOTER_WITH_ID = String.format("/api/announcement/footer/%s", UUID_REGEX);
    public static final String API_ANNOUNCEMENT_LOGIN = String.format("/api/announcement/login");
    public static final String API_ANNOUNCEMENT_LOGIN_WITH_ID = String.format("/api/announcement/login/%s", UUID_REGEX);
    public static final String API_ANNOUNCEMENT_WELCOME = String.format("/api/announcement/welcome");
    public static final String API_ANNOUNCEMENT_WELCOME_WITH_ID = String.format("/api/announcement/welcome/%s", UUID_REGEX);
    public static final String API_BOM_IMPORT_COMPONENT_IMPORT_EVENTS = String.format("/api/bom-import/%s/component-import-events", UUID_REGEX);
    public static final String API_BOM_IMPORT_COMPONENT_IMPORT_EVENTS_COUNT = String.format("/api/bom-import/%s/component-import-events-count", UUID_REGEX);
    public static final String API_CODELOCATIONS_WITH_ID = String.format("/api/codelocations/%s", UUID_REGEX);
    public static final String API_COMPONENT_MIGRATIONS = String.format("/api/component-migrations");
    public static final String API_COMPONENT_MIGRATIONS_WITH_ID = String.format("/api/component-migrations/%s", UUID_REGEX);
    public static final String API_COMPONENTS = String.format("/api/components");
    public static final String API_COMPONENTS_WITH_ID = String.format("/api/components/%s", UUID_REGEX);
    public static final String API_COMPONENTS_CUSTOM_FIELDS_WITH_ID = String.format("/api/components/%s/custom-fields/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_SBOM_FIELDS = String.format("/api/components/%s/sbom-fields", UUID_REGEX);
    public static final String API_COMPONENTS_TAGS_WITH_ID = String.format("/api/components/%s/tags/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_WITH_ID = String.format("/api/components/%s/versions/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_CUSTOM_FIELDS_WITH_ID = String.format("/api/components/%s/versions/%s/custom-fields/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_LICENSES_WITH_ID = String.format("/api/components/%s/versions/%s/licenses/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_LICENSES_TEXT = String.format("/api/components/%s/versions/%s/licenses/%s/text", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_ORIGIN_FILE_COPYRIGHTS = String.format("/api/components/%s/versions/%s/origin/%s/file-copyrights", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_ORIGIN_FILE_LICENSES_FUZZY = String.format("/api/components/%s/versions/%s/origin/%s/file-licenses-fuzzy", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_ORIGIN_FILE_LICENSES_WITH_ID = String.format("/api/components/%s/versions/%s/origin/%s/file-licenses/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_ORIGINS_WITH_ID = String.format("/api/components/%s/versions/%s/origins/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_ORIGINS_CAPABILITY_ANALYSIS = String.format("/api/components/%s/versions/%s/origins/%s/capability-analysis", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_ORIGINS_COPYRIGHTS = String.format("/api/components/%s/versions/%s/origins/%s/copyrights", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_ORIGINS_INFORMATION_LEAK_ANALYSIS = String.format("/api/components/%s/versions/%s/origins/%s/information-leak-analysis", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_ORIGINS_PACKAGE_CONFIG_ANALYSIS = String.format("/api/components/%s/versions/%s/origins/%s/package-config-analysis", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_ORIGINS_TRANSITIVE_UPGRADE_GUIDANCE = String.format("/api/components/%s/versions/%s/origins/%s/transitive-upgrade-guidance", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_ORIGINS_UPGRADE_GUIDANCE = String.format("/api/components/%s/versions/%s/origins/%s/upgrade-guidance", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_RISK_PROFILE = String.format("/api/components/%s/versions/%s/risk-profile", UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_RISK_PROFILE_SECURITY = String.format("/api/components/%s/versions/%s/risk-profile/security", UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VERSIONS_UPGRADE_GUIDANCE = String.format("/api/components/%s/versions/%s/upgrade-guidance", UUID_REGEX, UUID_REGEX);
    public static final String API_COMPONENTS_VULNERABILITY_STATISTICS = String.format("/api/components/%s/vulnerability-statistics", UUID_REGEX);
    public static final String API_CPES = String.format("/api/cpes");
    public static final String API_CPES_ORIGINS = String.format("/api/cpes/%s/origins", UUID_REGEX);
    public static final String API_CPES_VERSIONS = String.format("/api/cpes/%s/versions", UUID_REGEX);
    public static final String API_CURRENT_USER = String.format("/api/current-user");
    public static final String API_CURRENT_USER_TOKENS = String.format("/api/current-user/tokens");
    public static final String API_CURRENT_USER_TOKENS_WITH_ID = String.format("/api/current-user/tokens/%s", UUID_REGEX);
    public static final String API_CURRENT_VERSION = String.format("/api/current-version");
    public static final String API_CUSTOM_FIELDS_OBJECTS_CUSTOMFIELDOBJECT = String.format("/api/custom-fields/objects/customFieldObject");
    public static final String API_CUSTOM_FIELDS_OBJECTS_CUSTOMFIELDOBJECT_FIELDS_WITH_ID = String.format("/api/custom-fields/objects/customFieldObject/fields/%s", UUID_REGEX);
    public static final String API_CUSTOM_FIELDS_OBJECTS_CUSTOMFIELDOBJECT_FIELDS_OPTIONS = String.format("/api/custom-fields/objects/customFieldObject/fields/%s/options", UUID_REGEX);
    public static final String API_CUSTOM_FIELDS_TYPES = String.format("/api/custom-fields/types");
    public static final String API_CWES_WITH_ID = String.format("/api/cwes/%s", UUID_REGEX);
    public static final String API_DEVELOPER_SCANS_WITH_ID = String.format("/api/developer-scans/%s", UUID_REGEX);
    public static final String API_DEVELOPER_SCANS_FULL_RESULT = String.format("/api/developer-scans/%s/full-result", UUID_REGEX);
    public static final String API_EXTERNAL_CONFIG_DETECT_URI = String.format("/api/external-config/detect-uri");
    public static final String API_FILE_SOURCE_CONTENTS_WITH_ID = String.format("/api/file-source-contents/%s", UUID_REGEX);
    public static final String API_HEALTH_CHECKS_LIVENESS = String.format("/api/health-checks/liveness");
    public static final String API_HEALTH_CHECKS_READINESS = String.format("/api/health-checks/readiness");
    public static final String API_INTEGRATION_GITHUB = String.format("/api/integration/github");
    public static final String API_INTEGRATION_GITHUB_WITH_ID = String.format("/api/integration/github/%s", UUID_REGEX);
    public static final String API_INTEGRATION_GITHUB_REPOSITORIES_WITH_ID = String.format("/api/integration/github/%s/repositories/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_INTEGRATION_GITHUB_SCAN_SUMMARIES = String.format("/api/integration/github/scan-summaries");
    public static final String API_INTEGRATION_SCM_LITE_VERSION_MAPPING_WITH_ID = String.format("/api/integration/scm/lite-version-mapping/%s", UUID_REGEX);
    public static final String API_JOBS_HISTORIES = String.format("/api/jobs-histories");
    public static final String API_JOBS_RUNTIMES = String.format("/api/jobs-runtimes");
    public static final String API_JOBS_WITH_ID = String.format("/api/jobs/%s", UUID_REGEX);
    public static final String API_JOBS_SCHEDULERS_SCHEDULER_TRIGGER_GROUPS_TRIGGERGROUP_TRIGGERS_WITH_ID = String.format("/api/jobs/schedulers/scheduler/trigger-groups/triggerGroup/triggers/%s", UUID_REGEX);
    public static final String API_JOBS_VULNERABILITY_PRIORITY_STATUS = String.format("/api/jobs/vulnerability-priority/status");
    public static final String API_JOURNAL_PROJECTS_WITH_ID = String.format("/api/journal/projects/%s", UUID_REGEX);
    public static final String API_JOURNAL_PROJECTS_VERSIONS_WITH_ID = String.format("/api/journal/projects/%s/versions/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_LICENSE_DASHBOARD = String.format("/api/license-dashboard");
    public static final String API_LICENSE_FAMILIES_WITH_ID = String.format("/api/license-families/%s", UUID_REGEX);
    public static final String API_LICENSE_TERM_CATEGORIES_WITH_ID = String.format("/api/license-term-categories/%s", UUID_REGEX);
    public static final String API_LICENSE_TERMS_WITH_ID = String.format("/api/license-terms/%s", UUID_REGEX);
    public static final String API_LICENSE_TERMS_LICENSES_WITH_ID = String.format("/api/license-terms/%s/licenses/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_LICENSES_WITH_ID = String.format("/api/licenses/%s", UUID_REGEX);
    public static final String API_LICENSES_COMMENTS_WITH_ID = String.format("/api/licenses/%s/comments/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_LICENSES_LICENSE_TERMS_WITH_ID = String.format("/api/licenses/%s/license-terms/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_LICENSES_TEXT = String.format("/api/licenses/%s/text", UUID_REGEX);
    public static final String API_LITE_COMPONENTS_VULNERABILITY_BOM = String.format("/api/lite-components/%s/vulnerability-bom", UUID_REGEX);
    public static final String API_LITE_DASHBOARD = String.format("/api/lite-dashboard");
    public static final String API_LITE_PROJECTS_WITH_ID = String.format("/api/lite-projects/%s", UUID_REGEX);
    public static final String API_LITE_PROJECTS_LITE_VERSIONS = String.format("/api/lite-projects/%s/lite-versions", UUID_REGEX);
    public static final String API_LITE_VERSIONS_WITH_ID = String.format("/api/lite-versions/%s", UUID_REGEX);
    public static final String API_LITE_VERSIONS_COMPONENTS = String.format("/api/lite-versions/%s/components", UUID_REGEX);
    public static final String API_LW_BOM_PROJECT_VERSIONS_WITH_ID = String.format("/api/lw-bom-project-versions/%s", UUID_REGEX);
    public static final String API_LW_BOM_PROJECT_VERSIONS_LW_BOMS = String.format("/api/lw-bom-project-versions/%s/lw-boms", UUID_REGEX);
    public static final String API_LW_BOM_PROJECTS = String.format("/api/lw-bom-projects");
    public static final String API_LW_BOM_PROJECTS_WITH_ID = String.format("/api/lw-bom-projects/%s", UUID_REGEX);
    public static final String API_LW_BOM_PROJECTS_LW_BOM_PROJECT_VERSIONS = String.format("/api/lw-bom-projects/%s/lw-bom-project-versions", UUID_REGEX);
    public static final String API_LW_BOMS = String.format("/api/lw-boms");
    public static final String API_MANAGE_ANNOUNCEMENT_BANNER = String.format("/api/manage-announcement/banner");
    public static final String API_MANAGE_ANNOUNCEMENT_BANNER_WITH_ID = String.format("/api/manage-announcement/banner/%s", UUID_REGEX);
    public static final String API_MANAGE_ANNOUNCEMENT_FOOTER = String.format("/api/manage-announcement/footer");
    public static final String API_MANAGE_ANNOUNCEMENT_FOOTER_WITH_ID = String.format("/api/manage-announcement/footer/%s", UUID_REGEX);
    public static final String API_MANAGE_ANNOUNCEMENT_LOGIN = String.format("/api/manage-announcement/login");
    public static final String API_MANAGE_ANNOUNCEMENT_LOGIN_WITH_ID = String.format("/api/manage-announcement/login/%s", UUID_REGEX);
    public static final String API_MANAGE_ANNOUNCEMENT_WELCOME = String.format("/api/manage-announcement/welcome");
    public static final String API_MANAGE_ANNOUNCEMENT_WELCOME_WITH_ID = String.format("/api/manage-announcement/welcome/%s", UUID_REGEX);
    public static final String API_PASSWORD_MANAGEMENT_SETTINGS = String.format("/api/password/management/settings");
    public static final String API_PASSWORD_SECURITY_SETTINGS = String.format("/api/password/security/settings");
    public static final String API_POLICY_RULES_WITH_ID = String.format("/api/policy-rules/%s", UUID_REGEX);
    public static final String API_PROJECT_GROUPS = String.format("/api/project-groups");
    public static final String API_PROJECT_GROUPS_WITH_ID = String.format("/api/project-groups/%s", UUID_REGEX);
    public static final String API_PROJECT_GROUPS_CHILDREN = String.format("/api/project-groups/%s/children", UUID_REGEX);
    public static final String API_PROJECT_GROUPS_DESCENDANTS = String.format("/api/project-groups/%s/descendants", UUID_REGEX);
    public static final String API_PROJECT_GROUPS_DESTINATION_PROJECT_GROUPS = String.format("/api/project-groups/%s/destination-project-groups", UUID_REGEX);
    public static final String API_PROJECT_GROUPS_HIERARCHY = String.format("/api/project-groups/%s/hierarchy", UUID_REGEX);
    public static final String API_PROJECT_GROUPS_POSSIBLE_CHILD_PROJECT_GROUPS = String.format("/api/project-groups/%s/possible-child-project-groups", UUID_REGEX);
    public static final String API_PROJECT_GROUPS_PROJECT_GROUPS = String.format("/api/project-groups/%s/project-groups", UUID_REGEX);
    public static final String API_PROJECT_GROUPS_REPORT_SETTINGS = String.format("/api/project-groups/%s/report-settings", UUID_REGEX);
    public static final String API_PROJECT_GROUPS_SBOM_FIELDS = String.format("/api/project-groups/%s/sbom-fields", UUID_REGEX);
    public static final String API_PROJECT_GROUPS_USERGROUPS_WITH_ID = String.format("/api/project-groups/%s/usergroups/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECT_GROUPS_USERS_WITH_ID = String.format("/api/project-groups/%s/users/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECT_VERSION_ORIGIN_DEPENDENCY_PATHS = String.format("/api/project/%s/version/%s/origin/%s/dependency-paths", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_WITH_ID = String.format("/api/projects/%s", UUID_REGEX);
    public static final String API_PROJECTS_CUSTOM_FIELDS_WITH_ID = String.format("/api/projects/%s/custom-fields/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_PROJECT_MAPPINGS_WITH_ID = String.format("/api/projects/%s/project-mappings/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_SBOM_FIELDS = String.format("/api/projects/%s/sbom-fields", UUID_REGEX);
    public static final String API_PROJECTS_SCM = String.format("/api/projects/%s/scm", UUID_REGEX);
    public static final String API_PROJECTS_TAGS_WITH_ID = String.format("/api/projects/%s/tags/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_USERGROUPS_WITH_ID = String.format("/api/projects/%s/usergroups/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_USERS_WITH_ID = String.format("/api/projects/%s/users/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_WITH_ID = String.format("/api/projects/%s/versions/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_BOM_EVENTS = String.format("/api/projects/%s/versions/%s/bom-events", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_BOM_STATUS = String.format("/api/projects/%s/versions/%s/bom-status", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_BOM_STATUS_WITH_ID = String.format("/api/projects/%s/versions/%s/bom-status/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_CODE_LOCATIONS = String.format("/api/projects/%s/versions/%s/code-locations", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPARISON = String.format("/api/projects/%s/versions/%s/comparison", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_WITH_ID = String.format("/api/projects/%s/versions/%s/components/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_COMMENTS_WITH_ID = String.format("/api/projects/%s/versions/%s/components/%s/comments/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_COMPONENT_VERSIONS_COMMENTS_WITH_ID = String.format("/api/projects/%s/versions/%s/components/%s/component-versions/%s/comments/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_COMPONENT_VERSIONS_ISSUES_WITH_ID = String.format("/api/projects/%s/versions/%s/components/%s/component-versions/%s/issues/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_CUSTOM_FIELDS_WITH_ID = String.format("/api/projects/%s/versions/%s/components/%s/custom-fields/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_ISSUES_WITH_ID = String.format("/api/projects/%s/versions/%s/components/%s/issues/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_MATCHED_FILES = String.format("/api/projects/%s/versions/%s/components/%s/matched-files", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_POLICY_RULES = String.format("/api/projects/%s/versions/%s/components/%s/policy-rules", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_POLICY_STATUS = String.format("/api/projects/%s/versions/%s/components/%s/policy-status", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_SBOM_FIELDS = String.format("/api/projects/%s/versions/%s/components/%s/sbom-fields", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_WITH_ID = String.format("/api/projects/%s/versions/%s/components/%s/versions/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_CUSTOM_FIELDS_WITH_ID = String.format("/api/projects/%s/versions/%s/components/%s/versions/%s/custom-fields/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_MATCHED_FILES = String.format("/api/projects/%s/versions/%s/components/%s/versions/%s/matched-files", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_ORIGINS_MATCHED_FILES = String.format("/api/projects/%s/versions/%s/components/%s/versions/%s/origins/%s/matched-files", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_ORIGINS_VULNERABILITIES_REMEDIATION = String.format("/api/projects/%s/versions/%s/components/%s/versions/%s/origins/%s/vulnerabilities/%s/remediation", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_POLICY_STATUS = String.format("/api/projects/%s/versions/%s/components/%s/versions/%s/policy-status", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_SBOM_FIELDS = String.format("/api/projects/%s/versions/%s/components/%s/versions/%s/sbom-fields", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_VULNERABILITIES_REMEDIATION = String.format("/api/projects/%s/versions/%s/components/%s/versions/%s/vulnerabilities/%s/remediation", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_CONTAINERS_LAYERS_LAYERINDEX = String.format("/api/projects/%s/versions/%s/containers/%s/layers/layerIndex", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_CUSTOM_FIELDS_WITH_ID = String.format("/api/projects/%s/versions/%s/custom-fields/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_HIERARCHICAL_COMPONENTS = String.format("/api/projects/%s/versions/%s/hierarchical-components", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_IAC_ISSUE_COUNTS = String.format("/api/projects/%s/versions/%s/iac-issue-counts", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_ISSUES = String.format("/api/projects/%s/versions/%s/issues", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_LICENSE_REPORT_CATEGORIES = String.format("/api/projects/%s/versions/%s/license-report-categories", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_LICENSE_REPORTS = String.format("/api/projects/%s/versions/%s/license-reports", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_MATCHED_COMPONENTS = String.format("/api/projects/%s/versions/%s/matched-components", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_MATCHED_FILES = String.format("/api/projects/%s/versions/%s/matched-files", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_POLICY_RULES = String.format("/api/projects/%s/versions/%s/policy-rules", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_POLICY_STATUS = String.format("/api/projects/%s/versions/%s/policy-status", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_REPORTS_WITH_ID = String.format("/api/projects/%s/versions/%s/reports/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_REPORTS_CONTENTS = String.format("/api/projects/%s/versions/%s/reports/%s/contents", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_REPORTS_CAN_GENERATE_SBOM_REPORT = String.format("/api/projects/%s/versions/%s/reports/can-generate-sbom-report", UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_SOURCE_VIEW_COMMENTS_WITH_ID = String.format("/api/projects/%s/versions/%s/source-view/%s/comments/%s", UUID_REGEX, UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_VULNERABILITIES_VULNERABILITY_MATCHES = String.format("/api/projects/%s/versions/%s/vulnerabilities/%s/vulnerability-matches", UUID_REGEX, UUID_REGEX, UUID_REGEX);
    public static final String API_PROJECTS_VERSIONS_VULNERABLE_BOM_COMPONENTS = String.format("/api/projects/%s/versions/%s/vulnerable-bom-components", UUID_REGEX, UUID_REGEX);
    public static final String API_PURGE_TOKENS = String.format("/api/purge-tokens");
    public static final String API_PURGE_TOKENS_JOB_STATUS = String.format("/api/purge-tokens/job-status");
    public static final String API_REGISTRATION = String.format("/api/registration");
    public static final String API_REPORTS_CONTENTS = String.format("/api/reports/%s/contents", UUID_REGEX);
    public static final String API_ROLES_WITH_ID = String.format("/api/roles/%s", UUID_REGEX);
    public static final String API_SBOM_FIELDS_SCOPES = String.format("/api/sbom-fields/scopes");
    public static final String API_SBOM_FIELDS_SCOPES_SCOPENAME_FIELDS = String.format("/api/sbom-fields/scopes/scopeName/fields");
    public static final String API_SCAN_MONITOR = String.format("/api/scan-monitor");
    public static final String API_SCAN_READINESS = String.format("/api/scan-readiness");
    public static final String API_SCAN_SUMMARIES_WITH_ID = String.format("/api/scan-summaries/%s", UUID_REGEX);
    public static final String API_SEARCH_KB_PURL_COMPONENT = String.format("/api/search/kb-purl-component");
    public static final String API_SETTINGS_ANALYSIS = String.format("/api/settings/analysis");
    public static final String API_SETTINGS_API_TOKEN_PURGE = String.format("/api/settings/api-token-purge");
    public static final String API_SETTINGS_AUTO_REMEDIATE_UNMAPPED = String.format("/api/settings/auto-remediate-unmapped");
    public static final String API_SETTINGS_BRANDING = String.format("/api/settings/branding");
    public static final String API_SETTINGS_CODE_LOCATION_AUTO_UNMAPPING = String.format("/api/settings/code-location-auto-unmapping");
    public static final String API_SETTINGS_CUSTOM_FIELDS = String.format("/api/settings/custom-fields");
    public static final String API_SETTINGS_DATA_RETENTION = String.format("/api/settings/data-retention");
    public static final String API_SETTINGS_DETECT = String.format("/api/settings/detect");
    public static final String API_SETTINGS_LICENSE_REVIEW = String.format("/api/settings/license-review");
    public static final String API_SETTINGS_ROLE = String.format("/api/settings/role");
    public static final String API_SETTINGS_UNMATCHED_FILE_RETENTION = String.format("/api/settings/unmatched-file-retention");
    public static final String API_SSO_CONFIGURATION = String.format("/api/sso/configuration");
    public static final String API_SSO_STATUS = String.format("/api/sso/status");
    public static final String API_SYSTEM_OAUTH_CLIENT = String.format("/api/system-oauth-client");
    public static final String API_TOKENS = String.format("/api/tokens");
    public static final String API_TOKENS_WITH_ID = String.format("/api/tokens/%s", UUID_REGEX);
    public static final String API_TOOLS = String.format("/api/tools");
    public static final String API_USERGROUPS_WITH_ID = String.format("/api/usergroups/%s", UUID_REGEX);
    public static final String API_USERGROUPS_ASSIGNABLE_PROJECT_GROUPS = String.format("/api/usergroups/%s/assignable-project-groups", UUID_REGEX);
    public static final String API_USERGROUPS_ASSIGNABLE_PROJECTS = String.format("/api/usergroups/%s/assignable-projects", UUID_REGEX);
    public static final String API_USERGROUPS_PROJECTS = String.format("/api/usergroups/%s/projects", UUID_REGEX);
    public static final String API_USERGROUPS_ROLES_WITH_ID = String.format("/api/usergroups/%s/roles/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_USERGROUPS_USERS = String.format("/api/usergroups/%s/users", UUID_REGEX);
    public static final String API_USERGROUPS_USERS_WITH_ID = String.format("/api/usergroups/%s/users/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_USERS_WITH_ID = String.format("/api/users/%s", UUID_REGEX);
    public static final String API_USERS_ASSIGNABLE_PROJECT_GROUPS = String.format("/api/users/%s/assignable-project-groups", UUID_REGEX);
    public static final String API_USERS_ASSIGNABLE_PROJECTS = String.format("/api/users/%s/assignable-projects", UUID_REGEX);
    public static final String API_USERS_LAST_LOGIN = String.format("/api/users/%s/last-login", UUID_REGEX);
    public static final String API_USERS_NOTIFICATION_SUBSCRIPTIONS_WITH_ID = String.format("/api/users/%s/notification-subscriptions/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_USERS_NOTIFICATIONS = String.format("/api/users/%s/notifications", UUID_REGEX);
    public static final String API_USERS_PROJECTS = String.format("/api/users/%s/projects", UUID_REGEX);
    public static final String API_USERS_ROLES_WITH_ID = String.format("/api/users/%s/roles/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_USERS_USERGROUPS_WITH_ID = String.format("/api/users/%s/usergroups/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_VERSIONS_LICENSE_REPORTS_WITH_ID = String.format("/api/versions/%s/license-reports/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_VERSIONS_REPORTS_WITH_ID = String.format("/api/versions/%s/reports/%s", UUID_REGEX, UUID_REGEX);
    public static final String API_VULNERABILITIES_WITH_ID = String.format("/api/vulnerabilities/%s", UUID_REGEX);
    public static final String API_VULNERABILITIES_AFFECTED_PROJECTS = String.format("/api/vulnerabilities/%s/affected-projects", UUID_REGEX);
    public static final String API_VULNERABILITIES_DEFAULT_REMEDIATION_STATUS = String.format("/api/vulnerabilities/%s/default-remediation-status", UUID_REGEX);
    public static final String API_VULNERABILITIES_RANGES = String.format("/api/vulnerabilities/%s/ranges", UUID_REGEX);
    public static final String API_VULNERABILITY_REPORTS_WITH_ID = String.format("/api/vulnerability-reports/%s", UUID_REGEX);

    private List<MediaTypeMatcher> mediaTypeMatchers = new LinkedList<>();

    // This class contains a list of regular expressions to perform matches on the URL path.
    // A URL path should only match one expression in the list.
    // The expressions are sorted in alphabetical order.
    // The forward slash in the path should be escaped to avoid potential errors.
    // The parts of a path that are variable are the UUIDs for the resources.

    // The string to escape forward slash is: \\/
    // The regex pattern for a UUID is: \\b[a-f0-9]{8}\\b-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-\\b[a-f0-9]{12}\\b
    public BlackDuckMediaTypeDiscovery() {
        mediaTypeMatchers.add(new MediaTypeMatcher(API_ANNOUNCEMENT_BANNER, VND_BLACKDUCKSOFTWARE_SYSTEM_ANNOUNCEMENT_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_ANNOUNCEMENT_BANNER_WITH_ID, VND_BLACKDUCKSOFTWARE_SYSTEM_ANNOUNCEMENT_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_ANNOUNCEMENT_FOOTER, VND_BLACKDUCKSOFTWARE_SYSTEM_ANNOUNCEMENT_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_ANNOUNCEMENT_FOOTER_WITH_ID, VND_BLACKDUCKSOFTWARE_SYSTEM_ANNOUNCEMENT_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_ANNOUNCEMENT_LOGIN, VND_BLACKDUCKSOFTWARE_SYSTEM_ANNOUNCEMENT_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_ANNOUNCEMENT_LOGIN_WITH_ID, VND_BLACKDUCKSOFTWARE_SYSTEM_ANNOUNCEMENT_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_ANNOUNCEMENT_WELCOME, VND_BLACKDUCKSOFTWARE_SYSTEM_ANNOUNCEMENT_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_ANNOUNCEMENT_WELCOME_WITH_ID, VND_BLACKDUCKSOFTWARE_SYSTEM_ANNOUNCEMENT_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_BOM_IMPORT_COMPONENT_IMPORT_EVENTS, VND_BLACKDUCKSOFTWARE_SCAN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_BOM_IMPORT_COMPONENT_IMPORT_EVENTS_COUNT, VND_BLACKDUCKSOFTWARE_SCAN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CODELOCATIONS_WITH_ID, VND_BLACKDUCKSOFTWARE_SCAN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_CUSTOM_FIELDS_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_SBOM_FIELDS, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_TAGS_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_CUSTOM_FIELDS_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_LICENSES_TEXT, TEXT_PLAIN));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_LICENSES_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_ORIGINS_CAPABILITY_ANALYSIS, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_ORIGINS_COPYRIGHTS, VND_BLACKDUCKSOFTWARE_COPYRIGHT_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_ORIGINS_INFORMATION_LEAK_ANALYSIS, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_ORIGINS_PACKAGE_CONFIG_ANALYSIS, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_ORIGINS_TRANSITIVE_UPGRADE_GUIDANCE, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_ORIGINS_UPGRADE_GUIDANCE, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_ORIGINS_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_ORIGIN_FILE_COPYRIGHTS, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_ORIGIN_FILE_LICENSES_FUZZY, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_ORIGIN_FILE_LICENSES_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_RISK_PROFILE, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_RISK_PROFILE_SECURITY, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_UPGRADE_GUIDANCE, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VERSIONS_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_VULNERABILITY_STATISTICS, VND_BLACKDUCKSOFTWARE_VULNERABILITY_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENTS_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENT_MIGRATIONS, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_COMPONENT_MIGRATIONS_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CPES, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CPES_ORIGINS, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CPES_VERSIONS, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CURRENT_USER, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CURRENT_USER_TOKENS, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CURRENT_USER_TOKENS_WITH_ID, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CURRENT_VERSION, VND_BLACKDUCKSOFTWARE_STATUS_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CUSTOM_FIELDS_OBJECTS_CUSTOMFIELDOBJECT, VND_BLACKDUCKSOFTWARE_ADMIN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CUSTOM_FIELDS_OBJECTS_CUSTOMFIELDOBJECT_FIELDS_OPTIONS, VND_BLACKDUCKSOFTWARE_ADMIN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CUSTOM_FIELDS_OBJECTS_CUSTOMFIELDOBJECT_FIELDS_WITH_ID, VND_BLACKDUCKSOFTWARE_ADMIN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CUSTOM_FIELDS_TYPES, VND_BLACKDUCKSOFTWARE_ADMIN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_CWES_WITH_ID, VND_BLACKDUCKSOFTWARE_VULNERABILITY_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_DEVELOPER_SCANS_FULL_RESULT, VND_BLACKDUCKSOFTWARE_SCAN_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_DEVELOPER_SCANS_WITH_ID, VND_BLACKDUCKSOFTWARE_SCAN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_EXTERNAL_CONFIG_DETECT_URI, VND_BLACKDUCKSOFTWARE_ADMIN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_FILE_SOURCE_CONTENTS_WITH_ID, VND_BLACKDUCKSOFTWARE_SCAN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_HEALTH_CHECKS_LIVENESS, VND_BLACKDUCKSOFTWARE_STATUS_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_HEALTH_CHECKS_READINESS, VND_BLACKDUCKSOFTWARE_STATUS_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_INTEGRATION_GITHUB, VND_BLACKDUCKSOFTWARE_INTEGRATION_SCM_CONFIGURATION_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_INTEGRATION_GITHUB_REPOSITORIES_WITH_ID, VND_BLACKDUCKSOFTWARE_INTEGRATION_SCM_CONFIGURATION_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_INTEGRATION_GITHUB_SCAN_SUMMARIES, VND_BLACKDUCKSOFTWARE_INTEGRATION_SCM_CONFIGURATION_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_INTEGRATION_GITHUB_WITH_ID, VND_BLACKDUCKSOFTWARE_INTEGRATION_SCM_CONFIGURATION_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_INTEGRATION_SCM_LITE_VERSION_MAPPING_WITH_ID, VND_BLACKDUCKSOFTWARE_INTEGRATION_SCM_CONFIGURATION_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_JOBS_HISTORIES, VND_BLACKDUCKSOFTWARE_JOB_HISTORY_PAGE_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_JOBS_RUNTIMES, VND_BLACKDUCKSOFTWARE_JOB_SCHEDULE_PAGE_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_JOBS_SCHEDULERS_SCHEDULER_TRIGGER_GROUPS_TRIGGERGROUP_TRIGGERS_WITH_ID, VND_BLACKDUCKSOFTWARE_JOB_SCHEDULE_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_JOBS_VULNERABILITY_PRIORITY_STATUS, VND_BLACKDUCKSOFTWARE_STATUS_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_JOBS_WITH_ID, VND_BLACKDUCKSOFTWARE_STATUS_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_JOURNAL_PROJECTS_VERSIONS_WITH_ID, VND_BLACKDUCKSOFTWARE_JOURNAL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_JOURNAL_PROJECTS_WITH_ID, VND_BLACKDUCKSOFTWARE_JOURNAL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSES_COMMENTS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSES_LICENSE_TERMS_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSES_TEXT, TEXT_PLAIN));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSES_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSE_DASHBOARD, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSE_FAMILIES_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSE_TERMS_LICENSES_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSE_TERMS_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LICENSE_TERM_CATEGORIES_WITH_ID, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LITE_COMPONENTS_VULNERABILITY_BOM, VND_BLACKDUCKSOFTWARE_LW_BILL_OF_MATERIALS_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LITE_DASHBOARD, VND_BLACKDUCKSOFTWARE_LW_BILL_OF_MATERIALS_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LITE_PROJECTS_LITE_VERSIONS, VND_BLACKDUCKSOFTWARE_LW_BILL_OF_MATERIALS_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LITE_PROJECTS_WITH_ID, VND_BLACKDUCKSOFTWARE_LW_BILL_OF_MATERIALS_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LITE_VERSIONS_COMPONENTS, VND_BLACKDUCKSOFTWARE_LW_BILL_OF_MATERIALS_2_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LITE_VERSIONS_WITH_ID, VND_BLACKDUCKSOFTWARE_LW_BILL_OF_MATERIALS_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LW_BOMS, VND_BLACKDUCKSOFTWARE_LW_BILL_OF_MATERIALS_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LW_BOM_PROJECTS, VND_BLACKDUCKSOFTWARE_LW_BILL_OF_MATERIALS_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LW_BOM_PROJECTS_LW_BOM_PROJECT_VERSIONS, VND_BLACKDUCKSOFTWARE_LW_BILL_OF_MATERIALS_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LW_BOM_PROJECTS_WITH_ID, VND_BLACKDUCKSOFTWARE_LW_BILL_OF_MATERIALS_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LW_BOM_PROJECT_VERSIONS_LW_BOMS, VND_BLACKDUCKSOFTWARE_LW_BILL_OF_MATERIALS_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_LW_BOM_PROJECT_VERSIONS_WITH_ID, VND_BLACKDUCKSOFTWARE_LW_BILL_OF_MATERIALS_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_MANAGE_ANNOUNCEMENT_BANNER, VND_BLACKDUCKSOFTWARE_SYSTEM_ANNOUNCEMENT_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_MANAGE_ANNOUNCEMENT_BANNER_WITH_ID, VND_BLACKDUCKSOFTWARE_SYSTEM_ANNOUNCEMENT_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_MANAGE_ANNOUNCEMENT_FOOTER, VND_BLACKDUCKSOFTWARE_SYSTEM_ANNOUNCEMENT_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_MANAGE_ANNOUNCEMENT_FOOTER_WITH_ID, VND_BLACKDUCKSOFTWARE_SYSTEM_ANNOUNCEMENT_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_MANAGE_ANNOUNCEMENT_LOGIN, VND_BLACKDUCKSOFTWARE_SYSTEM_ANNOUNCEMENT_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_MANAGE_ANNOUNCEMENT_LOGIN_WITH_ID, VND_BLACKDUCKSOFTWARE_SYSTEM_ANNOUNCEMENT_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_MANAGE_ANNOUNCEMENT_WELCOME, VND_BLACKDUCKSOFTWARE_SYSTEM_ANNOUNCEMENT_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_MANAGE_ANNOUNCEMENT_WELCOME_WITH_ID, VND_BLACKDUCKSOFTWARE_SYSTEM_ANNOUNCEMENT_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PASSWORD_MANAGEMENT_SETTINGS, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PASSWORD_SECURITY_SETTINGS, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_POLICY_RULES_WITH_ID, VND_BLACKDUCKSOFTWARE_POLICY_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_CUSTOM_FIELDS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_PROJECT_MAPPINGS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_SBOM_FIELDS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_7_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_SCM, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_TAGS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_USERGROUPS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_USERS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_BOM_EVENTS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_BOM_STATUS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_BOM_STATUS_WITH_ID, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_CODE_LOCATIONS, VND_BLACKDUCKSOFTWARE_INTERNAL_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPARISON, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_COMMENTS_WITH_ID, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_COMPONENT_VERSIONS_COMMENTS_WITH_ID, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_COMPONENT_VERSIONS_ISSUES_WITH_ID, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_CUSTOM_FIELDS_WITH_ID, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_ISSUES_WITH_ID, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_MATCHED_FILES, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_POLICY_RULES, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_POLICY_STATUS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_SBOM_FIELDS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_CUSTOM_FIELDS_WITH_ID, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_MATCHED_FILES, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_ORIGINS_MATCHED_FILES, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_ORIGINS_VULNERABILITIES_REMEDIATION, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_POLICY_STATUS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_SBOM_FIELDS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_VULNERABILITIES_REMEDIATION, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_VERSIONS_WITH_ID, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_COMPONENTS_WITH_ID, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_CONTAINERS_LAYERS_LAYERINDEX, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_CUSTOM_FIELDS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_HIERARCHICAL_COMPONENTS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_IAC_ISSUE_COUNTS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_ISSUES, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_LICENSE_REPORTS, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_LICENSE_REPORT_CATEGORIES, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_MATCHED_COMPONENTS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_MATCHED_FILES, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_POLICY_RULES, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_POLICY_STATUS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_REPORTS_CAN_GENERATE_SBOM_REPORT, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_REPORTS_CONTENTS, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_REPORTS_WITH_ID, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_SOURCE_VIEW_COMMENTS_WITH_ID, VND_BLACKDUCKSOFTWARE_SOURCE_VIEW_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_VULNERABILITIES_VULNERABILITY_MATCHES, VND_BLACKDUCKSOFTWARE_VULNERABILITY_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_VULNERABLE_BOM_COMPONENTS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_VERSIONS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECTS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_7_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECT_GROUPS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECT_GROUPS_CHILDREN, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECT_GROUPS_DESCENDANTS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECT_GROUPS_DESTINATION_PROJECT_GROUPS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECT_GROUPS_HIERARCHY, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECT_GROUPS_POSSIBLE_CHILD_PROJECT_GROUPS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECT_GROUPS_PROJECT_GROUPS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECT_GROUPS_REPORT_SETTINGS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECT_GROUPS_SBOM_FIELDS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECT_GROUPS_USERGROUPS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECT_GROUPS_USERS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECT_GROUPS_WITH_ID, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PROJECT_VERSION_ORIGIN_DEPENDENCY_PATHS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PURGE_TOKENS, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_PURGE_TOKENS_JOB_STATUS, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_REGISTRATION, VND_BLACKDUCKSOFTWARE_STATUS_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_REPORTS_CONTENTS, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_ROLES_WITH_ID, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SBOM_FIELDS_SCOPES, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SBOM_FIELDS_SCOPES_SCOPENAME_FIELDS, VND_BLACKDUCKSOFTWARE_BILL_OF_MATERIALS_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SCAN_MONITOR, VND_BLACKDUCKSOFTWARE_SCAN_MONITOR_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SCAN_READINESS, VND_BLACKDUCKSOFTWARE_SCAN_READINESS_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SCAN_SUMMARIES_WITH_ID, VND_BLACKDUCKSOFTWARE_SCAN_6_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SEARCH_KB_PURL_COMPONENT, VND_BLACKDUCKSOFTWARE_COMPONENT_DETAIL_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SETTINGS_ANALYSIS, VND_BLACKDUCKSOFTWARE_ADMIN_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SETTINGS_API_TOKEN_PURGE, VND_BLACKDUCKSOFTWARE_ADMIN_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SETTINGS_AUTO_REMEDIATE_UNMAPPED, VND_BLACKDUCKSOFTWARE_ADMIN_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SETTINGS_BRANDING, VND_BLACKDUCKSOFTWARE_ADMIN_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SETTINGS_CODE_LOCATION_AUTO_UNMAPPING, VND_BLACKDUCKSOFTWARE_ADMIN_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SETTINGS_CUSTOM_FIELDS, VND_BLACKDUCKSOFTWARE_ADMIN_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SETTINGS_DATA_RETENTION, VND_BLACKDUCKSOFTWARE_ADMIN_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SETTINGS_DETECT, VND_BLACKDUCKSOFTWARE_ADMIN_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SETTINGS_LICENSE_REVIEW, VND_BLACKDUCKSOFTWARE_ADMIN_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SETTINGS_ROLE, VND_BLACKDUCKSOFTWARE_ADMIN_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SETTINGS_UNMATCHED_FILE_RETENTION, VND_BLACKDUCKSOFTWARE_ADMIN_5_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SSO_CONFIGURATION, VND_BLACKDUCKSOFTWARE_ADMIN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SSO_STATUS, VND_BLACKDUCKSOFTWARE_ADMIN_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_SYSTEM_OAUTH_CLIENT, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_TOKENS, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_TOKENS_WITH_ID, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_TOOLS, VND_BLACKDUCKSOFTWARE_TOOL_VIEW_1_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERGROUPS_ASSIGNABLE_PROJECTS, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERGROUPS_ASSIGNABLE_PROJECT_GROUPS, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERGROUPS_PROJECTS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERGROUPS_ROLES_WITH_ID, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERGROUPS_USERS, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERGROUPS_USERS_WITH_ID, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERGROUPS_WITH_ID, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS_ASSIGNABLE_PROJECTS, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS_ASSIGNABLE_PROJECT_GROUPS, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS_LAST_LOGIN, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS_NOTIFICATIONS, VND_BLACKDUCKSOFTWARE_NOTIFICATION_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS_NOTIFICATION_SUBSCRIPTIONS_WITH_ID, VND_BLACKDUCKSOFTWARE_NOTIFICATION_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS_PROJECTS, VND_BLACKDUCKSOFTWARE_PROJECT_DETAIL_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS_ROLES_WITH_ID, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS_USERGROUPS_WITH_ID, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_USERS_WITH_ID, VND_BLACKDUCKSOFTWARE_USER_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_VERSIONS_LICENSE_REPORTS_WITH_ID, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_VERSIONS_REPORTS_WITH_ID, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_VULNERABILITIES_AFFECTED_PROJECTS, VND_BLACKDUCKSOFTWARE_VULNERABILITY_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_VULNERABILITIES_DEFAULT_REMEDIATION_STATUS, VND_BLACKDUCKSOFTWARE_VULNERABILITY_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_VULNERABILITIES_RANGES, VND_BLACKDUCKSOFTWARE_VULNERABILITY_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_VULNERABILITIES_WITH_ID, VND_BLACKDUCKSOFTWARE_VULNERABILITY_4_JSON));
        mediaTypeMatchers.add(new MediaTypeMatcher(API_VULNERABILITY_REPORTS_WITH_ID, VND_BLACKDUCKSOFTWARE_REPORT_4_JSON));
    }

    public String determineMediaType(HttpUrl url, String currentMediaType) {
        if (null != url && VALUES_TO_REPLACE.contains(currentMediaType)) {
            return determineMediaType(url);
        } else {
            return currentMediaType;
        }
    }

    public String determineMediaType(HttpUrl url) {
        String path = url.url().getPath();
        return mediaTypeMatchers.stream()
                   .filter(matcher -> matcher.getPattern().matcher(path).matches())
                   .map(MediaTypeMatcher::getMediaType)
                   .findFirst()
                   .orElse(DEFAULT_MEDIA_TYPE);
    }

    private class MediaTypeMatcher {
        private Pattern pattern;
        private String mediaType;

        public MediaTypeMatcher(final String pattern, final String mediaType) {
            this.pattern = createPattern(pattern);
            this.mediaType = mediaType;
        }

        private Pattern createPattern(String pattern) {
            String regexPattern = pattern.replaceAll("/","\\/");
            return Pattern.compile(regexPattern);
        }

        public Pattern getPattern() {
            return pattern;
        }

        public String getMediaType() {
            return mediaType;
        }
    }

}
