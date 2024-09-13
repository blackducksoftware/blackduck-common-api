/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

import java.math.BigDecimal;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionIacIssueCountsView extends BlackDuckComponent {
    private Boolean iacScanPresent;
    private BigDecimal ignoredCount;
    private BigDecimal totalCount;
    private BigDecimal unignoredCount;

    public Boolean getIacScanPresent() {
        return iacScanPresent;
    }

    public void setIacScanPresent(Boolean iacScanPresent) {
        this.iacScanPresent = iacScanPresent;
    }

    public BigDecimal getIgnoredCount() {
        return ignoredCount;
    }

    public void setIgnoredCount(BigDecimal ignoredCount) {
        this.ignoredCount = ignoredCount;
    }

    public BigDecimal getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(BigDecimal totalCount) {
        this.totalCount = totalCount;
    }

    public BigDecimal getUnignoredCount() {
        return unignoredCount;
    }

    public void setUnignoredCount(BigDecimal unignoredCount) {
        this.unignoredCount = unignoredCount;
    }

}
