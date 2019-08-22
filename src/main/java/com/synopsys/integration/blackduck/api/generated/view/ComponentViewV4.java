package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentApprovalStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentSourceType;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.generated.response.HomepageView;
import com.synopsys.integration.blackduck.api.generated.response.OpenHubView;
import com.synopsys.integration.blackduck.api.generated.response.LogoView;
import com.synopsys.integration.blackduck.api.generated.response.LogoView;
import com.synopsys.integration.blackduck.api.generated.view.TagView;
import com.synopsys.integration.blackduck.api.generated.view.CustomFieldView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentViewV4 extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();
    public static final String VERSIONS_LINK = "versions";
    public static final String HOMEPAGE_LINK = "homepage";
    public static final String OPENHUB_LINK = "openhub";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";
    public static final String SMALLLOGO_LINK = "smallLogo";
    public static final String MEDIUMLOGO_LINK = "mediumLogo";
    public static final String TAGS_LINK = "tags";
    public static final String CUSTOM_FIELDS_LINK = "custom-fields";

    public static final LinkMultipleResponses<ComponentVersionView> VERSIONS_LINK_RESPONSE = new LinkMultipleResponses<ComponentVersionView>(VERSIONS_LINK, ComponentVersionView.class);
    public static final LinkMultipleResponses<HomepageView> HOMEPAGE_LINK_RESPONSE = new LinkMultipleResponses<HomepageView>(HOMEPAGE_LINK, HomepageView.class);
    public static final LinkMultipleResponses<OpenHubView> OPENHUB_LINK_RESPONSE = new LinkMultipleResponses<OpenHubView>(OPENHUB_LINK, OpenHubView.class);
    public static final LinkMultipleResponses<VulnerabilityView> VULNERABILITIES_LINK_RESPONSE = new LinkMultipleResponses<VulnerabilityView>(VULNERABILITIES_LINK, VulnerabilityView.class);
    public static final LinkMultipleResponses<LogoView> SMALLLOGO_LINK_RESPONSE = new LinkMultipleResponses<LogoView>(SMALLLOGO_LINK, LogoView.class);
    public static final LinkMultipleResponses<LogoView> MEDIUMLOGO_LINK_RESPONSE = new LinkMultipleResponses<LogoView>(MEDIUMLOGO_LINK, LogoView.class);
    public static final LinkMultipleResponses<TagView> TAGS_LINK_RESPONSE = new LinkMultipleResponses<TagView>(TAGS_LINK, TagView.class);
    public static final LinkMultipleResponses<CustomFieldView> CUSTOM_FIELDS_LINK_RESPONSE = new LinkMultipleResponses<CustomFieldView>(CUSTOM_FIELDS_LINK, CustomFieldView.class);

    static {
        links.put(VERSIONS_LINK, VERSIONS_LINK_RESPONSE);
        links.put(HOMEPAGE_LINK, HOMEPAGE_LINK_RESPONSE);
        links.put(OPENHUB_LINK, OPENHUB_LINK_RESPONSE);
        links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
        links.put(SMALLLOGO_LINK, SMALLLOGO_LINK_RESPONSE);
        links.put(MEDIUMLOGO_LINK, MEDIUMLOGO_LINK_RESPONSE);
        links.put(TAGS_LINK, TAGS_LINK_RESPONSE);
        links.put(CUSTOM_FIELDS_LINK, CUSTOM_FIELDS_LINK_RESPONSE);
    }

    private ComponentApprovalStatusType approvalStatus;
    private String notes;
    private String name;
    private String description;
    private Object _meta;
    private ComponentSourceType source;
    private String url;
    private String primaryLanguage;
    private java.util.List<String> additionalHomepages;
    private String mediaType = "application/vnd.blackducksoftware.component-detail-4+json";

    public ComponentApprovalStatusType getApprovalStatus() {
    return approvalStatus;
    }

    public void setApprovalStatus(ComponentApprovalStatusType approvalStatus) {
    this.approvalStatus = approvalStatus;
    }

    public String getNotes() {
    return notes;
    }

    public void setNotes(String notes) {
    this.notes = notes;
    }

    public String getName() {
    return name;
    }

    public void setName(String name) {
    this.name = name;
    }

    public String getDescription() {
    return description;
    }

    public void setDescription(String description) {
    this.description = description;
    }

    public Object get_meta() {
    return _meta;
    }

    public void set_meta(Object _meta) {
    this._meta = _meta;
    }

    public ComponentSourceType getSource() {
    return source;
    }

    public void setSource(ComponentSourceType source) {
    this.source = source;
    }

    public String getUrl() {
    return url;
    }

    public void setUrl(String url) {
    this.url = url;
    }

    public String getPrimaryLanguage() {
    return primaryLanguage;
    }

    public void setPrimaryLanguage(String primaryLanguage) {
    this.primaryLanguage = primaryLanguage;
    }

    public java.util.List<String> getAdditionalHomepages() {
    return additionalHomepages;
    }

    public void setAdditionalHomepages(java.util.List<String> additionalHomepages) {
    this.additionalHomepages = additionalHomepages;
    }

	public String getMediaType() {
	return mediaType;
	}

}
