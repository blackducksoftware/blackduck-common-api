package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.enumeration.FieldsCustomFieldTypeType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class FieldsCustomFieldViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.admin-4+json";

    private Object updatedBy;
    private BigDecimal position;
    private String description;
    private FieldsCustomFieldTypeType type;
    private Object createdBy;
    private String createdAt;
    private Boolean active;
    private String label;
    private String updatedAt;

    public Object getUpdatedBy() {
	return updatedBy;
    }

    public void setUpdatedBy(Object updatedBy) {
	this.updatedBy = updatedBy;
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

    public FieldsCustomFieldTypeType getType() {
	return type;
    }

    public void setType(FieldsCustomFieldTypeType type) {
	this.type = type;
    }

    public Object getCreatedBy() {
	return createdBy;
    }

    public void setCreatedBy(Object createdBy) {
	this.createdBy = createdBy;
    }

    public String getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(String createdAt) {
	this.createdAt = createdAt;
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

    public String getUpdatedAt() {
	return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
	this.updatedAt = updatedAt;
    }


    public String getMediaType() {
	return mediaType;
    }

}
