/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.view;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkBlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionLicenseLicensesLicenseFamilySummaryView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseFamilyUpdatedByView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseResponsibilityType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseTermSourceType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseTermView extends BlackDuckView {
    public static final Map<String, LinkBlackDuckResponse> links = new HashMap<>();

    public static final String LICENSE_TERM_LICENSES_LINK = "license-term-licenses";

    public static final LinkMultipleResponses<LicenseTermAssociationView> LICENSE_TERM_LICENSES_LINK_RESPONSE = new LinkMultipleResponses<LicenseTermAssociationView>(LICENSE_TERM_LICENSES_LINK, LicenseTermAssociationView.class);

    static {
        links.put(LICENSE_TERM_LICENSES_LINK, LICENSE_TERM_LICENSES_LINK_RESPONSE);
    }

    private ComponentVersionLicenseLicensesLicenseFamilySummaryView category;
    private java.util.Date createdAt;
    private LicenseFamilyUpdatedByView createdBy;
    private Boolean deprecated;
    private String description;
    private String name;
    private LicenseResponsibilityType responsibility;
    private LicenseTermSourceType source;
    private java.util.Date updatedAt;
    private LicenseFamilyUpdatedByView updatedBy;

    public ComponentVersionLicenseLicensesLicenseFamilySummaryView getCategory() {
        return category;
    }

    public void setCategory(ComponentVersionLicenseLicensesLicenseFamilySummaryView category) {
        this.category = category;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public LicenseFamilyUpdatedByView getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(LicenseFamilyUpdatedByView createdBy) {
        this.createdBy = createdBy;
    }

    public Boolean getDeprecated() {
        return deprecated;
    }

    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
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

    public LicenseResponsibilityType getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(LicenseResponsibilityType responsibility) {
        this.responsibility = responsibility;
    }

    public LicenseTermSourceType getSource() {
        return source;
    }

    public void setSource(LicenseTermSourceType source) {
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
