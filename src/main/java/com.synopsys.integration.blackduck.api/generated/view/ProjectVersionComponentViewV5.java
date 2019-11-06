package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseFamilyLicenseFamilyRiskRulesUsageType;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentActivityDataView;
import com.synopsys.integration.blackduck.api.generated.view.RiskProfileView;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.OriginView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.VersionBomComponentMatchType;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.VersionBomOriginView;
import java.math.BigDecimal;
import java.util.List;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.VersionBomPolicyRuleView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentReviewedDetailsView;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyStatusType;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentLicensesView;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.VersionBomComponentReviewStatusType;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.MatchedFileView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionComponentViewV5 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-5+json";

	public static final Map<String, LinkResponse> links = new HashMap<>();
        public static final String POLICY_RULES_LINK = "policy-rules";
        public static final String MATCHED_FILES_LINK = "matched-files";
        public static final String ORIGINS_LINK = "origins";

	public static final LinkMultipleResponses<VersionBomPolicyRuleView> POLICY_RULES_LINK_RESPONSE = new LinkMultipleResponses<VersionBomPolicyRuleView>(POLICY_RULES_LINK, VersionBomPolicyRuleView.class);
	public static final LinkMultipleResponses<MatchedFileView> MATCHED_FILES_LINK_RESPONSE = new LinkMultipleResponses<MatchedFileView>(MATCHED_FILES_LINK, MatchedFileView.class);
	public static final LinkMultipleResponses<OriginView> ORIGINS_LINK_RESPONSE = new LinkMultipleResponses<OriginView>(ORIGINS_LINK, OriginView.class);

    static {
	links.put(POLICY_RULES_LINK, POLICY_RULES_LINK_RESPONSE);
	links.put(MATCHED_FILES_LINK, MATCHED_FILES_LINK_RESPONSE);
	links.put(ORIGINS_LINK, ORIGINS_LINK_RESPONSE);
    }

    private Boolean inAttributionReport;
    private java.util.Date releasedOn;
    private String componentName;
    private RiskProfileView securityRiskProfile;
    private RiskProfileView versionRiskProfile;
    private ProjectVersionComponentReviewedDetailsView reviewedDetails;
    private String attributionStatement;
    private RiskProfileView activityRiskProfile;
    private java.util.List<VersionBomComponentMatchType> matchTypes;
    private java.util.List<VersionBomOriginView> origins;
    private java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> usages;
    private String policyStatus;
    private ProjectVersionComponentActivityDataView activityData;
    private String componentPurpose;
    private Boolean componentModified;
    private PolicyStatusType approvalStatus;
    private String componentVersion;
    private RiskProfileView licenseRiskProfile;
    private RiskProfileView operationalRiskProfile;
    private Boolean ignored;
    private String componentModification;
    private BigDecimal totalFileMatchCount;
    private java.util.List<ProjectVersionComponentLicensesView> licenses;
    private VersionBomComponentReviewStatusType reviewStatus;
    private Boolean manuallyAdjusted;
    private String component;
    private String componentVersionName;

    public Boolean getInAttributionReport() {
	return inAttributionReport;
    }

    public void setInAttributionReport(Boolean inAttributionReport) {
	this.inAttributionReport = inAttributionReport;
    }

    public java.util.Date getReleasedOn() {
	return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
	this.releasedOn = releasedOn;
    }

    public String getComponentName() {
	return componentName;
    }

    public void setComponentName(String componentName) {
	this.componentName = componentName;
    }

    public RiskProfileView getSecurityRiskProfile() {
	return securityRiskProfile;
    }

    public void setSecurityRiskProfile(RiskProfileView securityRiskProfile) {
	this.securityRiskProfile = securityRiskProfile;
    }

    public RiskProfileView getVersionRiskProfile() {
	return versionRiskProfile;
    }

    public void setVersionRiskProfile(RiskProfileView versionRiskProfile) {
	this.versionRiskProfile = versionRiskProfile;
    }

    public ProjectVersionComponentReviewedDetailsView getReviewedDetails() {
	return reviewedDetails;
    }

    public void setReviewedDetails(ProjectVersionComponentReviewedDetailsView reviewedDetails) {
	this.reviewedDetails = reviewedDetails;
    }

    public String getAttributionStatement() {
	return attributionStatement;
    }

    public void setAttributionStatement(String attributionStatement) {
	this.attributionStatement = attributionStatement;
    }

    public RiskProfileView getActivityRiskProfile() {
	return activityRiskProfile;
    }

    public void setActivityRiskProfile(RiskProfileView activityRiskProfile) {
	this.activityRiskProfile = activityRiskProfile;
    }

    public java.util.List<VersionBomComponentMatchType> getMatchTypes() {
	return matchTypes;
    }

    public void setMatchTypes(java.util.List<VersionBomComponentMatchType> matchTypes) {
	this.matchTypes = matchTypes;
    }

    public java.util.List<VersionBomOriginView> getOrigins() {
	return origins;
    }

    public void setOrigins(java.util.List<VersionBomOriginView> origins) {
	this.origins = origins;
    }

    public java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> getUsages() {
	return usages;
    }

    public void setUsages(java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> usages) {
	this.usages = usages;
    }

    public String getPolicyStatus() {
	return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
	this.policyStatus = policyStatus;
    }

    public ProjectVersionComponentActivityDataView getActivityData() {
	return activityData;
    }

    public void setActivityData(ProjectVersionComponentActivityDataView activityData) {
	this.activityData = activityData;
    }

    public String getComponentPurpose() {
	return componentPurpose;
    }

    public void setComponentPurpose(String componentPurpose) {
	this.componentPurpose = componentPurpose;
    }

    public Boolean getComponentModified() {
	return componentModified;
    }

    public void setComponentModified(Boolean componentModified) {
	this.componentModified = componentModified;
    }

    public PolicyStatusType getApprovalStatus() {
	return approvalStatus;
    }

    public void setApprovalStatus(PolicyStatusType approvalStatus) {
	this.approvalStatus = approvalStatus;
    }

    public String getComponentVersion() {
	return componentVersion;
    }

    public void setComponentVersion(String componentVersion) {
	this.componentVersion = componentVersion;
    }

    public RiskProfileView getLicenseRiskProfile() {
	return licenseRiskProfile;
    }

    public void setLicenseRiskProfile(RiskProfileView licenseRiskProfile) {
	this.licenseRiskProfile = licenseRiskProfile;
    }

    public RiskProfileView getOperationalRiskProfile() {
	return operationalRiskProfile;
    }

    public void setOperationalRiskProfile(RiskProfileView operationalRiskProfile) {
	this.operationalRiskProfile = operationalRiskProfile;
    }

    public Boolean getIgnored() {
	return ignored;
    }

    public void setIgnored(Boolean ignored) {
	this.ignored = ignored;
    }

    public String getComponentModification() {
	return componentModification;
    }

    public void setComponentModification(String componentModification) {
	this.componentModification = componentModification;
    }

    public BigDecimal getTotalFileMatchCount() {
	return totalFileMatchCount;
    }

    public void setTotalFileMatchCount(BigDecimal totalFileMatchCount) {
	this.totalFileMatchCount = totalFileMatchCount;
    }

    public java.util.List<ProjectVersionComponentLicensesView> getLicenses() {
	return licenses;
    }

    public void setLicenses(java.util.List<ProjectVersionComponentLicensesView> licenses) {
	this.licenses = licenses;
    }

    public VersionBomComponentReviewStatusType getReviewStatus() {
	return reviewStatus;
    }

    public void setReviewStatus(VersionBomComponentReviewStatusType reviewStatus) {
	this.reviewStatus = reviewStatus;
    }

    public Boolean getManuallyAdjusted() {
	return manuallyAdjusted;
    }

    public void setManuallyAdjusted(Boolean manuallyAdjusted) {
	this.manuallyAdjusted = manuallyAdjusted;
    }

    public String getComponent() {
	return component;
    }

    public void setComponent(String component) {
	this.component = component;
    }

    public String getComponentVersionName() {
	return componentVersionName;
    }

    public void setComponentVersionName(String componentVersionName) {
	this.componentVersionName = componentVersionName;
    }


    public String getMediaType() {
	return mediaType;
    }

}
