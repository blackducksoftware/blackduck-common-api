package com.blackducksoftware.integration.hub.api.core;

/**
 * This will represent a starting point for a REST conversation with the Hub, such as '/api/codelocations' or '/api/projects'
 */
public class HubPath {
    private final String path;

    public HubPath(final String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

}
