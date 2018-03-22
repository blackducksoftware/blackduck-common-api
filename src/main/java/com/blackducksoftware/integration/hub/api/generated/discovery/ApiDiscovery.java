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
package com.blackducksoftware.integration.hub.api.generated.discovery;

import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubPath;
import com.blackducksoftware.integration.hub.api.core.HubPathMultipleResponses;
import com.blackducksoftware.integration.hub.api.core.HubPathSingleResponse;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.generated.response.ApiTokenView;
import com.blackducksoftware.integration.hub.api.generated.response.ComponentSearchResult;
import com.blackducksoftware.integration.hub.api.generated.response.CurrentVersionView;
import com.blackducksoftware.integration.hub.api.generated.response.EndUserLicenseAgreementView;
import com.blackducksoftware.integration.hub.api.generated.response.FilterView;
import com.blackducksoftware.integration.hub.api.generated.response.HealthCheckStatusView;
import com.blackducksoftware.integration.hub.api.generated.view.CodeLocationView;
import com.blackducksoftware.integration.hub.api.generated.view.ComponentSearchResultView;
import com.blackducksoftware.integration.hub.api.generated.view.LicenseView;
import com.blackducksoftware.integration.hub.api.generated.view.NotificationView;
import com.blackducksoftware.integration.hub.api.generated.view.PolicyRuleViewV2;
import com.blackducksoftware.integration.hub.api.generated.view.ProjectView;
import com.blackducksoftware.integration.hub.api.generated.view.ReportView;
import com.blackducksoftware.integration.hub.api.generated.view.RoleView;
import com.blackducksoftware.integration.hub.api.generated.view.UserGroupView;
import com.blackducksoftware.integration.hub.api.generated.view.UserView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ApiDiscovery {
    public static final Map<HubPath, LinkResponse> links = new HashMap<>();

    public static final HubPath CODELOCATIONS_LINK = new HubPath("/api/codelocations");
    public static final HubPath COMPONENTS_LINK = new HubPath("/api/components");
    public static final HubPath CURRENT_USER_LINK = new HubPath("/api/current-user");
    public static final HubPath CURRENT_USER_TOKENS_LINK = new HubPath("/api/current-user/tokens");
    public static final HubPath CURRENT_VERSION_LINK = new HubPath("/api/current-version");
    public static final HubPath ENDUSERLICENSEAGREEMENT_LINK = new HubPath("/api/enduserlicenseagreement");
    public static final HubPath HEALTH_CHECKS_LIVENESS_LINK = new HubPath("/api/health-checks/liveness");
    public static final HubPath HEALTH_CHECKS_READINESS_LINK = new HubPath("/api/health-checks/readiness");
    public static final HubPath LICENSES_LINK = new HubPath("/api/licenses");
    public static final HubPath NOTIFICATION_STATE_FILTERS_LINK = new HubPath("/api/notification-state-filters");
    public static final HubPath NOTIFICATION_TYPE_FILTERS_LINK = new HubPath("/api/notification-type-filters");
    public static final HubPath NOTIFICATIONS_LINK = new HubPath("/api/notifications");
    public static final HubPath POLICY_RULE_ENABLED_FILTERS_LINK = new HubPath("/api/policy-rule-enabled-filters");
    public static final HubPath POLICY_RULES_LINK = new HubPath("/api/policy-rules");
    public static final HubPath PROJECTS_LINK = new HubPath("/api/projects");
    public static final HubPath ROLES_LINK = new HubPath("/api/roles");
    public static final HubPath SEARCH_COMPONENTS_LINK = new HubPath("/api/search/components");
    public static final HubPath USER_STATUS_FILTERS_LINK = new HubPath("/api/user-status-filters");
    public static final HubPath USERGROUPS_LINK = new HubPath("/api/usergroups");
    public static final HubPath USERS_LINK = new HubPath("/api/users");
    public static final HubPath VULNERABILITY_REMEDIATION_REPORTS_LINK = new HubPath("/api/vulnerability-remediation-reports");
    public static final HubPath VULNERABILITY_STATUS_REPORTS_LINK = new HubPath("/api/vulnerability-status-reports");
    public static final HubPath VULNERABILITY_UPDATE_REPORTS_LINK = new HubPath("/api/vulnerability-update-reports");

    public static final HubPathMultipleResponses<CodeLocationView> CODELOCATIONS_LINK_RESPONSE = new HubPathMultipleResponses<CodeLocationView>(CODELOCATIONS_LINK, CodeLocationView.class);
    public static final HubPathMultipleResponses<ComponentSearchResultView> COMPONENTS_LINK_RESPONSE = new HubPathMultipleResponses<ComponentSearchResultView>(COMPONENTS_LINK, ComponentSearchResultView.class);
    public static final HubPathSingleResponse<UserView> CURRENT_USER_LINK_RESPONSE = new HubPathSingleResponse<UserView>(CURRENT_USER_LINK, UserView.class);
    public static final HubPathMultipleResponses<ApiTokenView> CURRENT_USER_TOKENS_LINK_RESPONSE = new HubPathMultipleResponses<ApiTokenView>(CURRENT_USER_TOKENS_LINK, ApiTokenView.class);
    public static final HubPathSingleResponse<CurrentVersionView> CURRENT_VERSION_LINK_RESPONSE = new HubPathSingleResponse<CurrentVersionView>(CURRENT_VERSION_LINK, CurrentVersionView.class);
    public static final HubPathSingleResponse<EndUserLicenseAgreementView> ENDUSERLICENSEAGREEMENT_LINK_RESPONSE = new HubPathSingleResponse<EndUserLicenseAgreementView>(ENDUSERLICENSEAGREEMENT_LINK, EndUserLicenseAgreementView.class);
    public static final HubPathSingleResponse<HealthCheckStatusView> HEALTH_CHECKS_LIVENESS_LINK_RESPONSE = new HubPathSingleResponse<HealthCheckStatusView>(HEALTH_CHECKS_LIVENESS_LINK, HealthCheckStatusView.class);
    public static final HubPathSingleResponse<HealthCheckStatusView> HEALTH_CHECKS_READINESS_LINK_RESPONSE = new HubPathSingleResponse<HealthCheckStatusView>(HEALTH_CHECKS_READINESS_LINK, HealthCheckStatusView.class);
    public static final HubPathMultipleResponses<LicenseView> LICENSES_LINK_RESPONSE = new HubPathMultipleResponses<LicenseView>(LICENSES_LINK, LicenseView.class);
    public static final HubPathSingleResponse<FilterView> NOTIFICATION_STATE_FILTERS_LINK_RESPONSE = new HubPathSingleResponse<FilterView>(NOTIFICATION_STATE_FILTERS_LINK, FilterView.class);
    public static final HubPathSingleResponse<FilterView> NOTIFICATION_TYPE_FILTERS_LINK_RESPONSE = new HubPathSingleResponse<FilterView>(NOTIFICATION_TYPE_FILTERS_LINK, FilterView.class);
    public static final HubPathMultipleResponses<NotificationView> NOTIFICATIONS_LINK_RESPONSE = new HubPathMultipleResponses<NotificationView>(NOTIFICATIONS_LINK, NotificationView.class);
    public static final HubPathSingleResponse<FilterView> POLICY_RULE_ENABLED_FILTERS_LINK_RESPONSE = new HubPathSingleResponse<FilterView>(POLICY_RULE_ENABLED_FILTERS_LINK, FilterView.class);
    public static final HubPathMultipleResponses<PolicyRuleViewV2> POLICY_RULES_LINK_RESPONSE = new HubPathMultipleResponses<PolicyRuleViewV2>(POLICY_RULES_LINK, PolicyRuleViewV2.class);
    public static final HubPathMultipleResponses<ProjectView> PROJECTS_LINK_RESPONSE = new HubPathMultipleResponses<ProjectView>(PROJECTS_LINK, ProjectView.class);
    public static final HubPathMultipleResponses<RoleView> ROLES_LINK_RESPONSE = new HubPathMultipleResponses<RoleView>(ROLES_LINK, RoleView.class);
    public static final HubPathMultipleResponses<ComponentSearchResult> SEARCH_COMPONENTS_LINK_RESPONSE = new HubPathMultipleResponses<ComponentSearchResult>(SEARCH_COMPONENTS_LINK, ComponentSearchResult.class);
    public static final HubPathSingleResponse<FilterView> USER_STATUS_FILTERS_LINK_RESPONSE = new HubPathSingleResponse<FilterView>(USER_STATUS_FILTERS_LINK, FilterView.class);
    public static final HubPathMultipleResponses<UserGroupView> USERGROUPS_LINK_RESPONSE = new HubPathMultipleResponses<UserGroupView>(USERGROUPS_LINK, UserGroupView.class);
    public static final HubPathMultipleResponses<UserView> USERS_LINK_RESPONSE = new HubPathMultipleResponses<UserView>(USERS_LINK, UserView.class);
    public static final HubPathMultipleResponses<ReportView> VULNERABILITY_REMEDIATION_REPORTS_LINK_RESPONSE = new HubPathMultipleResponses<ReportView>(VULNERABILITY_REMEDIATION_REPORTS_LINK, ReportView.class);
    public static final HubPathMultipleResponses<ReportView> VULNERABILITY_STATUS_REPORTS_LINK_RESPONSE = new HubPathMultipleResponses<ReportView>(VULNERABILITY_STATUS_REPORTS_LINK, ReportView.class);
    public static final HubPathMultipleResponses<ReportView> VULNERABILITY_UPDATE_REPORTS_LINK_RESPONSE = new HubPathMultipleResponses<ReportView>(VULNERABILITY_UPDATE_REPORTS_LINK, ReportView.class);

    static {
        links.put(CODELOCATIONS_LINK, CODELOCATIONS_LINK_RESPONSE);
        links.put(COMPONENTS_LINK, COMPONENTS_LINK_RESPONSE);
        links.put(CURRENT_USER_LINK, CURRENT_USER_LINK_RESPONSE);
        links.put(CURRENT_USER_TOKENS_LINK, CURRENT_USER_TOKENS_LINK_RESPONSE);
        links.put(CURRENT_VERSION_LINK, CURRENT_VERSION_LINK_RESPONSE);
        links.put(ENDUSERLICENSEAGREEMENT_LINK, ENDUSERLICENSEAGREEMENT_LINK_RESPONSE);
        links.put(HEALTH_CHECKS_LIVENESS_LINK, HEALTH_CHECKS_LIVENESS_LINK_RESPONSE);
        links.put(HEALTH_CHECKS_READINESS_LINK, HEALTH_CHECKS_READINESS_LINK_RESPONSE);
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
