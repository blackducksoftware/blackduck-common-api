package com.synopsys.integration.blackduck.api.generated.view;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.generated.enumeration.CustomFieldTypeType;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class FieldsCustomFieldViewV4 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.admin-4+json";

    private Object updatedBy;
    private CustomFieldTypeType type;
    private BigDecimal position;
    private String description;
    private Object createdBy;
    private java.util.Date createdAt;
    private java.util.Date updatedAt;
    private Boolean active;
    private String label;

    public Object getUpdatedBy() {
	return updatedBy;
    }

    public void setUpdatedBy(Object updatedBy) {
	this.updatedBy = updatedBy;
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

    public Object getCreatedBy() {
	return createdBy;
    }

    public void setCreatedBy(Object createdBy) {
	this.createdBy = createdBy;
    }

    public java.util.Date getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
	this.createdAt = createdAt;
    }

    public java.util.Date getUpdatedAt() {
	return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
	this.updatedAt = updatedAt;
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


    public String getMediaType() {
	return mediaType;
    }

}
