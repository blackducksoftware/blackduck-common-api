/**
 * hub-common-api
 *
 * Copyright (C) 2018 Black Duck Software, Inc.
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
import com.synopsys.integration.blackduck.api.generated.response.DashboardSummaryView;
import com.synopsys.integration.blackduck.api.generated.response.EndUserLicenseAgreementView;
import com.synopsys.integration.blackduck.api.generated.response.HealthCheckStatusView;
import com.synopsys.integration.blackduck.api.generated.response.LegacyFilterView;
import com.synopsys.integration.blackduck.api.generated.view.CodeLocationView;
import com.synopsys.integration.blackduck.api.generated.view.ComponentSearchResultView;
import com.synopsys.integration.blackduck.api.generated.view.LicenseView;
import com.synopsys.integration.blackduck.api.generated.view.NotificationView;
import com.synopsys.integration.blackduck.api.generated.view.PolicyRuleViewV2;
import com.synopsys.integration.blackduck.api.generated.view.ProjectView;
import com.synopsys.integration.blackduck.api.generated.view.ReportView;
import com.synopsys.integration.blackduck.api.generated.view.RoleView;
import com.synopsys.integration.blackduck.api.generated.view.UserGroupView;
import com.synopsys.integration.blackduck.api.generated.view.UserView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ApiDiscovery {
    public static final Map<BlackDuckPath, LinkResponse> links = new HashMap<>();

    public static final BlackDuckPath CODELOCATIONS_LINK = new BlackDuckPath("/api/codelocations");
    public static final BlackDuckPath COMPONENT_APPROVAL_STATUS_FILTERS_LINK = new BlackDuckPath("/api/component-approval-status-filters");
    public static final BlackDuckPath COMPONENT_SOURCE_FILTERS_LINK = new BlackDuckPath("/api/component-source-filters");
    public static final BlackDuckPath COMPONENT_VERSION_APPROVAL_STATUS_FILTERS_LINK = new BlackDuckPath("/api/component-version-approval-status-filters");
    public static final BlackDuckPath COMPONENTS_LINK = new BlackDuckPath("/api/components");
    public static final BlackDuckPath CURRENT_USER_LINK = new BlackDuckPath("/api/current-user");
    public static final BlackDuckPath CURRENT_VERSION_LINK = new BlackDuckPath("/api/current-version");
    public static final BlackDuckPath DASHBOARD_SUMMARY_LINK = new BlackDuckPath("/api/dashboard-summary");
    public static final BlackDuckPath ENDUSERLICENSEAGREEMENT_LINK = new BlackDuckPath("/api/enduserlicenseagreement");
    public static final BlackDuckPath HEALTH_CHECKS_LIVENESS_LINK = new BlackDuckPath("/api/health-checks/liveness");
    public static final BlackDuckPath HEALTH_CHECKS_READINESS_LINK = new BlackDuckPath("/api/health-checks/readiness");
    public static final BlackDuckPath LICENSE_STATUS_FILTERS_LINK = new BlackDuckPath("/api/license-status-filters");
    public static final BlackDuckPath LICENSES_LINK = new BlackDuckPath("/api/licenses");
    public static final BlackDuckPath NOTIFICATION_STATE_FILTERS_LINK = new BlackDuckPath("/api/notification-state-filters");
    public static final BlackDuckPath NOTIFICATION_TYPE_FILTERS_LINK = new BlackDuckPath("/api/notification-type-filters");
    public static final BlackDuckPath NOTIFICATIONS_LINK = new BlackDuckPath("/api/notifications");
    public static final BlackDuckPath POLICY_RULE_ENABLED_FILTERS_LINK = new BlackDuckPath("/api/policy-rule-enabled-filters");
    public static final BlackDuckPath POLICY_RULES_LINK = new BlackDuckPath("/api/policy-rules");
    public static final BlackDuckPath PROJECTS_LINK = new BlackDuckPath("/api/projects");
    public static final BlackDuckPath ROLES_LINK = new BlackDuckPath("/api/roles");
    public static final BlackDuckPath SEARCH_COMPONENTS_LINK = new BlackDuckPath("/api/search/components");
    public static final BlackDuckPath USER_STATUS_FILTERS_LINK = new BlackDuckPath("/api/user-status-filters");
    public static final BlackDuckPath USERGROUPS_LINK = new BlackDuckPath("/api/usergroups");
    public static final BlackDuckPath USERS_LINK = new BlackDuckPath("/api/users");
    public static final BlackDuckPath VULNERABILITY_REMEDIATION_REPORTS_LINK = new BlackDuckPath("/api/vulnerability-remediation-reports");
    public static final BlackDuckPath VULNERABILITY_STATUS_REPORTS_LINK = new BlackDuckPath("/api/vulnerability-status-reports");
    public static final BlackDuckPath VULNERABILITY_UPDATE_REPORTS_LINK = new BlackDuckPath("/api/vulnerability-update-reports");

    public static final BlackDuckPathMultipleResponses<CodeLocationView> CODELOCATIONS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<CodeLocationView>(CODELOCATIONS_LINK, CodeLocationView.class);
    public static final BlackDuckPathSingleResponse<LegacyFilterView> COMPONENT_APPROVAL_STATUS_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<LegacyFilterView>(COMPONENT_APPROVAL_STATUS_FILTERS_LINK, LegacyFilterView.class);
    public static final BlackDuckPathSingleResponse<LegacyFilterView> COMPONENT_SOURCE_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<LegacyFilterView>(COMPONENT_SOURCE_FILTERS_LINK, LegacyFilterView.class);
    public static final BlackDuckPathSingleResponse<LegacyFilterView> COMPONENT_VERSION_APPROVAL_STATUS_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<LegacyFilterView>(COMPONENT_VERSION_APPROVAL_STATUS_FILTERS_LINK, LegacyFilterView.class);
    public static final BlackDuckPathMultipleResponses<ComponentSearchResultView> COMPONENTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<ComponentSearchResultView>(COMPONENTS_LINK, ComponentSearchResultView.class);
    public static final BlackDuckPathSingleResponse<UserView> CURRENT_USER_LINK_RESPONSE = new BlackDuckPathSingleResponse<UserView>(CURRENT_USER_LINK, UserView.class);
    public static final BlackDuckPathSingleResponse<CurrentVersionView> CURRENT_VERSION_LINK_RESPONSE = new BlackDuckPathSingleResponse<CurrentVersionView>(CURRENT_VERSION_LINK, CurrentVersionView.class);
    public static final BlackDuckPathSingleResponse<DashboardSummaryView> DASHBOARD_SUMMARY_LINK_RESPONSE = new BlackDuckPathSingleResponse<DashboardSummaryView>(DASHBOARD_SUMMARY_LINK, DashboardSummaryView.class);
    public static final BlackDuckPathSingleResponse<EndUserLicenseAgreementView> ENDUSERLICENSEAGREEMENT_LINK_RESPONSE = new BlackDuckPathSingleResponse<EndUserLicenseAgreementView>(ENDUSERLICENSEAGREEMENT_LINK, EndUserLicenseAgreementView.class);
    public static final BlackDuckPathSingleResponse<HealthCheckStatusView> HEALTH_CHECKS_LIVENESS_LINK_RESPONSE = new BlackDuckPathSingleResponse<HealthCheckStatusView>(HEALTH_CHECKS_LIVENESS_LINK, HealthCheckStatusView.class);
    public static final BlackDuckPathSingleResponse<HealthCheckStatusView> HEALTH_CHECKS_READINESS_LINK_RESPONSE = new BlackDuckPathSingleResponse<HealthCheckStatusView>(HEALTH_CHECKS_READINESS_LINK, HealthCheckStatusView.class);
    public static final BlackDuckPathSingleResponse<LegacyFilterView> LICENSE_STATUS_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<LegacyFilterView>(LICENSE_STATUS_FILTERS_LINK, LegacyFilterView.class);
    public static final BlackDuckPathMultipleResponses<LicenseView> LICENSES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<LicenseView>(LICENSES_LINK, LicenseView.class);
    public static final BlackDuckPathSingleResponse<LegacyFilterView> NOTIFICATION_STATE_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<LegacyFilterView>(NOTIFICATION_STATE_FILTERS_LINK, LegacyFilterView.class);
    public static final BlackDuckPathSingleResponse<LegacyFilterView> NOTIFICATION_TYPE_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<LegacyFilterView>(NOTIFICATION_TYPE_FILTERS_LINK, LegacyFilterView.class);
    public static final BlackDuckPathMultipleResponses<NotificationView> NOTIFICATIONS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<NotificationView>(NOTIFICATIONS_LINK, NotificationView.class);
    public static final BlackDuckPathSingleResponse<LegacyFilterView> POLICY_RULE_ENABLED_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<LegacyFilterView>(POLICY_RULE_ENABLED_FILTERS_LINK, LegacyFilterView.class);
    public static final BlackDuckPathMultipleResponses<PolicyRuleViewV2> POLICY_RULES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<PolicyRuleViewV2>(POLICY_RULES_LINK, PolicyRuleViewV2.class);
    public static final BlackDuckPathMultipleResponses<ProjectView> PROJECTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<ProjectView>(PROJECTS_LINK, ProjectView.class);
    public static final BlackDuckPathMultipleResponses<RoleView> ROLES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<RoleView>(ROLES_LINK, RoleView.class);
    public static final BlackDuckPathMultipleResponses<ComponentSearchResult> SEARCH_COMPONENTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<ComponentSearchResult>(SEARCH_COMPONENTS_LINK, ComponentSearchResult.class);
    public static final BlackDuckPathSingleResponse<LegacyFilterView> USER_STATUS_FILTERS_LINK_RESPONSE = new BlackDuckPathSingleResponse<LegacyFilterView>(USER_STATUS_FILTERS_LINK, LegacyFilterView.class);
    public static final BlackDuckPathMultipleResponses<UserGroupView> USERGROUPS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<UserGroupView>(USERGROUPS_LINK, UserGroupView.class);
    public static final BlackDuckPathMultipleResponses<UserView> USERS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<UserView>(USERS_LINK, UserView.class);
    public static final BlackDuckPathMultipleResponses<ReportView> VULNERABILITY_REMEDIATION_REPORTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<ReportView>(VULNERABILITY_REMEDIATION_REPORTS_LINK, ReportView.class);
    public static final BlackDuckPathMultipleResponses<ReportView> VULNERABILITY_STATUS_REPORTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<ReportView>(VULNERABILITY_STATUS_REPORTS_LINK, ReportView.class);
    public static final BlackDuckPathMultipleResponses<ReportView> VULNERABILITY_UPDATE_REPORTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<ReportView>(VULNERABILITY_UPDATE_REPORTS_LINK, ReportView.class);

    static {
        links.put(CODELOCATIONS_LINK, CODELOCATIONS_LINK_RESPONSE);
        links.put(COMPONENT_APPROVAL_STATUS_FILTERS_LINK, COMPONENT_APPROVAL_STATUS_FILTERS_LINK_RESPONSE);
        links.put(COMPONENT_SOURCE_FILTERS_LINK, COMPONENT_SOURCE_FILTERS_LINK_RESPONSE);
        links.put(COMPONENT_VERSION_APPROVAL_STATUS_FILTERS_LINK, COMPONENT_VERSION_APPROVAL_STATUS_FILTERS_LINK_RESPONSE);
        links.put(COMPONENTS_LINK, COMPONENTS_LINK_RESPONSE);
        links.put(CURRENT_USER_LINK, CURRENT_USER_LINK_RESPONSE);
        links.put(CURRENT_VERSION_LINK, CURRENT_VERSION_LINK_RESPONSE);
        links.put(DASHBOARD_SUMMARY_LINK, DASHBOARD_SUMMARY_LINK_RESPONSE);
        links.put(ENDUSERLICENSEAGREEMENT_LINK, ENDUSERLICENSEAGREEMENT_LINK_RESPONSE);
        links.put(HEALTH_CHECKS_LIVENESS_LINK, HEALTH_CHECKS_LIVENESS_LINK_RESPONSE);
        links.put(HEALTH_CHECKS_READINESS_LINK, HEALTH_CHECKS_READINESS_LINK_RESPONSE);
        links.put(LICENSE_STATUS_FILTERS_LINK, LICENSE_STATUS_FILTERS_LINK_RESPONSE);
        links.put(LICENSES_LINK, LICENSES_LINK_RESPONSE);
        links.put(NOTIFICATION_STATE_FILTERS_LINK, NOTIFICATION_STATE_FILTERS_LINK_RESPONSE);
        links.put(NOTIFICATION_TYPE_FILTERS_LINK, NOTIFICATION_TYPE_FILTERS_LINK_RESPONSE);
        links.put(NOTIFICATIONS_LINK, NOTIFICATIONS_LINK_RESPONSE);
        links.put(POLICY_RULE_ENABLED_FILTERS_LINK, POLICY_RULE_ENABLED_FILTERS_LINK_RESPONSE);
        links.put(POLICY_RULES_LINK, POLICY_RULES_LINK_RESPONSE);
        links.put(PROJECTS_LINK, PROJECTS_LINK_RESPONSE);
        links.put(ROLES_LINK, ROLES_LINK_RESPONSE);
        links.put(SEARCH_COMPONENTS_LINK, SEARCH_COMPONENTS_LINK_RESPONSE);
        links.put(USER_STATUS_FILTERS_LINK, USER_STATUS_FILTERS_LINK_RESPONSE);
        links.put(USERGROUPS_LINK, USERGROUPS_LINK_RESPONSE);
        links.put(USERS_LINK, USERS_LINK_RESPONSE);
        links.put(VULNERABILITY_REMEDIATION_REPORTS_LINK, VULNERABILITY_REMEDIATION_REPORTS_LINK_RESPONSE);
        links.put(VULNERABILITY_STATUS_REPORTS_LINK, VULNERABILITY_STATUS_REPORTS_LINK_RESPONSE);
        links.put(VULNERABILITY_UPDATE_REPORTS_LINK, VULNERABILITY_UPDATE_REPORTS_LINK_RESPONSE);
    }

}
