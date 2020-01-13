/**
 * blackduck-common-api
 *
 * Copyright (c) 2020 Synopsys, Inc.
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
package com.synopsys.integration.blackduck.api.manual.throwaway.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.CustomLicenseRequestCodeSharingType;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.LicenseStatusType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CustomLicenseRequest extends BlackDuckComponent {
    private CustomLicenseRequestCodeSharingType codeSharing;
    private java.util.Date expirationDate;
    private String licenseFamily;
    private LicenseStatusType licenseStatus;
    private String name;
    private String notes;
    private String text;

    public CustomLicenseRequestCodeSharingType getCodeSharing() {
        return codeSharing;
    }

    public void setCodeSharing(CustomLicenseRequestCodeSharingType codeSharing) {
        this.codeSharing = codeSharing;
    }

    public java.util.Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getLicenseFamily() {
        return licenseFamily;
    }

    public void setLicenseFamily(String licenseFamily) {
        this.licenseFamily = licenseFamily;
    }

    public LicenseStatusType getLicenseStatus() {
        return licenseStatus;
    }

    public void setLicenseStatus(LicenseStatusType licenseStatus) {
        this.licenseStatus = licenseStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
