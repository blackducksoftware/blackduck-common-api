package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentVersionApprovalStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.OriginSourceType;
import com.synopsys.integration.blackduck.api.generated.view.ComplexLicenseView;
import com.synopsys.integration.blackduck.api.generated.view.RiskProfileView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionInternalView extends BlackDuckComponent {
    private java.util.List<String> additionalHomepages;
    private ComponentVersionApprovalStatusType approvalStatus;
    private Long bomUseCount;
    private ComplexLicenseView license;
    private String notes;
    private java.util.Date releasedOn;
    private RiskProfileView securityRiskProfile;
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

    public Long getBomUseCount() {
        return bomUseCount;
    }

    public void setBomUseCount(Long bomUseCount) {
        this.bomUseCount = bomUseCount;
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

    public RiskProfileView getSecurityRiskProfile() {
        return securityRiskProfile;
    }

    public void setSecurityRiskProfile(RiskProfileView securityRiskProfile) {
        this.securityRiskProfile = securityRiskProfile;
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
