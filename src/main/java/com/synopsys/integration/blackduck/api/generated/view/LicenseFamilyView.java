/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseFamilyCreatedByView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseFamilyRiskRulesView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseFamilyUpdatedByView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseSourceType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseFamilyView extends BlackDuckView {
    private java.util.Date createdAt;
    private LicenseFamilyCreatedByView createdBy;
    private String description;
    private java.util.List<LicenseFamilyRiskRulesView> licenseFamilyRiskRules;
    private String name;
    private LicenseSourceType source;
    private java.util.Date updatedAt;
    private LicenseFamilyUpdatedByView updatedBy;

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public LicenseFamilyCreatedByView getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(LicenseFamilyCreatedByView createdBy) {
        this.createdBy = createdBy;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public java.util.List<LicenseFamilyRiskRulesView> getLicenseFamilyRiskRules() {
        return licenseFamilyRiskRules;
    }

    public void setLicenseFamilyRiskRules(java.util.List<LicenseFamilyRiskRulesView> licenseFamilyRiskRules) {
        this.licenseFamilyRiskRules = licenseFamilyRiskRules;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LicenseSourceType getSource() {
        return source;
    }

    public void setSource(LicenseSourceType source) {
        this.source = source;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LicenseFamilyUpdatedByView getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(LicenseFamilyUpdatedByView updatedBy) {
        this.updatedBy = updatedBy;
    }

}
