/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionAutoUnmappingStatusView extends BlackDuckComponent {
    private java.util.Date firstUnmappingDate;
    private Boolean hasCodeLocationMarkedForUnmapping;

    public java.util.Date getFirstUnmappingDate() {
        return firstUnmappingDate;
    }

    public void setFirstUnmappingDate(java.util.Date firstUnmappingDate) {
        this.firstUnmappingDate = firstUnmappingDate;
    }

    public Boolean getHasCodeLocationMarkedForUnmapping() {
        return hasCodeLocationMarkedForUnmapping;
    }

    public void setHasCodeLocationMarkedForUnmapping(Boolean hasCodeLocationMarkedForUnmapping) {
        this.hasCodeLocationMarkedForUnmapping = hasCodeLocationMarkedForUnmapping;
    }

}
