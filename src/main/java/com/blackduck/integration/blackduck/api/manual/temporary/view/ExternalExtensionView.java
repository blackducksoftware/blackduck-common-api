/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.view;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;
import com.blackduck.integration.blackduck.api.core.response.LinkBlackDuckResponse;
import com.blackduck.integration.blackduck.api.core.response.LinkMultipleResponses;

import java.util.HashMap;
import java.util.Map;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ExternalExtensionView extends BlackDuckView {
    public static final Map<String, LinkBlackDuckResponse> links = new HashMap<>();

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
