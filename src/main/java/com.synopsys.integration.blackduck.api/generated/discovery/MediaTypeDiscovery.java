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

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.view.RoleView;
import com.synopsys.integration.blackduck.api.generated.view.CustomFieldView;
import com.synopsys.integration.blackduck.api.generated.component.RegistrationAttributesView;
import com.synopsys.integration.blackduck.api.generated.view.CweView;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpressionExpressionsParametersView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRemediatingFixesPreviousVulnerabilitiesView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseUpdatedByView;
import com.synopsys.integration.blackduck.api.generated.view.LicenseView;
import com.synopsys.integration.blackduck.api.generated.component.ReportContentsReportContentView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionLicenseLicensesLicenseFamilySummaryView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseLicenseFamilyView;
import com.synopsys.integration.blackduck.api.generated.view.CommentView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionLicenseLicensesView;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.RegistrationFeaturesView;
import com.synopsys.integration.blackduck.api.generated.view.CustomFieldObjectView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.LicenseFamilyView;
import com.synopsys.integration.blackduck.api.generated.component.CweCommonConsequencesView;
import com.synopsys.integration.blackduck.api.generated.view.RiskProfileView;
import com.synopsys.integration.blackduck.api.generated.component.VulnerabilityCvss3TemporalMetricsView;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.view.RoleAssignmentView;
import com.synopsys.integration.blackduck.api.generated.component.VulnerabilityCvss2TemporalMetricsView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRemediatingNoVulnerabilitiesView;
import com.synopsys.integration.blackduck.api.generated.view.PolicyRuleView;
import com.synopsys.integration.blackduck.api.generated.view.ComponentVersionPolicyStatusView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseFamilyUpdatedByView;
import com.synopsys.integration.blackduck.api.generated.view.FieldsCustomFieldView;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpressionExpressionsView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseFamilyCreatedByView;
import com.synopsys.integration.blackduck.api.generated.component.VulnerabilityCvss3View;
import com.synopsys.integration.blackduck.api.generated.view.CodeLocationView;
import com.synopsys.integration.blackduck.api.generated.view.ComponentVersionRiskProfileView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityView;
import com.synopsys.integration.blackduck.api.generated.view.LicenseTextView;
import com.synopsys.integration.blackduck.api.generated.view.ReportView;
import com.synopsys.integration.blackduck.api.generated.component.RegistrationMessagesView;
import com.synopsys.integration.blackduck.api.generated.view.ComponentView;
import com.synopsys.integration.blackduck.api.generated.view.ComponentPolicyStatusView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentReviewedDetailsReviewingUserView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView;
import com.synopsys.integration.blackduck.api.generated.component.VulnerabilityCvss2View;
import com.synopsys.integration.blackduck.api.generated.component.LicenseFamilyLicenseFamilyRiskRulesView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRiskProfileRiskDataCountsView;
import com.synopsys.integration.blackduck.api.generated.view.UserGroupView;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpressionView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseStatusUpdatedByView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionLicenseView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionPolicyStatusView;
import com.synopsys.integration.blackduck.api.generated.view.ReportContentsView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRemediatingLatestAfterCurrentView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRiskProfileActivityDataView;
import com.synopsys.integration.blackduck.api.generated.view.LicenseTermView;
import com.synopsys.integration.blackduck.api.generated.component.CommentUserView;
import com.synopsys.integration.blackduck.api.generated.view.JobView;
import com.synopsys.integration.blackduck.api.generated.view.ComponentVersionRemediatingView;
import com.synopsys.integration.blackduck.api.generated.view.RegistrationView;
import com.synopsys.integration.blackduck.api.generated.view.ScanView;
import com.synopsys.integration.blackduck.api.generated.view.UserView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentActivityDataView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionComponentView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRiskProfileRiskDataView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRiskProfileVersionDataView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseCreatedByView;
import com.synopsys.integration.blackduck.api.generated.view.ComponentVersionView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentReviewedDetailsView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentLicensesView;
import com.synopsys.integration.blackduck.api.generated.view.CurrentUserView;
import com.synopsys.integration.blackduck.api.generated.view.LicenseReportsReportView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityReportsReportView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class MediaTypeDiscovery {
	private final Map<Class<? extends BlackDuckComponent>, String> mediaTypeMap = new HashMap<>();

	public MediaTypeDiscovery() {
    			mediaTypeMap.put(CodeLocationView.class, "application/vnd.blackducksoftware.scan-4+json");
    			mediaTypeMap.put(CommentUserView.class, "application/vnd.blackducksoftware.bill-of-materials-4+json");
    			mediaTypeMap.put(CommentView.class, "application/vnd.blackducksoftware.bill-of-materials-6+json");
    			mediaTypeMap.put(ComponentPolicyStatusView.class, "application/vnd.blackducksoftware.bill-of-materials-6+json");
    			mediaTypeMap.put(ComponentVersionPolicyStatusView.class, "application/vnd.blackducksoftware.bill-of-materials-6+json");
    			mediaTypeMap.put(ComponentVersionRemediatingFixesPreviousVulnerabilitiesView.class, "application/vnd.blackducksoftware.component-detail-4+json");
    			mediaTypeMap.put(ComponentVersionRemediatingLatestAfterCurrentView.class, "application/vnd.blackducksoftware.component-detail-4+json");
    			mediaTypeMap.put(ComponentVersionRemediatingNoVulnerabilitiesView.class, "application/vnd.blackducksoftware.component-detail-4+json");
    			mediaTypeMap.put(ComponentVersionRemediatingView.class, "application/vnd.blackducksoftware.component-detail-5+json");
    			mediaTypeMap.put(ComponentVersionRiskProfileActivityDataView.class, "application/vnd.blackducksoftware.component-detail-4+json");
    			mediaTypeMap.put(ComponentVersionRiskProfileRiskDataCountsView.class, "application/vnd.blackducksoftware.component-detail-5+json");
    			mediaTypeMap.put(ComponentVersionRiskProfileRiskDataView.class, "application/vnd.blackducksoftware.component-detail-4+json");
    			mediaTypeMap.put(ComponentVersionRiskProfileVersionDataView.class, "application/vnd.blackducksoftware.component-detail-4+json");
    			mediaTypeMap.put(ComponentVersionRiskProfileView.class, "application/vnd.blackducksoftware.component-detail-5+json");
    			mediaTypeMap.put(ComponentVersionView.class, "application/vnd.blackducksoftware.component-detail-5+json");
    			mediaTypeMap.put(ComponentView.class, "application/vnd.blackducksoftware.component-detail-4+json");
    			mediaTypeMap.put(CurrentUserView.class, "application/vnd.blackducksoftware.user-4+json");
    			mediaTypeMap.put(CustomFieldObjectView.class, "application/vnd.blackducksoftware.admin-4+json");
    			mediaTypeMap.put(CustomFieldView.class, "application/vnd.blackducksoftware.bill-of-materials-6+json");
    			mediaTypeMap.put(CweCommonConsequencesView.class, "application/vnd.blackducksoftware.vulnerability-4+json");
    			mediaTypeMap.put(CweView.class, "application/vnd.blackducksoftware.vulnerability-4+json");
    			mediaTypeMap.put(FieldsCustomFieldView.class, "application/vnd.blackducksoftware.admin-4+json");
    			mediaTypeMap.put(JobView.class, "application/vnd.blackducksoftware.status-4+json");
    			mediaTypeMap.put(LicenseCreatedByView.class, "application/vnd.blackducksoftware.component-detail-5+json");
    			mediaTypeMap.put(LicenseFamilyCreatedByView.class, "application/vnd.blackducksoftware.component-detail-5+json");
    			mediaTypeMap.put(LicenseFamilyLicenseFamilyRiskRulesView.class, "application/vnd.blackducksoftware.component-detail-5+json");
    			mediaTypeMap.put(LicenseFamilyUpdatedByView.class, "application/vnd.blackducksoftware.component-detail-5+json");
    			mediaTypeMap.put(LicenseFamilyView.class, "application/vnd.blackducksoftware.component-detail-5+json");
    			mediaTypeMap.put(LicenseLicenseFamilyView.class, "application/vnd.blackducksoftware.component-detail-5+json");
    			mediaTypeMap.put(LicenseReportsReportView.class, "application/vnd.blackducksoftware.report-4+json");
    			mediaTypeMap.put(LicenseStatusUpdatedByView.class, "application/vnd.blackducksoftware.component-detail-5+json");
    			mediaTypeMap.put(LicenseTermView.class, "application/vnd.blackducksoftware.component-detail-5+json");
    			mediaTypeMap.put(LicenseTextView.class, "application/vnd.blackducksoftware.component-detail-5+json");
    			mediaTypeMap.put(LicenseUpdatedByView.class, "application/vnd.blackducksoftware.component-detail-5+json");
    			mediaTypeMap.put(LicenseView.class, "application/vnd.blackducksoftware.component-detail-5+json");
    			mediaTypeMap.put(PolicyRuleExpressionExpressionsParametersView.class, "application/vnd.blackducksoftware.policy-5+json");
    			mediaTypeMap.put(PolicyRuleExpressionExpressionsView.class, "application/vnd.blackducksoftware.policy-5+json");
    			mediaTypeMap.put(PolicyRuleExpressionView.class, "application/vnd.blackducksoftware.policy-4+json");
    			mediaTypeMap.put(PolicyRuleView.class, "application/vnd.blackducksoftware.policy-5+json");
    			mediaTypeMap.put(ProjectVersionComponentActivityDataView.class, "application/vnd.blackducksoftware.bill-of-materials-4+json");
    			mediaTypeMap.put(ProjectVersionComponentLicensesView.class, "application/vnd.blackducksoftware.bill-of-materials-4+json");
    			mediaTypeMap.put(ProjectVersionComponentReviewedDetailsReviewingUserView.class, "application/vnd.blackducksoftware.bill-of-materials-6+json");
    			mediaTypeMap.put(ProjectVersionComponentReviewedDetailsView.class, "application/vnd.blackducksoftware.bill-of-materials-4+json");
    			mediaTypeMap.put(ProjectVersionComponentView.class, "application/vnd.blackducksoftware.bill-of-materials-6+json");
    			mediaTypeMap.put(ProjectVersionLicenseLicensesLicenseFamilySummaryView.class, "application/vnd.blackducksoftware.project-detail-5+json");
    			mediaTypeMap.put(ProjectVersionLicenseLicensesView.class, "application/vnd.blackducksoftware.project-detail-5+json");
    			mediaTypeMap.put(ProjectVersionLicenseView.class, "application/vnd.blackducksoftware.project-detail-4+json");
    			mediaTypeMap.put(ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView.class, "application/vnd.blackducksoftware.bill-of-materials-4+json");
    			mediaTypeMap.put(ProjectVersionPolicyStatusView.class, "application/vnd.blackducksoftware.bill-of-materials-6+json");
    			mediaTypeMap.put(ProjectVersionView.class, "application/vnd.blackducksoftware.project-detail-5+json");
    			mediaTypeMap.put(ProjectView.class, "application/vnd.blackducksoftware.project-detail-4+json");
    			mediaTypeMap.put(RegistrationAttributesView.class, "application/vnd.blackducksoftware.status-4+json");
    			mediaTypeMap.put(RegistrationFeaturesView.class, "application/vnd.blackducksoftware.status-4+json");
    			mediaTypeMap.put(RegistrationMessagesView.class, "application/vnd.blackducksoftware.status-4+json");
    			mediaTypeMap.put(RegistrationView.class, "application/vnd.blackducksoftware.status-4+json");
    			mediaTypeMap.put(ReportContentsReportContentView.class, "application/vnd.blackducksoftware.report-4+json");
    			mediaTypeMap.put(ReportContentsView.class, "application/vnd.blackducksoftware.report-4+json");
    			mediaTypeMap.put(ReportView.class, "application/vnd.blackducksoftware.report-4+json");
    			mediaTypeMap.put(RiskProfileView.class, "application/vnd.blackducksoftware.bill-of-materials-4+json");
    			mediaTypeMap.put(RoleAssignmentView.class, "application/vnd.blackducksoftware.user-4+json");
    			mediaTypeMap.put(RoleView.class, "application/vnd.blackducksoftware.user-4+json");
    			mediaTypeMap.put(ScanView.class, "application/vnd.blackducksoftware.scan-4+json");
    			mediaTypeMap.put(UserGroupView.class, "application/vnd.blackducksoftware.user-4+json");
    			mediaTypeMap.put(UserView.class, "application/vnd.blackducksoftware.user-4+json");
    			mediaTypeMap.put(VulnerabilityCvss2TemporalMetricsView.class, "application/vnd.blackducksoftware.vulnerability-4+json");
    			mediaTypeMap.put(VulnerabilityCvss2View.class, "application/vnd.blackducksoftware.vulnerability-4+json");
    			mediaTypeMap.put(VulnerabilityCvss3TemporalMetricsView.class, "application/vnd.blackducksoftware.vulnerability-4+json");
    			mediaTypeMap.put(VulnerabilityCvss3View.class, "application/vnd.blackducksoftware.vulnerability-4+json");
    			mediaTypeMap.put(VulnerabilityReportsReportView.class, "application/vnd.blackducksoftware.report-4+json");
    			mediaTypeMap.put(VulnerabilityView.class, "application/vnd.blackducksoftware.vulnerability-4+json");
	}

	public<T extends BlackDuckComponent> String determineMediaType(T bdClass) {
    		return mediaTypeMap.get(bdClass);
    	}

}