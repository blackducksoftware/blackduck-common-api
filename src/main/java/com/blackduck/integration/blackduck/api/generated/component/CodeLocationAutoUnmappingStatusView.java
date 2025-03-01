/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CodeLocationAutoUnmappingStatusView extends BlackDuckComponent {
    private Boolean markedForUnmapping;
    private java.util.Date unmappingDate;

    public Boolean getMarkedForUnmapping() {
        return markedForUnmapping;
    }

    public void setMarkedForUnmapping(Boolean markedForUnmapping) {
        this.markedForUnmapping = markedForUnmapping;
    }

    public java.util.Date getUnmappingDate() {
        return unmappingDate;
    }

    public void setUnmappingDate(java.util.Date unmappingDate) {
        this.unmappingDate = unmappingDate;
    }

}
