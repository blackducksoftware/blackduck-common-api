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

import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.core.LinkMultipleResponses;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.core.LinkSingleResponse;
import com.blackducksoftware.integration.hub.api.generated.enumeration.OriginSourceType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.ProjectVersionDistributionType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.ProjectVersionPhaseType;
import com.blackducksoftware.integration.hub.api.generated.response.VersionRiskProfileView;
import com.blackducksoftware.integration.hub.api.generated.view.CodeLocationView;
import com.blackducksoftware.integration.hub.api.generated.view.ComplexLicenseView;
import com.blackducksoftware.integration.hub.api.generated.view.ProjectView;
import com.blackducksoftware.integration.hub.api.generated.view.ReportView;
import com.blackducksoftware.integration.hub.api.generated.view.VersionBomComponentView;
import com.blackducksoftware.integration.hub.api.generated.view.VersionBomPolicyStatusView;
import com.blackducksoftware.integration.hub.api.generated.view.VulnerableComponentView;

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

    public static final LinkMultipleResponses COMPONENTS_LINK_RESPONSE = new LinkMultipleResponses(COMPONENTS_LINK, VersionBomComponentView.class);
    public static final LinkSingleResponse POLICY_STATUS_LINK_RESPONSE = new LinkSingleResponse(POLICY_STATUS_LINK, VersionBomPolicyStatusView.class);
    public static final LinkSingleResponse RISKPROFILE_LINK_RESPONSE = new LinkSingleResponse(RISKPROFILE_LINK, VersionRiskProfileView.class);
    public static final LinkMultipleResponses CODELOCATIONS_LINK_RESPONSE = new LinkMultipleResponses(CODELOCATIONS_LINK, CodeLocationView.class);
    public static final LinkMultipleResponses LICENSEREPORTS_LINK_RESPONSE = new LinkMultipleResponses(LICENSEREPORTS_LINK, ReportView.class);
    public static final LinkSingleResponse PROJECT_LINK_RESPONSE = new LinkSingleResponse(PROJECT_LINK, ProjectView.class);
    public static final LinkMultipleResponses VULNERABLE_COMPONENTS_LINK_RESPONSE = new LinkMultipleResponses(VULNERABLE_COMPONENTS_LINK, VulnerableComponentView.class);
    public static final LinkMultipleResponses VERSIONREPORT_LINK_RESPONSE = new LinkMultipleResponses(VERSIONREPORT_LINK, ReportView.class);

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
