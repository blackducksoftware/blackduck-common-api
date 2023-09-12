/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentsItemsLicenseDefinitionView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentsItemsPolicyResultsView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentsItemsVulnCountView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionComponentsView extends BlackDuckComponent {
    private String componentId;
    private String componentName;
    private String externalId;
    private String externalNamespace;
    private Boolean ignored;
    private ProjectVersionComponentsItemsLicenseDefinitionView licenseDefinition;
    private String originId;
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

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getExternalNamespace() {
        return externalNamespace;
    }

    public void setExternalNamespace(String externalNamespace) {
        this.externalNamespace = externalNamespace;
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

    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
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
