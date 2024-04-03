/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LegacyAppliedFilterView extends BlackDuckComponent {
    private String label;
    private String name;
    private java.util.List<LegacyFilterValueView> selected;

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

    public java.util.List<LegacyFilterValueView> getSelected() {
        return selected;
    }

    public void setSelected(java.util.List<LegacyFilterValueView> selected) {
        this.selected = selected;
    }

}
