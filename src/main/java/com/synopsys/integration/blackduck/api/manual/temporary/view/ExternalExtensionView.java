/**
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
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
package com.synopsys.integration.blackduck.api.manual.temporary.view;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ExternalExtensionView extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String GLOBAL_OPTIONS_LINK = "global-options";
    public static final String USER_OPTIONS_LINK = "user-options";

    public static final LinkMultipleResponses<ExternalExtensionConfigValueView> GLOBAL_OPTIONS_LINK_RESPONSE = new LinkMultipleResponses<ExternalExtensionConfigValueView>(GLOBAL_OPTIONS_LINK, ExternalExtensionConfigValueView.class);
    public static final LinkMultipleResponses<ExternalExtensionUserView> USER_OPTIONS_LINK_RESPONSE = new LinkMultipleResponses<ExternalExtensionUserView>(USER_OPTIONS_LINK, ExternalExtensionUserView.class);

    static {
        links.put(GLOBAL_OPTIONS_LINK, GLOBAL_OPTIONS_LINK_RESPONSE);
        links.put(USER_OPTIONS_LINK, USER_OPTIONS_LINK_RESPONSE);
    }

    private Boolean authenticated;
    private String description;
    private String infoUrl;
    private String name;

    public Boolean getAuthenticated() {
        return authenticated;
    }

    public void setAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInfoUrl() {
        return infoUrl;
    }

    public void setInfoUrl(String infoUrl) {
        this.infoUrl = infoUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
