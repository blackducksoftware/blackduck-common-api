/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.deprecated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.enumeration.ProjectVersionComponentPolicyStatusType;
import com.blackduck.integration.blackduck.api.manual.temporary.component.NameValuePairView;

// ComponentVersionPolicyViolationDetails from the previous API is now called ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public class ComponentVersionPolicyViolationDetails extends BlackDuckComponent {
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
