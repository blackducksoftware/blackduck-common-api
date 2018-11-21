package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.RiskCountType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RiskCountView extends BlackDuckComponent {
    private Integer count;
    private RiskCountType countType;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public RiskCountType getCountType() {
        return countType;
    }

    public void setCountType(RiskCountType countType) {
        this.countType = countType;
    }

}
