/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.core.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;

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
