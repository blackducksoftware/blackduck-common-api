/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class DeclaredComponentPath extends BlackDuckComponent {
    private String externalComponentId;
    private java.util.List<String> externalIds;
    private Long nodeId;

    public String getExternalComponentId() {
        return externalComponentId;
    }

    public void setExternalComponentId(String externalComponentId) {
        this.externalComponentId = externalComponentId;
    }

    public java.util.List<String> getExternalIds() {
        return externalIds;
    }

    public void setExternalIds(java.util.List<String> externalIds) {
        this.externalIds = externalIds;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

}
