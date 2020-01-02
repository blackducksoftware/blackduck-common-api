package com.synopsys.integration.blackduck.api.generated.component;

import java.util.List;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.NameValuePairView;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import java.util.Optional;

@Deprecated
/**
* ComponentVersionPolicyViolationDetails is now called ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentVersionPolicyViolationDetails extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-4+json";

    private java.util.List<NameValuePairView> severityLevels;
    private String name;

    public java.util.List<NameValuePairView> getSeverityLevels() {
	return severityLevels;
    }

    public void setSeverityLevels(java.util.List<NameValuePairView> severityLevels) {
	this.severityLevels = severityLevels;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }


    public String getMediaType() {
	return mediaType;
    }

}
