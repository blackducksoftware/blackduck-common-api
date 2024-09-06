/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.response;

import com.blackduck.integration.blackduck.api.manual.temporary.component.LegacyFilterValueView;
import com.blackduck.integration.blackduck.api.core.BlackDuckResponse;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LegacyFilterView extends BlackDuckResponse {
    private String label;
    private String name;
    private java.util.List<LegacyFilterValueView> values;

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<LegacyFilterValueView> getValues() {
        return values;
    }

    public void setValues(java.util.List<LegacyFilterValueView> values) {
        this.values = values;
    }

}
