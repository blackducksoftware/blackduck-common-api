/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.response;

import com.blackduck.integration.blackduck.api.core.BlackDuckResponse;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class EndUserLicenseAgreementView extends BlackDuckResponse {
    private java.util.Date acceptedDate;

    public java.util.Date getAcceptedDate() {
        return acceptedDate;
    }

    public void setAcceptedDate(java.util.Date acceptedDate) {
        this.acceptedDate = acceptedDate;
    }

}
