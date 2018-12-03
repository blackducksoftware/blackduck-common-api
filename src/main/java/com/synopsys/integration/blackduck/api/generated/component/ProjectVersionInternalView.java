/**
 * blackduck-common-api
 *
 * Copyright (C) 2018 Black Duck Software, Inc.
 * http://www.blackducksoftware.com/
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
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.PolicyStatusSummaryInternalView;
import com.synopsys.integration.blackduck.api.generated.enumeration.OriginSourceType;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicySummaryStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionDistributionType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionPhaseType;
import com.synopsys.integration.blackduck.api.generated.view.ComplexLicenseView;
import com.synopsys.integration.blackduck.api.generated.view.RiskProfileView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionInternalView extends BlackDuckComponent {
    private java.util.Date createdAt;
    private String createdBy;
    private String createdByUser;
    private ProjectVersionDistributionType distribution;
    private java.util.Date lastBomUpdateDate;
    private java.util.Date lastScanDate;
    private ComplexLicenseView license;
    private RiskProfileView licenseRiskProfile;
    private String nickname;
    private RiskProfileView operationalRiskProfile;
    private ProjectVersionPhaseType phase;
    private PolicySummaryStatusType policyStatus;
    private java.util.List<PolicyStatusSummaryInternalView> policyStatusSummaries;
    private String releaseComments;
    private java.util.Date releasedOn;
    private RiskProfileView securityRiskProfile;
    private java.util.Date settingUpdatedAt;
    private String settingUpdatedBy;
    private String settingUpdatedByUser;
    private OriginSourceType source;
    private String versionName;

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

    public String getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
        this.createdByUser = createdByUser;
    }

    public ProjectVersionDistributionType getDistribution() {
        return distribution;
    }

    public void setDistribution(ProjectVersionDistributionType distribution) {
        this.distribution = distribution;
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

    public ComplexLicenseView getLicense() {
        return license;
    }

    public void setLicense(ComplexLicenseView license) {
        this.license = license;
    }

    public RiskProfileView getLicenseRiskProfile() {
        return licenseRiskProfile;
    }

    public void setLicenseRiskProfile(RiskProfileView licenseRiskProfile) {
        this.licenseRiskProfile = licenseRiskProfile;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public RiskProfileView getOperationalRiskProfile() {
        return operationalRiskProfile;
    }

    public void setOperationalRiskProfile(RiskProfileView operationalRiskProfile) {
        this.operationalRiskProfile = operationalRiskProfile;
    }

    public ProjectVersionPhaseType getPhase() {
        return phase;
    }

    public void setPhase(ProjectVersionPhaseType phase) {
        this.phase = phase;
    }

    public PolicySummaryStatusType getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(PolicySummaryStatusType policyStatus) {
        this.policyStatus = policyStatus;
    }

    public java.util.List<PolicyStatusSummaryInternalView> getPolicyStatusSummaries() {
        return policyStatusSummaries;
    }

    public void setPolicyStatusSummaries(java.util.List<PolicyStatusSummaryInternalView> policyStatusSummaries) {
        this.policyStatusSummaries = policyStatusSummaries;
    }

    public String getReleaseComments() {
        return releaseComments;
    }

    public void setReleaseComments(String releaseComments) {
        this.releaseComments = releaseComments;
    }

    public java.util.Date getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
        this.releasedOn = releasedOn;
    }

    public RiskProfileView getSecurityRiskProfile() {
        return securityRiskProfile;
    }

    public void setSecurityRiskProfile(RiskProfileView securityRiskProfile) {
        this.securityRiskProfile = securityRiskProfile;
    }

    public java.util.Date getSettingUpdatedAt() {
        return settingUpdatedAt;
    }

    public void setSettingUpdatedAt(java.util.Date settingUpdatedAt) {
        this.settingUpdatedAt = settingUpdatedAt;
    }

    public String getSettingUpdatedBy() {
        return settingUpdatedBy;
    }

    public void setSettingUpdatedBy(String settingUpdatedBy) {
        this.settingUpdatedBy = settingUpdatedBy;
    }

    public String getSettingUpdatedByUser() {
        return settingUpdatedByUser;
    }

    public void setSettingUpdatedByUser(String settingUpdatedByUser) {
        this.settingUpdatedByUser = settingUpdatedByUser;
    }

    public OriginSourceType getSource() {
        return source;
    }

    public void setSource(OriginSourceType source) {
        this.source = source;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

}
