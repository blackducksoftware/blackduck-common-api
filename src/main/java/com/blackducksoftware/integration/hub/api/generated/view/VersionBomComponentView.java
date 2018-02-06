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
package com.blackducksoftware.integration.hub.api.generated.view;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.generated.enumeration.MatchedFileUsagesType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.PolicyStatusApprovalStatusType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.VersionBomComponentMatchType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.VersionBomComponentReviewStatusType;
import com.blackducksoftware.integration.hub.api.generated.model.ActivityDataView;
import com.blackducksoftware.integration.hub.api.generated.model.ReviewedDetails;
import com.blackducksoftware.integration.hub.api.generated.model.UserCommentView;
import com.blackducksoftware.integration.hub.api.generated.model.VersionBomLicenseView;
import com.blackducksoftware.integration.hub.api.generated.model.VersionBomOriginView;
import com.blackducksoftware.integration.hub.api.generated.view.IssueView;
import com.blackducksoftware.integration.hub.api.generated.view.MatchedFileView;
import com.blackducksoftware.integration.hub.api.generated.view.PolicyRuleViewV2;
import com.blackducksoftware.integration.hub.api.generated.view.RiskProfileView;
import com.blackducksoftware.integration.hub.api.generated.view.VulnerabilityV2View;
import com.google.gson.reflect.TypeToken;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionBomComponentView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String POLICY_RULES_LINK = "policy-rules";
    public static final String MATCHED_FILES_LINK = "matched-files";
    public static final String COMMENTS_LINK = "comments";
    public static final String COMPONENT_ISSUES_LINK = "component-issues";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";

    static {
            links.put(POLICY_RULES_LINK, new TypeToken<ArrayList<PolicyRuleViewV2>>() {}.getType());
            links.put(MATCHED_FILES_LINK, new TypeToken<ArrayList<MatchedFileView>>() {}.getType());
            links.put(COMMENTS_LINK, new TypeToken<ArrayList<UserCommentView>>() {}.getType());
            links.put(COMPONENT_ISSUES_LINK, IssueView.class);
            links.put(VULNERABILITIES_LINK, new TypeToken<ArrayList<VulnerabilityV2View>>() {}.getType());
    }

    public ActivityDataView activityData;
    public RiskProfileView activityRiskProfile;
    public PolicyStatusApprovalStatusType approvalStatus;
    public String component;
    public String componentName;
    public String componentVersion;
    public String componentVersionName;
    public RiskProfileView licenseRiskProfile;
    public java.util.List<VersionBomLicenseView> licenses;
    public java.util.List<VersionBomComponentMatchType> matchTypes;
    public RiskProfileView operationalRiskProfile;
    public java.util.List<VersionBomOriginView> origins;
    public PolicyStatusApprovalStatusType policyStatus;
    public java.util.Date releasedOn;
    public VersionBomComponentReviewStatusType reviewStatus;
    public ReviewedDetails reviewedDetails;
    public RiskProfileView securityRiskProfile;
    public Long totalFileMatchCount;
    public java.util.List<MatchedFileUsagesType> usages;
    public RiskProfileView versionRiskProfile;

}
