package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentPolicyStatusType;
import com.synopsys.integration.blackduck.api.manual.temporary.component.NameValuePairView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView extends BlackDuckComponent {
    private ProjectVersionComponentPolicyStatusType name;
    private java.util.List<NameValuePairView> severityLevels;

    public ProjectVersionComponentPolicyStatusType getName() {
	    return name;
    }

    public void setName(ProjectVersionComponentPolicyStatusType name) {
	    this.name = name;
    }

    public java.util.List<NameValuePairView> getSeverityLevels() {
	    return severityLevels;
    }

    public void setSeverityLevels(java.util.List<NameValuePairView> severityLevels) {
	    this.severityLevels = severityLevels;
    }

}
