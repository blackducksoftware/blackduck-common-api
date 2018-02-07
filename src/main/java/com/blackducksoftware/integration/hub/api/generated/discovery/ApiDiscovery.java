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

import com.blackducksoftware.integration.hub.api.core.LinkMultipleResponses;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.core.LinkSingleResponse;
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
import com.blackducksoftware.integration.hub.api.generated.view.PolicyRuleView;
import com.blackducksoftware.integration.hub.api.generated.view.ProjectView;
import com.blackducksoftware.integration.hub.api.generated.view.ReportView;
import com.blackducksoftware.integration.hub.api.generated.view.RoleView;
import com.blackducksoftware.integration.hub.api.generated.view.UserGroupView;
import com.blackducksoftware.integration.hub.api.generated.view.UserView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ApiDiscovery {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String CODELOCATIONS_LINK = "/api/codelocations";
    public static final String COMPONENTS_LINK = "/api/components";
    public static final String CURRENT_USER_LINK = "/api/current-user";
    public static final String CURRENT_USER_TOKENS_LINK = "/api/current-user/tokens";
    public static final String CURRENT_VERSION_LINK = "/api/current-version";
    public static final String ENDUSERLICENSEAGREEMENT_LINK = "/api/enduserlicenseagreement";
    public static final String HEALTH_CHECKS_LIVENESS_LINK = "/api/health-checks/liveness";
    public static final String HEALTH_CHECKS_READINESS_LINK = "/api/health-checks/readiness";
    public static final String LICENSES_LINK = "/api/licenses";
    public static final String NOTIFICATION_STATE_FILTERS_LINK = "/api/notification-state-filters";
    public static final String NOTIFICATION_TYPE_FILTERS_LINK = "/api/notification-type-filters";
    public static final String NOTIFICATIONS_LINK = "/api/notifications";
    public static final String POLICY_RULE_ENABLED_FILTERS_LINK = "/api/policy-rule-enabled-filters";
    public static final String POLICY_RULES_LINK = "/api/policy-rules";
    public static final String PROJECTS_LINK = "/api/projects";
    public static final String ROLES_LINK = "/api/roles";
    public static final String SEARCH_COMPONENTS_LINK = "/api/search/components";
    public static final String USER_STATUS_FILTERS_LINK = "/api/user-status-filters";
    public static final String USERGROUPS_LINK = "/api/usergroups";
    public static final String USERS_LINK = "/api/users";
    public static final String VULNERABILITY_REMEDIATION_REPORTS_LINK = "/api/vulnerability-remediation-reports";
    public static final String VULNERABILITY_STATUS_REPORTS_LINK = "/api/vulnerability-status-reports";
    public static final String VULNERABILITY_UPDATE_REPORTS_LINK = "/api/vulnerability-update-reports";

    public static final LinkMultipleResponses CODELOCATIONS_LINK_RESPONSE = new LinkMultipleResponses(CODELOCATIONS_LINK, CodeLocationView.class);
    public static final LinkMultipleResponses COMPONENTS_LINK_RESPONSE = new LinkMultipleResponses(COMPONENTS_LINK, ComponentSearchResultView.class);
    public static final LinkSingleResponse CURRENT_USER_LINK_RESPONSE = new LinkSingleResponse(CURRENT_USER_LINK, UserView.class);
    public static final LinkMultipleResponses CURRENT_USER_TOKENS_LINK_RESPONSE = new LinkMultipleResponses(CURRENT_USER_TOKENS_LINK, ApiTokenView.class);
    public static final LinkSingleResponse CURRENT_VERSION_LINK_RESPONSE = new LinkSingleResponse(CURRENT_VERSION_LINK, CurrentVersionView.class);
    public static final LinkSingleResponse ENDUSERLICENSEAGREEMENT_LINK_RESPONSE = new LinkSingleResponse(ENDUSERLICENSEAGREEMENT_LINK, EndUserLicenseAgreementView.class);
    public static final LinkSingleResponse HEALTH_CHECKS_LIVENESS_LINK_RESPONSE = new LinkSingleResponse(HEALTH_CHECKS_LIVENESS_LINK, HealthCheckStatusView.class);
    public static final LinkSingleResponse HEALTH_CHECKS_READINESS_LINK_RESPONSE = new LinkSingleResponse(HEALTH_CHECKS_READINESS_LINK, HealthCheckStatusView.class);
    public static final LinkMultipleResponses LICENSES_LINK_RESPONSE = new LinkMultipleResponses(LICENSES_LINK, LicenseView.class);
    public static final LinkSingleResponse NOTIFICATION_STATE_FILTERS_LINK_RESPONSE = new LinkSingleResponse(NOTIFICATION_STATE_FILTERS_LINK, FilterView.class);
    public static final LinkSingleResponse NOTIFICATION_TYPE_FILTERS_LINK_RESPONSE = new LinkSingleResponse(NOTIFICATION_TYPE_FILTERS_LINK, FilterView.class);
    public static final LinkMultipleResponses NOTIFICATIONS_LINK_RESPONSE = new LinkMultipleResponses(NOTIFICATIONS_LINK, NotificationView.class);
    public static final LinkSingleResponse POLICY_RULE_ENABLED_FILTERS_LINK_RESPONSE = new LinkSingleResponse(POLICY_RULE_ENABLED_FILTERS_LINK, FilterView.class);
    public static final LinkMultipleResponses POLICY_RULES_LINK_RESPONSE = new LinkMultipleResponses(POLICY_RULES_LINK, PolicyRuleView.class);
    public static final LinkMultipleResponses PROJECTS_LINK_RESPONSE = new LinkMultipleResponses(PROJECTS_LINK, ProjectView.class);
    public static final LinkMultipleResponses ROLES_LINK_RESPONSE = new LinkMultipleResponses(ROLES_LINK, RoleView.class);
    public static final LinkMultipleResponses SEARCH_COMPONENTS_LINK_RESPONSE = new LinkMultipleResponses(SEARCH_COMPONENTS_LINK, ComponentSearchResult.class);
    public static final LinkSingleResponse USER_STATUS_FILTERS_LINK_RESPONSE = new LinkSingleResponse(USER_STATUS_FILTERS_LINK, FilterView.class);
    public static final LinkMultipleResponses USERGROUPS_LINK_RESPONSE = new LinkMultipleResponses(USERGROUPS_LINK, UserGroupView.class);
    public static final LinkMultipleResponses USERS_LINK_RESPONSE = new LinkMultipleResponses(USERS_LINK, UserView.class);
    public static final LinkMultipleResponses VULNERABILITY_REMEDIATION_REPORTS_LINK_RESPONSE = new LinkMultipleResponses(VULNERABILITY_REMEDIATION_REPORTS_LINK, ReportView.class);
    public static final LinkMultipleResponses VULNERABILITY_STATUS_REPORTS_LINK_RESPONSE = new LinkMultipleResponses(VULNERABILITY_STATUS_REPORTS_LINK, ReportView.class);
    public static final LinkMultipleResponses VULNERABILITY_UPDATE_REPORTS_LINK_RESPONSE = new LinkMultipleResponses(VULNERABILITY_UPDATE_REPORTS_LINK, ReportView.class);

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
