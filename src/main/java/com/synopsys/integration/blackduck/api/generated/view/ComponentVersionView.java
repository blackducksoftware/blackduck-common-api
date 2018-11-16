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

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentVersionApprovalStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.OriginSourceType;
import com.synopsys.integration.blackduck.api.generated.response.ComponentVersionReferenceView;
import com.synopsys.integration.blackduck.api.generated.response.ComponentVersionRiskView;
import com.synopsys.integration.blackduck.api.generated.view.ComplexLicenseView;
import com.synopsys.integration.blackduck.api.generated.view.ComponentView;
import com.synopsys.integration.blackduck.api.generated.view.OriginView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityV2View;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionView extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String COMPONENT_LINK = "component";
    public static final String REFERENCES_LINK = "references";
    public static final String ORIGINS_LINK = "origins";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";
    public static final String RISK_PROFILE_LINK = "risk-profile";

    public static final LinkSingleResponse<ComponentView> COMPONENT_LINK_RESPONSE = new LinkSingleResponse<ComponentView>(COMPONENT_LINK, ComponentView.class);
    public static final LinkMultipleResponses<ComponentVersionReferenceView> REFERENCES_LINK_RESPONSE = new LinkMultipleResponses<ComponentVersionReferenceView>(REFERENCES_LINK, ComponentVersionReferenceView.class);
    public static final LinkMultipleResponses<OriginView> ORIGINS_LINK_RESPONSE = new LinkMultipleResponses<OriginView>(ORIGINS_LINK, OriginView.class);
    public static final LinkMultipleResponses<VulnerabilityV2View> VULNERABILITIES_LINK_RESPONSE = new LinkMultipleResponses<VulnerabilityV2View>(VULNERABILITIES_LINK, VulnerabilityV2View.class);
    public static final LinkSingleResponse<ComponentVersionRiskView> RISK_PROFILE_LINK_RESPONSE = new LinkSingleResponse<ComponentVersionRiskView>(RISK_PROFILE_LINK, ComponentVersionRiskView.class);

    static {
        links.put(COMPONENT_LINK, COMPONENT_LINK_RESPONSE);
        links.put(REFERENCES_LINK, REFERENCES_LINK_RESPONSE);
        links.put(ORIGINS_LINK, ORIGINS_LINK_RESPONSE);
        links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
        links.put(RISK_PROFILE_LINK, RISK_PROFILE_LINK_RESPONSE);
    }

    public java.util.List<String> additionalHomepages;
    public ComponentVersionApprovalStatusType approvalStatus;
    public ComplexLicenseView license;
    public String notes;
    public java.util.Date releasedOn;
    public OriginSourceType source;
    public ComponentType type;
    public java.util.Date updatedAt;
    public String updatedBy;
    public String updatedByUrl;
    public String versionName;

}
