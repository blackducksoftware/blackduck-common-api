/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.core.response;

import com.blackduck.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.rest.HttpUrl;

public class UrlMultipleResponses<T extends BlackDuckResponse> extends UrlResponse<T> {
    public UrlMultipleResponses(HttpUrl url, Class<T> responseClass) {
        super(url, responseClass);
    }

}
