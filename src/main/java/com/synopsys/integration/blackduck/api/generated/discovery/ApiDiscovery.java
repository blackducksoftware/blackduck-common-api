/**
 * blackduck-common-api
 *
 * Copyright (C) 2019 Black Duck Software, Inc.
 * http://www.blackducksoftware.com/
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
    public static final BlackDuckPath PROJECTS_LINK = new BlackDuckPath("/api/projects");
    public static final BlackDuckPath REGISTRATION_LINK = new BlackDuckPath("/api/registration");
    public static final BlackDuckPath RISK_PROFILE_FILTERS_LINK = new BlackDuckPath("/api/risk-profile-filters");
    public static final BlackDuckPath ROLES_LINK = new BlackDuckPath("/api/roles");
    public static final BlackDuckPath SEARCH_COMPONENTS_LINK = new BlackDuckPath("/api/search/components");
    public static final BlackDuckPath USER_STATUS_FILTERS_LINK = new BlackDuckPath("/api/user-status-filters");
    public static final BlackDuckPath USERGROUPS_LINK = new BlackDuckPath("/api/usergroups");
    public static final BlackDuckPath USERS_LINK = new BlackDuckPath("/api/users");
    public static final BlackDuckPath VULNERABILITY_REMEDIATION_REPORTS_LINK = new BlackDuckPath("/api/vulnerability-remediation-reports");
    public static final BlackDuckPath VULNERABILITY_STATUS_REPORTS_LINK = new BlackDuckPath("/api/vulnerability-status-reports");
    public static final BlackDuckPath VULNERABILITY_UPDATE_REPORTS_LINK = new BlackDuckPath("/api/vulnerability-update-reports");

    public static final BlackDuckPathMultipleResponses<CodeLocationView> CODELOCATIONS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<>(ApiDiscovery.CODELOCATIONS_LINK, CodeLocationView.class);
    public static final BlackDuckPathMultipleResponses<ComponentSearchResultView> COMPONENTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<>(ApiDiscovery.COMPONENTS_LINK, ComponentSearchResultView.class);
    public static final BlackDuckPathSingleResponse<FilterView> COMPONENTS_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<>(ApiDiscovery.COMPONENTS_FILTERS_LINK, FilterView.class);
    public static final BlackDuckPathSingleResponse<UserView> CURRENT_USER_LINK_RESPONSE = new BlackDuckPathSingleResponse<>(ApiDiscovery.CURRENT_USER_LINK, UserView.class);
    public static final BlackDuckPathSingleResponse<CurrentVersionView> CURRENT_VERSION_LINK_RESPONSE = new BlackDuckPathSingleResponse<>(ApiDiscovery.CURRENT_VERSION_LINK, CurrentVersionView.class);
    public static final BlackDuckPathMultipleResponses<CustomFieldObjectView> CUSTOM_FIELDS_OBJECTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<>(ApiDiscovery.CUSTOM_FIELDS_OBJECTS_LINK, CustomFieldObjectView.class);
    public static final BlackDuckPathMultipleResponses<CustomFieldTypeView> CUSTOM_FIELDS_TYPES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<>(ApiDiscovery.CUSTOM_FIELDS_TYPES_LINK, CustomFieldTypeView.class);
    public static final BlackDuckPathSingleResponse<DashboardSummaryView> DASHBOARD_SUMMARY_LINK_RESPONSE = new BlackDuckPathSingleResponse<>(ApiDiscovery.DASHBOARD_SUMMARY_LINK, DashboardSummaryView.class);
    public static final BlackDuckPathSingleResponse<EndUserLicenseAgreementView> ENDUSERLICENSEAGREEMENT_LINK_RESPONSE = new BlackDuckPathSingleResponse<>(ApiDiscovery.ENDUSERLICENSEAGREEMENT_LINK, EndUserLicenseAgreementView.class);
    public static final BlackDuckPathSingleResponse<HealthCheckStatusView> HEALTH_CHECKS_LIVENESS_LINK_RESPONSE = new BlackDuckPathSingleResponse<>(ApiDiscovery.HEALTH_CHECKS_LIVENESS_LINK, HealthCheckStatusView.class);
    public static final BlackDuckPathSingleResponse<HealthCheckStatusView> HEALTH_CHECKS_READINESS_LINK_RESPONSE = new BlackDuckPathSingleResponse<>(ApiDiscovery.HEALTH_CHECKS_READINESS_LINK, HealthCheckStatusView.class);
    public static final BlackDuckPathMultipleResponses<JobStatisticsView> JOB_STATISTICS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<>(ApiDiscovery.JOB_STATISTICS_LINK, JobStatisticsView.class);
    public static final BlackDuckPathMultipleResponses<LicenseFamilyView> LICENSE_FAMILIES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<>(ApiDiscovery.LICENSE_FAMILIES_LINK, LicenseFamilyView.class);
    public static final BlackDuckPathSingleResponse<FilterView> LICENSE_FAMILIES_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<>(ApiDiscovery.LICENSE_FAMILIES_FILTERS_LINK, FilterView.class);
    public static final BlackDuckPathMultipleResponses<LicenseView> LICENSES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<>(ApiDiscovery.LICENSES_LINK, LicenseView.class);
    public static final BlackDuckPathSingleResponse<FilterView> LICENSES_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<>(ApiDiscovery.LICENSES_FILTERS_LINK, FilterView.class);
    public static final BlackDuckPathSingleResponse<FilterView> NOTIFICATION_STATE_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<>(ApiDiscovery.NOTIFICATION_STATE_FILTERS_LINK, FilterView.class);
    public static final BlackDuckPathSingleResponse<FilterView> NOTIFICATION_TYPE_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<>(ApiDiscovery.NOTIFICATION_TYPE_FILTERS_LINK, FilterView.class);
    public static final BlackDuckPathMultipleResponses<NotificationView> NOTIFICATIONS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<>(ApiDiscovery.NOTIFICATIONS_LINK, NotificationView.class);
    public static final BlackDuckPathSingleResponse<FilterView> NOTIFICATIONS_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<>(ApiDiscovery.NOTIFICATIONS_FILTERS_LINK, FilterView.class);
    public static final BlackDuckPathSingleResponse<LegacyFilterView> POLICY_RULE_ENABLED_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<>(ApiDiscovery.POLICY_RULE_ENABLED_FILTERS_LINK, LegacyFilterView.class);
    public static final BlackDuckPathMultipleResponses<PolicyRuleView> POLICY_RULES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<>(ApiDiscovery.POLICY_RULES_LINK, PolicyRuleView.class);
    public static final BlackDuckPathMultipleResponses<ProjectView> PROJECTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<>(ApiDiscovery.PROJECTS_LINK, ProjectView.class);
    public static final BlackDuckPathSingleResponse<RegistrationView> REGISTRATION_LINK_RESPONSE = new BlackDuckPathSingleResponse<>(ApiDiscovery.REGISTRATION_LINK, RegistrationView.class);
    public static final BlackDuckPathSingleResponse<FilterView> RISK_PROFILE_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<>(ApiDiscovery.RISK_PROFILE_FILTERS_LINK, FilterView.class);
    public static final BlackDuckPathMultipleResponses<RoleView> ROLES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<>(ApiDiscovery.ROLES_LINK, RoleView.class);
    public static final BlackDuckPathMultipleResponses<ComponentSearchResult> SEARCH_COMPONENTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<>(ApiDiscovery.SEARCH_COMPONENTS_LINK, ComponentSearchResult.class);
    public static final BlackDuckPathSingleResponse<LegacyFilterView> USER_STATUS_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<>(ApiDiscovery.USER_STATUS_FILTERS_LINK, LegacyFilterView.class);
    public static final BlackDuckPathMultipleResponses<UserGroupView> USERGROUPS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<>(ApiDiscovery.USERGROUPS_LINK, UserGroupView.class);
    public static final BlackDuckPathMultipleResponses<UserView> USERS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<>(ApiDiscovery.USERS_LINK, UserView.class);
    public static final BlackDuckPathMultipleResponses<ReportView> VULNERABILITY_REMEDIATION_REPORTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<>(ApiDiscovery.VULNERABILITY_REMEDIATION_REPORTS_LINK, ReportView.class);
    public static final BlackDuckPathMultipleResponses<ReportView> VULNERABILITY_STATUS_REPORTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<>(ApiDiscovery.VULNERABILITY_STATUS_REPORTS_LINK, ReportView.class);
    public static final BlackDuckPathMultipleResponses<ReportView> VULNERABILITY_UPDATE_REPORTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<>(ApiDiscovery.VULNERABILITY_UPDATE_REPORTS_LINK, ReportView.class);

    static {
        ApiDiscovery.links.put(ApiDiscovery.CODELOCATIONS_LINK, ApiDiscovery.CODELOCATIONS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.COMPONENTS_LINK, ApiDiscovery.COMPONENTS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.COMPONENTS_FILTERS_LINK, ApiDiscovery.COMPONENTS_FILTERS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.CURRENT_USER_LINK, ApiDiscovery.CURRENT_USER_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.CURRENT_VERSION_LINK, ApiDiscovery.CURRENT_VERSION_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.CUSTOM_FIELDS_OBJECTS_LINK, ApiDiscovery.CUSTOM_FIELDS_OBJECTS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.CUSTOM_FIELDS_TYPES_LINK, ApiDiscovery.CUSTOM_FIELDS_TYPES_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.DASHBOARD_SUMMARY_LINK, ApiDiscovery.DASHBOARD_SUMMARY_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.ENDUSERLICENSEAGREEMENT_LINK, ApiDiscovery.ENDUSERLICENSEAGREEMENT_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.HEALTH_CHECKS_LIVENESS_LINK, ApiDiscovery.HEALTH_CHECKS_LIVENESS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.HEALTH_CHECKS_READINESS_LINK, ApiDiscovery.HEALTH_CHECKS_READINESS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.JOB_STATISTICS_LINK, ApiDiscovery.JOB_STATISTICS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.LICENSE_FAMILIES_LINK, ApiDiscovery.LICENSE_FAMILIES_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.LICENSE_FAMILIES_FILTERS_LINK, ApiDiscovery.LICENSE_FAMILIES_FILTERS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.LICENSES_LINK, ApiDiscovery.LICENSES_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.LICENSES_FILTERS_LINK, ApiDiscovery.LICENSES_FILTERS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.NOTIFICATION_STATE_FILTERS_LINK, ApiDiscovery.NOTIFICATION_STATE_FILTERS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.NOTIFICATION_TYPE_FILTERS_LINK, ApiDiscovery.NOTIFICATION_TYPE_FILTERS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.NOTIFICATIONS_LINK, ApiDiscovery.NOTIFICATIONS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.NOTIFICATIONS_FILTERS_LINK, ApiDiscovery.NOTIFICATIONS_FILTERS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.POLICY_RULE_ENABLED_FILTERS_LINK, ApiDiscovery.POLICY_RULE_ENABLED_FILTERS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.POLICY_RULES_LINK, ApiDiscovery.POLICY_RULES_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.PROJECTS_LINK, ApiDiscovery.PROJECTS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.REGISTRATION_LINK, ApiDiscovery.REGISTRATION_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.RISK_PROFILE_FILTERS_LINK, ApiDiscovery.RISK_PROFILE_FILTERS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.ROLES_LINK, ApiDiscovery.ROLES_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.SEARCH_COMPONENTS_LINK, ApiDiscovery.SEARCH_COMPONENTS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.USER_STATUS_FILTERS_LINK, ApiDiscovery.USER_STATUS_FILTERS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.USERGROUPS_LINK, ApiDiscovery.USERGROUPS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.USERS_LINK, ApiDiscovery.USERS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.VULNERABILITY_REMEDIATION_REPORTS_LINK, ApiDiscovery.VULNERABILITY_REMEDIATION_REPORTS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.VULNERABILITY_STATUS_REPORTS_LINK, ApiDiscovery.VULNERABILITY_STATUS_REPORTS_LINK_RESPONSE);
        ApiDiscovery.links.put(ApiDiscovery.VULNERABILITY_UPDATE_REPORTS_LINK, ApiDiscovery.VULNERABILITY_UPDATE_REPORTS_LINK_RESPONSE);
    }

}
