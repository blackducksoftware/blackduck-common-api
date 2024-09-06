/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class UUID extends BlackDuckComponent {
    private Long leastSignificantBits;
    private Long mostSignificantBits;

    public Long getLeastSignificantBits() {
        return leastSignificantBits;
    }

    public void setLeastSignificantBits(Long leastSignificantBits) {
        this.leastSignificantBits = leastSignificantBits;
    }

    public Long getMostSignificantBits() {
        return mostSignificantBits;
    }

    public void setMostSignificantBits(Long mostSignificantBits) {
        this.mostSignificantBits = mostSignificantBits;
    }

}
