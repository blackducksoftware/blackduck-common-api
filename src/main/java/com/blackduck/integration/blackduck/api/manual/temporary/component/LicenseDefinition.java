/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.enumeration.LicenseType;
import com.blackduck.integration.blackduck.api.generated.enumeration.LicenseOwnershipType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseDefinition extends BlackDuckComponent {
    private Long codeSharing;
    private String discoveredAs;
    private String licenseDisplay;
    private String licenseId;
    private java.util.List<String> licenseIds;
    private LicenseType licenseType;
    private java.util.List<LicenseDefinition> licenses;
    private String name;
    private LicenseOwnershipType ownership;
    private String spdxId;

    public Long getCodeSharing() {
        return codeSharing;
    }

    public void setCodeSharing(Long codeSharing) {
        this.codeSharing = codeSharing;
    }

    public String getDiscoveredAs() {
        return discoveredAs;
    }

    public void setDiscoveredAs(String discoveredAs) {
        this.discoveredAs = discoveredAs;
    }

    public String getLicenseDisplay() {
        return licenseDisplay;
    }

    public void setLicenseDisplay(String licenseDisplay) {
        this.licenseDisplay = licenseDisplay;
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public java.util.List<String> getLicenseIds() {
        return licenseIds;
    }

    public void setLicenseIds(java.util.List<String> licenseIds) {
        this.licenseIds = licenseIds;
    }

    public LicenseType getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
    }

    public java.util.List<LicenseDefinition> getLicenses() {
        return licenses;
    }

    public void setLicenses(java.util.List<LicenseDefinition> licenses) {
        this.licenses = licenses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

}
