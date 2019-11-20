package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRiskProfileActivityDataView;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRiskProfileRiskDataView;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRiskProfileVersionDataView;
import java.util.Optional;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentVersionRiskProfileViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-4+json";

    private ComponentVersionRiskProfileVersionDataView versionData;
    private ComponentVersionRiskProfileRiskDataView riskData;
    private ComponentVersionRiskProfileActivityDataView activityData;

    public ComponentVersionRiskProfileVersionDataView getVersionData() {
	return versionData;
    }

    public void setVersionData(ComponentVersionRiskProfileVersionDataView versionData) {
	this.versionData = versionData;
    }

    public ComponentVersionRiskProfileRiskDataView getRiskData() {
	return riskData;
    }

    public void setRiskData(ComponentVersionRiskProfileRiskDataView riskData) {
	this.riskData = riskData;
    }

    public ComponentVersionRiskProfileActivityDataView getActivityData() {
	return activityData;
    }

    public void setActivityData(ComponentVersionRiskProfileActivityDataView activityData) {
	this.activityData = activityData;
    }


    public String getMediaType() {
	return mediaType;
    }

}
