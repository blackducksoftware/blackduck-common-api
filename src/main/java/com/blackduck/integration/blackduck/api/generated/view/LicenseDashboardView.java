/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.view;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;
import com.blackduck.integration.blackduck.api.generated.component.LicenseDashboardItemsCreatedByView;
import com.blackduck.integration.blackduck.api.generated.component.LicenseDashboardItemsLicenseFamilyView;
import com.blackduck.integration.blackduck.api.generated.component.LicenseDashboardItemsStatusUpdatedByView;
import com.blackduck.integration.blackduck.api.generated.component.LicenseDashboardItemsUpdatedByView;
import com.blackduck.integration.blackduck.api.generated.enumeration.LicenseOwnershipType;
import com.blackduck.integration.blackduck.api.generated.enumeration.LicenseSourceType;
import com.blackduck.integration.blackduck.api.generated.enumeration.LicenseStatusType;

import java.math.BigDecimal;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseDashboardView extends BlackDuckView {
    private BigDecimal bomComponentCount;
    private java.util.Date createdAt;
    private LicenseDashboardItemsCreatedByView createdBy;
    private java.util.Date expirationDate;
    private Boolean inUse;
    private LicenseDashboardItemsLicenseFamilyView licenseFamily;
    private LicenseSourceType licenseSource;
    private LicenseStatusType licenseStatus;
    private String name;
    private String notes;
    private LicenseOwnershipType ownership;
    private java.util.Date statusUpdatedAt;
    private LicenseDashboardItemsStatusUpdatedByView statusUpdatedBy;
    private java.util.Date updatedAt;
    private LicenseDashboardItemsUpdatedByView updatedBy;

    public BigDecimal getBomComponentCount() {
        return bomComponentCount;
    }

    public void setBomComponentCount(BigDecimal bomComponentCount) {
        this.bomComponentCount = bomComponentCount;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public LicenseDashboardItemsCreatedByView getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(LicenseDashboardItemsCreatedByView createdBy) {
        this.createdBy = createdBy;
    }

    public java.util.Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(java.util.Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Boolean getInUse() {
        return inUse;
    }

    public void setInUse(Boolean inUse) {
        this.inUse = inUse;
    }

    public LicenseDashboardItemsLicenseFamilyView getLicenseFamily() {
        return licenseFamily;
    }

    public void setLicenseFamily(LicenseDashboardItemsLicenseFamilyView licenseFamily) {
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

    public java.util.Date getStatusUpdatedAt() {
        return statusUpdatedAt;
    }

    public void setStatusUpdatedAt(java.util.Date statusUpdatedAt) {
        this.statusUpdatedAt = statusUpdatedAt;
    }

    public LicenseDashboardItemsStatusUpdatedByView getStatusUpdatedBy() {
        return statusUpdatedBy;
    }

    public void setStatusUpdatedBy(LicenseDashboardItemsStatusUpdatedByView statusUpdatedBy) {
        this.statusUpdatedBy = statusUpdatedBy;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LicenseDashboardItemsUpdatedByView getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(LicenseDashboardItemsUpdatedByView updatedBy) {
        this.updatedBy = updatedBy;
    }

}
