/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import java.math.BigDecimal;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.enumeration.CustomFieldType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionCustomFieldView extends BlackDuckComponent {
    private Boolean active;
    private String description;
    private String label;
    private BigDecimal position;
    private Boolean required;
    private CustomFieldType type;
    private java.util.List<String> values;

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

    public BigDecimal getPosition() {
        return position;
    }

    public void setPosition(BigDecimal position) {
        this.position = position;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public CustomFieldType getType() {
        return type;
    }

    public void setType(CustomFieldType type) {
        this.type = type;
    }

    public java.util.List<String> getValues() {
        return values;
    }

    public void setValues(java.util.List<String> values) {
        this.values = values;
    }

}
