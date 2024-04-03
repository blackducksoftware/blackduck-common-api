/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class SourceTreeNodeView extends BlackDuckComponent {
    private Boolean containsMatch;
    private Boolean matched;
    private String name;
    private String nodeType;
    private java.util.List<String> scanIds;

    public Boolean getContainsMatch() {
        return containsMatch;
    }

    public void setContainsMatch(Boolean containsMatch) {
        this.containsMatch = containsMatch;
    }

    public Boolean getMatched() {
        return matched;
    }

    public void setMatched(Boolean matched) {
        this.matched = matched;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public java.util.List<String> getScanIds() {
        return scanIds;
    }

    public void setScanIds(java.util.List<String> scanIds) {
        this.scanIds = scanIds;
    }

}
