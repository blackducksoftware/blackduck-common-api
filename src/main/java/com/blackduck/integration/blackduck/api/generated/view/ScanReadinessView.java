/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.view;

import com.blackduck.integration.blackduck.api.generated.component.ScanReadinessItemsView;
import com.blackduck.integration.blackduck.api.core.BlackDuckView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ScanReadinessView extends BlackDuckView {
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
