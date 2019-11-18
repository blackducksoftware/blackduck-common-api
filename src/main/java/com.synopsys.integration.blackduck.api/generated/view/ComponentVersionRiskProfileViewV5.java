package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRiskProfileActivityDataView;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRiskProfileRiskDataView;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRiskProfileVersionDataView;
import java.util.Optional;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionRiskProfileViewV5 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-5+json";

    private ComponentVersionRiskProfileActivityDataView activityData;
    private ComponentVersionRiskProfileRiskDataView riskData;
    private ComponentVersionRiskProfileVersionDataView versionData;

    public ComponentVersionRiskProfileActivityDataView getActivityData() {
	return activityData;
    }

    public void setActivityData(ComponentVersionRiskProfileActivityDataView activityData) {
	this.activityData = activityData;
    }

    public ComponentVersionRiskProfileRiskDataView getRiskData() {
	return riskData;
    }

    public void setRiskData(ComponentVersionRiskProfileRiskDataView riskData) {
	this.riskData = riskData;
    }

    public ComponentVersionRiskProfileVersionDataView getVersionData() {
	return versionData;
    }

    public void setVersionData(ComponentVersionRiskProfileVersionDataView versionData) {
	this.versionData = versionData;
    }


    public String getMediaType() {
	return mediaType;
    }

}
