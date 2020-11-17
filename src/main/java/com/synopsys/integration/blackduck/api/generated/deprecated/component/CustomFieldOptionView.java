package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

@Deprecated
/**
* CustomFieldOptionView from the previous API is now called CustomFieldOptionsView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class CustomFieldOptionView extends BlackDuckComponent {
    private BigDecimal position;
    private String label;

    public BigDecimal getPosition() {
	    return position;
    }

    public void setPosition(BigDecimal position) {
	    this.position = position;
    }

    public String getLabel() {
	    return label;
    }

    public void setLabel(String label) {
	    this.label = label;
    }

}
