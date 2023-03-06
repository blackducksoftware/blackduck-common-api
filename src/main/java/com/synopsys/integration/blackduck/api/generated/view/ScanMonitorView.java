/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ScanMonitorView extends BlackDuckView {
    private BigDecimal level;
    private String scanHealth;

    public BigDecimal getLevel() {
        return level;
    }

    public void setLevel(BigDecimal level) {
        this.level = level;
    }

    public String getScanHealth() {
        return scanHealth;
    }

    public void setScanHealth(String scanHealth) {
        this.scanHealth = scanHealth;
    }

}
