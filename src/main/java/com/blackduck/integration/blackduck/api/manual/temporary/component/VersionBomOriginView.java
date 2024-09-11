/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.core.ResourceMetadata;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionBomOriginView extends BlackDuckComponent {
    private String externalId;
    private String externalNamespace;
    private Boolean externalNamespaceDistribution;
    private String name;
    private String origin;
    private ResourceMetadata _meta;

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

    public Boolean getExternalNamespaceDistribution() {
        return externalNamespaceDistribution;
    }

    public void setExternalNamespaceDistribution(Boolean externalNamespaceDistribution) {
        this.externalNamespaceDistribution = externalNamespaceDistribution;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public ResourceMetadata getMeta() {
        return _meta;
    }

    public void setMeta(ResourceMetadata meta) {
        _meta = meta;
    }

}
