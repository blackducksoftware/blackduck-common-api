/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.view;

import java.util.HashMap;
import java.util.Map;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;
import com.blackduck.integration.blackduck.api.core.response.LinkBlackDuckResponse;
import com.blackduck.integration.blackduck.api.core.response.LinkSingleResponse;
import com.blackduck.integration.blackduck.api.generated.enumeration.LicenseResponsibilityType;
import com.blackduck.integration.blackduck.api.generated.enumeration.LicenseTermSourceType;
import com.blackduck.integration.blackduck.api.generated.view.LicenseView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseTermAssociationView extends BlackDuckView {
    public static final Map<String, LinkBlackDuckResponse> links = new HashMap<>();

    public static final String LICENSE_LINK = "license";
    public static final String LICENSE_TERM_LINK = "license-term";

    public static final LinkSingleResponse<LicenseView> LICENSE_LINK_RESPONSE = new LinkSingleResponse<LicenseView>(LICENSE_LINK, LicenseView.class);
    public static final LinkSingleResponse<LicenseTermView> LICENSE_TERM_LINK_RESPONSE = new LinkSingleResponse<LicenseTermView>(LICENSE_TERM_LINK, LicenseTermView.class);

    static {
        links.put(LICENSE_LINK, LICENSE_LINK_RESPONSE);
        links.put(LICENSE_TERM_LINK, LICENSE_TERM_LINK_RESPONSE);
    }

    private LicenseTermSourceType associationSource;
    private Boolean deactivated;
    private Boolean deprecated;
    private String description;
    private Boolean fulfillmentRequired;
    private String name;
    private LicenseResponsibilityType responsibility;

    public LicenseTermSourceType getAssociationSource() {
        return associationSource;
    }

    public void setAssociationSource(LicenseTermSourceType associationSource) {
        this.associationSource = associationSource;
    }

    public Boolean getDeactivated() {
        return deactivated;
    }

    public void setDeactivated(Boolean deactivated) {
        this.deactivated = deactivated;
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

    public Boolean getFulfillmentRequired() {
        return fulfillmentRequired;
    }

    public void setFulfillmentRequired(Boolean fulfillmentRequired) {
        this.fulfillmentRequired = fulfillmentRequired;
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
