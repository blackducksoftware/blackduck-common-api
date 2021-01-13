/**
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

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
