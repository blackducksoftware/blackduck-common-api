/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.core.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.rest.HttpUrl;

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
