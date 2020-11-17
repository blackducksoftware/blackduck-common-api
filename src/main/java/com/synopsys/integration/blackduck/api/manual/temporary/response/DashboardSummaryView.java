/**
 * blackduck-common-api
 *
 * Copyright (c) 2020 Synopsys, Inc.
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
package com.synopsys.integration.blackduck.api.manual.temporary.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class DashboardSummaryView extends BlackDuckResponse {
    private String catalogRiskProfile;
    private String dashboardFacts;
    private String dashboardOverall;
    private String dashboardPolicyViolationByTier;
    private String dashboardTopPolicyViolation;
    private String dashboardTopSecurityRisk;
    private String riskProfile;

    public String getCatalogRiskProfile() {
        return catalogRiskProfile;
    }

    public void setCatalogRiskProfile(String catalogRiskProfile) {
        this.catalogRiskProfile = catalogRiskProfile;
    }

    public String getDashboardFacts() {
        return dashboardFacts;
    }

    public void setDashboardFacts(String dashboardFacts) {
        this.dashboardFacts = dashboardFacts;
    }

    public String getDashboardOverall() {
        return dashboardOverall;
    }

    public void setDashboardOverall(String dashboardOverall) {
        this.dashboardOverall = dashboardOverall;
    }

    public String getDashboardPolicyViolationByTier() {
        return dashboardPolicyViolationByTier;
    }

    public void setDashboardPolicyViolationByTier(String dashboardPolicyViolationByTier) {
        this.dashboardPolicyViolationByTier = dashboardPolicyViolationByTier;
    }

    public String getDashboardTopPolicyViolation() {
        return dashboardTopPolicyViolation;
    }

    public void setDashboardTopPolicyViolation(String dashboardTopPolicyViolation) {
        this.dashboardTopPolicyViolation = dashboardTopPolicyViolation;
    }

    public String getDashboardTopSecurityRisk() {
        return dashboardTopSecurityRisk;
    }

    public void setDashboardTopSecurityRisk(String dashboardTopSecurityRisk) {
        this.dashboardTopSecurityRisk = dashboardTopSecurityRisk;
    }

    public String getRiskProfile() {
        return riskProfile;
    }

    public void setRiskProfile(String riskProfile) {
        this.riskProfile = riskProfile;
    }

}
