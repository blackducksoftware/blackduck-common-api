package com.blackducksoftware.integration.hub.api.core;

public class LinkSingleResponse extends LinkResponse {
    public LinkSingleResponse(final String link, final Class<? extends HubResponse> responseClass) {
        super(link, responseClass);
    }

}
