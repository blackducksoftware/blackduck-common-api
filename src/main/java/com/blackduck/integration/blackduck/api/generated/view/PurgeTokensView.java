/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.view;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;

import java.math.BigDecimal;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PurgeTokensView extends BlackDuckView {
    private BigDecimal purgeCount;
    private BigDecimal purgeWeeks;
    private BigDecimal totalCount;

    public BigDecimal getPurgeCount() {
        return purgeCount;
    }

    public void setPurgeCount(BigDecimal purgeCount) {
        this.purgeCount = purgeCount;
    }

    public BigDecimal getPurgeWeeks() {
        return purgeWeeks;
    }

    public void setPurgeWeeks(BigDecimal purgeWeeks) {
        this.purgeWeeks = purgeWeeks;
    }

    public BigDecimal getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
    }

}
