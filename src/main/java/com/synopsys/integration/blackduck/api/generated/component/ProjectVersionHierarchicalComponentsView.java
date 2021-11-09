package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionHierarchicalComponentsItemsAggregateChildLicenseRiskProfileView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionHierarchicalComponentsItemsAggregateChildOperationalRiskProfileView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionHierarchicalComponentsItemsAggregateChildSecurityRiskProfileView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionHierarchicalComponentsItemsAggregateLicenseRiskProfileView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionHierarchicalComponentsItemsAggregateOperationalRiskProfileView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionHierarchicalComponentsItemsAggregateSecurityRiskProfileView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionHierarchicalComponentsItemsLicenseRiskProfileView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionHierarchicalComponentsItemsLicensesView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionHierarchicalComponentsItemsOperationalRiskProfileView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionHierarchicalComponentsItemsOriginsView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionHierarchicalComponentsItemsReviewedDetailsView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionHierarchicalComponentsItemsSecurityRiskProfileView;
import com.synopsys.integration.blackduck.api.generated.enumeration.MatchType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentPolicyStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentReviewStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentType;
import com.synopsys.integration.blackduck.api.generated.enumeration.UsageType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionHierarchicalComponentsView extends BlackDuckComponent {
    private ProjectVersionHierarchicalComponentsItemsAggregateChildLicenseRiskProfileView aggregateChildLicenseRiskProfile;
    private ProjectVersionHierarchicalComponentsItemsAggregateChildOperationalRiskProfileView aggregateChildOperationalRiskProfile;
    private ProjectVersionComponentPolicyStatusType aggregateChildPolicyStatus;
    private ProjectVersionHierarchicalComponentsItemsAggregateChildSecurityRiskProfileView aggregateChildSecurityRiskProfile;
    private ProjectVersionHierarchicalComponentsItemsAggregateLicenseRiskProfileView aggregateLicenseRiskProfile;
    private ProjectVersionHierarchicalComponentsItemsAggregateOperationalRiskProfileView aggregateOperationalRiskProfile;
    private ProjectVersionComponentPolicyStatusType aggregatePolicyStatus;
    private ProjectVersionHierarchicalComponentsItemsAggregateSecurityRiskProfileView aggregateSecurityRiskProfile;
    private String component;
    private String componentName;
    private ProjectVersionComponentType componentType;
    private String componentVersion;
    private String componentVersionName;
    private ProjectVersionHierarchicalComponentsItemsLicenseRiskProfileView licenseRiskProfile;
    private java.util.List<ProjectVersionHierarchicalComponentsItemsLicensesView> licenses;
    private java.util.List<MatchType> matchTypes;
    private BigDecimal numberOfMatches;
    private ProjectVersionHierarchicalComponentsItemsOperationalRiskProfileView operationalRiskProfile;
    private java.util.List<ProjectVersionHierarchicalComponentsItemsOriginsView> origins;
    private ProjectVersionComponentPolicyStatusType policyStatus;
    private ProjectVersionComponentReviewStatusType reviewStatus;
    private ProjectVersionHierarchicalComponentsItemsReviewedDetailsView reviewedDetails;
    private ProjectVersionHierarchicalComponentsItemsSecurityRiskProfileView securityRiskProfile;
    private java.util.List<UsageType> usages;

    public ProjectVersionHierarchicalComponentsItemsAggregateChildLicenseRiskProfileView getAggregateChildLicenseRiskProfile() {
        return aggregateChildLicenseRiskProfile;
    }

    public void setAggregateChildLicenseRiskProfile(ProjectVersionHierarchicalComponentsItemsAggregateChildLicenseRiskProfileView aggregateChildLicenseRiskProfile) {
        this.aggregateChildLicenseRiskProfile = aggregateChildLicenseRiskProfile;
    }

    public ProjectVersionHierarchicalComponentsItemsAggregateChildOperationalRiskProfileView getAggregateChildOperationalRiskProfile() {
        return aggregateChildOperationalRiskProfile;
    }

    public void setAggregateChildOperationalRiskProfile(ProjectVersionHierarchicalComponentsItemsAggregateChildOperationalRiskProfileView aggregateChildOperationalRiskProfile) {
        this.aggregateChildOperationalRiskProfile = aggregateChildOperationalRiskProfile;
    }

    public ProjectVersionComponentPolicyStatusType getAggregateChildPolicyStatus() {
        return aggregateChildPolicyStatus;
    }

    public void setAggregateChildPolicyStatus(ProjectVersionComponentPolicyStatusType aggregateChildPolicyStatus) {
        this.aggregateChildPolicyStatus = aggregateChildPolicyStatus;
    }

    public ProjectVersionHierarchicalComponentsItemsAggregateChildSecurityRiskProfileView getAggregateChildSecurityRiskProfile() {
        return aggregateChildSecurityRiskProfile;
    }

    public void setAggregateChildSecurityRiskProfile(ProjectVersionHierarchicalComponentsItemsAggregateChildSecurityRiskProfileView aggregateChildSecurityRiskProfile) {
        this.aggregateChildSecurityRiskProfile = aggregateChildSecurityRiskProfile;
    }

    public ProjectVersionHierarchicalComponentsItemsAggregateLicenseRiskProfileView getAggregateLicenseRiskProfile() {
        return aggregateLicenseRiskProfile;
    }

    public void setAggregateLicenseRiskProfile(ProjectVersionHierarchicalComponentsItemsAggregateLicenseRiskProfileView aggregateLicenseRiskProfile) {
        this.aggregateLicenseRiskProfile = aggregateLicenseRiskProfile;
    }

    public ProjectVersionHierarchicalComponentsItemsAggregateOperationalRiskProfileView getAggregateOperationalRiskProfile() {
        return aggregateOperationalRiskProfile;
    }

    public void setAggregateOperationalRiskProfile(ProjectVersionHierarchicalComponentsItemsAggregateOperationalRiskProfileView aggregateOperationalRiskProfile) {
        this.aggregateOperationalRiskProfile = aggregateOperationalRiskProfile;
    }

    public ProjectVersionComponentPolicyStatusType getAggregatePolicyStatus() {
        return aggregatePolicyStatus;
    }

    public void setAggregatePolicyStatus(ProjectVersionComponentPolicyStatusType aggregatePolicyStatus) {
        this.aggregatePolicyStatus = aggregatePolicyStatus;
    }

    public ProjectVersionHierarchicalComponentsItemsAggregateSecurityRiskProfileView getAggregateSecurityRiskProfile() {
        return aggregateSecurityRiskProfile;
    }

    public void setAggregateSecurityRiskProfile(ProjectVersionHierarchicalComponentsItemsAggregateSecurityRiskProfileView aggregateSecurityRiskProfile) {
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

    public ProjectVersionHierarchicalComponentsItemsLicenseRiskProfileView getLicenseRiskProfile() {
        return licenseRiskProfile;
    }

    public void setLicenseRiskProfile(ProjectVersionHierarchicalComponentsItemsLicenseRiskProfileView licenseRiskProfile) {
        this.licenseRiskProfile = licenseRiskProfile;
    }

    public java.util.List<ProjectVersionHierarchicalComponentsItemsLicensesView> getLicenses() {
        return licenses;
    }

    public void setLicenses(java.util.List<ProjectVersionHierarchicalComponentsItemsLicensesView> licenses) {
        this.licenses = licenses;
    }

    public java.util.List<MatchType> getMatchTypes() {
        return matchTypes;
    }

    public void setMatchTypes(java.util.List<MatchType> matchTypes) {
        this.matchTypes = matchTypes;
    }

    public BigDecimal getNumberOfMatches() {
        return numberOfMatches;
    }

    public void setNumberOfMatches(BigDecimal numberOfMatches) {
        this.numberOfMatches = numberOfMatches;
    }

    public ProjectVersionHierarchicalComponentsItemsOperationalRiskProfileView getOperationalRiskProfile() {
        return operationalRiskProfile;
    }

    public void setOperationalRiskProfile(ProjectVersionHierarchicalComponentsItemsOperationalRiskProfileView operationalRiskProfile) {
        this.operationalRiskProfile = operationalRiskProfile;
    }

    public java.util.List<ProjectVersionHierarchicalComponentsItemsOriginsView> getOrigins() {
        return origins;
    }

    public void setOrigins(java.util.List<ProjectVersionHierarchicalComponentsItemsOriginsView> origins) {
        this.origins = origins;
    }

    public ProjectVersionComponentPolicyStatusType getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(ProjectVersionComponentPolicyStatusType policyStatus) {
        this.policyStatus = policyStatus;
    }

    public ProjectVersionComponentReviewStatusType getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(ProjectVersionComponentReviewStatusType reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public ProjectVersionHierarchicalComponentsItemsReviewedDetailsView getReviewedDetails() {
        return reviewedDetails;
    }

    public void setReviewedDetails(ProjectVersionHierarchicalComponentsItemsReviewedDetailsView reviewedDetails) {
        this.reviewedDetails = reviewedDetails;
    }

    public ProjectVersionHierarchicalComponentsItemsSecurityRiskProfileView getSecurityRiskProfile() {
        return securityRiskProfile;
    }

    public void setSecurityRiskProfile(ProjectVersionHierarchicalComponentsItemsSecurityRiskProfileView securityRiskProfile) {
        this.securityRiskProfile = securityRiskProfile;
    }

    public java.util.List<UsageType> getUsages() {
        return usages;
    }

    public void setUsages(java.util.List<UsageType> usages) {
        this.usages = usages;
    }

}
