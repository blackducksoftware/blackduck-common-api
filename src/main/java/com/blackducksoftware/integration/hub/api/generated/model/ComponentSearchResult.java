package com.blackducksoftware.integration.hub.api.generated.model;

import com.blackducksoftware.integration.hub.api.HubModel;
import com.blackducksoftware.integration.hub.api.generated.model.ComponentHit;
import com.blackducksoftware.integration.hub.api.generated.model.Facet;
import com.blackducksoftware.integration.hub.api.generated.model.SearchResultSpec;
import com.blackducksoftware.integration.hub.api.generated.model.SearchResultStatistics;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentSearchResult extends HubModel {
    public java.util.List<Facet> facets;
    public java.util.List<ComponentHit> hits;
    public String localError;
    public String remoteError;
    public SearchResultSpec searchResultSpec;
    public SearchResultStatistics searchResultStatistics;

}
