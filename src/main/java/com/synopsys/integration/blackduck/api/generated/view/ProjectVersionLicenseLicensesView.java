/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionLicenseLicensesLicenseFamilySummaryView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionLicenseLicensesView extends BlackDuckView {
    private String license;
    private ProjectVersionLicenseLicensesLicenseFamilySummaryView licenseFamilySummary;
    private java.util.List<String> licenses;
    private String name;

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public ProjectVersionLicenseLicensesLicenseFamilySummaryView getLicenseFamilySummary() {
        return licenseFamilySummary;
    }

    public void setLicenseFamilySummary(ProjectVersionLicenseLicensesLicenseFamilySummaryView licenseFamilySummary) {
        this.licenseFamilySummary = licenseFamilySummary;
    }

    public java.util.List<String> getLicenses() {
        return licenses;
    }

    public void setLicenses(java.util.List<String> licenses) {
        this.licenses = licenses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
