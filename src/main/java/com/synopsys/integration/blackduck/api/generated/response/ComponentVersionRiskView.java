package com.synopsys.integration.blackduck.api.generated.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.blackduck.api.generated.component.ActivityDataView;
import com.synopsys.integration.blackduck.api.generated.component.VersionDataView;
import com.synopsys.integration.blackduck.api.generated.view.RiskProfileView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionRiskView extends BlackDuckResponse {
    private ActivityDataView activityData;
    private RiskProfileView riskData;
    private VersionDataView versionData;

    public ActivityDataView getActivityData() {
        return activityData;
    }

    public void setActivityData(ActivityDataView activityData) {
        this.activityData = activityData;
    }

    public RiskProfileView getRiskData() {
        return riskData;
    }

    public void setRiskData(RiskProfileView riskData) {
        this.riskData = riskData;
    }

    public VersionDataView getVersionData() {
        return versionData;
    }

    public void setVersionData(VersionDataView versionData) {
        this.versionData = versionData;
    }

}
