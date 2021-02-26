/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.deprecated.component.LicenseFamilyRiskRuleView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CustomLicenseFamilyRequest extends BlackDuckComponent {
    private String description;
    private java.util.List<LicenseFamilyRiskRuleView> licenseFamilyRiskRules;
    private String name;

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

}
