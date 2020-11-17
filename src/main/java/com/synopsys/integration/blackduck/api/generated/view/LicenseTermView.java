package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseTermCategorySummaryView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseResponsibilityType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseTermSourceType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class LicenseTermView extends BlackDuckView {
    private java.util.Date createdAt;
    private Object updatedBy;
    private Object createdBy;
    private Boolean deprecated;
    private String name;
    private LicenseTermCategorySummaryView category;
    private java.util.Date updatedAt;
    private LicenseTermSourceType source;
    private String description;
    private LicenseResponsibilityType responsibility;

    public java.util.Date getCreatedAt() {
	    return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
	    this.createdAt = createdAt;
    }

    public Object getUpdatedBy() {
	    return updatedBy;
    }

    public void setUpdatedBy(Object updatedBy) {
	    this.updatedBy = updatedBy;
    }

    public Object getCreatedBy() {
	    return createdBy;
    }

    public void setCreatedBy(Object createdBy) {
	    this.createdBy = createdBy;
    }

    public Boolean getDeprecated() {
	    return deprecated;
    }

    public void setDeprecated(Boolean deprecated) {
	    this.deprecated = deprecated;
    }

    public String getName() {
	    return name;
    }

    public void setName(String name) {
	    this.name = name;
    }

    public LicenseTermCategorySummaryView getCategory() {
	    return category;
    }

    public void setCategory(LicenseTermCategorySummaryView category) {
	    this.category = category;
    }

    public java.util.Date getUpdatedAt() {
	    return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
	    this.updatedAt = updatedAt;
    }

    public LicenseTermSourceType getSource() {
	    return source;
    }

    public void setSource(LicenseTermSourceType source) {
	    this.source = source;
    }

    public String getDescription() {
	    return description;
    }

    public void setDescription(String description) {
	    this.description = description;
    }

    public LicenseResponsibilityType getResponsibility() {
	    return responsibility;
    }

    public void setResponsibility(LicenseResponsibilityType responsibility) {
	    this.responsibility = responsibility;
    }

}
