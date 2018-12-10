/**
 * blackduck-common-api
 *
 * Copyright (C) 2018 Black Duck Software, Inc.
 * http://www.blackducksoftware.com/
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.VersionBomLicenseView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComplexLicenseType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionBomLicenseView extends BlackDuckComponent {
    private String license;
    private String licenseDisplay;
    private ComplexLicenseType licenseType;
    private java.util.List<VersionBomLicenseView> licenses;

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getLicenseDisplay() {
        return licenseDisplay;
    }

    public void setLicenseDisplay(String licenseDisplay) {
        this.licenseDisplay = licenseDisplay;
    }

    public ComplexLicenseType getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(ComplexLicenseType licenseType) {
        this.licenseType = licenseType;
    }

    public java.util.List<VersionBomLicenseView> getLicenses() {
        return licenses;
    }

    public void setLicenses(java.util.List<VersionBomLicenseView> licenses) {
        this.licenses = licenses;
    }

}
