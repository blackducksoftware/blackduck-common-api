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
    import com.synopsys.integration.blackduck.api.generated.response.ComponentSearchResultView;
    import com.synopsys.integration.blackduck.api.generated.response.CweView;
    import com.synopsys.integration.blackduck.api.generated.view.CodeLocationView;
    import com.synopsys.integration.blackduck.api.generated.view.CustomFieldObjectView;
    import com.synopsys.integration.blackduck.api.generated.view.JobView;
    import com.synopsys.integration.blackduck.api.generated.view.LicenseReportsReportView;
    import com.synopsys.integration.blackduck.api.generated.view.LicenseView;
    import com.synopsys.integration.blackduck.api.generated.view.PolicyRuleView;
    import com.synopsys.integration.blackduck.api.generated.view.ProjectView;
    import com.synopsys.integration.blackduck.api.generated.view.RegistrationView;
    import com.synopsys.integration.blackduck.api.generated.view.ReportContentsView;
    import com.synopsys.integration.blackduck.api.generated.view.RoleView;
    import com.synopsys.integration.blackduck.api.generated.view.ScanView;
    import com.synopsys.integration.blackduck.api.generated.view.UserGroupView;
    import com.synopsys.integration.blackduck.api.generated.view.UserView;
    import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityReportsReportView;
    import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityView;
    import com.synopsys.integration.blackduck.api.manual.throwaway.generated.response.CurrentVersionView;
    import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.LicenseFamilyView;
    import com.synopsys.integration.blackduck.api.manual.view.NotificationView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ApiDiscovery {
	public static final Map<BlackDuckPath, LinkResponse> links = new HashMap<>();

    	public static final BlackDuckPath SCAN_SUMMARIES_LINK = new BlackDuckPath("/api/scan-summaries");
    	public static final BlackDuckPath USERGROUPS_LINK = new BlackDuckPath("/api/usergroups");
    	public static final BlackDuckPath LICENSE_FAMILIES_LINK = new BlackDuckPath("/api/license-families");
    	public static final BlackDuckPath JOBS_LINK = new BlackDuckPath("/api/jobs");
    	public static final BlackDuckPath REPORTS_LINK = new BlackDuckPath("/api/reports");
    	public static final BlackDuckPath VERSIONS_LINK = new BlackDuckPath("/api/versions");
    	public static final BlackDuckPath NOTIFICATIONS_LINK = new BlackDuckPath("/api/notifications");
    	public static final BlackDuckPath COMPONENTS_LINK = new BlackDuckPath("/api/components");
    	public static final BlackDuckPath LICENSES_LINK = new BlackDuckPath("/api/licenses");
    	public static final BlackDuckPath VULNERABILITIES_LINK = new BlackDuckPath("/api/vulnerabilities");
    	public static final BlackDuckPath CURRENT_USER_LINK = new BlackDuckPath("/api/current-user");
    	public static final BlackDuckPath PROJECTS_LINK = new BlackDuckPath("/api/projects");
    	public static final BlackDuckPath REGISTRATION_LINK = new BlackDuckPath("/api/registration");
    	public static final BlackDuckPath CURRENT_VERSION_LINK = new BlackDuckPath("/api/current-version");
    	public static final BlackDuckPath CUSTOM_FIELDS_LINK = new BlackDuckPath("/api/custom-fields");
    	public static final BlackDuckPath ROLES_LINK = new BlackDuckPath("/api/roles");
    	public static final BlackDuckPath CWES_LINK = new BlackDuckPath("/api/cwes");
    	public static final BlackDuckPath CODELOCATIONS_LINK = new BlackDuckPath("/api/codelocations");
    	public static final BlackDuckPath POLICY_RULES_LINK = new BlackDuckPath("/api/policy-rules");
    	public static final BlackDuckPath USERS_LINK = new BlackDuckPath("/api/users");
    	public static final BlackDuckPath VULNERABILITY_REPORTS_LINK = new BlackDuckPath("/api/vulnerability-reports");

    	public static final BlackDuckPathSingleResponse<ScanView> SCAN_SUMMARIES_LINK_RESPONSE = new BlackDuckPathSingleResponse<ScanView>(SCAN_SUMMARIES_LINK, ScanView.class);
    	public static final BlackDuckPathMultipleResponses<UserGroupView> USERGROUPS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<UserGroupView>(USERGROUPS_LINK, UserGroupView.class);
    	public static final BlackDuckPathMultipleResponses<LicenseFamilyView> LICENSE_FAMILIES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<LicenseFamilyView>(LICENSE_FAMILIES_LINK, LicenseFamilyView.class);
    	public static final BlackDuckPathMultipleResponses<JobView> JOBS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<JobView>(JOBS_LINK, JobView.class);
    	public static final BlackDuckPathSingleResponse<ReportContentsView> REPORTS_LINK_RESPONSE = new BlackDuckPathSingleResponse<ReportContentsView>(REPORTS_LINK, ReportContentsView.class);
    	public static final BlackDuckPathMultipleResponses<LicenseReportsReportView> VERSIONS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<LicenseReportsReportView>(VERSIONS_LINK, LicenseReportsReportView.class);
    	public static final BlackDuckPathMultipleResponses<NotificationView> NOTIFICATIONS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<NotificationView>(NOTIFICATIONS_LINK, NotificationView.class);
    	public static final BlackDuckPathMultipleResponses<ComponentSearchResultView> COMPONENTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<ComponentSearchResultView>(COMPONENTS_LINK, ComponentSearchResultView.class);
    	public static final BlackDuckPathMultipleResponses<LicenseView> LICENSES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<LicenseView>(LICENSES_LINK, LicenseView.class);
    	public static final BlackDuckPathSingleResponse<VulnerabilityView> VULNERABILITIES_LINK_RESPONSE = new BlackDuckPathSingleResponse<VulnerabilityView>(VULNERABILITIES_LINK, VulnerabilityView.class);
    	public static final BlackDuckPathSingleResponse<UserView> CURRENT_USER_LINK_RESPONSE = new BlackDuckPathSingleResponse<UserView>(CURRENT_USER_LINK, UserView.class);
    	public static final BlackDuckPathMultipleResponses<ProjectView> PROJECTS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<ProjectView>(PROJECTS_LINK, ProjectView.class);
    	public static final BlackDuckPathSingleResponse<RegistrationView> REGISTRATION_LINK_RESPONSE = new BlackDuckPathSingleResponse<RegistrationView>(REGISTRATION_LINK, RegistrationView.class);
    	public static final BlackDuckPathSingleResponse<CurrentVersionView> CURRENT_VERSION_LINK_RESPONSE = new BlackDuckPathSingleResponse<CurrentVersionView>(CURRENT_VERSION_LINK, CurrentVersionView.class);
    	public static final BlackDuckPathMultipleResponses<CustomFieldObjectView> CUSTOM_FIELDS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<CustomFieldObjectView>(CUSTOM_FIELDS_LINK, CustomFieldObjectView.class);
    	public static final BlackDuckPathMultipleResponses<RoleView> ROLES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<RoleView>(ROLES_LINK, RoleView.class);
    	public static final BlackDuckPathSingleResponse<CweView> CWES_LINK_RESPONSE = new BlackDuckPathSingleResponse<CweView>(CWES_LINK, CweView.class);
    	public static final BlackDuckPathMultipleResponses<CodeLocationView> CODELOCATIONS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<CodeLocationView>(CODELOCATIONS_LINK, CodeLocationView.class);
    	public static final BlackDuckPathMultipleResponses<PolicyRuleView> POLICY_RULES_LINK_RESPONSE = new BlackDuckPathMultipleResponses<PolicyRuleView>(POLICY_RULES_LINK, PolicyRuleView.class);
    	public static final BlackDuckPathMultipleResponses<UserView> USERS_LINK_RESPONSE = new BlackDuckPathMultipleResponses<UserView>(USERS_LINK, UserView.class);
    	public static final BlackDuckPathSingleResponse<VulnerabilityReportsReportView> VULNERABILITY_REPORTS_LINK_RESPONSE = new BlackDuckPathSingleResponse<VulnerabilityReportsReportView>(VULNERABILITY_REPORTS_LINK, VulnerabilityReportsReportView.class);

	static {
    		links.put(SCAN_SUMMARIES_LINK, SCAN_SUMMARIES_LINK_RESPONSE);
    		links.put(USERGROUPS_LINK, USERGROUPS_LINK_RESPONSE);
    		links.put(LICENSE_FAMILIES_LINK, LICENSE_FAMILIES_LINK_RESPONSE);
    		links.put(JOBS_LINK, JOBS_LINK_RESPONSE);
    		links.put(REPORTS_LINK, REPORTS_LINK_RESPONSE);
    		links.put(VERSIONS_LINK, VERSIONS_LINK_RESPONSE);
    		links.put(NOTIFICATIONS_LINK, NOTIFICATIONS_LINK_RESPONSE);
    		links.put(COMPONENTS_LINK, COMPONENTS_LINK_RESPONSE);
    		links.put(LICENSES_LINK, LICENSES_LINK_RESPONSE);
    		links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
    		links.put(CURRENT_USER_LINK, CURRENT_USER_LINK_RESPONSE);
    		links.put(PROJECTS_LINK, PROJECTS_LINK_RESPONSE);
    		links.put(REGISTRATION_LINK, REGISTRATION_LINK_RESPONSE);
    		links.put(CURRENT_VERSION_LINK, CURRENT_VERSION_LINK_RESPONSE);
    		links.put(CUSTOM_FIELDS_LINK, CUSTOM_FIELDS_LINK_RESPONSE);
    		links.put(ROLES_LINK, ROLES_LINK_RESPONSE);
    		links.put(CWES_LINK, CWES_LINK_RESPONSE);
    		links.put(CODELOCATIONS_LINK, CODELOCATIONS_LINK_RESPONSE);
    		links.put(POLICY_RULES_LINK, POLICY_RULES_LINK_RESPONSE);
    		links.put(USERS_LINK, USERS_LINK_RESPONSE);
    		links.put(VULNERABILITY_REPORTS_LINK, VULNERABILITY_REPORTS_LINK_RESPONSE);
	}

}