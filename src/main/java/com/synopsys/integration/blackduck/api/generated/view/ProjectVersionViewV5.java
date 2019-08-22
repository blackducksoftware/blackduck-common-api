package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionViewLicenseV5;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.generated.view.ProjectView;
import com.synopsys.integration.blackduck.api.generated.view.CodeLocationView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionViewV5 extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();
    public static final String COMPONENTS_LINK = "components";
    public static final String PROJECT_LINK = "project";
    public static final String CUSTOM_FIELDS_LINK = "custom-fields";
    public static final String CODELOCATIONS_LINK = "codelocations";
    public static final String ISSUES_LINK = "issues";

    public static final LinkMultipleResponses<VersionBomComponentView> COMPONENTS_LINK_RESPONSE = new LinkMultipleResponses<VersionBomComponentView>(COMPONENTS_LINK, VersionBomComponentView.class);
    public static final LinkSingleResponse<ProjectView> PROJECT_LINK_RESPONSE = new LinkSingleResponse<ProjectView>(PROJECT_LINK, ProjectView.class);
    public static final LinkMultipleResponses<ProjectVersionCustomFieldView> CUSTOM_FIELDS_LINK_RESPONSE = new LinkMultipleResponses<ProjectVersionCustomFieldView>(CUSTOM_FIELDS_LINK, ProjectVersionCustomFieldView.class);
    public static final LinkMultipleResponses<CodeLocationView> CODELOCATIONS_LINK_RESPONSE = new LinkMultipleResponses<CodeLocationView>(CODELOCATIONS_LINK, CodeLocationView.class);
    public static final LinkMultipleResponses<IssueView> ISSUES_LINK_RESPONSE = new LinkMultipleResponses<IssueView>(ISSUES_LINK, IssueView.class);

    static {
        links.put(COMPONENTS_LINK, COMPONENTS_LINK_RESPONSE);
        links.put(PROJECT_LINK, PROJECT_LINK_RESPONSE);
        links.put(CUSTOM_FIELDS_LINK, CUSTOM_FIELDS_LINK_RESPONSE);
        links.put(CODELOCATIONS_LINK, CODELOCATIONS_LINK_RESPONSE);
        links.put(ISSUES_LINK, ISSUES_LINK_RESPONSE);
    }

    private String phase;
    private String createdByUser;
    private String settingUpdatedBy;
    private Object _meta;
    private String source;
    private String versionName;
    private String distribution;
    private String releasedOn;
    private String releaseComments;
    private ProjectVersionViewLicenseV5 license;
    private String createdAt;
    private String createdBy;
    private String nickname;
    private String settingUpdatedAt;
    private String settingUpdatedByUser;
    private String mediaType = "application/vnd.blackducksoftware.project-detail-5+json";

    public String getPhase() {
    return phase;
    }

    public void setPhase(String phase) {
    this.phase = phase;
    }

    public String getCreatedByUser() {
    return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
    this.createdByUser = createdByUser;
    }

    public String getSettingUpdatedBy() {
    return settingUpdatedBy;
    }

    public void setSettingUpdatedBy(String settingUpdatedBy) {
    this.settingUpdatedBy = settingUpdatedBy;
    }

    public Object get_meta() {
    return _meta;
    }

    public void set_meta(Object _meta) {
    this._meta = _meta;
    }

    public String getSource() {
    return source;
    }

    public void setSource(String source) {
    this.source = source;
    }

    public String getVersionName() {
    return versionName;
    }

    public void setVersionName(String versionName) {
    this.versionName = versionName;
    }

    public String getDistribution() {
    return distribution;
    }

    public void setDistribution(String distribution) {
    this.distribution = distribution;
    }

    public String getReleasedOn() {
    return releasedOn;
    }

    public void setReleasedOn(String releasedOn) {
    this.releasedOn = releasedOn;
    }

    public String getReleaseComments() {
    return releaseComments;
    }

    public void setReleaseComments(String releaseComments) {
    this.releaseComments = releaseComments;
    }

    public ProjectVersionViewLicenseV5 getLicense() {
    return license;
    }

    public void setLicense(ProjectVersionViewLicenseV5 license) {
    this.license = license;
    }

    public String getCreatedAt() {
    return createdAt;
    }

    public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
    }

    public String getCreatedBy() {
    return createdBy;
    }

    public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
    }

    public String getNickname() {
    return nickname;
    }

    public void setNickname(String nickname) {
    this.nickname = nickname;
    }

    public String getSettingUpdatedAt() {
    return settingUpdatedAt;
    }

    public void setSettingUpdatedAt(String settingUpdatedAt) {
    this.settingUpdatedAt = settingUpdatedAt;
    }

    public String getSettingUpdatedByUser() {
    return settingUpdatedByUser;
    }

    public void setSettingUpdatedByUser(String settingUpdatedByUser) {
    this.settingUpdatedByUser = settingUpdatedByUser;
    }

	public String getMediaType() {
	return mediaType;
	}

}
