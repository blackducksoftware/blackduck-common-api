/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.view;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;
import com.blackduck.integration.blackduck.api.generated.enumeration.LicenseResponsibilityType;
import com.blackduck.integration.blackduck.api.generated.enumeration.LicenseTermSourceType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseTermAssociationView extends BlackDuckView {
    private LicenseTermSourceType associationSource;
    private Boolean deactivated;
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
