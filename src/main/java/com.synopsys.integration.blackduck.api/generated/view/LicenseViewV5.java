/**
 * blackduck-common-api
 *
 * Copyright (c) 2019 Synopsys, Inc.
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
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.component.LicenseLicenseFamilyView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseLicenseSourceType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseOwnershipType;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseLicenseStatusType;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.component.LicenseStatusUpdatedByView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseUpdatedByView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseCreatedByView;
import com.synopsys.integration.blackduck.api.core.LinkStringResponse;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseViewV5 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-5+json";

	public static final Map<String, LinkResponse> links = new HashMap<>();
        public static final String TEXT_LINK = "text";

	public static final LinkStringResponse TEXT_LINK_RESPONSE = new LinkStringResponse(TEXT_LINK, String.class);

    static {
	links.put(TEXT_LINK, TEXT_LINK_RESPONSE);
    }

    private String updatedAt;
    private LicenseStatusUpdatedByView statusUpdatedBy;
    private String name;
    private LicenseLicenseFamilyView licenseFamily;
    private LicenseLicenseSourceType licenseSource;
    private String createdAt;
    private String statusUpdatedAt;
    private String notes;
    private LicenseCreatedByView createdBy;
    private String expirationDate;
    private LicenseUpdatedByView updatedBy;
    private LicenseOwnershipType ownership;
    private LicenseLicenseStatusType licenseStatus;
    private String spdxId;

    public String getUpdatedAt() {
	return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
	this.updatedAt = updatedAt;
    }

    public LicenseStatusUpdatedByView getStatusUpdatedBy() {
	return statusUpdatedBy;
    }

    public void setStatusUpdatedBy(LicenseStatusUpdatedByView statusUpdatedBy) {
	this.statusUpdatedBy = statusUpdatedBy;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public LicenseLicenseFamilyView getLicenseFamily() {
	return licenseFamily;
    }

    public void setLicenseFamily(LicenseLicenseFamilyView licenseFamily) {
	this.licenseFamily = licenseFamily;
    }

    public LicenseLicenseSourceType getLicenseSource() {
	return licenseSource;
    }

    public void setLicenseSource(LicenseLicenseSourceType licenseSource) {
	this.licenseSource = licenseSource;
    }

    public String getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(String createdAt) {
	this.createdAt = createdAt;
    }

    public String getStatusUpdatedAt() {
	return statusUpdatedAt;
    }

    public void setStatusUpdatedAt(String statusUpdatedAt) {
	this.statusUpdatedAt = statusUpdatedAt;
    }

    public String getNotes() {
	return notes;
    }

    public void setNotes(String notes) {
	this.notes = notes;
    }

    public LicenseCreatedByView getCreatedBy() {
	return createdBy;
    }

    public void setCreatedBy(LicenseCreatedByView createdBy) {
	this.createdBy = createdBy;
    }

    public String getExpirationDate() {
	return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
	this.expirationDate = expirationDate;
    }

    public LicenseUpdatedByView getUpdatedBy() {
	return updatedBy;
    }

    public void setUpdatedBy(LicenseUpdatedByView updatedBy) {
	this.updatedBy = updatedBy;
    }

    public LicenseOwnershipType getOwnership() {
	return ownership;
    }

    public void setOwnership(LicenseOwnershipType ownership) {
	this.ownership = ownership;
    }

    public LicenseLicenseStatusType getLicenseStatus() {
	return licenseStatus;
    }

    public void setLicenseStatus(LicenseLicenseStatusType licenseStatus) {
	this.licenseStatus = licenseStatus;
    }

    public String getSpdxId() {
	return spdxId;
    }

    public void setSpdxId(String spdxId) {
	this.spdxId = spdxId;
    }


    public String getMediaType() {
	return mediaType;
    }

}
