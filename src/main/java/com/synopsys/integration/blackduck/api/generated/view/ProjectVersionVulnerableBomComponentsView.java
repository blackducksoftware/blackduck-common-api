package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.view.ComponentMatchedFilesView;
import com.synopsys.integration.blackduck.api.generated.view.ComponentVersionLicenseView;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionVulnerableBomComponentsItemsVulnerabilityWithRemediationView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionVulnerableBomComponentsView extends BlackDuckView {
	public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String MATCHED_FILES_LINK = "matched-files";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";

	public static final LinkMultipleResponses<ComponentMatchedFilesView> MATCHED_FILES_LINK_RESPONSE = new LinkMultipleResponses<ComponentMatchedFilesView>(MATCHED_FILES_LINK, ComponentMatchedFilesView.class);
	public static final LinkMultipleResponses<VulnerabilityView> VULNERABILITIES_LINK_RESPONSE = new LinkMultipleResponses<VulnerabilityView>(VULNERABILITIES_LINK, VulnerabilityView.class);

    static {
	    links.put(MATCHED_FILES_LINK, MATCHED_FILES_LINK_RESPONSE);
	    links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
    }

    private Boolean ignored;
    private ComponentVersionLicenseView license;
    private ProjectVersionVulnerableBomComponentsItemsVulnerabilityWithRemediationView vulnerabilityWithRemediation;
    private String componentVersion;
    private String componentName;
    private String componentVersionName;
    private String componentVersionOriginName;
    private String componentVersionOriginId;

    public Boolean getIgnored() {
	    return ignored;
    }

    public void setIgnored(Boolean ignored) {
	    this.ignored = ignored;
    }

    public ComponentVersionLicenseView getLicense() {
	    return license;
    }

    public void setLicense(ComponentVersionLicenseView license) {
	    this.license = license;
    }

    public ProjectVersionVulnerableBomComponentsItemsVulnerabilityWithRemediationView getVulnerabilityWithRemediation() {
	    return vulnerabilityWithRemediation;
    }

    public void setVulnerabilityWithRemediation(ProjectVersionVulnerableBomComponentsItemsVulnerabilityWithRemediationView vulnerabilityWithRemediation) {
	    this.vulnerabilityWithRemediation = vulnerabilityWithRemediation;
    }

    public String getComponentVersion() {
	    return componentVersion;
    }

    public void setComponentVersion(String componentVersion) {
	    this.componentVersion = componentVersion;
    }

    public String getComponentName() {
	    return componentName;
    }

    public void setComponentName(String componentName) {
	    this.componentName = componentName;
    }

    public String getComponentVersionName() {
	    return componentVersionName;
    }

    public void setComponentVersionName(String componentVersionName) {
	    this.componentVersionName = componentVersionName;
    }

    public String getComponentVersionOriginName() {
	    return componentVersionOriginName;
    }

    public void setComponentVersionOriginName(String componentVersionOriginName) {
	    this.componentVersionOriginName = componentVersionOriginName;
    }

    public String getComponentVersionOriginId() {
	    return componentVersionOriginId;
    }

    public void setComponentVersionOriginId(String componentVersionOriginId) {
	    this.componentVersionOriginId = componentVersionOriginId;
    }

}