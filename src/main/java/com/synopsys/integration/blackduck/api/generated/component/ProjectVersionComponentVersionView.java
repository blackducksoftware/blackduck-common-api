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
package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentVersionActivityDataView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentVersionLicensesView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentVersionReviewedDetailsView;
import com.synopsys.integration.blackduck.api.generated.enumeration.MatchType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentPolicyStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentReviewStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentType;
import com.synopsys.integration.blackduck.api.generated.view.RiskProfileView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionComponentVersionView extends BlackDuckComponent {
    private ProjectVersionComponentVersionActivityDataView activityData;
    private RiskProfileView activityRiskProfile;
    private String approvalStatus;
    private String attributionStatement;
    private String component;
    private String componentModification;
    private Boolean componentModified;
    private String componentName;
    private String componentPurpose;
    private ProjectVersionComponentType componentType;
    private String componentVersion;
    private String componentVersionName;
    private Boolean ignored;
    private Boolean inAttributionReport;
    private RiskProfileView licenseRiskProfile;
    private java.util.List<ProjectVersionComponentVersionLicensesView> licenses;
    private Boolean manuallyAdjusted;
    private java.util.List<MatchType> matchTypes;
    private RiskProfileView operationalRiskProfile;
    private java.util.List<String> origins;
    private ProjectVersionComponentPolicyStatusType policyStatus;
    private java.util.Date releasedOn;
    private ProjectVersionComponentReviewStatusType reviewStatus;
    private ProjectVersionComponentVersionReviewedDetailsView reviewedDetails;
    private RiskProfileView securityRiskProfile;
    private BigDecimal totalFileMatchCount;
    private java.util.List<String> usages;
    private RiskProfileView versionRiskProfile;

    public ProjectVersionComponentVersionActivityDataView getActivityData() {
        return activityData;
    }

    public void setActivityData(ProjectVersionComponentVersionActivityDataView activityData) {
        this.activityData = activityData;
    }

    public RiskProfileView getActivityRiskProfile() {
        return activityRiskProfile;
    }

    public void setActivityRiskProfile(RiskProfileView activityRiskProfile) {
        this.activityRiskProfile = activityRiskProfile;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getAttributionStatement() {
        return attributionStatement;
    }

    public void setAttributionStatement(String attributionStatement) {
        this.attributionStatement = attributionStatement;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getComponentModification() {
        return componentModification;
    }

    public void setComponentModification(String componentModification) {
        this.componentModification = componentModification;
    }

    public Boolean getComponentModified() {
        return componentModified;
    }

    public void setComponentModified(Boolean componentModified) {
        this.componentModified = componentModified;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getComponentPurpose() {
        return componentPurpose;
    }

    public void setComponentPurpose(String componentPurpose) {
        this.componentPurpose = componentPurpose;
    }

    public ProjectVersionComponentType getComponentType() {
        return componentType;
    }

    public void setComponentType(ProjectVersionComponentType componentType) {
        this.componentType = componentType;
    }

    public String getComponentVersion() {
        return componentVersion;
    }

    public void setComponentVersion(String componentVersion) {
        this.componentVersion = componentVersion;
    }

    public String getComponentVersionName() {
        return componentVersionName;
    }

    public void setComponentVersionName(String componentVersionName) {
        this.componentVersionName = componentVersionName;
    }

    public Boolean getIgnored() {
        return ignored;
    }

    public void setIgnored(Boolean ignored) {
        this.ignored = ignored;
    }

    public Boolean getInAttributionReport() {
        return inAttributionReport;
    }

    public void setInAttributionReport(Boolean inAttributionReport) {
        this.inAttributionReport = inAttributionReport;
    }

    public RiskProfileView getLicenseRiskProfile() {
        return licenseRiskProfile;
    }

    public void setLicenseRiskProfile(RiskProfileView licenseRiskProfile) {
        this.licenseRiskProfile = licenseRiskProfile;
    }

    public java.util.List<ProjectVersionComponentVersionLicensesView> getLicenses() {
        return licenses;
    }

    public void setLicenses(java.util.List<ProjectVersionComponentVersionLicensesView> licenses) {
        this.licenses = licenses;
    }

    public Boolean getManuallyAdjusted() {
        return manuallyAdjusted;
    }

    public void setManuallyAdjusted(Boolean manuallyAdjusted) {
        this.manuallyAdjusted = manuallyAdjusted;
    }

    public java.util.List<MatchType> getMatchTypes() {
        return matchTypes;
    }

    public void setMatchTypes(java.util.List<MatchType> matchTypes) {
        this.matchTypes = matchTypes;
    }

    public RiskProfileView getOperationalRiskProfile() {
        return operationalRiskProfile;
    }

    public void setOperationalRiskProfile(RiskProfileView operationalRiskProfile) {
        this.operationalRiskProfile = operationalRiskProfile;
    }

    public java.util.List<String> getOrigins() {
        return origins;
    }

    public void setOrigins(java.util.List<String> origins) {
        this.origins = origins;
    }

    public ProjectVersionComponentPolicyStatusType getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(ProjectVersionComponentPolicyStatusType policyStatus) {
        this.policyStatus = policyStatus;
    }

    public java.util.Date getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
        this.releasedOn = releasedOn;
    }

    public ProjectVersionComponentReviewStatusType getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(ProjectVersionComponentReviewStatusType reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public ProjectVersionComponentVersionReviewedDetailsView getReviewedDetails() {
        return reviewedDetails;
    }

    public void setReviewedDetails(ProjectVersionComponentVersionReviewedDetailsView reviewedDetails) {
        this.reviewedDetails = reviewedDetails;
    }

    public RiskProfileView getSecurityRiskProfile() {
        return securityRiskProfile;
    }

    public void setSecurityRiskProfile(RiskProfileView securityRiskProfile) {
        this.securityRiskProfile = securityRiskProfile;
    }

    public BigDecimal getTotalFileMatchCount() {
        return totalFileMatchCount;
    }

    public void setTotalFileMatchCount(BigDecimal totalFileMatchCount) {
        this.totalFileMatchCount = totalFileMatchCount;
    }

    public java.util.List<String> getUsages() {
        return usages;
    }

    public void setUsages(java.util.List<String> usages) {
        this.usages = usages;
    }

    public RiskProfileView getVersionRiskProfile() {
        return versionRiskProfile;
    }

    public void setVersionRiskProfile(RiskProfileView versionRiskProfile) {
        this.versionRiskProfile = versionRiskProfile;
    }

}
