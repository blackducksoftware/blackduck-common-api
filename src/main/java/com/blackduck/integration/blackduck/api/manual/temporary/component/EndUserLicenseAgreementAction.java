/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class EndUserLicenseAgreementAction extends BlackDuckComponent {
    private Boolean accept;
    private Boolean acceptEndUserLicense;

    public Boolean getAccept() {
        return accept;
    }

    public void setAccept(Boolean accept) {
        this.accept = accept;
    }

    public Boolean getAcceptEndUserLicense() {
        return acceptEndUserLicense;
    }

    public void setAcceptEndUserLicense(Boolean acceptEndUserLicense) {
        this.acceptEndUserLicense = acceptEndUserLicense;
    }

}
