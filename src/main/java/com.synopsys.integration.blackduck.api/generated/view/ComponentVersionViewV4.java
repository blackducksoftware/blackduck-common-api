package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.OriginView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentVersionTypeType;
import java.util.List;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentVersionSourceType;
import com.synopsys.integration.blackduck.api.core.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionLicenseLicensesView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityView;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentVersionApprovalStatusType;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.generated.view.ComponentView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-4+json";

	public static final Map<String, LinkResponse> links = new HashMap<>();
        public static final String VULNERABILITIES_LINK = "vulnerabilities";
        public static final String COMPONENT_LINK = "component";
        public static final String ORIGINS_LINK = "origins";

	public static final LinkMultipleResponses<VulnerabilityView> VULNERABILITIES_LINK_RESPONSE = new LinkMultipleResponses<VulnerabilityView>(VULNERABILITIES_LINK, VulnerabilityView.class);
	public static final LinkSingleResponse<ComponentView> COMPONENT_LINK_RESPONSE = new LinkSingleResponse<ComponentView>(COMPONENT_LINK, ComponentView.class);
	public static final LinkMultipleResponses<OriginView> ORIGINS_LINK_RESPONSE = new LinkMultipleResponses<OriginView>(ORIGINS_LINK, OriginView.class);

    static {
	links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
	links.put(COMPONENT_LINK, COMPONENT_LINK_RESPONSE);
	links.put(ORIGINS_LINK, ORIGINS_LINK_RESPONSE);
    }

    private String notes;
    private ComponentVersionTypeType type;
    private ComponentVersionSourceType source;
    private ComponentVersionApprovalStatusType approvalStatus;
    private String releasedOn;
    private java.util.List<String> additionalHomepages;
    private String versionName;
    private ProjectVersionLicenseLicensesView license;

    public String getNotes() {
	return notes;
    }

    public void setNotes(String notes) {
	this.notes = notes;
    }

    public ComponentVersionTypeType getType() {
	return type;
    }

    public void setType(ComponentVersionTypeType type) {
	this.type = type;
    }

    public ComponentVersionSourceType getSource() {
	return source;
    }

    public void setSource(ComponentVersionSourceType source) {
	this.source = source;
    }

    public ComponentVersionApprovalStatusType getApprovalStatus() {
	return approvalStatus;
    }

    public void setApprovalStatus(ComponentVersionApprovalStatusType approvalStatus) {
	this.approvalStatus = approvalStatus;
    }

    public String getReleasedOn() {
	return releasedOn;
    }

    public void setReleasedOn(String releasedOn) {
	this.releasedOn = releasedOn;
    }

    public java.util.List<String> getAdditionalHomepages() {
	return additionalHomepages;
    }

    public void setAdditionalHomepages(java.util.List<String> additionalHomepages) {
	this.additionalHomepages = additionalHomepages;
    }

    public String getVersionName() {
	return versionName;
    }

    public void setVersionName(String versionName) {
	this.versionName = versionName;
    }

    public ProjectVersionLicenseLicensesView getLicense() {
	return license;
    }

    public void setLicense(ProjectVersionLicenseLicensesView license) {
	this.license = license;
    }


    public String getMediaType() {
	return mediaType;
    }

}
