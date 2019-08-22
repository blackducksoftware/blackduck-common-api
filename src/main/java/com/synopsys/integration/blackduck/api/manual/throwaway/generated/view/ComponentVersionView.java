package com.synopsys.integration.blackduck.api.manual.throwaway.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.ComponentType;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.ComponentVersionApprovalStatusType;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.OriginSourceType;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.response.ComponentVersionReferenceView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.response.ComponentVersionRiskView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.ComplexLicenseView;
import com.synopsys.integration.blackduck.api.generated.view.ComponentView;
import com.synopsys.integration.blackduck.api.generated.view.OriginView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionView extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String COMPONENT_LINK = "component";
    public static final String REFERENCES_LINK = "references";
    public static final String ORIGINS_LINK = "origins";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";
    public static final String RISK_PROFILE_LINK = "risk-profile";

    public static final LinkSingleResponse<ComponentView> COMPONENT_LINK_RESPONSE = new LinkSingleResponse<ComponentView>(COMPONENT_LINK, ComponentView.class);
    public static final LinkMultipleResponses<ComponentVersionReferenceView> REFERENCES_LINK_RESPONSE = new LinkMultipleResponses<ComponentVersionReferenceView>(REFERENCES_LINK, ComponentVersionReferenceView.class);
    public static final LinkMultipleResponses<OriginView> ORIGINS_LINK_RESPONSE = new LinkMultipleResponses<OriginView>(ORIGINS_LINK, OriginView.class);
    public static final LinkMultipleResponses<VulnerabilityView> VULNERABILITIES_LINK_RESPONSE = new LinkMultipleResponses<VulnerabilityView>(VULNERABILITIES_LINK, VulnerabilityView.class);
    public static final LinkSingleResponse<ComponentVersionRiskView> RISK_PROFILE_LINK_RESPONSE = new LinkSingleResponse<ComponentVersionRiskView>(RISK_PROFILE_LINK, ComponentVersionRiskView.class);

    static {
        links.put(COMPONENT_LINK, COMPONENT_LINK_RESPONSE);
        links.put(REFERENCES_LINK, REFERENCES_LINK_RESPONSE);
        links.put(ORIGINS_LINK, ORIGINS_LINK_RESPONSE);
        links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
        links.put(RISK_PROFILE_LINK, RISK_PROFILE_LINK_RESPONSE);
    }

    private java.util.List<String> additionalHomepages;
    private ComponentVersionApprovalStatusType approvalStatus;
    private ComplexLicenseView license;
    private String notes;
    private java.util.Date releasedOn;
    private OriginSourceType source;
    private ComponentType type;
    private java.util.Date updatedAt;
    private String updatedBy;
    private String updatedByUrl;
    private String versionName;

    public java.util.List<String> getAdditionalHomepages() {
        return additionalHomepages;
    }

    public void setAdditionalHomepages(java.util.List<String> additionalHomepages) {
        this.additionalHomepages = additionalHomepages;
    }

    public ComponentVersionApprovalStatusType getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ComponentVersionApprovalStatusType approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public ComplexLicenseView getLicense() {
        return license;
    }

    public void setLicense(ComplexLicenseView license) {
        this.license = license;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public java.util.Date getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
        this.releasedOn = releasedOn;
    }

    public OriginSourceType getSource() {
        return source;
    }

    public void setSource(OriginSourceType source) {
        this.source = source;
    }

    public ComponentType getType() {
        return type;
    }

    public void setType(ComponentType type) {
        this.type = type;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedByUrl() {
        return updatedByUrl;
    }

    public void setUpdatedByUrl(String updatedByUrl) {
        this.updatedByUrl = updatedByUrl;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

}