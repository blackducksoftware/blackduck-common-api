package com.synopsys.integration.blackduck.api.generated.component;

import java.util.List;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyStatusType;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.NameValuePairView;

@Deprecated
/**
* ComponentVersionPolicyViolationDetails is now called ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentVersionPolicyViolationDetails extends BlackDuckComponent {
    private PolicyStatusType name;
    private java.util.List<NameValuePairView> severityLevels;

    public PolicyStatusType getName() {
	    return name;
    }

    public void setName(PolicyStatusType name) {
	    this.name = name;
    }

    public java.util.List<NameValuePairView> getSeverityLevels() {
	    return severityLevels;
    }

    public void setSeverityLevels(java.util.List<NameValuePairView> severityLevels) {
	    this.severityLevels = severityLevels;
    }

}
