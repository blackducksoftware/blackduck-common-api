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
package com.synopsys.integration.blackduck.api.generated.discovery;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckPath;
import com.synopsys.integration.blackduck.api.core.BlackDuckPathMultipleResponses;
import com.synopsys.integration.blackduck.api.core.BlackDuckPathSingleResponse;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.response.ComponentSearchResult;
import com.synopsys.integration.blackduck.api.generated.response.CurrentVersionView;
import com.synopsys.integration.blackduck.api.generated.response.CustomFieldTypeView;
import com.synopsys.integration.blackduck.api.generated.response.DashboardSummaryView;
import com.synopsys.integration.blackduck.api.generated.response.EndUserLicenseAgreementView;
import com.synopsys.integration.blackduck.api.generated.response.HealthCheckStatusView;
import com.synopsys.integration.blackduck.api.generated.response.JobStatisticsView;
import com.synopsys.integration.blackduck.api.generated.response.LegacyFilterView;
import com.synopsys.integration.blackduck.api.generated.view.CodeLocationView;
import com.synopsys.integration.blackduck.api.generated.view.ComponentSearchResultView;
import com.synopsys.integration.blackduck.api.generated.view.CustomFieldObjectView;
import com.synopsys.integration.blackduck.api.generated.view.FilterView;
import com.synopsys.integration.blackduck.api.generated.view.LicenseFamilyView;
import com.synopsys.integration.blackduck.api.generated.view.LicenseView;
import com.synopsys.integration.blackduck.api.generated.view.PolicyRuleView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectView;
import com.synopsys.integration.blackduck.api.generated.view.RegistrationView;
import com.synopsys.integration.blackduck.api.generated.view.ReportView;
import com.synopsys.integration.blackduck.api.generated.view.RoleView;
import com.synopsys.integration.blackduck.api.generated.view.UserGroupView;
import com.synopsys.integration.blackduck.api.generated.view.UserView;
import com.synopsys.integration.blackduck.api.manual.view.NotificationView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ApiDiscovery {
    public static final Map<BlackDuckPath, LinkResponse> links = new HashMap<>();

    public static final BlackDuckPath CODELOCATIONS_LINK = new BlackDuckPath("/api/codelocations");
    public static final BlackDuckPath CODELOCATIONS_FILTERS_LINK = new BlackDuckPath("/api/codelocations-filters");
    public static final BlackDuckPath COMPONENTS_LINK = new BlackDuckPath("/api/components");
    public static final BlackDuckPath COMPONENTS_FILTERS_LINK = new BlackDuckPath("/api/components-filters");
    public static final BlackDuckPath CURRENT_USER_LINK = new BlackDuckPath("/api/current-user");
    public static final BlackDuckPath CURRENT_VERSION_LINK = new BlackDuckPath("/api/current-version");
    public static final BlackDuckPath CUSTOM_FIELDS_OBJECTS_LINK = new BlackDuckPath("/api/custom-fields/objects");
    public static final BlackDuckPath CUSTOM_FIELDS_TYPES_LINK = new BlackDuckPath("/api/custom-fields/types");
    public static final BlackDuckPath DASHBOARD_SUMMARY_LINK = new BlackDuckPath("/api/dashboard-summary");
    public static final BlackDuckPath ENDUSERLICENSEAGREEMENT_LINK = new BlackDuckPath("/api/enduserlicenseagreement");
    public static final BlackDuckPath HEALTH_CHECKS_LIVENESS_LINK = new BlackDuckPath("/api/health-checks/liveness");
    public static final BlackDuckPath HEALTH_CHECKS_READINESS_LINK = new BlackDuckPath("/api/health-checks/readiness");
    public static final BlackDuckPath JOB_STATISTICS_LINK = new BlackDuckPath("/api/job-statistics");
    public static final BlackDuckPath JOBS_FILTERS_LINK = new BlackDuckPath("/api/jobs-filters");
    public static final BlackDuckPath LICENSE_FAMILIES_LINK = new BlackDuckPath("/api/license-families");
    public static final BlackDuckPath LICENSE_FAMILIES_FILTERS_LINK = new BlackDuckPath("/api/license-families-filters");
    public static final BlackDuckPath LICENSES_LINK = new BlackDuckPath("/api/licenses");
    public static final BlackDuckPath LICENSES_FILTERS_LINK = new BlackDuckPath("/api/licenses-filters");
    public static final BlackDuckPath NOTIFICATION_STATE_FILTERS_LINK = new BlackDuckPath("/api/notification-state-filters");
    public static final BlackDuckPath NOTIFICATION_TYPE_FILTERS_LINK = new BlackDuckPath("/api/notification-type-filters");
    public static final BlackDuckPath NOTIFICATIONS_LINK = new BlackDuckPath("/api/notifications");
    public static final BlackDuckPath NOTIFICATIONS_FILTERS_LINK = new BlackDuckPath("/api/notifications-filters");
    public static final BlackDuckPath POLICY_RULE_ENABLED_FILTERS_LINK = new BlackDuckPath("/api/policy-rule-enabled-filters");
    public static final BlackDuckPath POLICY_RULES_LINK = new BlackDuckPath("/api/policy-rules");
    public static final BlackDuckPath POLICY_RULES_FILTERS_LINK = new BlackDuckPath("/api/policy-rules-filters");
    public static final BlackDuckPath PROJECTS_LINK = new BlackDuckPath("/api/projects");
    public static final BlackDuckPath REGISTRATION_LINK = new BlackDuckPath("/api/registration");
    public static final BlackDuckPath RISK_PROFILE_FILTERS_LINK = new BlackDuckPath("/api/risk-profile-filters");
    public static final BlackDuckPath ROLES_LINK = new BlackDuckPath("/api/roles");
    public static final BlackDuckPath SEARCH_COMPONENTS_LINK = new BlackDuckPath("/api/search/components");
    public static final BlackDuckPath USER_STATUS_FILTERS_LINK = new BlackDuckPath("/api/user-status-filters");
    public static final BlackDuckPath USERGROUPS_LINK = new BlackDuckPath("/api/usergroups");
    public static final BlackDuckPath USERS_LINK = new BlackDuckPath("/api/users");
    public static final BlackDuckPath USERS_FILTERS_LINK = new BlackDuckPath("/api/users-filters");
    public static final BlackDuckPath VULNERABILITY_REMEDIATION_REPORTS_LINK = new BlackDuckPath("/api/vulnerability-remediation-reports");
    public static final BlackDuckPath VULNERABILITY_STATUS_REPORTS_LINK = new BlackDuckPath("/api/vulnerability-status-reports");
    public static final BlackDuckPath VULNERABILITY_UPDATE_REPORTS_LINK = new BlackDuckPath("/api/vulnerability-update-reports");

    public static final BlackDuckPathMultipleResponses<CodeLocationView> CODELOCATIONS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<CodeLocationView>(CODELOCATIONS_LINK, CodeLocationView.class);
    public static final BlackDuckPathSingleResponse<FilterView> CODELOCATIONS_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<FilterView>(CODELOCATIONS_FILTERS_LINK, FilterView.class);
    public static final BlackDuckPathMultipleResponses<ComponentSearchResultView> COMPONENTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<ComponentSearchResultView>(COMPONENTS_LINK, ComponentSearchResultView.class);
    public static final BlackDuckPathSingleResponse<FilterView> COMPONENTS_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<FilterView>(COMPONENTS_FILTERS_LINK, FilterView.class);
    public static final BlackDuckPathSingleResponse<UserView> CURRENT_USER_LINK_RESPONSE = new BlackDuckPathSingleResponse<UserView>(CURRENT_USER_LINK, UserView.class);
    public static final BlackDuckPathSingleResponse<CurrentVersionView> CURRENT_VERSION_LINK_RESPONSE = new BlackDuckPathSingleResponse<CurrentVersionView>(CURRENT_VERSION_LINK, CurrentVersionView.class);
    public static final BlackDuckPathMultipleResponses<CustomFieldObjectView> CUSTOM_FIELDS_OBJECTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<CustomFieldObjectView>(CUSTOM_FIELDS_OBJECTS_LINK, CustomFieldObjectView.class);
    public static final BlackDuckPathMultipleResponses<CustomFieldTypeView> CUSTOM_FIELDS_TYPES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<CustomFieldTypeView>(CUSTOM_FIELDS_TYPES_LINK, CustomFieldTypeView.class);
    public static final BlackDuckPathSingleResponse<DashboardSummaryView> DASHBOARD_SUMMARY_LINK_RESPONSE = new BlackDuckPathSingleResponse<DashboardSummaryView>(DASHBOARD_SUMMARY_LINK, DashboardSummaryView.class);
    public static final BlackDuckPathSingleResponse<EndUserLicenseAgreementView> ENDUSERLICENSEAGREEMENT_LINK_RESPONSE = new BlackDuckPathSingleResponse<EndUserLicenseAgreementView>(ENDUSERLICENSEAGREEMENT_LINK, EndUserLicenseAgreementView.class);
    public static final BlackDuckPathSingleResponse<HealthCheckStatusView> HEALTH_CHECKS_LIVENESS_LINK_RESPONSE = new BlackDuckPathSingleResponse<HealthCheckStatusView>(HEALTH_CHECKS_LIVENESS_LINK, HealthCheckStatusView.class);
    public static final BlackDuckPathSingleResponse<HealthCheckStatusView> HEALTH_CHECKS_READINESS_LINK_RESPONSE = new BlackDuckPathSingleResponse<HealthCheckStatusView>(HEALTH_CHECKS_READINESS_LINK, HealthCheckStatusView.class);
    public static final BlackDuckPathMultipleResponses<JobStatisticsView> JOB_STATISTICS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<JobStatisticsView>(JOB_STATISTICS_LINK, JobStatisticsView.class);
    public static final BlackDuckPathSingleResponse<FilterView> JOBS_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<FilterView>(JOBS_FILTERS_LINK, FilterView.class);
    public static final BlackDuckPathMultipleResponses<LicenseFamilyView> LICENSE_FAMILIES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<LicenseFamilyView>(LICENSE_FAMILIES_LINK, LicenseFamilyView.class);
    public static final BlackDuckPathSingleResponse<FilterView> LICENSE_FAMILIES_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<FilterView>(LICENSE_FAMILIES_FILTERS_LINK, FilterView.class);
    public static final BlackDuckPathMultipleResponses<LicenseView> LICENSES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<LicenseView>(LICENSES_LINK, LicenseView.class);
    public static final BlackDuckPathSingleResponse<FilterView> LICENSES_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<FilterView>(LICENSES_FILTERS_LINK, FilterView.class);
    public static final BlackDuckPathSingleResponse<FilterView> NOTIFICATION_STATE_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<FilterView>(NOTIFICATION_STATE_FILTERS_LINK, FilterView.class);
    public static final BlackDuckPathSingleResponse<FilterView> NOTIFICATION_TYPE_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<FilterView>(NOTIFICATION_TYPE_FILTERS_LINK, FilterView.class);
    public static final BlackDuckPathMultipleResponses<NotificationView> NOTIFICATIONS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<NotificationView>(NOTIFICATIONS_LINK, NotificationView.class);
    public static final BlackDuckPathSingleResponse<FilterView> NOTIFICATIONS_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<FilterView>(NOTIFICATIONS_FILTERS_LINK, FilterView.class);
    public static final BlackDuckPathSingleResponse<LegacyFilterView> POLICY_RULE_ENABLED_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<LegacyFilterView>(POLICY_RULE_ENABLED_FILTERS_LINK, LegacyFilterView.class);
    public static final BlackDuckPathMultipleResponses<PolicyRuleView> POLICY_RULES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<PolicyRuleView>(POLICY_RULES_LINK, PolicyRuleView.class);
    public static final BlackDuckPathSingleResponse<FilterView> POLICY_RULES_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<FilterView>(POLICY_RULES_FILTERS_LINK, FilterView.class);
    public static final BlackDuckPathMultipleResponses<ProjectView> PROJECTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<ProjectView>(PROJECTS_LINK, ProjectView.class);
    public static final BlackDuckPathSingleResponse<RegistrationView> REGISTRATION_LINK_RESPONSE = new BlackDuckPathSingleResponse<RegistrationView>(REGISTRATION_LINK, RegistrationView.class);
    public static final BlackDuckPathSingleResponse<FilterView> RISK_PROFILE_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<FilterView>(RISK_PROFILE_FILTERS_LINK, FilterView.class);
    public static final BlackDuckPathMultipleResponses<RoleView> ROLES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<RoleView>(ROLES_LINK, RoleView.class);
    public static final BlackDuckPathMultipleResponses<ComponentSearchResult> SEARCH_COMPONENTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<ComponentSearchResult>(SEARCH_COMPONENTS_LINK, ComponentSearchResult.class);
    public static final BlackDuckPathSingleResponse<LegacyFilterView> USER_STATUS_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<LegacyFilterView>(USER_STATUS_FILTERS_LINK, LegacyFilterView.class);
    public static final BlackDuckPathMultipleResponses<UserGroupView> USERGROUPS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<UserGroupView>(USERGROUPS_LINK, UserGroupView.class);
    public static final BlackDuckPathMultipleResponses<UserView> USERS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<UserView>(USERS_LINK, UserView.class);
    public static final BlackDuckPathSingleResponse<FilterView> USERS_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<FilterView>(USERS_FILTERS_LINK, FilterView.class);
    public static final BlackDuckPathMultipleResponses<ReportView> VULNERABILITY_REMEDIATION_REPORTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<ReportView>(VULNERABILITY_REMEDIATION_REPORTS_LINK, ReportView.class);
    public static final BlackDuckPathMultipleResponses<ReportView> VULNERABILITY_STATUS_REPORTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<ReportView>(VULNERABILITY_STATUS_REPORTS_LINK, ReportView.class);
    public static final BlackDuckPathMultipleResponses<ReportView> VULNERABILITY_UPDATE_REPORTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<ReportView>(VULNERABILITY_UPDATE_REPORTS_LINK, ReportView.class);

    static {
        links.put(CODELOCATIONS_LINK, CODELOCATIONS_LINK_RESPONSE);
        links.put(CODELOCATIONS_FILTERS_LINK, CODELOCATIONS_FILTERS_LINK_RESPONSE);
        links.put(COMPONENTS_LINK, COMPONENTS_LINK_RESPONSE);
        links.put(COMPONENTS_FILTERS_LINK, COMPONENTS_FILTERS_LINK_RESPONSE);
        links.put(CURRENT_USER_LINK, CURRENT_USER_LINK_RESPONSE);
        links.put(CURRENT_VERSION_LINK, CURRENT_VERSION_LINK_RESPONSE);
        links.put(CUSTOM_FIELDS_OBJECTS_LINK, CUSTOM_FIELDS_OBJECTS_LINK_RESPONSE);
        links.put(CUSTOM_FIELDS_TYPES_LINK, CUSTOM_FIELDS_TYPES_LINK_RESPONSE);
        links.put(DASHBOARD_SUMMARY_LINK, DASHBOARD_SUMMARY_LINK_RESPONSE);
        links.put(ENDUSERLICENSEAGREEMENT_LINK, ENDUSERLICENSEAGREEMENT_LINK_RESPONSE);
        links.put(HEALTH_CHECKS_LIVENESS_LINK, HEALTH_CHECKS_LIVENESS_LINK_RESPONSE);
        links.put(HEALTH_CHECKS_READINESS_LINK, HEALTH_CHECKS_READINESS_LINK_RESPONSE);
        links.put(JOB_STATISTICS_LINK, JOB_STATISTICS_LINK_RESPONSE);
        links.put(JOBS_FILTERS_LINK, JOBS_FILTERS_LINK_RESPONSE);
        links.put(LICENSE_FAMILIES_LINK, LICENSE_FAMILIES_LINK_RESPONSE);
        links.put(LICENSE_FAMILIES_FILTERS_LINK, LICENSE_FAMILIES_FILTERS_LINK_RESPONSE);
        links.put(LICENSES_LINK, LICENSES_LINK_RESPONSE);
        links.put(LICENSES_FILTERS_LINK, LICENSES_FILTERS_LINK_RESPONSE);
        links.put(NOTIFICATION_STATE_FILTERS_LINK, NOTIFICATION_STATE_FILTERS_LINK_RESPONSE);
        links.put(NOTIFICATION_TYPE_FILTERS_LINK, NOTIFICATION_TYPE_FILTERS_LINK_RESPONSE);
        links.put(NOTIFICATIONS_LINK, NOTIFICATIONS_LINK_RESPONSE);
        links.put(NOTIFICATIONS_FILTERS_LINK, NOTIFICATIONS_FILTERS_LINK_RESPONSE);
        links.put(POLICY_RULE_ENABLED_FILTERS_LINK, POLICY_RULE_ENABLED_FILTERS_LINK_RESPONSE);
        links.put(POLICY_RULES_LINK, POLICY_RULES_LINK_RESPONSE);
        links.put(POLICY_RULES_FILTERS_LINK, POLICY_RULES_FILTERS_LINK_RESPONSE);
        links.put(PROJECTS_LINK, PROJECTS_LINK_RESPONSE);
        links.put(REGISTRATION_LINK, REGISTRATION_LINK_RESPONSE);
        links.put(RISK_PROFILE_FILTERS_LINK, RISK_PROFILE_FILTERS_LINK_RESPONSE);
        links.put(ROLES_LINK, ROLES_LINK_RESPONSE);
        links.put(SEARCH_COMPONENTS_LINK, SEARCH_COMPONENTS_LINK_RESPONSE);
        links.put(USER_STATUS_FILTERS_LINK, USER_STATUS_FILTERS_LINK_RESPONSE);
        links.put(USERGROUPS_LINK, USERGROUPS_LINK_RESPONSE);
        links.put(USERS_LINK, USERS_LINK_RESPONSE);
        links.put(USERS_FILTERS_LINK, USERS_FILTERS_LINK_RESPONSE);
        links.put(VULNERABILITY_REMEDIATION_REPORTS_LINK, VULNERABILITY_REMEDIATION_REPORTS_LINK_RESPONSE);
        links.put(VULNERABILITY_STATUS_REPORTS_LINK, VULNERABILITY_STATUS_REPORTS_LINK_RESPONSE);
        links.put(VULNERABILITY_UPDATE_REPORTS_LINK, VULNERABILITY_UPDATE_REPORTS_LINK_RESPONSE);
    }

}
