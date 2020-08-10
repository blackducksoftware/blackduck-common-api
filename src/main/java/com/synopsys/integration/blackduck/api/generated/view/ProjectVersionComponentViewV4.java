package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRiskProfileActivityDataView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentLicensesView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentReviewedDetailsView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseFamilyLicenseFamilyRiskRulesUsageType;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentMatchTypesType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentReviewStatusType;
import com.synopsys.integration.blackduck.api.generated.view.RiskProfileView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.VersionBomOriginView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.OriginView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionComponentViewV4 extends BlackDuckView {
	public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String MATCHED_FILES_LINK = "matched-files";
    public static final String ORIGINS_LINK = "origins";
    public static final String POLICY_RULES_LINK = "policy-rules";

	public static final LinkMultipleResponses<ComponentMatchedFilesView> MATCHED_FILES_LINK_RESPONSE = new LinkMultipleResponses<ComponentMatchedFilesView>(MATCHED_FILES_LINK, ComponentMatchedFilesView.class);
	public static final LinkMultipleResponses<OriginView> ORIGINS_LINK_RESPONSE = new LinkMultipleResponses<OriginView>(ORIGINS_LINK, OriginView.class);
	public static final LinkMultipleResponses<ComponentPolicyRulesView> POLICY_RULES_LINK_RESPONSE = new LinkMultipleResponses<ComponentPolicyRulesView>(POLICY_RULES_LINK, ComponentPolicyRulesView.class);

    static {
	    links.put(MATCHED_FILES_LINK, MATCHED_FILES_LINK_RESPONSE);
	    links.put(ORIGINS_LINK, ORIGINS_LINK_RESPONSE);
	    links.put(POLICY_RULES_LINK, POLICY_RULES_LINK_RESPONSE);
    }

    private String componentName;
    private java.util.List<VersionBomOriginView> origins;
    private String component;
    private ComponentVersionRiskProfileActivityDataView activityData;
    private String componentVersionName;
    private RiskProfileView versionRiskProfile;
    private RiskProfileView activityRiskProfile;
    private java.util.List<ProjectVersionComponentLicensesView> licenses;
    private RiskProfileView licenseRiskProfile;
    private PolicyStatusType policyStatus;
    private java.util.List<ProjectVersionComponentMatchTypesType> matchTypes;
    private java.util.Date releasedOn;
    private RiskProfileView securityRiskProfile;
    private ProjectVersionComponentReviewStatusType reviewStatus;
    private java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> usages;
    private PolicyStatusType approvalStatus;
    private ProjectVersionComponentReviewedDetailsView reviewedDetails;
    private BigDecimal totalFileMatchCount;
    private String componentVersion;
    private RiskProfileView operationalRiskProfile;

    public String getComponentName() {
	    return componentName;
    }

    public void setComponentName(String componentName) {
	    this.componentName = componentName;
    }

    public java.util.List<VersionBomOriginView> getOrigins() {
	    return origins;
    }

    public void setOrigins(java.util.List<VersionBomOriginView> origins) {
	    this.origins = origins;
    }

    public String getComponent() {
	    return component;
    }

    public void setComponent(String component) {
	    this.component = component;
    }

    public ComponentVersionRiskProfileActivityDataView getActivityData() {
	    return activityData;
    }

    public void setActivityData(ComponentVersionRiskProfileActivityDataView activityData) {
	    this.activityData = activityData;
    }

    public String getComponentVersionName() {
	    return componentVersionName;
    }

    public void setComponentVersionName(String componentVersionName) {
	    this.componentVersionName = componentVersionName;
    }

    public RiskProfileView getVersionRiskProfile() {
	    return versionRiskProfile;
    }

    public void setVersionRiskProfile(RiskProfileView versionRiskProfile) {
	    this.versionRiskProfile = versionRiskProfile;
    }

    public RiskProfileView getActivityRiskProfile() {
	    return activityRiskProfile;
    }

    public void setActivityRiskProfile(RiskProfileView activityRiskProfile) {
	    this.activityRiskProfile = activityRiskProfile;
    }

    public java.util.List<ProjectVersionComponentLicensesView> getLicenses() {
	    return licenses;
    }

    public void setLicenses(java.util.List<ProjectVersionComponentLicensesView> licenses) {
	    this.licenses = licenses;
    }

    public RiskProfileView getLicenseRiskProfile() {
	    return licenseRiskProfile;
    }

    public void setLicenseRiskProfile(RiskProfileView licenseRiskProfile) {
	    this.licenseRiskProfile = licenseRiskProfile;
    }

    public PolicyStatusType getPolicyStatus() {
	    return policyStatus;
    }

    public void setPolicyStatus(PolicyStatusType policyStatus) {
	    this.policyStatus = policyStatus;
    }

    public java.util.List<ProjectVersionComponentMatchTypesType> getMatchTypes() {
	    return matchTypes;
    }

    public void setMatchTypes(java.util.List<ProjectVersionComponentMatchTypesType> matchTypes) {
	    this.matchTypes = matchTypes;
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

    public ProjectVersionComponentReviewStatusType getReviewStatus() {
	    return reviewStatus;
    }

    public void setReviewStatus(ProjectVersionComponentReviewStatusType reviewStatus) {
	    this.reviewStatus = reviewStatus;
    }

    public java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> getUsages() {
	    return usages;
    }

    public void setUsages(java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> usages) {
	    this.usages = usages;
    }

    public PolicyStatusType getApprovalStatus() {
	    return approvalStatus;
    }

    public void setApprovalStatus(PolicyStatusType approvalStatus) {
	    this.approvalStatus = approvalStatus;
    }

    public ProjectVersionComponentReviewedDetailsView getReviewedDetails() {
	    return reviewedDetails;
    }

    public void setReviewedDetails(ProjectVersionComponentReviewedDetailsView reviewedDetails) {
	    this.reviewedDetails = reviewedDetails;
    }

    public BigDecimal getTotalFileMatchCount() {
	    return totalFileMatchCount;
    }

    public void setTotalFileMatchCount(BigDecimal totalFileMatchCount) {
	    this.totalFileMatchCount = totalFileMatchCount;
    }

    public String getComponentVersion() {
	    return componentVersion;
    }

    public void setComponentVersion(String componentVersion) {
	    this.componentVersion = componentVersion;
    }

    public RiskProfileView getOperationalRiskProfile() {
	    return operationalRiskProfile;
    }

    public void setOperationalRiskProfile(RiskProfileView operationalRiskProfile) {
	    this.operationalRiskProfile = operationalRiskProfile;
    }

}
