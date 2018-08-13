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
import com.synopsys.integration.blackduck.api.generated.view.ComplexLicenseView;
import com.synopsys.integration.blackduck.api.generated.view.MatchedFileView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityV2View;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityWithRemediationView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VulnerableComponentView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String MATCHED_FILES_LINK = "matched-files";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";

    public static final LinkMultipleResponses<MatchedFileView> MATCHED_FILES_LINK_RESPONSE = new LinkMultipleResponses<MatchedFileView>(MATCHED_FILES_LINK, MatchedFileView.class);
    public static final LinkMultipleResponses<VulnerabilityV2View> VULNERABILITIES_LINK_RESPONSE = new LinkMultipleResponses<VulnerabilityV2View>(VULNERABILITIES_LINK, VulnerabilityV2View.class);

    static {
        links.put(MATCHED_FILES_LINK, MATCHED_FILES_LINK_RESPONSE);
        links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
    }

    public String component;
    public String componentName;
    public String componentVersion;
    public String componentVersionName;
    public String componentVersionOriginId;
    public String componentVersionOriginName;
    public ComplexLicenseView license;
    public VulnerabilityWithRemediationView vulnerabilityWithRemediation;

}
