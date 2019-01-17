/**
 * blackduck-common-api
 *
 * Copyright (C) 2019 Black Duck Software, Inc.
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
import com.synopsys.integration.blackduck.api.generated.component.ReviewedDetails;
import com.synopsys.integration.blackduck.api.generated.component.VersionBomLicenseView;
import com.synopsys.integration.blackduck.api.generated.component.VersionBomOriginView;
import com.synopsys.integration.blackduck.api.generated.enumeration.MatchedFileUsagesType;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicySummaryStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.VersionBomComponentMatchType;
import com.synopsys.integration.blackduck.api.generated.enumeration.VersionBomComponentReviewStatusType;
import com.synopsys.integration.blackduck.api.generated.view.RiskProfileView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class HierarchicalVersionBomComponentView extends BlackDuckComponent {
    private RiskProfileView aggregateChildLicenseRiskProfile;
    private RiskProfileView aggregateChildOperationalRiskProfile;
    private PolicySummaryStatusType aggregateChildPolicyStatus;
    private RiskProfileView aggregateChildSecurityRiskProfile;
    private RiskProfileView aggregateLicenseRiskProfile;
    private RiskProfileView aggregateOperationalRiskProfile;
    private PolicySummaryStatusType aggregatePolicyStatus;
    private RiskProfileView aggregateSecurityRiskProfile;
    private String component;
    private String componentName;
    private String componentVersion;
    private String componentVersionName;
    private RiskProfileView licenseRiskProfile;
    private java.util.List<VersionBomLicenseView> licenses;
    private java.util.List<VersionBomComponentMatchType> matchTypes;
    private Integer numberOfMatches;
    private RiskProfileView operationalRiskProfile;
    private java.util.List<VersionBomOriginView> origins;
    private PolicySummaryStatusType policyStatus;
    private VersionBomComponentReviewStatusType reviewStatus;
    private ReviewedDetails reviewedDetails;
    private RiskProfileView securityRiskProfile;
    private java.util.List<MatchedFileUsagesType> usages;

    public RiskProfileView getAggregateChildLicenseRiskProfile() {
        return aggregateChildLicenseRiskProfile;
    }

    public void setAggregateChildLicenseRiskProfile(RiskProfileView aggregateChildLicenseRiskProfile) {
        this.aggregateChildLicenseRiskProfile = aggregateChildLicenseRiskProfile;
    }

    public RiskProfileView getAggregateChildOperationalRiskProfile() {
        return aggregateChildOperationalRiskProfile;
    }

    public void setAggregateChildOperationalRiskProfile(RiskProfileView aggregateChildOperationalRiskProfile) {
        this.aggregateChildOperationalRiskProfile = aggregateChildOperationalRiskProfile;
    }

    public PolicySummaryStatusType getAggregateChildPolicyStatus() {
        return aggregateChildPolicyStatus;
    }

    public void setAggregateChildPolicyStatus(PolicySummaryStatusType aggregateChildPolicyStatus) {
        this.aggregateChildPolicyStatus = aggregateChildPolicyStatus;
    }

    public RiskProfileView getAggregateChildSecurityRiskProfile() {
        return aggregateChildSecurityRiskProfile;
    }

    public void setAggregateChildSecurityRiskProfile(RiskProfileView aggregateChildSecurityRiskProfile) {
        this.aggregateChildSecurityRiskProfile = aggregateChildSecurityRiskProfile;
    }

    public RiskProfileView getAggregateLicenseRiskProfile() {
        return aggregateLicenseRiskProfile;
    }

    public void setAggregateLicenseRiskProfile(RiskProfileView aggregateLicenseRiskProfile) {
        this.aggregateLicenseRiskProfile = aggregateLicenseRiskProfile;
    }

    public RiskProfileView getAggregateOperationalRiskProfile() {
        return aggregateOperationalRiskProfile;
    }

    public void setAggregateOperationalRiskProfile(RiskProfileView aggregateOperationalRiskProfile) {
        this.aggregateOperationalRiskProfile = aggregateOperationalRiskProfile;
    }

    public PolicySummaryStatusType getAggregatePolicyStatus() {
        return aggregatePolicyStatus;
    }

    public void setAggregatePolicyStatus(PolicySummaryStatusType aggregatePolicyStatus) {
        this.aggregatePolicyStatus = aggregatePolicyStatus;
    }

    public RiskProfileView getAggregateSecurityRiskProfile() {
        return aggregateSecurityRiskProfile;
    }

    public void setAggregateSecurityRiskProfile(RiskProfileView aggregateSecurityRiskProfile) {
        this.aggregateSecurityRiskProfile = aggregateSecurityRiskProfile;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
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

    public RiskProfileView getLicenseRiskProfile() {
        return licenseRiskProfile;
    }

    public void setLicenseRiskProfile(RiskProfileView licenseRiskProfile) {
        this.licenseRiskProfile = licenseRiskProfile;
    }

    public java.util.List<VersionBomLicenseView> getLicenses() {
        return licenses;
    }

    public void setLicenses(java.util.List<VersionBomLicenseView> licenses) {
        this.licenses = licenses;
    }

    public java.util.List<VersionBomComponentMatchType> getMatchTypes() {
        return matchTypes;
    }

    public void setMatchTypes(java.util.List<VersionBomComponentMatchType> matchTypes) {
        this.matchTypes = matchTypes;
    }

    public Integer getNumberOfMatches() {
        return numberOfMatches;
    }

    public void setNumberOfMatches(Integer numberOfMatches) {
        this.numberOfMatches = numberOfMatches;
    }

    public RiskProfileView getOperationalRiskProfile() {
        return operationalRiskProfile;
    }

    public void setOperationalRiskProfile(RiskProfileView operationalRiskProfile) {
        this.operationalRiskProfile = operationalRiskProfile;
    }

    public java.util.List<VersionBomOriginView> getOrigins() {
        return origins;
    }

    public void setOrigins(java.util.List<VersionBomOriginView> origins) {
        this.origins = origins;
    }

    public PolicySummaryStatusType getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(PolicySummaryStatusType policyStatus) {
        this.policyStatus = policyStatus;
    }

    public VersionBomComponentReviewStatusType getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(VersionBomComponentReviewStatusType reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public ReviewedDetails getReviewedDetails() {
        return reviewedDetails;
    }

    public void setReviewedDetails(ReviewedDetails reviewedDetails) {
        this.reviewedDetails = reviewedDetails;
    }

    public RiskProfileView getSecurityRiskProfile() {
        return securityRiskProfile;
    }

    public void setSecurityRiskProfile(RiskProfileView securityRiskProfile) {
        this.securityRiskProfile = securityRiskProfile;
    }

    public java.util.List<MatchedFileUsagesType> getUsages() {
        return usages;
    }

    public void setUsages(java.util.List<MatchedFileUsagesType> usages) {
        this.usages = usages;
    }

}
