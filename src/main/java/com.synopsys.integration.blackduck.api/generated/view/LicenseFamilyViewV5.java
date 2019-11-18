package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.generated.component.LicenseFamilyUpdatedByView;
import java.util.List;
import com.synopsys.integration.blackduck.api.generated.component.LicenseFamilyCreatedByView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseFamilyLicenseFamilyRiskRulesView;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseFamilySourceType;
import java.util.Optional;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseFamilyViewV5 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-5+json";

    private LicenseFamilySourceType source;
    private String updatedAt;
    private LicenseFamilyUpdatedByView updatedBy;
    private String description;
    private String name;
    private String createdAt;
    private java.util.List<LicenseFamilyLicenseFamilyRiskRulesView> licenseFamilyRiskRules;
    private LicenseFamilyCreatedByView createdBy;

    public LicenseFamilySourceType getSource() {
	return source;
    }

    public void setSource(LicenseFamilySourceType source) {
	this.source = source;
    }

    public String getUpdatedAt() {
	return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
	this.updatedAt = updatedAt;
    }

    public LicenseFamilyUpdatedByView getUpdatedBy() {
	return updatedBy;
    }

    public void setUpdatedBy(LicenseFamilyUpdatedByView updatedBy) {
	this.updatedBy = updatedBy;
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

    public String getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(String createdAt) {
	this.createdAt = createdAt;
    }

    public java.util.List<LicenseFamilyLicenseFamilyRiskRulesView> getLicenseFamilyRiskRules() {
	return licenseFamilyRiskRules;
    }

    public void setLicenseFamilyRiskRules(java.util.List<LicenseFamilyLicenseFamilyRiskRulesView> licenseFamilyRiskRules) {
	this.licenseFamilyRiskRules = licenseFamilyRiskRules;
    }

    public LicenseFamilyCreatedByView getCreatedBy() {
	return createdBy;
    }

    public void setCreatedBy(LicenseFamilyCreatedByView createdBy) {
	this.createdBy = createdBy;
    }


    public String getMediaType() {
	return mediaType;
    }

}
