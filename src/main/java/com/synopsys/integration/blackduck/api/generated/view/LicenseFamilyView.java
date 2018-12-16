package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseFamilyRiskRuleView;
import com.synopsys.integration.blackduck.api.generated.component.UserSummaryView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseFamilySourceType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseFamilyView extends BlackDuckView {
    private java.util.Date createdAt;
    private UserSummaryView createdBy;
    private String description;
    private java.util.List<LicenseFamilyRiskRuleView> licenseFamilyRiskRules;
    private String name;
    private LicenseFamilySourceType source;
    private java.util.Date updatedAt;
    private UserSummaryView updatedBy;

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public UserSummaryView getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserSummaryView createdBy) {
        this.createdBy = createdBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.List<LicenseFamilyRiskRuleView> getLicenseFamilyRiskRules() {
        return licenseFamilyRiskRules;
    }

    public void setLicenseFamilyRiskRules(java.util.List<LicenseFamilyRiskRuleView> licenseFamilyRiskRules) {
        this.licenseFamilyRiskRules = licenseFamilyRiskRules;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LicenseFamilySourceType getSource() {
        return source;
    }

    public void setSource(LicenseFamilySourceType source) {
        this.source = source;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserSummaryView getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(UserSummaryView updatedBy) {
        this.updatedBy = updatedBy;
    }

}
