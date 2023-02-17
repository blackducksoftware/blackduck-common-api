/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
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
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionVulnerableBomComponentsItemsLicenseView;
import com.synopsys.integration.blackduck.api.generated.view.ComponentMatchedFilesView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionVulnerableBomComponentsItemsVulnerabilityWithRemediationView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionVulnerableBomComponentsView extends BlackDuckView {
    public static final Map<String, LinkBlackDuckResponse> links = new HashMap<>();

    public static final String MATCHED_FILES_LINK = "matched-files";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";

    public static final LinkMultipleResponses<ComponentMatchedFilesView> MATCHED_FILES_LINK_RESPONSE = new LinkMultipleResponses<ComponentMatchedFilesView>(MATCHED_FILES_LINK, ComponentMatchedFilesView.class);
    public static final LinkMultipleResponses<VulnerabilityView> VULNERABILITIES_LINK_RESPONSE = new LinkMultipleResponses<VulnerabilityView>(VULNERABILITIES_LINK, VulnerabilityView.class);

    static {
        links.put(MATCHED_FILES_LINK, MATCHED_FILES_LINK_RESPONSE);
        links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
    }

    private String componentName;
    private String componentVersion;
    private String componentVersionName;
    private String componentVersionOriginId;
    private String componentVersionOriginName;
    private Boolean ignored;
    private ProjectVersionVulnerableBomComponentsItemsLicenseView license;
    private ProjectVersionVulnerableBomComponentsItemsVulnerabilityWithRemediationView vulnerabilityWithRemediation;

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
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

    public String getComponentVersionOriginId() {
        return componentVersionOriginId;
    }

    public void setComponentVersionOriginId(String componentVersionOriginId) {
        this.componentVersionOriginId = componentVersionOriginId;
    }

    public String getComponentVersionOriginName() {
        return componentVersionOriginName;
    }

    public void setComponentVersionOriginName(String componentVersionOriginName) {
        this.componentVersionOriginName = componentVersionOriginName;
    }

    public Boolean getIgnored() {
        return ignored;
    }

    public void setIgnored(Boolean ignored) {
        this.ignored = ignored;
    }

    public ProjectVersionVulnerableBomComponentsItemsLicenseView getLicense() {
        return license;
    }

    public void setLicense(ProjectVersionVulnerableBomComponentsItemsLicenseView license) {
        this.license = license;
    }

    public ProjectVersionVulnerableBomComponentsItemsVulnerabilityWithRemediationView getVulnerabilityWithRemediation() {
        return vulnerabilityWithRemediation;
    }

    public void setVulnerabilityWithRemediation(ProjectVersionVulnerableBomComponentsItemsVulnerabilityWithRemediationView vulnerabilityWithRemediation) {
        this.vulnerabilityWithRemediation = vulnerabilityWithRemediation;
    }

    public UrlMultipleResponses<ComponentMatchedFilesView> metaMatchedFilesLink() {
        return metaMultipleResponses(MATCHED_FILES_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<ComponentMatchedFilesView>> metaMatchedFilesLinkSafely() {
        return metaMultipleResponsesSafely(MATCHED_FILES_LINK_RESPONSE);
    }

    public UrlMultipleResponses<VulnerabilityView> metaVulnerabilitiesLink() {
        return metaMultipleResponses(VULNERABILITIES_LINK_RESPONSE);
    }

    public Optional<UrlMultipleResponses<VulnerabilityView>> metaVulnerabilitiesLinkSafely() {
        return metaMultipleResponsesSafely(VULNERABILITIES_LINK_RESPONSE);
    }

}
