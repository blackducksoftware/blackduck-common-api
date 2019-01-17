/**
 * blackduck-common-api
 *
 * Copyright (C) 2019 Black Duck Software, Inc.
 * http://www.blackducksoftware.com/
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.blackduck.api.generated.response;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.blackduck.api.generated.component.ComponentHit;
import com.synopsys.integration.blackduck.api.generated.component.Facet;
import com.synopsys.integration.blackduck.api.generated.component.SearchResultSpec;
import com.synopsys.integration.blackduck.api.generated.component.SearchResultStatistics;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentSearchResult extends BlackDuckResponse {
    private java.util.List<Facet> facets;
    private java.util.List<ComponentHit> hits;
    private String localError;
    private String remoteError;
    private SearchResultSpec searchResultSpec;
    private SearchResultStatistics searchResultStatistics;

    public java.util.List<Facet> getFacets() {
        return facets;
    }

    public void setFacets(java.util.List<Facet> facets) {
        this.facets = facets;
    }

    public java.util.List<ComponentHit> getHits() {
        return hits;
    }

    public void setHits(java.util.List<ComponentHit> hits) {
        this.hits = hits;
    }

    public String getLocalError() {
        return localError;
    }

    public void setLocalError(String localError) {
        this.localError = localError;
    }

    public String getRemoteError() {
        return remoteError;
    }

    public void setRemoteError(String remoteError) {
        this.remoteError = remoteError;
    }

    public SearchResultSpec getSearchResultSpec() {
        return searchResultSpec;
    }

    public void setSearchResultSpec(SearchResultSpec searchResultSpec) {
        this.searchResultSpec = searchResultSpec;
    }

    public SearchResultStatistics getSearchResultStatistics() {
        return searchResultStatistics;
    }

    public void setSearchResultStatistics(SearchResultStatistics searchResultStatistics) {
        this.searchResultStatistics = searchResultStatistics;
    }

}
