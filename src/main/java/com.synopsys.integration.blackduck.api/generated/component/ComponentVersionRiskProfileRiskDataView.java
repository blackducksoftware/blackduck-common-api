package com.synopsys.integration.blackduck.api.generated.component;

import java.util.List;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRiskProfileRiskDataCountsView;
import java.util.Optional;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentVersionRiskProfileRiskDataView extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-5+json";

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
