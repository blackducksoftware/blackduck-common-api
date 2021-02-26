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

public class BlackDuckPathSingleResponse<T extends BlackDuckResponse> extends BlackDuckPathResponse<T> {
    public BlackDuckPathSingleResponse(BlackDuckPath blackDuckPath, Class<T> responseClass) {
        super(blackDuckPath, responseClass);
    }

}
