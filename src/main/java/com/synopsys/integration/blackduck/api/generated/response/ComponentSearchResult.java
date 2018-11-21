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
