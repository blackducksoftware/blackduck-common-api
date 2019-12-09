package com.synopsys.integration.blackduck.api.generated.view;

import java.util.List;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRiskProfileRiskDataCountsView;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class RiskProfileView extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-6+json";

    private java.util.List<ComponentVersionRiskProfileRiskDataCountsView> counts;

    public java.util.List<ComponentVersionRiskProfileRiskDataCountsView> getCounts() {
	return counts;
    }

    public void setCounts(java.util.List<ComponentVersionRiskProfileRiskDataCountsView> counts) {
	this.counts = counts;
    }


    public String getMediaType() {
	return mediaType;
    }

}
