package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.CustomFieldTypeType;

/**
* CustomFieldViewV6 is now called FieldsCustomFieldView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class CustomFieldViewV6 extends BlackDuckView {
    private java.util.List<String> values;
    private CustomFieldTypeType type;
    private BigDecimal position;
    private String description;
    private Boolean active;
    private String label;

    public java.util.List<String> getValues() {
	    return values;
    }

    public void setValues(java.util.List<String> values) {
	    this.values = values;
    }

    public CustomFieldTypeType getType() {
	    return type;
    }

    public void setType(CustomFieldTypeType type) {
	    this.type = type;
    }

    public BigDecimal getPosition() {
	    return position;
    }

    public void setPosition(BigDecimal position) {
	    this.position = position;
    }

    public String getDescription() {
	    return description;
    }

    public void setDescription(String description) {
	    this.description = description;
    }

    public Boolean getActive() {
	    return active;
    }

    public void setActive(Boolean active) {
	    this.active = active;
    }

    public String getLabel() {
	    return label;
    }

    public void setLabel(String label) {
	    this.label = label;
    }

}
