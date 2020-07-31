package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentVersionRiskProfileRiskDataCountsCountType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ComponentVersionRiskProfileRiskDataCountsViewV4 extends BlackDuckComponent {
    private ComponentVersionRiskProfileRiskDataCountsCountType countType;
    private BigDecimal count;

    public ComponentVersionRiskProfileRiskDataCountsCountType getCountType() {
	    return countType;
    }

    public void setCountType(ComponentVersionRiskProfileRiskDataCountsCountType countType) {
	    this.countType = countType;
    }

    public BigDecimal getCount() {
	    return count;
    }

    public void setCount(BigDecimal count) {
	    this.count = count;
    }

}
