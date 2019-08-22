package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentViewLicensesV5;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionComponentViewV5 extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();
    public static final String ORIGINS_LINK = "origins";

    public static final LinkMultipleResponses<OriginView> ORIGINS_LINK_RESPONSE = new LinkMultipleResponses<OriginView>(ORIGINS_LINK, OriginView.class);

    static {
        links.put(ORIGINS_LINK, ORIGINS_LINK_RESPONSE);
    }

    private java.util.List<String> matchTypes;
    private String approvalStatus;
    private Object securityRiskProfile;
    private Object _meta;
    private Object versionRiskProfile;
    private Object licenseRiskProfile;
    private String componentVersion;
    private String policyStatus;
    private String releasedOn;
    private BigDecimal totalFileMatchCount;
    private java.util.List<String> origins;
    private Object activityRiskProfile;
    private String component;
    private ProjectVersionComponentViewLicensesV5 licenses;
    private Object operationalRiskProfile;
    private String componentVersionName;
    private Object activityData;
    private Object reviewedDetails;
    private String reviewStatus;
    private String componentName;
    private java.util.List<String> usages;
    private String mediaType = "application/vnd.blackducksoftware.bill-of-materials-5+json";

    public java.util.List<String> getMatchTypes() {
    return matchTypes;
    }

    public void setMatchTypes(java.util.List<String> matchTypes) {
    this.matchTypes = matchTypes;
    }

    public String getApprovalStatus() {
    return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
    this.approvalStatus = approvalStatus;
    }

    public Object getSecurityRiskProfile() {
    return securityRiskProfile;
    }

    public void setSecurityRiskProfile(Object securityRiskProfile) {
    this.securityRiskProfile = securityRiskProfile;
    }

    public Object get_meta() {
    return _meta;
    }

    public void set_meta(Object _meta) {
    this._meta = _meta;
    }

    public Object getVersionRiskProfile() {
    return versionRiskProfile;
    }

    public void setVersionRiskProfile(Object versionRiskProfile) {
    this.versionRiskProfile = versionRiskProfile;
    }

    public Object getLicenseRiskProfile() {
    return licenseRiskProfile;
    }

    public void setLicenseRiskProfile(Object licenseRiskProfile) {
    this.licenseRiskProfile = licenseRiskProfile;
    }

    public String getComponentVersion() {
    return componentVersion;
    }

    public void setComponentVersion(String componentVersion) {
    this.componentVersion = componentVersion;
    }

    public String getPolicyStatus() {
    return policyStatus;
    }

    public void setPolicyStatus(String policyStatus) {
    this.policyStatus = policyStatus;
    }

    public String getReleasedOn() {
    return releasedOn;
    }

    public void setReleasedOn(String releasedOn) {
    this.releasedOn = releasedOn;
    }

    public BigDecimal getTotalFileMatchCount() {
    return totalFileMatchCount;
    }

    public void setTotalFileMatchCount(BigDecimal totalFileMatchCount) {
    this.totalFileMatchCount = totalFileMatchCount;
    }

    public java.util.List<String> getOrigins() {
    return origins;
    }

    public void setOrigins(java.util.List<String> origins) {
    this.origins = origins;
    }

    public Object getActivityRiskProfile() {
    return activityRiskProfile;
    }

    public void setActivityRiskProfile(Object activityRiskProfile) {
    this.activityRiskProfile = activityRiskProfile;
    }

    public String getComponent() {
    return component;
    }

    public void setComponent(String component) {
    this.component = component;
    }

    public ProjectVersionComponentViewLicensesV5 getLicenses() {
    return licenses;
    }

    public void setLicenses(ProjectVersionComponentViewLicensesV5 licenses) {
    this.licenses = licenses;
    }

    public Object getOperationalRiskProfile() {
    return operationalRiskProfile;
    }

    public void setOperationalRiskProfile(Object operationalRiskProfile) {
    this.operationalRiskProfile = operationalRiskProfile;
    }

    public String getComponentVersionName() {
    return componentVersionName;
    }

    public void setComponentVersionName(String componentVersionName) {
    this.componentVersionName = componentVersionName;
    }

    public Object getActivityData() {
    return activityData;
    }

    public void setActivityData(Object activityData) {
    this.activityData = activityData;
    }

    public Object getReviewedDetails() {
    return reviewedDetails;
    }

    public void setReviewedDetails(Object reviewedDetails) {
    this.reviewedDetails = reviewedDetails;
    }

    public String getReviewStatus() {
    return reviewStatus;
    }

    public void setReviewStatus(String reviewStatus) {
    this.reviewStatus = reviewStatus;
    }

    public String getComponentName() {
    return componentName;
    }

    public void setComponentName(String componentName) {
    this.componentName = componentName;
    }

    public java.util.List<String> getUsages() {
    return usages;
    }

    public void setUsages(java.util.List<String> usages) {
    this.usages = usages;
    }

	public String getMediaType() {
	return mediaType;
	}

}
