/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LegacySuiteIdentifierView extends BlackDuckComponent {
    private String suiteComponentId;
    private String suiteReleaseId;

    public String getSuiteComponentId() {
        return suiteComponentId;
    }

    public void setSuiteComponentId(String suiteComponentId) {
        this.suiteComponentId = suiteComponentId;
    }

    public String getSuiteReleaseId() {
        return suiteReleaseId;
    }

    public void setSuiteReleaseId(String suiteReleaseId) {
        this.suiteReleaseId = suiteReleaseId;
    }

}
