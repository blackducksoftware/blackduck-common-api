package com.blackducksoftware.integration.hub.api.generated.discovery;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.generated.model.ApiTokenView;
import com.blackducksoftware.integration.hub.api.generated.model.ComponentSearchResult;
import com.blackducksoftware.integration.hub.api.generated.model.CurrentVersionView;
import com.blackducksoftware.integration.hub.api.generated.model.EndUserLicenseAgreementView;
import com.blackducksoftware.integration.hub.api.generated.model.FilterView;
import com.blackducksoftware.integration.hub.api.generated.model.HealthCheckStatusView;
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
import com.google.gson.reflect.TypeToken;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ApiDiscovery {
    public static final Map<String, Type> links = new HashMap<>();

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

    static {
        links.put(CODELOCATIONS_LINK, new TypeToken<ArrayList<CodeLocationView>>() {}.getType());
        links.put(COMPONENTS_LINK, new TypeToken<ArrayList<ComponentSearchResultView>>() {}.getType());
        links.put(CURRENT_USER_LINK, UserView.class);
        links.put(CURRENT_USER_TOKENS_LINK, new TypeToken<ArrayList<ApiTokenView>>() {}.getType());
        links.put(CURRENT_VERSION_LINK, CurrentVersionView.class);
        links.put(ENDUSERLICENSEAGREEMENT_LINK, EndUserLicenseAgreementView.class);
        links.put(HEALTH_CHECKS_LIVENESS_LINK, HealthCheckStatusView.class);
        links.put(HEALTH_CHECKS_READINESS_LINK, HealthCheckStatusView.class);
        links.put(LICENSES_LINK, new TypeToken<ArrayList<LicenseView>>() {}.getType());
        links.put(NOTIFICATION_STATE_FILTERS_LINK, FilterView.class);
        links.put(NOTIFICATION_TYPE_FILTERS_LINK, FilterView.class);
        links.put(NOTIFICATIONS_LINK, new TypeToken<ArrayList<NotificationView>>() {}.getType());
        links.put(POLICY_RULE_ENABLED_FILTERS_LINK, FilterView.class);
        links.put(POLICY_RULES_LINK, new TypeToken<ArrayList<PolicyRuleView>>() {}.getType());
        links.put(PROJECTS_LINK, new TypeToken<ArrayList<ProjectView>>() {}.getType());
        links.put(ROLES_LINK, new TypeToken<ArrayList<RoleView>>() {}.getType());
        links.put(SEARCH_COMPONENTS_LINK, new TypeToken<ArrayList<ComponentSearchResult>>() {}.getType());
        links.put(USER_STATUS_FILTERS_LINK, FilterView.class);
        links.put(USERGROUPS_LINK, new TypeToken<ArrayList<UserGroupView>>() {}.getType());
        links.put(USERS_LINK, new TypeToken<ArrayList<UserView>>() {}.getType());
        links.put(VULNERABILITY_REMEDIATION_REPORTS_LINK, new TypeToken<ArrayList<ReportView>>() {}.getType());
        links.put(VULNERABILITY_STATUS_REPORTS_LINK, new TypeToken<ArrayList<ReportView>>() {}.getType());
        links.put(VULNERABILITY_UPDATE_REPORTS_LINK, new TypeToken<ArrayList<ReportView>>() {}.getType());
    }

}
