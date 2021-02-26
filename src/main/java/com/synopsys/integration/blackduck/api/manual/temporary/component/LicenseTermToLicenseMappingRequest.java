/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseTermToLicenseMappingRequest extends BlackDuckComponent {
    private Boolean fulfillmentRequired;
    private String licenseTerm;

    public Boolean getFulfillmentRequired() {
        return fulfillmentRequired;
    }

    public void setFulfillmentRequired(Boolean fulfillmentRequired) {
        this.fulfillmentRequired = fulfillmentRequired;
    }

    public String getLicenseTerm() {
        return licenseTerm;
    }

    public void setLicenseTerm(String licenseTerm) {
        this.licenseTerm = licenseTerm;
    }

}
