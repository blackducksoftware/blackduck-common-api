package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.NameValuePairView;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicySummaryStatusType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionPolicyViolationDetails extends BlackDuckComponent {
    private PolicySummaryStatusType name;
    private java.util.List<NameValuePairView> severityLevels;

    public PolicySummaryStatusType getName() {
        return name;
    }

    public void setName(PolicySummaryStatusType name) {
        this.name = name;
    }

    public java.util.List<NameValuePairView> getSeverityLevels() {
        return severityLevels;
    }

    public void setSeverityLevels(java.util.List<NameValuePairView> severityLevels) {
        this.severityLevels = severityLevels;
    }

}
