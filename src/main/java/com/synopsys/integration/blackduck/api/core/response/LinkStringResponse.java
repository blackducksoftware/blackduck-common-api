/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.core.response;

public class LinkStringResponse extends LinkResponse<String> {
    public LinkStringResponse(String link) {
        super(link, String.class);
    }

    public LinkStringResponse(String link, Class<String> resultClass) {
        super(link, resultClass);
    }

}
