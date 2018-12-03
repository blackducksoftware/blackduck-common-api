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
package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.LinkStringResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseCodeSharingType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseOwnershipType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseSourceType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseStatusType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseView extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String TEXT_LINK = "text";

    public static final LinkStringResponse TEXT_LINK_RESPONSE = new LinkStringResponse(TEXT_LINK, String.class);

    static {
        links.put(TEXT_LINK, TEXT_LINK_RESPONSE);
    }

    private LicenseCodeSharingType codeSharing;
    private java.util.Date createdAt;
    private String createdBy;
    private String createdByUser;
    private java.util.Date expirationDate;
    private LicenseSourceType licenseSource;
    private LicenseStatusType licenseStatus;
    private String name;
    private String notes;
    private LicenseOwnershipType ownership;
    private String spdxId;
    private java.util.Date statusUpdatedAt;
    private String statusUpdatedBy;
    private String statusUpdatedByUser;
    private java.util.Date updatedAt;
    private String updatedBy;
    private String updatedByUser;

    public LicenseCodeSharingType getCodeSharing() {
        return codeSharing;
    }

    public void setCodeSharing(LicenseCodeSharingType codeSharing) {
        this.codeSharing = codeSharing;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
        this.createdByUser = createdByUser;
    }

    public java.util.Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public LicenseSourceType getLicenseSource() {
        return licenseSource;
    }

    public void setLicenseSource(LicenseSourceType licenseSource) {
        this.licenseSource = licenseSource;
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

    public LicenseOwnershipType getOwnership() {
        return ownership;
    }

    public void setOwnership(LicenseOwnershipType ownership) {
        this.ownership = ownership;
    }

    public String getSpdxId() {
        return spdxId;
    }

    public void setSpdxId(String spdxId) {
        this.spdxId = spdxId;
    }

    public java.util.Date getStatusUpdatedAt() {
        return statusUpdatedAt;
    }

    public void setStatusUpdatedAt(java.util.Date statusUpdatedAt) {
        this.statusUpdatedAt = statusUpdatedAt;
    }

    public String getStatusUpdatedBy() {
        return statusUpdatedBy;
    }

    public void setStatusUpdatedBy(String statusUpdatedBy) {
        this.statusUpdatedBy = statusUpdatedBy;
    }

    public String getStatusUpdatedByUser() {
        return statusUpdatedByUser;
    }

    public void setStatusUpdatedByUser(String statusUpdatedByUser) {
        this.statusUpdatedByUser = statusUpdatedByUser;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedByUser() {
        return updatedByUser;
    }

    public void setUpdatedByUser(String updatedByUser) {
        this.updatedByUser = updatedByUser;
    }

}
