package com.synopsys.integration.blackduck.api.generated.view;

import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseTermResponsibilityType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseTermSourceType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class LicenseTermViewV4 extends BlackDuckView {
    private LicenseTermResponsibilityType responsibility;
    private String description;
    private String name;
    private Boolean fulfillmentRequired;
    private LicenseTermSourceType associationSource;
    private Boolean deactivated;

    public LicenseTermResponsibilityType getResponsibility() {
	    return responsibility;
    }

    public void setResponsibility(LicenseTermResponsibilityType responsibility) {
	    this.responsibility = responsibility;
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

    public Boolean getFulfillmentRequired() {
	    return fulfillmentRequired;
    }

    public void setFulfillmentRequired(Boolean fulfillmentRequired) {
	    this.fulfillmentRequired = fulfillmentRequired;
    }

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

}
