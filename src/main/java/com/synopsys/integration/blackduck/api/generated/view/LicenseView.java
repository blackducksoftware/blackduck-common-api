/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkBlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.core.response.UrlSingleResponse;
import com.synopsys.integration.blackduck.api.generated.component.LicenseCreatedByView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseLicenseFamilyView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseStatusUpdatedByView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseUpdatedByView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseOwnershipType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseSourceType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseStatusType;
import com.synopsys.integration.blackduck.api.manual.response.BlackDuckStringResponse;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseView extends BlackDuckView {
    public static final Map<String, LinkBlackDuckResponse> links = new HashMap<>();

    public static final String TEXT_LINK = "text";

    public static final LinkSingleResponse<BlackDuckStringResponse> TEXT_LINK_RESPONSE = new LinkSingleResponse<BlackDuckStringResponse>(TEXT_LINK, BlackDuckStringResponse.class);

    static {
        links.put(TEXT_LINK, TEXT_LINK_RESPONSE);
    }

    private java.util.Date createdAt;
    private LicenseCreatedByView createdBy;
    private java.util.Date expirationDate;
    private LicenseLicenseFamilyView licenseFamily;
    private LicenseSourceType licenseSource;
    private LicenseStatusType licenseStatus;
    private String name;
    private String notes;
    private LicenseOwnershipType ownership;
    private String spdxId;
    private java.util.Date statusUpdatedAt;
    private LicenseStatusUpdatedByView statusUpdatedBy;
    private java.util.Date updatedAt;
    private LicenseUpdatedByView updatedBy;

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public LicenseCreatedByView getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(LicenseCreatedByView createdBy) {
        this.createdBy = createdBy;
    }

    public java.util.Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public LicenseLicenseFamilyView getLicenseFamily() {
        return licenseFamily;
    }

    public void setLicenseFamily(LicenseLicenseFamilyView licenseFamily) {
        this.licenseFamily = licenseFamily;
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

    public LicenseStatusUpdatedByView getStatusUpdatedBy() {
        return statusUpdatedBy;
    }

    public void setStatusUpdatedBy(LicenseStatusUpdatedByView statusUpdatedBy) {
        this.statusUpdatedBy = statusUpdatedBy;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LicenseUpdatedByView getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(LicenseUpdatedByView updatedBy) {
        this.updatedBy = updatedBy;
    }

    public UrlSingleResponse<BlackDuckStringResponse> metaTextLink() {
        return metaSingleResponse(TEXT_LINK_RESPONSE);
    }

    public Optional<UrlSingleResponse<BlackDuckStringResponse>> metaTextLinkSafely() {
        return metaSingleResponseSafely(TEXT_LINK_RESPONSE);
    }

}
