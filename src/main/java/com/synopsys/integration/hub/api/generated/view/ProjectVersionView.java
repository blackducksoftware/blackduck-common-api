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
package com.synopsys.integration.hub.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.hub.api.core.HubView;
import com.synopsys.integration.hub.api.core.LinkMultipleResponses;
import com.synopsys.integration.hub.api.core.LinkResponse;
import com.synopsys.integration.hub.api.core.LinkSingleResponse;
import com.synopsys.integration.hub.api.generated.enumeration.OriginSourceType;
import com.synopsys.integration.hub.api.generated.enumeration.ProjectVersionDistributionType;
import com.synopsys.integration.hub.api.generated.enumeration.ProjectVersionPhaseType;
import com.synopsys.integration.hub.api.generated.response.VersionRiskProfileView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String COMPONENTS_LINK = "components";
    public static final String POLICY_STATUS_LINK = "policy-status";
    public static final String RISKPROFILE_LINK = "riskProfile";
    public static final String CODELOCATIONS_LINK = "codelocations";
    public static final String LICENSEREPORTS_LINK = "licenseReports";
    public static final String PROJECT_LINK = "project";
    public static final String VULNERABLE_COMPONENTS_LINK = "vulnerable-components";
    public static final String VERSIONREPORT_LINK = "versionReport";

    public static final LinkMultipleResponses<VersionBomComponentView> COMPONENTS_LINK_RESPONSE = new LinkMultipleResponses<VersionBomComponentView>(COMPONENTS_LINK, VersionBomComponentView.class);
    public static final LinkSingleResponse<VersionBomPolicyStatusView> POLICY_STATUS_LINK_RESPONSE = new LinkSingleResponse<VersionBomPolicyStatusView>(POLICY_STATUS_LINK, VersionBomPolicyStatusView.class);
    public static final LinkSingleResponse<VersionRiskProfileView> RISKPROFILE_LINK_RESPONSE = new LinkSingleResponse<VersionRiskProfileView>(RISKPROFILE_LINK, VersionRiskProfileView.class);
    public static final LinkMultipleResponses<CodeLocationView> CODELOCATIONS_LINK_RESPONSE = new LinkMultipleResponses<CodeLocationView>(CODELOCATIONS_LINK, CodeLocationView.class);
    public static final LinkMultipleResponses<ReportView> LICENSEREPORTS_LINK_RESPONSE = new LinkMultipleResponses<ReportView>(LICENSEREPORTS_LINK, ReportView.class);
    public static final LinkSingleResponse<ProjectView> PROJECT_LINK_RESPONSE = new LinkSingleResponse<ProjectView>(PROJECT_LINK, ProjectView.class);
    public static final LinkMultipleResponses<VulnerableComponentView> VULNERABLE_COMPONENTS_LINK_RESPONSE = new LinkMultipleResponses<VulnerableComponentView>(VULNERABLE_COMPONENTS_LINK, VulnerableComponentView.class);
    public static final LinkMultipleResponses<ReportView> VERSIONREPORT_LINK_RESPONSE = new LinkMultipleResponses<ReportView>(VERSIONREPORT_LINK, ReportView.class);

    static {
        links.put(COMPONENTS_LINK, COMPONENTS_LINK_RESPONSE);
        links.put(POLICY_STATUS_LINK, POLICY_STATUS_LINK_RESPONSE);
        links.put(RISKPROFILE_LINK, RISKPROFILE_LINK_RESPONSE);
        links.put(CODELOCATIONS_LINK, CODELOCATIONS_LINK_RESPONSE);
        links.put(LICENSEREPORTS_LINK, LICENSEREPORTS_LINK_RESPONSE);
        links.put(PROJECT_LINK, PROJECT_LINK_RESPONSE);
        links.put(VULNERABLE_COMPONENTS_LINK, VULNERABLE_COMPONENTS_LINK_RESPONSE);
        links.put(VERSIONREPORT_LINK, VERSIONREPORT_LINK_RESPONSE);
    }

    public ProjectVersionDistributionType distribution;
    public ComplexLicenseView license;
    public String nickname;
    public ProjectVersionPhaseType phase;
    public String releaseComments;
    public java.util.Date releasedOn;
    public OriginSourceType source;
    public String versionName;

}
