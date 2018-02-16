package com.blackducksoftware.integration.hub.api.generated.response;

import com.blackducksoftware.integration.hub.api.core.HubResponse;
import com.blackducksoftware.integration.hub.api.generated.component.ComponentHit;
import com.blackducksoftware.integration.hub.api.generated.component.Facet;
import com.blackducksoftware.integration.hub.api.generated.component.SearchResultSpec;
import com.blackducksoftware.integration.hub.api.generated.component.SearchResultStatistics;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentSearchResult extends HubResponse {
    public java.util.List<Facet> facets;
    public java.util.List<ComponentHit> hits;
    public String localError;
    public String remoteError;
    public SearchResultSpec searchResultSpec;
    public SearchResultStatistics searchResultStatistics;

}
