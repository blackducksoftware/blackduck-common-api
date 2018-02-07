package com.blackducksoftware.integration.hub.api.core;

public abstract class LinkResponse {
    public String link;
    public Class<? extends HubResponse> responseClass;

    public LinkResponse(final String link, final Class<? extends HubResponse> responseClass) {
        this.link = link;
        this.responseClass = responseClass;
    }

}
