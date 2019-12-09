package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.generated.component.LicenseFamilyUpdatedByView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseLicenseSourceType;
import java.util.List;
import com.synopsys.integration.blackduck.api.generated.component.LicenseFamilyLicenseFamilyRiskRulesView;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class LicenseFamilyViewV5 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-5+json";

    private java.util.List<LicenseFamilyLicenseFamilyRiskRulesView> licenseFamilyRiskRules;
    private LicenseFamilyUpdatedByView createdBy;
    private LicenseFamilyUpdatedByView updatedBy;
    private LicenseLicenseSourceType source;
    private String description;
    private String name;
    private java.util.Date createdAt;
    private java.util.Date updatedAt;

    public java.util.List<LicenseFamilyLicenseFamilyRiskRulesView> getLicenseFamilyRiskRules() {
	return licenseFamilyRiskRules;
    }

    public void setLicenseFamilyRiskRules(java.util.List<LicenseFamilyLicenseFamilyRiskRulesView> licenseFamilyRiskRules) {
	this.licenseFamilyRiskRules = licenseFamilyRiskRules;
    }

    public LicenseFamilyUpdatedByView getCreatedBy() {
	return createdBy;
    }

    public void setCreatedBy(LicenseFamilyUpdatedByView createdBy) {
	this.createdBy = createdBy;
    }

    public LicenseFamilyUpdatedByView getUpdatedBy() {
	return updatedBy;
    }

    public void setUpdatedBy(LicenseFamilyUpdatedByView updatedBy) {
	this.updatedBy = updatedBy;
    }

    public LicenseLicenseSourceType getSource() {
	return source;
    }

    public void setSource(LicenseLicenseSourceType source) {
	this.source = source;
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

    public java.util.Date getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
	this.createdAt = createdAt;
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
