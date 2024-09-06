/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import java.math.BigDecimal;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LwBomsItemsVulnCountView extends BlackDuckComponent {
    private BigDecimal CRITICAL;
    private BigDecimal HIGH;
    private BigDecimal LOW;
    private BigDecimal MEDIUM;
    private BigDecimal OK;
    private BigDecimal UNKNOWN;

    public BigDecimal getCRITICAL() {
        return CRITICAL;
    }

    public void setCRITICAL(BigDecimal CRITICAL) {
        this.CRITICAL = CRITICAL;
    }

    public BigDecimal getHIGH() {
        return HIGH;
    }

    public void setHIGH(BigDecimal HIGH) {
        this.HIGH = HIGH;
    }

    public BigDecimal getLOW() {
        return LOW;
    }

    public void setLOW(BigDecimal LOW) {
        this.LOW = LOW;
    }

    public BigDecimal getMEDIUM() {
        return MEDIUM;
    }

    public void setMEDIUM(BigDecimal MEDIUM) {
        this.MEDIUM = MEDIUM;
    }

    public BigDecimal getOK() {
        return OK;
    }

    public void setOK(BigDecimal OK) {
        this.OK = OK;
    }

    public BigDecimal getUNKNOWN() {
        return UNKNOWN;
    }

    public void setUNKNOWN(BigDecimal UNKNOWN) {
        this.UNKNOWN = UNKNOWN;
    }

}
