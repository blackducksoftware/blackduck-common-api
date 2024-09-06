/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionComponentSbomFieldsView extends BlackDuckComponent {
    private String fieldName;
    private String label;
    private ProjectVersionComponentSbomFieldsItemsValueView value;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ProjectVersionComponentSbomFieldsItemsValueView getValue() {
        return value;
    }

    public void setValue(ProjectVersionComponentSbomFieldsItemsValueView value) {
        this.value = value;
    }

}
