/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.deprecated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

import java.math.BigDecimal;

// TextByteOffsetView from the previous API is now called FileLicensesLicenseItemsOffsetsView
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public class TextByteOffsetView extends BlackDuckComponent {
    private BigDecimal endByte;
    private BigDecimal startByte;

    public BigDecimal getEndByte() {
        return endByte;
    }

    public void setEndByte(BigDecimal endByte) {
        this.endByte = endByte;
    }

    public BigDecimal getStartByte() {
        return startByte;
    }

    public void setStartByte(BigDecimal startByte) {
        this.startByte = startByte;
    }

}
