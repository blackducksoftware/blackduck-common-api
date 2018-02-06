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
import com.blackducksoftware.integration.hub.api.generated.enumeration.OriginSourceType;
import com.blackducksoftware.integration.hub.api.generated.model.ComponentVersionReferenceView;
import com.blackducksoftware.integration.hub.api.generated.model.ComponentVersionRiskView;
import com.blackducksoftware.integration.hub.api.generated.view.ComplexLicenseView;
import com.blackducksoftware.integration.hub.api.generated.view.ComponentView;
import com.blackducksoftware.integration.hub.api.generated.view.OriginView;
import com.blackducksoftware.integration.hub.api.generated.view.VulnerabilityV2View;
import com.google.gson.reflect.TypeToken;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String COMPONENT_LINK = "component";
    public static final String REFERENCES_LINK = "references";
    public static final String ORIGINS_LINK = "origins";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";
    public static final String RISK_PROFILE_LINK = "risk-profile";

    static {
            links.put(COMPONENT_LINK, ComponentView.class);
            links.put(REFERENCES_LINK, new TypeToken<ArrayList<ComponentVersionReferenceView>>() {}.getType());
            links.put(ORIGINS_LINK, new TypeToken<ArrayList<OriginView>>() {}.getType());
            links.put(VULNERABILITIES_LINK, new TypeToken<ArrayList<VulnerabilityV2View>>() {}.getType());
            links.put(RISK_PROFILE_LINK, ComponentVersionRiskView.class);
    }

    public ComplexLicenseView license;
    public java.util.Date releasedOn;
    public OriginSourceType source;
    public String versionName;

}
