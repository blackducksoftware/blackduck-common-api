/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.CustomFieldType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CustomFieldRequest extends BlackDuckComponent {
    private Boolean active;
    private String description;
    private java.util.List<CustomFieldOptionRequest> initialOptions;
    private String label;
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

    public java.util.List<CustomFieldOptionRequest> getInitialOptions() {
        return initialOptions;
    }

    public void setInitialOptions(java.util.List<CustomFieldOptionRequest> initialOptions) {
        this.initialOptions = initialOptions;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
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
