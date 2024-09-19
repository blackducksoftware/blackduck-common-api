/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.core.response;

import com.blackduck.integration.blackduck.api.core.BlackDuckResponse;

public class LinkMultipleResponses<T extends BlackDuckResponse> extends LinkBlackDuckResponse<T> {
    public LinkMultipleResponses(String link, Class<T> responseClass) {
        super(link, responseClass);
    }

}
