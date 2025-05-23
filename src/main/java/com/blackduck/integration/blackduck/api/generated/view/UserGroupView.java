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
import com.blackduck.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.blackduck.integration.blackduck.api.core.response.UrlMultipleResponses;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class UserGroupView extends BlackDuckView {
    public static final Map<String, LinkBlackDuckResponse> links = new HashMap<>();

    public static final String USERS_LINK = "users";

    public static final LinkMultipleResponses<UserView> USERS_LINK_RESPONSE = new LinkMultipleResponses<UserView>(USERS_LINK, UserView.class);

    static {
        links.put(USERS_LINK, USERS_LINK_RESPONSE);
    }

    private Boolean active;
    private String createdFrom;
    private Boolean default_;
    private String externalName;
    private String name;
    private String userGroup;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCreatedFrom() {
        return createdFrom;
    }

    public void setCreatedFrom(String createdFrom) {
        this.createdFrom = createdFrom;
    }

    public Boolean getDefault_() {
        return default_;
    }

    public void setDefault_(Boolean default_) {
        this.default_ = default_;
    }

    public String getExternalName() {
        return externalName;
    }

    public void setExternalName(String externalName) {
        this.externalName = externalName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(String userGroup) {
        this.userGroup = userGroup;
    }

    public UrlMultipleResponses<UserView> metaUsersLink() {
        return metaMultipleResponses(USERS_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<UserView>> metaUsersLinkSafely() {
        return metaMultipleResponsesSafely(USERS_LINK_RESPONSE);
    }

}
