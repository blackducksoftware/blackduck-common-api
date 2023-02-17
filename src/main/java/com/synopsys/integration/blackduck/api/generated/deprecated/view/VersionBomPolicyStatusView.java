/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.deprecated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentPolicyStatusType;
import com.synopsys.integration.blackduck.api.manual.temporary.component.NameValuePairView;

// VersionBomPolicyStatusView from the previous API is now called ProjectVersionPolicyStatusView
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public class VersionBomPolicyStatusView extends BlackDuckView {
    private ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView componentVersionPolicyViolationDetails;
    private java.util.List<NameValuePairView> componentVersionStatusCounts;
    private ProjectVersionComponentPolicyStatusType overallStatus;
    private java.util.Date updatedAt;

    public ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView getComponentVersionPolicyViolationDetails() {
        return componentVersionPolicyViolationDetails;
    }

    public void setComponentVersionPolicyViolationDetails(ProjectVersionPolicyStatusComponentVersionPolicyViolationDetailsView componentVersionPolicyViolationDetails) {
        this.componentVersionPolicyViolationDetails = componentVersionPolicyViolationDetails;
    }

    public java.util.List<NameValuePairView> getComponentVersionStatusCounts() {
        return componentVersionStatusCounts;
    }

    public void setComponentVersionStatusCounts(java.util.List<NameValuePairView> componentVersionStatusCounts) {
        this.componentVersionStatusCounts = componentVersionStatusCounts;
    }

    public ProjectVersionComponentPolicyStatusType getOverallStatus() {
        return overallStatus;
    }

    public void setOverallStatus(ProjectVersionComponentPolicyStatusType overallStatus) {
        this.overallStatus = overallStatus;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
