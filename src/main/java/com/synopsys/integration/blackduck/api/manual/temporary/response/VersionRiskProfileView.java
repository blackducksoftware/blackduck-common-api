/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.response;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionRiskProfileView extends BlackDuckResponse {
    public static final Map<String, LinkResponse> links = new HashMap<>();

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
