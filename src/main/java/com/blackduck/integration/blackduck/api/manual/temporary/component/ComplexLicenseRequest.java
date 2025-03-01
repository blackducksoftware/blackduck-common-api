/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.enumeration.LicenseType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComplexLicenseRequest extends BlackDuckComponent {
    private String license;
    private java.util.List<ComplexLicenseRequest> licenses;
    private LicenseType type;

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public java.util.List<ComplexLicenseRequest> getLicenses() {
        return licenses;
    }

    public void setLicenses(java.util.List<ComplexLicenseRequest> licenses) {
        this.licenses = licenses;
    }

    public LicenseType getType() {
        return type;
    }

    public void setType(LicenseType type) {
        this.type = type;
    }

}
