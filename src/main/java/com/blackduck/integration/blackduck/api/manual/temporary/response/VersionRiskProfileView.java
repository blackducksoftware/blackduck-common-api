/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.response;

import java.util.HashMap;
import java.util.Map;

import com.blackduck.integration.blackduck.api.core.BlackDuckResponse;
import com.blackduck.integration.blackduck.api.core.response.LinkBlackDuckResponse;
import com.blackduck.integration.blackduck.api.core.response.LinkSingleResponse;
import com.blackduck.integration.blackduck.api.generated.view.ProjectVersionView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionRiskProfileView extends BlackDuckResponse {
    public static final Map<String, LinkBlackDuckResponse> links = new HashMap<>();

    public static final String VERSION_LINK = "version";

    public static final LinkSingleResponse<ProjectVersionView> VERSION_LINK_RESPONSE = new LinkSingleResponse<ProjectVersionView>(VERSION_LINK, ProjectVersionView.class);

    static {
        links.put(VERSION_LINK, VERSION_LINK_RESPONSE);
    }

    private java.util.Date bomLastUpdatedAt;
    private Object categories;

    public java.util.Date getBomLastUpdatedAt() {
        return bomLastUpdatedAt;
    }

    public void setBomLastUpdatedAt(java.util.Date bomLastUpdatedAt) {
        this.bomLastUpdatedAt = bomLastUpdatedAt;
    }

    public Object getCategories() {
        return categories;
    }

    public void setCategories(Object categories) {
        this.categories = categories;
    }

}
