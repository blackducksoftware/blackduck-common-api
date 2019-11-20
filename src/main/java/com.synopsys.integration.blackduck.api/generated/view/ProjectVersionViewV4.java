package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionComponentView;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.IssueView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.ProjectVersionPhaseType;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionLicenseView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionPolicyStatusView;
import com.synopsys.integration.blackduck.api.generated.view.CodeLocationView;
import com.synopsys.integration.blackduck.api.core.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseFamilyLicenseFamilyRiskRulesReleaseDistributionType;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.VulnerableComponentView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.project-detail-4+json";

	public static final Map<String, LinkResponse> links = new HashMap<>();
        public static final String LICENSEREPORTS_LINK = "licenseReports";
        public static final String VULNERABLE_COMPONENTS_LINK = "vulnerable-components";
        public static final String COMPONENTS_LINK = "components";
        public static final String CODELOCATIONS_LINK = "codelocations";
        public static final String POLICY_STATUS_LINK = "policy-status";
        public static final String PROJECT_LINK = "project";
        public static final String ISSUES_LINK = "issues";

	public static final LinkMultipleResponses<ReportView> LICENSEREPORTS_LINK_RESPONSE = new LinkMultipleResponses<ReportView>(LICENSEREPORTS_LINK, ReportView.class);
	public static final LinkMultipleResponses<VulnerableComponentView> VULNERABLE_COMPONENTS_LINK_RESPONSE = new LinkMultipleResponses<VulnerableComponentView>(VULNERABLE_COMPONENTS_LINK, VulnerableComponentView.class);
	public static final LinkMultipleResponses<ProjectVersionComponentView> COMPONENTS_LINK_RESPONSE = new LinkMultipleResponses<ProjectVersionComponentView>(COMPONENTS_LINK, ProjectVersionComponentView.class);
	public static final LinkMultipleResponses<CodeLocationView> CODELOCATIONS_LINK_RESPONSE = new LinkMultipleResponses<CodeLocationView>(CODELOCATIONS_LINK, CodeLocationView.class);
	public static final LinkSingleResponse<ProjectVersionPolicyStatusView> POLICY_STATUS_LINK_RESPONSE = new LinkSingleResponse<ProjectVersionPolicyStatusView>(POLICY_STATUS_LINK, ProjectVersionPolicyStatusView.class);
	public static final LinkSingleResponse<ProjectView> PROJECT_LINK_RESPONSE = new LinkSingleResponse<ProjectView>(PROJECT_LINK, ProjectView.class);
	public static final LinkMultipleResponses<IssueView> ISSUES_LINK_RESPONSE = new LinkMultipleResponses<IssueView>(ISSUES_LINK, IssueView.class);

    static {
	links.put(LICENSEREPORTS_LINK, LICENSEREPORTS_LINK_RESPONSE);
	links.put(VULNERABLE_COMPONENTS_LINK, VULNERABLE_COMPONENTS_LINK_RESPONSE);
	links.put(COMPONENTS_LINK, COMPONENTS_LINK_RESPONSE);
	links.put(CODELOCATIONS_LINK, CODELOCATIONS_LINK_RESPONSE);
	links.put(POLICY_STATUS_LINK, POLICY_STATUS_LINK_RESPONSE);
	links.put(PROJECT_LINK, PROJECT_LINK_RESPONSE);
	links.put(ISSUES_LINK, ISSUES_LINK_RESPONSE);
    }

    private ProjectVersionPhaseType phase;
    private String createdBy;
    private String releaseComments;
    private String source;
    private LicenseFamilyLicenseFamilyRiskRulesReleaseDistributionType distribution;
    private ProjectVersionLicenseView license;
    private java.util.Date createdAt;
    private String nickname;
    private java.util.Date settingUpdatedAt;
    private String createdByUser;
    private String settingUpdatedByUser;
    private String settingUpdatedBy;
    private java.util.Date releasedOn;
    private String versionName;

    public ProjectVersionPhaseType getPhase() {
	return phase;
    }

    public void setPhase(ProjectVersionPhaseType phase) {
	this.phase = phase;
    }

    public String getCreatedBy() {
	return createdBy;
    }

    public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
    }

    public String getReleaseComments() {
	return releaseComments;
    }

    public void setReleaseComments(String releaseComments) {
	this.releaseComments = releaseComments;
    }

    public String getSource() {
	return source;
    }

    public void setSource(String source) {
	this.source = source;
    }

    public LicenseFamilyLicenseFamilyRiskRulesReleaseDistributionType getDistribution() {
	return distribution;
    }

    public void setDistribution(LicenseFamilyLicenseFamilyRiskRulesReleaseDistributionType distribution) {
	this.distribution = distribution;
    }

    public ProjectVersionLicenseView getLicense() {
	return license;
    }

    public void setLicense(ProjectVersionLicenseView license) {
	this.license = license;
    }

    public java.util.Date getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
	this.createdAt = createdAt;
    }

    public String getNickname() {
	return nickname;
    }

    public void setNickname(String nickname) {
	this.nickname = nickname;
    }

    public java.util.Date getSettingUpdatedAt() {
	return settingUpdatedAt;
    }

    public void setSettingUpdatedAt(java.util.Date settingUpdatedAt) {
	this.settingUpdatedAt = settingUpdatedAt;
    }

    public String getCreatedByUser() {
	return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
	this.createdByUser = createdByUser;
    }

    public String getSettingUpdatedByUser() {
	return settingUpdatedByUser;
    }

    public void setSettingUpdatedByUser(String settingUpdatedByUser) {
	this.settingUpdatedByUser = settingUpdatedByUser;
    }

    public String getSettingUpdatedBy() {
	return settingUpdatedBy;
    }

    public void setSettingUpdatedBy(String settingUpdatedBy) {
	this.settingUpdatedBy = settingUpdatedBy;
    }

    public java.util.Date getReleasedOn() {
	return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
	this.releasedOn = releasedOn;
    }

    public String getVersionName() {
	return versionName;
    }

    public void setVersionName(String versionName) {
	this.versionName = versionName;
    }


    public String getMediaType() {
	return mediaType;
    }

}
