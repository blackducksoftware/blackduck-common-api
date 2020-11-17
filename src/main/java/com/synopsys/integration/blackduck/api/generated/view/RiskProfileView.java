package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.RiskProfileCountsView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class RiskProfileView extends BlackDuckView {
    private java.util.List<RiskProfileCountsView> counts;

    public java.util.List<RiskProfileCountsView> getCounts() {
	    return counts;
    }

    public void setCounts(java.util.List<RiskProfileCountsView> counts) {
	    this.counts = counts;
    }

}
