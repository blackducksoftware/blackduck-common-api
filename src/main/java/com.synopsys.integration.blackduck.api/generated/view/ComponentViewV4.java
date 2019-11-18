package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.view.CustomFieldView;
import java.util.List;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentApprovalStatusType;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityView;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.TagView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentSourceType;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.generated.view.ComponentVersionView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-4+json";

	public static final Map<String, LinkResponse> links = new HashMap<>();
        public static final String VULNERABILITIES_LINK = "vulnerabilities";
        public static final String VERSIONS_LINK = "versions";
        public static final String TAGS_LINK = "tags";
        public static final String CUSTOM_FIELDS_LINK = "custom-fields";

	public static final LinkMultipleResponses<VulnerabilityView> VULNERABILITIES_LINK_RESPONSE = new LinkMultipleResponses<VulnerabilityView>(VULNERABILITIES_LINK, VulnerabilityView.class);
	public static final LinkMultipleResponses<ComponentVersionView> VERSIONS_LINK_RESPONSE = new LinkMultipleResponses<ComponentVersionView>(VERSIONS_LINK, ComponentVersionView.class);
	public static final LinkMultipleResponses<TagView> TAGS_LINK_RESPONSE = new LinkMultipleResponses<TagView>(TAGS_LINK, TagView.class);
	public static final LinkMultipleResponses<CustomFieldView> CUSTOM_FIELDS_LINK_RESPONSE = new LinkMultipleResponses<CustomFieldView>(CUSTOM_FIELDS_LINK, CustomFieldView.class);

    static {
	links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
	links.put(VERSIONS_LINK, VERSIONS_LINK_RESPONSE);
	links.put(TAGS_LINK, TAGS_LINK_RESPONSE);
	links.put(CUSTOM_FIELDS_LINK, CUSTOM_FIELDS_LINK_RESPONSE);
    }

    private ComponentApprovalStatusType approvalStatus;
    private String url;
    private String description;
    private String name;
    private String primaryLanguage;
    private String notes;
    private ComponentSourceType source;
    private java.util.List<String> additionalHomepages;

    public ComponentApprovalStatusType getApprovalStatus() {
	return approvalStatus;
    }

    public void setApprovalStatus(ComponentApprovalStatusType approvalStatus) {
	this.approvalStatus = approvalStatus;
    }

    public String getUrl() {
	return url;
    }

    public void setUrl(String url) {
	this.url = url;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getPrimaryLanguage() {
	return primaryLanguage;
    }

    public void setPrimaryLanguage(String primaryLanguage) {
	this.primaryLanguage = primaryLanguage;
    }

    public String getNotes() {
	return notes;
    }

    public void setNotes(String notes) {
	this.notes = notes;
    }

    public ComponentSourceType getSource() {
	return source;
    }

    public void setSource(ComponentSourceType source) {
	this.source = source;
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
