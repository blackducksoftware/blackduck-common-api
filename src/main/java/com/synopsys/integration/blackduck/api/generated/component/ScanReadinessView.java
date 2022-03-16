/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ScanReadinessItemsView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ScanReadinessView extends BlackDuckComponent {
    private java.util.List<ScanReadinessItemsView> items;
    private String readiness;

    public java.util.List<ScanReadinessItemsView> getItems() {
        return items;
    }

    public void setItems(java.util.List<ScanReadinessItemsView> items) {
        this.items = items;
    }

    public String getReadiness() {
        return readiness;
    }

    public void setReadiness(String readiness) {
        this.readiness = readiness;
    }

}
