package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.LicenseFamilyUpdatedByView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class LicenseTermCategoryView extends BlackDuckView {
    private java.util.Date createdAt;
    private LicenseFamilyUpdatedByView updatedBy;
    private LicenseFamilyUpdatedByView createdBy;
    private String name;
    private java.util.Date updatedAt;
    private String description;

    public java.util.Date getCreatedAt() {
	    return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
	    this.createdAt = createdAt;
    }

    public LicenseFamilyUpdatedByView getUpdatedBy() {
	    return updatedBy;
    }

    public void setUpdatedBy(LicenseFamilyUpdatedByView updatedBy) {
	    this.updatedBy = updatedBy;
    }

    public LicenseFamilyUpdatedByView getCreatedBy() {
	    return createdBy;
    }

    public void setCreatedBy(LicenseFamilyUpdatedByView createdBy) {
	    this.createdBy = createdBy;
    }

    public String getName() {
	    return name;
    }

    public void setName(String name) {
	    this.name = name;
    }

    public java.util.Date getUpdatedAt() {
	    return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
	    this.updatedAt = updatedAt;
    }

    public String getDescription() {
	    return description;
    }

    public void setDescription(String description) {
	    this.description = description;
    }

}
