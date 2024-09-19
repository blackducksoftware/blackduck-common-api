/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.component.ComponentVersionLicenseLicensesLicenseFamilySummaryView;
import com.blackduck.integration.blackduck.api.generated.enumeration.LicenseResponsibilityType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionBomLicenseTermView extends BlackDuckComponent {
    private ComponentVersionLicenseLicensesLicenseFamilySummaryView category;
    private Boolean fulfilled;
    private String name;
    private LicenseResponsibilityType responsibility;

    public ComponentVersionLicenseLicensesLicenseFamilySummaryView getCategory() {
        return category;
    }

    public void setCategory(ComponentVersionLicenseLicensesLicenseFamilySummaryView category) {
        this.category = category;
    }

    public Boolean getFulfilled() {
        return fulfilled;
    }

    public void setFulfilled(Boolean fulfilled) {
        this.fulfilled = fulfilled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LicenseResponsibilityType getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(LicenseResponsibilityType responsibility) {
        this.responsibility = responsibility;
    }

}
