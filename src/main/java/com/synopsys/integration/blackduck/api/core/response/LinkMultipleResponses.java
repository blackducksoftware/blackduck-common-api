/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.core.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;

public class LinkMultipleResponses<T extends BlackDuckResponse> extends LinkBlackDuckResponse<T> {
    public LinkMultipleResponses(String link, Class<T> responseClass) {
        super(link, responseClass);
    }

}
