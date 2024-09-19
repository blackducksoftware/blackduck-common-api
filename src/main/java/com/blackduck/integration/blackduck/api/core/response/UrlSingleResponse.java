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

public class UrlSingleResponse<T extends BlackDuckResponse> extends UrlResponse<T> {
    public UrlSingleResponse(HttpUrl url, Class<T> responseClass) {
        super(url, responseClass);
    }

}
