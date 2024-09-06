/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.component;

import com.blackduck.integration.blackduck.api.generated.component.ComponentVersionLicenseLicensesLicenseFamilySummaryView;
import com.blackduck.integration.blackduck.api.manual.temporary.enumeration.LicenseStatusType;
import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.component.LicenseFamilyUpdatedByView;
import com.blackduck.integration.blackduck.api.generated.enumeration.LicenseOwnershipType;
import com.blackduck.integration.blackduck.api.generated.enumeration.LicenseSourceType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseViewWithText extends BlackDuckComponent {
    private java.util.Date createdAt;
    private LicenseFamilyUpdatedByView createdBy;
    private java.util.Date expirationDate;
    private ComponentVersionLicenseLicensesLicenseFamilySummaryView licenseFamily;
    private LicenseSourceType licenseSource;
    private LicenseStatusType licenseStatus;
    private Boolean licenseTextAdjusted;
    private String name;
    private String notes;
    private LicenseOwnershipType ownership;
    private String spdxId;
    private java.util.Date statusUpdatedAt;
    private LicenseFamilyUpdatedByView statusUpdatedBy;
    private String text;
    private java.util.Date updatedAt;
    private LicenseFamilyUpdatedByView updatedBy;

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public LicenseFamilyUpdatedByView getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(LicenseFamilyUpdatedByView createdBy) {
        this.createdBy = createdBy;
    }

    public java.util.Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public ComponentVersionLicenseLicensesLicenseFamilySummaryView getLicenseFamily() {
        return licenseFamily;
    }

    public void setLicenseFamily(ComponentVersionLicenseLicensesLicenseFamilySummaryView licenseFamily) {
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

    public Boolean getLicenseTextAdjusted() {
        return licenseTextAdjusted;
    }

    public void setLicenseTextAdjusted(Boolean licenseTextAdjusted) {
        this.licenseTextAdjusted = licenseTextAdjusted;
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

    public LicenseFamilyUpdatedByView getStatusUpdatedBy() {
        return statusUpdatedBy;
    }

    public void setStatusUpdatedBy(LicenseFamilyUpdatedByView statusUpdatedBy) {
        this.statusUpdatedBy = statusUpdatedBy;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LicenseFamilyUpdatedByView getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(LicenseFamilyUpdatedByView updatedBy) {
        this.updatedBy = updatedBy;
    }

}
