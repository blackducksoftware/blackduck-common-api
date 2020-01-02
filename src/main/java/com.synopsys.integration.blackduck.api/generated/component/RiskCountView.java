package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentVersionRiskProfileRiskDataCountsCountTypeType;

@Deprecated
/**
* RiskCountView is now called ComponentVersionRiskProfileRiskDataCountsView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class RiskCountView extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.component-detail-4+json";

    private ComponentVersionRiskProfileRiskDataCountsCountTypeType countType;
    private BigDecimal count;

    public ComponentVersionRiskProfileRiskDataCountsCountTypeType getCountType() {
	return countType;
    }

    public void setCountType(ComponentVersionRiskProfileRiskDataCountsCountTypeType countType) {
	this.countType = countType;
    }

    public BigDecimal getCount() {
	return count;
    }

    public void setCount(BigDecimal count) {
	this.count = count;
    }


    public String getMediaType() {
	return mediaType;
    }

}
