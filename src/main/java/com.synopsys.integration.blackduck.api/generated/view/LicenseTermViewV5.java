package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseTermResponsibilityType;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseTermAssociationSourceType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseTermViewV5 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-5+json";

    private String name;
    private LicenseTermResponsibilityType responsibility;
    private Boolean deactivated;
    private LicenseTermAssociationSourceType associationSource;
    private String description;
    private Boolean fulfillmentRequired;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public LicenseTermResponsibilityType getResponsibility() {
	return responsibility;
    }

    public void setResponsibility(LicenseTermResponsibilityType responsibility) {
	this.responsibility = responsibility;
    }

    public Boolean getDeactivated() {
	return deactivated;
    }

    public void setDeactivated(Boolean deactivated) {
	this.deactivated = deactivated;
    }

    public LicenseTermAssociationSourceType getAssociationSource() {
	return associationSource;
    }

    public void setAssociationSource(LicenseTermAssociationSourceType associationSource) {
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


    public String getMediaType() {
	return mediaType;
    }

}
