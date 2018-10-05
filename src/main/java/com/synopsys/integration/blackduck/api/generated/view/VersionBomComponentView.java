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
package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.HubView;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.generated.component.ActivityDataView;
import com.synopsys.integration.blackduck.api.generated.component.ReviewedDetails;
import com.synopsys.integration.blackduck.api.generated.component.VersionBomLicenseView;
import com.synopsys.integration.blackduck.api.generated.component.VersionBomOriginView;
import com.synopsys.integration.blackduck.api.generated.enumeration.MatchedFileUsagesType;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicySummaryStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.VersionBomComponentMatchType;
import com.synopsys.integration.blackduck.api.generated.enumeration.VersionBomComponentReviewStatusType;
import com.synopsys.integration.blackduck.api.generated.response.UserCommentView;
import com.synopsys.integration.blackduck.api.generated.view.IssueView;
import com.synopsys.integration.blackduck.api.generated.view.MatchedFileView;
import com.synopsys.integration.blackduck.api.generated.view.PolicyRuleViewV2;
import com.synopsys.integration.blackduck.api.generated.view.RiskProfileView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityV2View;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionBomComponentView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String POLICY_RULES_LINK = "policy-rules";
    public static final String MATCHED_FILES_LINK = "matched-files";
    public static final String COMMENTS_LINK = "comments";
    public static final String COMPONENT_ISSUES_LINK = "component-issues";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";

    public static final LinkMultipleResponses<PolicyRuleViewV2> POLICY_RULES_LINK_RESPONSE = new LinkMultipleResponses<PolicyRuleViewV2>(POLICY_RULES_LINK, PolicyRuleViewV2.class);
    public static final LinkMultipleResponses<MatchedFileView> MATCHED_FILES_LINK_RESPONSE = new LinkMultipleResponses<MatchedFileView>(MATCHED_FILES_LINK, MatchedFileView.class);
    public static final LinkMultipleResponses<UserCommentView> COMMENTS_LINK_RESPONSE = new LinkMultipleResponses<UserCommentView>(COMMENTS_LINK, UserCommentView.class);
    public static final LinkSingleResponse<IssueView> COMPONENT_ISSUES_LINK_RESPONSE = new LinkSingleResponse<IssueView>(COMPONENT_ISSUES_LINK, IssueView.class);
    public static final LinkMultipleResponses<VulnerabilityV2View> VULNERABILITIES_LINK_RESPONSE = new LinkMultipleResponses<VulnerabilityV2View>(VULNERABILITIES_LINK, VulnerabilityV2View.class);

    static {
        links.put(POLICY_RULES_LINK, POLICY_RULES_LINK_RESPONSE);
        links.put(MATCHED_FILES_LINK, MATCHED_FILES_LINK_RESPONSE);
        links.put(COMMENTS_LINK, COMMENTS_LINK_RESPONSE);
        links.put(COMPONENT_ISSUES_LINK, COMPONENT_ISSUES_LINK_RESPONSE);
        links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
    }

    public ActivityDataView activityData;
    public RiskProfileView activityRiskProfile;
    public PolicySummaryStatusType approvalStatus;
    public String component;
    public String componentModification;
    public Boolean componentModified;
    public String componentName;
    public String componentPurpose;
    public String componentVersion;
    public String componentVersionName;
    public RiskProfileView licenseRiskProfile;
    public java.util.List<VersionBomLicenseView> licenses;
    public java.util.List<VersionBomComponentMatchType> matchTypes;
    public RiskProfileView operationalRiskProfile;
    public java.util.List<VersionBomOriginView> origins;
    public PolicySummaryStatusType policyStatus;
    public java.util.Date releasedOn;
    public VersionBomComponentReviewStatusType reviewStatus;
    public ReviewedDetails reviewedDetails;
    public RiskProfileView securityRiskProfile;
    public Long totalFileMatchCount;
    public java.util.List<MatchedFileUsagesType> usages;
    public RiskProfileView versionRiskProfile;

}
