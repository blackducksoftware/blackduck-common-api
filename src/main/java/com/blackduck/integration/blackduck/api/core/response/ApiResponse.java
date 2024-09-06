/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.core.response;

import com.synopsys.integration.util.Stringable;

public abstract class ApiResponse<T> extends Stringable {
    private final Class<T> responseClass;

    public ApiResponse(Class<T> responseClass) {
        this.responseClass = responseClass;
    }

    public Class<T> getResponseClass() {
        return responseClass;
    }

}
