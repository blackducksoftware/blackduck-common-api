/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.response;

import com.blackduck.integration.blackduck.api.core.BlackDuckResponse;

public class BlackDuckStringResponse extends BlackDuckResponse {
    private String value;

    public BlackDuckStringResponse(String value) {
        this.value = value;
    }

    public String string() {
        return value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
