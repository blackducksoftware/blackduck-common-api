/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.core.response;

import com.blackduck.integration.blackduck.api.core.BlackDuckResponse;

public abstract class LinkBlackDuckResponse<T extends BlackDuckResponse> extends ApiResponse<T> {
    private final String link;

    public LinkBlackDuckResponse(String link, Class<T> responseClass) {
        super(responseClass);
        this.link = link;
    }

    public String getLink() {
        return link;
    }

}
