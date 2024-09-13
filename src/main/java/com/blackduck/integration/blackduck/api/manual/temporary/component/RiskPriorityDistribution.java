/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RiskPriorityDistribution extends BlackDuckComponent {
    private Integer CRITICAL;
    private Integer HIGH;
    private Integer LOW;
    private Integer MEDIUM;
    private Integer OK;
    private Integer UNKNOWN;

    public Integer getCRITICAL() {
        return CRITICAL;
    }

    public void setCRITICAL(Integer CRITICAL) {
        this.CRITICAL = CRITICAL;
    }

    public Integer getHIGH() {
        return HIGH;
    }

    public void setHIGH(Integer HIGH) {
        this.HIGH = HIGH;
    }

    public Integer getLOW() {
        return LOW;
    }

    public void setLOW(Integer LOW) {
        this.LOW = LOW;
    }

    public Integer getMEDIUM() {
        return MEDIUM;
    }

    public void setMEDIUM(Integer MEDIUM) {
        this.MEDIUM = MEDIUM;
    }

    public Integer getOK() {
        return OK;
    }

    public void setOK(Integer OK) {
        this.OK = OK;
    }

    public Integer getUNKNOWN() {
        return UNKNOWN;
    }

    public void setUNKNOWN(Integer UNKNOWN) {
        this.UNKNOWN = UNKNOWN;
    }

}
