/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.response;

import com.blackduck.integration.blackduck.api.core.BlackDuckResponse;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CurrentVersionView extends BlackDuckResponse {
    private String version;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
