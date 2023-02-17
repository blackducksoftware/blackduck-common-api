/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.core.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.rest.HttpUrl;

public class UrlSingleResponse<T extends BlackDuckResponse> extends UrlResponse<T> {
    public UrlSingleResponse(HttpUrl url, Class<T> responseClass) {
        super(url, responseClass);
    }

}
