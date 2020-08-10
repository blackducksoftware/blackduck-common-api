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
package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkStringResponse;
import com.synopsys.integration.blackduck.api.generated.component.LicenseFamilyUpdatedByView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseLicenseFamilyView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentVersionApprovalStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseLicenseSourceType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionLicenseLicensesOwnershipType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class LicenseViewV5 extends BlackDuckView {
	public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String TEXT_LINK = "text";

	public static final LinkStringResponse TEXT_LINK_RESPONSE = new LinkStringResponse(TEXT_LINK, String.class);

    static {
	    links.put(TEXT_LINK, TEXT_LINK_RESPONSE);
    }

    private java.util.Date statusUpdatedAt;
    private ComponentVersionApprovalStatusType licenseStatus;
    private String name;
    private LicenseLicenseFamilyView licenseFamily;
    private LicenseLicenseSourceType licenseSource;
    private java.util.Date createdAt;
    private String notes;
    private LicenseFamilyUpdatedByView statusUpdatedBy;
    private LicenseFamilyUpdatedByView createdBy;
    private LicenseFamilyUpdatedByView updatedBy;
    private java.util.Date expirationDate;
    private ProjectVersionLicenseLicensesOwnershipType ownership;
    private String spdxId;
    private java.util.Date updatedAt;

    public java.util.Date getStatusUpdatedAt() {
	    return statusUpdatedAt;
    }

    public void setStatusUpdatedAt(java.util.Date statusUpdatedAt) {
	    this.statusUpdatedAt = statusUpdatedAt;
    }

    public ComponentVersionApprovalStatusType getLicenseStatus() {
	    return licenseStatus;
    }

    public void setLicenseStatus(ComponentVersionApprovalStatusType licenseStatus) {
	    this.licenseStatus = licenseStatus;
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

    public java.util.Date getCreatedAt() {
	    return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
	    this.createdAt = createdAt;
    }

    public String getNotes() {
	    return notes;
    }

    public void setNotes(String notes) {
	    this.notes = notes;
    }

    public LicenseFamilyUpdatedByView getStatusUpdatedBy() {
	    return statusUpdatedBy;
    }

    public void setStatusUpdatedBy(LicenseFamilyUpdatedByView statusUpdatedBy) {
	    this.statusUpdatedBy = statusUpdatedBy;
    }

    public LicenseFamilyUpdatedByView getCreatedBy() {
	    return createdBy;
    }

    public void setCreatedBy(LicenseFamilyUpdatedByView createdBy) {
	    this.createdBy = createdBy;
    }

    public LicenseFamilyUpdatedByView getUpdatedBy() {
	    return updatedBy;
    }

    public void setUpdatedBy(LicenseFamilyUpdatedByView updatedBy) {
	    this.updatedBy = updatedBy;
    }

    public java.util.Date getExpirationDate() {
	    return expirationDate;
    }

    public void setExpirationDate(java.util.Date expirationDate) {
	    this.expirationDate = expirationDate;
    }

    public ProjectVersionLicenseLicensesOwnershipType getOwnership() {
	    return ownership;
    }

    public void setOwnership(ProjectVersionLicenseLicensesOwnershipType ownership) {
	    this.ownership = ownership;
    }

    public String getSpdxId() {
	    return spdxId;
    }

    public void setSpdxId(String spdxId) {
	    this.spdxId = spdxId;
    }

    public java.util.Date getUpdatedAt() {
	    return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
	    this.updatedAt = updatedAt;
    }

}
