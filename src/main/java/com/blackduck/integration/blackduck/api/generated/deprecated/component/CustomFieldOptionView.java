/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.deprecated.component;

import java.math.BigDecimal;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// CustomFieldOptionView from the previous API is now called CustomFieldOptionsView
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public class CustomFieldOptionView extends BlackDuckComponent {
    private String label;
    private BigDecimal position;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public BigDecimal getPosition() {
        return position;
    }

    public void setPosition(BigDecimal position) {
        this.position = position;
    }

}
