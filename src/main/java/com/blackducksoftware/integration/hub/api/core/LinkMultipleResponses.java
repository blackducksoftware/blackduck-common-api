package com.blackducksoftware.integration.hub.api.core;

public class LinkMultipleResponses extends LinkResponse {
    public LinkMultipleResponses(final String link, final Class<? extends HubResponse> responseClass) {
        super(link, responseClass);
    }

}
