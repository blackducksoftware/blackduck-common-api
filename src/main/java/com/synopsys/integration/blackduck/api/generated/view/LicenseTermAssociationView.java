package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseResponsibilityType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseTermSourceType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class LicenseTermAssociationView extends BlackDuckView {
    private String name;
    private LicenseTermSourceType associationSource;
    private String description;
    private Boolean fulfillmentRequired;
    private Boolean deactivated;
    private LicenseResponsibilityType responsibility;

    public String getName() {
	    return name;
    }

    public void setName(String name) {
	    this.name = name;
    }

    public LicenseTermSourceType getAssociationSource() {
	    return associationSource;
    }

    public void setAssociationSource(LicenseTermSourceType associationSource) {
	    this.associationSource = associationSource;
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

    public Boolean getDeactivated() {
	    return deactivated;
    }

    public void setDeactivated(Boolean deactivated) {
	    this.deactivated = deactivated;
    }

    public LicenseResponsibilityType getResponsibility() {
	    return responsibility;
    }

    public void setResponsibility(LicenseResponsibilityType responsibility) {
	    this.responsibility = responsibility;
    }

}
