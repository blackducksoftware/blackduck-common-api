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
package com.synopsys.integration.blackduck.api.temporary.manual.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectRiskProfile extends BlackDuckComponent {
    private Integer bomCount;
    private java.util.List<Integer> bomViewEntryIds;
    private java.util.Date createdAt;
    private String createdBy;
    private String id;
    private java.util.Date lastBomUpdateDate;
    private java.util.Date lastScanDate;
    private String name;
    private String policyStatus;
    private java.util.List<PolicyStatusSummary> policyStatusSummaries;
    private java.util.Date projectLastUpdatedAt;
    private String projectLastUpdatedBy;
    private Integer releaseCount;
    private RiskProfile riskProfile;
    private Integer tier;

    public Integer getBomCount() {
        return bomCount;
    }

    public void setBomCount(Integer bomCount) {
        this.bomCount = bomCount;
    }

    public java.util.List<Integer> getBomViewEntryIds() {
        return bomViewEntryIds;
    }

    public void setBomViewEntryIds(java.util.List<Integer> bomViewEntryIds) {
        this.bomViewEntryIds = bomViewEntryIds;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public java.util.Date getLastBomUpdateDate() {
        return lastBomUpdateDate;
    }

    public void setLastBomUpdateDate(java.util.Date lastBomUpdateDate) {
        this.lastBomUpdateDate = lastBomUpdateDate;
    }

    public java.util.Date getLastScanDate() {
        return lastScanDate;
    }

    public void setLastScanDate(java.util.Date lastScanDate) {
        this.lastScanDate = lastScanDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
        this.policyStatus = policyStatus;
    }

    public java.util.List<PolicyStatusSummary> getPolicyStatusSummaries() {
        return policyStatusSummaries;
    }

    public void setPolicyStatusSummaries(java.util.List<PolicyStatusSummary> policyStatusSummaries) {
        this.policyStatusSummaries = policyStatusSummaries;
    }

    public java.util.Date getProjectLastUpdatedAt() {
        return projectLastUpdatedAt;
    }

    public void setProjectLastUpdatedAt(java.util.Date projectLastUpdatedAt) {
        this.projectLastUpdatedAt = projectLastUpdatedAt;
    }

    public String getProjectLastUpdatedBy() {
        return projectLastUpdatedBy;
    }

    public void setProjectLastUpdatedBy(String projectLastUpdatedBy) {
        this.projectLastUpdatedBy = projectLastUpdatedBy;
    }

    public Integer getReleaseCount() {
        return releaseCount;
    }

    public void setReleaseCount(Integer releaseCount) {
        this.releaseCount = releaseCount;
    }

    public RiskProfile getRiskProfile() {
        return riskProfile;
    }

    public void setRiskProfile(RiskProfile riskProfile) {
        this.riskProfile = riskProfile;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

}
