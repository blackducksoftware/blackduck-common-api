package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseLicenseSourceType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseOwnershipType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseCodeSharingType;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentVersionApprovalStatusType;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.LinkStringResponse;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class LicenseViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-4+json";

	public static final Map<String, LinkResponse> links = new HashMap<>();
        public static final String TEXT_LINK = "text";

	public static final LinkStringResponse TEXT_LINK_RESPONSE = new LinkStringResponse(TEXT_LINK, String.class);

    static {
	links.put(TEXT_LINK, TEXT_LINK_RESPONSE);
    }

    private String createdBy;
    private java.util.Date statusUpdatedAt;
    private ComponentVersionApprovalStatusType licenseStatus;
    private String name;
    private String statusUpdatedByUser;
    private LicenseLicenseSourceType licenseSource;
    private java.util.Date createdAt;
    private String notes;
    private String updatedByUser;
    private String updatedBy;
    private String createdByUser;
    private String statusUpdatedBy;
    private LicenseOwnershipType ownership;
    private LicenseCodeSharingType codeSharing;
    private java.util.Date expirationDate;
    private String spdxId;
    private java.util.Date updatedAt;

    public String getCreatedBy() {
	return createdBy;
    }

    public void setCreatedBy(String createdBy) {
	this.createdBy = createdBy;
    }

    public java.util.Date getStatusUpdatedAt() {
	return statusUpdatedAt;
    }

    public void setStatusUpdatedAt(java.util.Date statusUpdatedAt) {
	this.statusUpdatedAt = statusUpdatedAt;
    }

    public ComponentVersionApprovalStatusType getLicenseStatus() {
	return licenseStatus;
    }

    public void setLicenseStatus(ComponentVersionApprovalStatusType licenseStatus) {
	this.licenseStatus = licenseStatus;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getStatusUpdatedByUser() {
	return statusUpdatedByUser;
    }

    public void setStatusUpdatedByUser(String statusUpdatedByUser) {
	this.statusUpdatedByUser = statusUpdatedByUser;
    }

    public LicenseLicenseSourceType getLicenseSource() {
	return licenseSource;
    }

    public void setLicenseSource(LicenseLicenseSourceType licenseSource) {
	this.licenseSource = licenseSource;
    }

    public java.util.Date getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
	this.createdAt = createdAt;
    }

    public String getNotes() {
	return notes;
    }

    public void setNotes(String notes) {
	this.notes = notes;
    }

    public String getUpdatedByUser() {
	return updatedByUser;
    }

    public void setUpdatedByUser(String updatedByUser) {
	this.updatedByUser = updatedByUser;
    }

    public String getUpdatedBy() {
	return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
	this.updatedBy = updatedBy;
    }

    public String getCreatedByUser() {
	return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
	this.createdByUser = createdByUser;
    }

    public String getStatusUpdatedBy() {
	return statusUpdatedBy;
    }

    public void setStatusUpdatedBy(String statusUpdatedBy) {
	this.statusUpdatedBy = statusUpdatedBy;
    }

    public LicenseOwnershipType getOwnership() {
	return ownership;
    }

    public void setOwnership(LicenseOwnershipType ownership) {
	this.ownership = ownership;
    }

    public LicenseCodeSharingType getCodeSharing() {
	return codeSharing;
    }

    public void setCodeSharing(LicenseCodeSharingType codeSharing) {
	this.codeSharing = codeSharing;
    }

    public java.util.Date getExpirationDate() {
	return expirationDate;
    }

    public void setExpirationDate(java.util.Date expirationDate) {
	this.expirationDate = expirationDate;
    }

    public String getSpdxId() {
	return spdxId;
    }

    public void setSpdxId(String spdxId) {
	this.spdxId = spdxId;
    }

    public java.util.Date getUpdatedAt() {
	return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
	this.updatedAt = updatedAt;
    }


    public String getMediaType() {
	return mediaType;
    }

}
