package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.CustomFieldType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionComponentCustomFieldView extends BlackDuckView {
    private java.util.List<String> values;
    private Boolean active;
    private BigDecimal position;
    private String label;
    private CustomFieldType type;
    private String description;

    public java.util.List<String> getValues() {
	    return values;
    }

    public void setValues(java.util.List<String> values) {
	    this.values = values;
    }

    public Boolean getActive() {
	    return active;
    }

    public void setActive(Boolean active) {
	    this.active = active;
    }

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

    public CustomFieldType getType() {
	    return type;
    }

    public void setType(CustomFieldType type) {
	    this.type = type;
    }

    public String getDescription() {
	    return description;
    }

    public void setDescription(String description) {
	    this.description = description;
    }

}
