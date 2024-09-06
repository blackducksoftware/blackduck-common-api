/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionComponentsView extends BlackDuckComponent {
    private String componentId;
    private String componentName;
    private Boolean ignored;
    private ProjectVersionComponentsItemsLicenseDefinitionView licenseDefinition;
    private java.util.List<ProjectVersionComponentsItemsOriginsView> origins;
    private java.util.List<ProjectVersionComponentsItemsPolicyResultsView> policyResults;
    private String source;
    private String versionId;
    private String versionName;
    private ProjectVersionComponentsItemsVulnCountView vulnCount;
    private java.util.List<String> vulnIds;

    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public Boolean getIgnored() {
        return ignored;
    }

    public void setIgnored(Boolean ignored) {
        this.ignored = ignored;
    }

    public ProjectVersionComponentsItemsLicenseDefinitionView getLicenseDefinition() {
        return licenseDefinition;
    }

    public void setLicenseDefinition(ProjectVersionComponentsItemsLicenseDefinitionView licenseDefinition) {
        this.licenseDefinition = licenseDefinition;
    }

    public java.util.List<ProjectVersionComponentsItemsOriginsView> getOrigins() {
        return origins;
    }

    public void setOrigins(java.util.List<ProjectVersionComponentsItemsOriginsView> origins) {
        this.origins = origins;
    }

    public java.util.List<ProjectVersionComponentsItemsPolicyResultsView> getPolicyResults() {
        return policyResults;
    }

    public void setPolicyResults(java.util.List<ProjectVersionComponentsItemsPolicyResultsView> policyResults) {
        this.policyResults = policyResults;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public ProjectVersionComponentsItemsVulnCountView getVulnCount() {
        return vulnCount;
    }

    public void setVulnCount(ProjectVersionComponentsItemsVulnCountView vulnCount) {
        this.vulnCount = vulnCount;
    }

    public java.util.List<String> getVulnIds() {
        return vulnIds;
    }

    public void setVulnIds(java.util.List<String> vulnIds) {
        this.vulnIds = vulnIds;
    }

}
