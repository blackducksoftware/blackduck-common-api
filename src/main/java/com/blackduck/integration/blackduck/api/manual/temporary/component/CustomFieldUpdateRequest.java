/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.enumeration.CustomFieldType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CustomFieldUpdateRequest extends BlackDuckComponent {
    private Boolean active;
    private String description;
    private String label;
    private java.util.List<CustomFieldOptionUpdateRequest> options;
    private Integer position;
    private CustomFieldType type;

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public java.util.List<CustomFieldOptionUpdateRequest> getOptions() {
        return options;
    }

    public void setOptions(java.util.List<CustomFieldOptionUpdateRequest> options) {
        this.options = options;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public CustomFieldType getType() {
        return type;
    }

    public void setType(CustomFieldType type) {
        this.type = type;
    }

}
