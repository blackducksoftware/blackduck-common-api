/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkBlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.UrlMultipleResponses;
import com.synopsys.integration.blackduck.api.generated.component.ComponentLogoView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentApprovalStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.OriginSourceType;
import com.synopsys.integration.blackduck.api.generated.view.ComponentVersionView;
import com.synopsys.integration.blackduck.api.generated.view.CustomFieldView;
import com.synopsys.integration.blackduck.api.generated.view.TagView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentView extends BlackDuckView {
    public static final Map<String, LinkBlackDuckResponse> links = new HashMap<>();

    public static final String CUSTOM_FIELDS_LINK = "custom-fields";
    public static final String TAGS_LINK = "tags";
    public static final String VERSIONS_LINK = "versions";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";

    public static final LinkMultipleResponses<CustomFieldView> CUSTOM_FIELDS_LINK_RESPONSE = new LinkMultipleResponses<CustomFieldView>(CUSTOM_FIELDS_LINK, CustomFieldView.class);
    public static final LinkMultipleResponses<TagView> TAGS_LINK_RESPONSE = new LinkMultipleResponses<TagView>(TAGS_LINK, TagView.class);
    public static final LinkMultipleResponses<ComponentVersionView> VERSIONS_LINK_RESPONSE = new LinkMultipleResponses<ComponentVersionView>(VERSIONS_LINK, ComponentVersionView.class);
    public static final LinkMultipleResponses<VulnerabilityView> VULNERABILITIES_LINK_RESPONSE = new LinkMultipleResponses<VulnerabilityView>(VULNERABILITIES_LINK, VulnerabilityView.class);

    static {
        links.put(CUSTOM_FIELDS_LINK, CUSTOM_FIELDS_LINK_RESPONSE);
        links.put(TAGS_LINK, TAGS_LINK_RESPONSE);
        links.put(VERSIONS_LINK, VERSIONS_LINK_RESPONSE);
        links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
    }

    private java.util.List<String> additionalHomepages;
    private ComponentApprovalStatusType approvalStatus;
    private String description;
    private ComponentLogoView logo;
    private Boolean migrated;
    private String name;
    private String notes;
    private String primaryLanguage;
    private OriginSourceType source;
    private String url;

    public java.util.List<String> getAdditionalHomepages() {
        return additionalHomepages;
    }

    public void setAdditionalHomepages(java.util.List<String> additionalHomepages) {
        this.additionalHomepages = additionalHomepages;
    }

    public ComponentApprovalStatusType getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ComponentApprovalStatusType approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ComponentLogoView getLogo() {
        return logo;
    }

    public void setLogo(ComponentLogoView logo) {
        this.logo = logo;
    }

    public Boolean getMigrated() {
        return migrated;
    }

    public void setMigrated(Boolean migrated) {
        this.migrated = migrated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getPrimaryLanguage() {
        return primaryLanguage;
    }

    public void setPrimaryLanguage(String primaryLanguage) {
        this.primaryLanguage = primaryLanguage;
    }

    public OriginSourceType getSource() {
        return source;
    }

    public void setSource(OriginSourceType source) {
        this.source = source;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public UrlMultipleResponses<CustomFieldView> metaCustomFieldsLink() {
        return metaMultipleResponses(CUSTOM_FIELDS_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<CustomFieldView>> metaCustomFieldsLinkSafely() {
        return metaMultipleResponsesSafely(CUSTOM_FIELDS_LINK_RESPONSE);
    }

    public UrlMultipleResponses<TagView> metaTagsLink() {
        return metaMultipleResponses(TAGS_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<TagView>> metaTagsLinkSafely() {
        return metaMultipleResponsesSafely(TAGS_LINK_RESPONSE);
    }

    public UrlMultipleResponses<ComponentVersionView> metaVersionsLink() {
        return metaMultipleResponses(VERSIONS_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<ComponentVersionView>> metaVersionsLinkSafely() {
        return metaMultipleResponsesSafely(VERSIONS_LINK_RESPONSE);
    }

    public UrlMultipleResponses<VulnerabilityView> metaVulnerabilitiesLink() {
        return metaMultipleResponses(VULNERABILITIES_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<VulnerabilityView>> metaVulnerabilitiesLinkSafely() {
        return metaMultipleResponsesSafely(VULNERABILITIES_LINK_RESPONSE);
    }

}
