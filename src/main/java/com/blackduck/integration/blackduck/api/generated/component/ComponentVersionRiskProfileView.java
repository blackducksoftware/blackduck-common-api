/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.view.RiskProfileView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionRiskProfileView extends BlackDuckComponent {
    private ComponentVersionRiskProfileActivityDataView activityData;
    private RiskProfileView riskData;
    private ComponentVersionRiskProfileVersionDataView versionData;

    public ComponentVersionRiskProfileActivityDataView getActivityData() {
        return activityData;
    }

    public void setActivityData(ComponentVersionRiskProfileActivityDataView activityData) {
        this.activityData = activityData;
    }

    public RiskProfileView getRiskData() {
        return riskData;
    }

    public void setRiskData(RiskProfileView riskData) {
        this.riskData = riskData;
    }

    public ComponentVersionRiskProfileVersionDataView getVersionData() {
        return versionData;
    }

    public void setVersionData(ComponentVersionRiskProfileVersionDataView versionData) {
        this.versionData = versionData;
    }

}
