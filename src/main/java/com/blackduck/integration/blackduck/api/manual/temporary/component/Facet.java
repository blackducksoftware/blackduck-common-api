/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class Facet extends BlackDuckComponent {
    private FacetType facetType;
    private java.util.List<FacetValue> facetValues;

    public FacetType getFacetType() {
        return facetType;
    }

    public void setFacetType(FacetType facetType) {
        this.facetType = facetType;
    }

    public java.util.List<FacetValue> getFacetValues() {
        return facetValues;
    }

    public void setFacetValues(java.util.List<FacetValue> facetValues) {
        this.facetValues = facetValues;
    }

}
