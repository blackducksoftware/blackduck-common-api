package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentActivityDataView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentLicensesView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentReviewedDetailsView;
import com.synopsys.integration.blackduck.api.generated.enumeration.MatchType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentPolicyStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentReviewStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentType;
import com.synopsys.integration.blackduck.api.generated.enumeration.UsageType;
import com.synopsys.integration.blackduck.api.generated.view.ComponentMatchedFilesView;
import com.synopsys.integration.blackduck.api.generated.view.ComponentPolicyRulesView;
import com.synopsys.integration.blackduck.api.generated.view.OriginView;
import com.synopsys.integration.blackduck.api.generated.view.RiskProfileView;
import com.synopsys.integration.blackduck.api.manual.temporary.component.VersionBomOriginView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionComponentView extends BlackDuckView {
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

    private java.util.List<UsageType> usages;
    private Boolean ignored;
    private java.util.Date releasedOn;
    private java.util.List<VersionBomOriginView> origins;
    private String component;
    private java.util.List<MatchType> matchTypes;
    private java.util.List<ProjectVersionComponentLicensesView> licenses;
    private String componentName;
    private String componentModification;
    private String componentPurpose;
    private String componentVersionName;
    private String attributionStatement;
    private String componentVersion;
    private Boolean manuallyAdjusted;
    private Boolean componentModified;
    private Boolean inAttributionReport;
    private BigDecimal totalFileMatchCount;
    private RiskProfileView versionRiskProfile;
    private RiskProfileView securityRiskProfile;
    private RiskProfileView licenseRiskProfile;
    private RiskProfileView activityRiskProfile;
    private ProjectVersionComponentType componentType;
    private RiskProfileView operationalRiskProfile;
    private ProjectVersionComponentActivityDataView activityData;
    private ProjectVersionComponentPolicyStatusType approvalStatus;
    private ProjectVersionComponentReviewStatusType reviewStatus;
    private ProjectVersionComponentPolicyStatusType policyStatus;
    private ProjectVersionComponentReviewedDetailsView reviewedDetails;

    public java.util.List<UsageType> getUsages() {
	    return usages;
    }

    public void setUsages(java.util.List<UsageType> usages) {
	    this.usages = usages;
    }

    public Boolean getIgnored() {
	    return ignored;
    }

    public void setIgnored(Boolean ignored) {
	    this.ignored = ignored;
    }

    public java.util.Date getReleasedOn() {
	    return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
	    this.releasedOn = releasedOn;
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

    public java.util.List<MatchType> getMatchTypes() {
	    return matchTypes;
    }

    public void setMatchTypes(java.util.List<MatchType> matchTypes) {
	    this.matchTypes = matchTypes;
    }

    public java.util.List<ProjectVersionComponentLicensesView> getLicenses() {
	    return licenses;
    }

    public void setLicenses(java.util.List<ProjectVersionComponentLicensesView> licenses) {
	    this.licenses = licenses;
    }

    public String getComponentName() {
	    return componentName;
    }

    public void setComponentName(String componentName) {
	    this.componentName = componentName;
    }

    public String getComponentModification() {
	    return componentModification;
    }

    public void setComponentModification(String componentModification) {
	    this.componentModification = componentModification;
    }

    public String getComponentPurpose() {
	    return componentPurpose;
    }

    public void setComponentPurpose(String componentPurpose) {
	    this.componentPurpose = componentPurpose;
    }

    public String getComponentVersionName() {
	    return componentVersionName;
    }

    public void setComponentVersionName(String componentVersionName) {
	    this.componentVersionName = componentVersionName;
    }

    public String getAttributionStatement() {
	    return attributionStatement;
    }

    public void setAttributionStatement(String attributionStatement) {
	    this.attributionStatement = attributionStatement;
    }

    public String getComponentVersion() {
	    return componentVersion;
    }

    public void setComponentVersion(String componentVersion) {
	    this.componentVersion = componentVersion;
    }

    public Boolean getManuallyAdjusted() {
	    return manuallyAdjusted;
    }

    public void setManuallyAdjusted(Boolean manuallyAdjusted) {
	    this.manuallyAdjusted = manuallyAdjusted;
    }

    public Boolean getComponentModified() {
	    return componentModified;
    }

    public void setComponentModified(Boolean componentModified) {
	    this.componentModified = componentModified;
    }

    public Boolean getInAttributionReport() {
	    return inAttributionReport;
    }

    public void setInAttributionReport(Boolean inAttributionReport) {
	    this.inAttributionReport = inAttributionReport;
    }

    public BigDecimal getTotalFileMatchCount() {
	    return totalFileMatchCount;
    }

    public void setTotalFileMatchCount(BigDecimal totalFileMatchCount) {
	    this.totalFileMatchCount = totalFileMatchCount;
    }

    public RiskProfileView getVersionRiskProfile() {
	    return versionRiskProfile;
    }

    public void setVersionRiskProfile(RiskProfileView versionRiskProfile) {
	    this.versionRiskProfile = versionRiskProfile;
    }

    public RiskProfileView getSecurityRiskProfile() {
	    return securityRiskProfile;
    }

    public void setSecurityRiskProfile(RiskProfileView securityRiskProfile) {
	    this.securityRiskProfile = securityRiskProfile;
    }

    public RiskProfileView getLicenseRiskProfile() {
	    return licenseRiskProfile;
    }

    public void setLicenseRiskProfile(RiskProfileView licenseRiskProfile) {
	    this.licenseRiskProfile = licenseRiskProfile;
    }

    public RiskProfileView getActivityRiskProfile() {
	    return activityRiskProfile;
    }

    public void setActivityRiskProfile(RiskProfileView activityRiskProfile) {
	    this.activityRiskProfile = activityRiskProfile;
    }

    public ProjectVersionComponentType getComponentType() {
	    return componentType;
    }

    public void setComponentType(ProjectVersionComponentType componentType) {
	    this.componentType = componentType;
    }

    public RiskProfileView getOperationalRiskProfile() {
	    return operationalRiskProfile;
    }

    public void setOperationalRiskProfile(RiskProfileView operationalRiskProfile) {
	    this.operationalRiskProfile = operationalRiskProfile;
    }

    public ProjectVersionComponentActivityDataView getActivityData() {
	    return activityData;
    }

    public void setActivityData(ProjectVersionComponentActivityDataView activityData) {
	    this.activityData = activityData;
    }

    public ProjectVersionComponentPolicyStatusType getApprovalStatus() {
	    return approvalStatus;
    }

    public void setApprovalStatus(ProjectVersionComponentPolicyStatusType approvalStatus) {
	    this.approvalStatus = approvalStatus;
    }

    public ProjectVersionComponentReviewStatusType getReviewStatus() {
	    return reviewStatus;
    }

    public void setReviewStatus(ProjectVersionComponentReviewStatusType reviewStatus) {
	    this.reviewStatus = reviewStatus;
    }

    public ProjectVersionComponentPolicyStatusType getPolicyStatus() {
	    return policyStatus;
    }

    public void setPolicyStatus(ProjectVersionComponentPolicyStatusType policyStatus) {
	    this.policyStatus = policyStatus;
    }

    public ProjectVersionComponentReviewedDetailsView getReviewedDetails() {
	    return reviewedDetails;
    }

    public void setReviewedDetails(ProjectVersionComponentReviewedDetailsView reviewedDetails) {
	    this.reviewedDetails = reviewedDetails;
    }

}