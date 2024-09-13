/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.deprecated.enumeration.MatchedFileUsagesType;
import com.blackduck.integration.blackduck.api.generated.deprecated.enumeration.VersionBomComponentMatchType;
import com.blackduck.integration.blackduck.api.generated.deprecated.enumeration.VersionBomComponentReviewStatusType;
import com.blackduck.integration.blackduck.api.generated.enumeration.ProjectVersionComponentPolicyStatusType;
import com.blackduck.integration.blackduck.api.generated.view.RiskProfileView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class HierarchicalVersionBomComponentView extends BlackDuckComponent {
    private RiskProfileView aggregateChildLicenseRiskProfile;
    private RiskProfileView aggregateChildOperationalRiskProfile;
    private ProjectVersionComponentPolicyStatusType aggregateChildPolicyStatus;
    private RiskProfileView aggregateChildSecurityRiskProfile;
    private RiskProfileView aggregateLicenseRiskProfile;
    private RiskProfileView aggregateOperationalRiskProfile;
    private ProjectVersionComponentPolicyStatusType aggregatePolicyStatus;
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
    private ProjectVersionComponentPolicyStatusType policyStatus;
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

    public ProjectVersionComponentPolicyStatusType getAggregateChildPolicyStatus() {
        return aggregateChildPolicyStatus;
    }

    public void setAggregateChildPolicyStatus(ProjectVersionComponentPolicyStatusType aggregateChildPolicyStatus) {
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

    public ProjectVersionComponentPolicyStatusType getAggregatePolicyStatus() {
        return aggregatePolicyStatus;
    }

    public void setAggregatePolicyStatus(ProjectVersionComponentPolicyStatusType aggregatePolicyStatus) {
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

    public ProjectVersionComponentPolicyStatusType getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(ProjectVersionComponentPolicyStatusType policyStatus) {
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
