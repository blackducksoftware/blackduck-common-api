/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.core.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckPath;
import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;

public abstract class BlackDuckPathResponse<T extends BlackDuckResponse> extends ApiResponse<T> {
    private final BlackDuckPath blackDuckPath;

    public BlackDuckPathResponse(BlackDuckPath blackDuckPath, Class<T> responseClass) {
        super(responseClass);
        this.blackDuckPath = blackDuckPath;
    }

    public BlackDuckPath getBlackDuckPath() {
        return blackDuckPath;
    }

}
