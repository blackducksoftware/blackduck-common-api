/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.enumeration.ComparisonMatchType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionComparisonItemsComponentView extends BlackDuckComponent {
    private java.util.List<ComparisonMatchType> matchTypes;

    public java.util.List<ComparisonMatchType> getMatchTypes() {
        return matchTypes;
    }

    public void setMatchTypes(java.util.List<ComparisonMatchType> matchTypes) {
        this.matchTypes = matchTypes;
    }

}
