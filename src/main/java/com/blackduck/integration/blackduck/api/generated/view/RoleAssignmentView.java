/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.view;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;
import com.blackduck.integration.blackduck.api.core.response.LinkBlackDuckResponse;
import com.blackduck.integration.blackduck.api.core.response.LinkSingleResponse;
import com.blackduck.integration.blackduck.api.core.response.UrlSingleResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RoleAssignmentView extends BlackDuckView {
    public static final Map<String, LinkBlackDuckResponse> links = new HashMap<>();

    public static final String USER_LINK = "user";

    public static final LinkSingleResponse<UserView> USER_LINK_RESPONSE = new LinkSingleResponse<UserView>(USER_LINK, UserView.class);

    static {
        links.put(USER_LINK, USER_LINK_RESPONSE);
    }

    private String description;
    private String name;
    private String role;
    private String scope;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public UrlSingleResponse<UserView> metaUserLink() {
        return metaSingleResponse(USER_LINK_RESPONSE);
    }

    public Optional<UrlSingleResponse<UserView>> metaUserLinkSafely() {
        return metaSingleResponseSafely(USER_LINK_RESPONSE);
    }

}
