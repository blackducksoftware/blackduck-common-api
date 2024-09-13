/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.core.response;

import com.blackduck.integration.blackduck.api.core.BlackDuckResponse;
import com.blackduck.integration.rest.HttpUrl;

public class UrlResponse<T extends BlackDuckResponse> extends ApiResponse<T> {
    private final HttpUrl url;

    public UrlResponse(HttpUrl url, Class<T> responseClass) {
        super(responseClass);
        this.url = url;
    }

    public HttpUrl getUrl() {
        return url;
    }

}
