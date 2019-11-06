package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import java.util.List;
import com.synopsys.integration.blackduck.api.generated.enumeration.CustomFieldTypeType;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CustomFieldViewV6 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-6+json";

    private String label;
    private java.util.List<String> values;
    private BigDecimal position;
    private CustomFieldTypeType type;
    private String description;
    private Boolean active;

    public String getLabel() {
	return label;
    }

    public void setLabel(String label) {
	this.label = label;
    }

    public java.util.List<String> getValues() {
	return values;
    }

    public void setValues(java.util.List<String> values) {
	this.values = values;
    }

    public BigDecimal getPosition() {
	return position;
    }

    public void setPosition(BigDecimal position) {
	this.position = position;
    }

    public CustomFieldTypeType getType() {
	return type;
    }

    public void setType(CustomFieldTypeType type) {
	this.type = type;
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


    public String getMediaType() {
	return mediaType;
    }

}
