/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

import java.math.BigDecimal;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LayersLayerIndexView extends BlackDuckComponent {
    private LayersLayerIndexActivityRiskProfileView activityRiskProfile;
    private BigDecimal addedCount;
    private String baseImageUri;
    private String command;
    private BigDecimal layerIndex;
    private LayersLayerIndexLicenseRiskProfileView licenseRiskProfile;
    private LayersLayerIndexOperationalRiskProfileView operationalRiskProfile;
    private BigDecimal removedCount;
    private LayersLayerIndexSecurityRiskProfileView securityRiskProfile;
    private BigDecimal size;
    private java.util.List<String> tags;
    private LayersLayerIndexVersionRiskProfileView versionRiskProfile;

    public LayersLayerIndexActivityRiskProfileView getActivityRiskProfile() {
        return activityRiskProfile;
    }

    public void setActivityRiskProfile(LayersLayerIndexActivityRiskProfileView activityRiskProfile) {
        this.activityRiskProfile = activityRiskProfile;
    }

    public BigDecimal getAddedCount() {
        return addedCount;
    }

    public void setAddedCount(BigDecimal addedCount) {
        this.addedCount = addedCount;
    }

    public String getBaseImageUri() {
        return baseImageUri;
    }

    public void setBaseImageUri(String baseImageUri) {
        this.baseImageUri = baseImageUri;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public BigDecimal getLayerIndex() {
        return layerIndex;
    }

    public void setLayerIndex(BigDecimal layerIndex) {
        this.layerIndex = layerIndex;
    }

    public LayersLayerIndexLicenseRiskProfileView getLicenseRiskProfile() {
        return licenseRiskProfile;
    }

    public void setLicenseRiskProfile(LayersLayerIndexLicenseRiskProfileView licenseRiskProfile) {
        this.licenseRiskProfile = licenseRiskProfile;
    }

    public LayersLayerIndexOperationalRiskProfileView getOperationalRiskProfile() {
        return operationalRiskProfile;
    }

    public void setOperationalRiskProfile(LayersLayerIndexOperationalRiskProfileView operationalRiskProfile) {
        this.operationalRiskProfile = operationalRiskProfile;
    }

    public BigDecimal getRemovedCount() {
        return removedCount;
    }

    public void setRemovedCount(BigDecimal removedCount) {
        this.removedCount = removedCount;
    }

    public LayersLayerIndexSecurityRiskProfileView getSecurityRiskProfile() {
        return securityRiskProfile;
    }

    public void setSecurityRiskProfile(LayersLayerIndexSecurityRiskProfileView securityRiskProfile) {
        this.securityRiskProfile = securityRiskProfile;
    }

    public BigDecimal getSize() {
        return size;
    }

    public void setSize(BigDecimal size) {
        this.size = size;
    }

    public java.util.List<String> getTags() {
        return tags;
    }

    public void setTags(java.util.List<String> tags) {
        this.tags = tags;
    }

    public LayersLayerIndexVersionRiskProfileView getVersionRiskProfile() {
        return versionRiskProfile;
    }

    public void setVersionRiskProfile(LayersLayerIndexVersionRiskProfileView versionRiskProfile) {
        this.versionRiskProfile = versionRiskProfile;
    }

}
