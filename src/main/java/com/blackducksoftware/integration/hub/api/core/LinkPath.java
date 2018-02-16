package com.blackducksoftware.integration.hub.api.core;

/**
 * We need an abstraction around special 'paths' that look like 'api/codelocations' so it is easier to distinguish them from full-formed uri's and link labels in a ResourceLink.
 */
public class LinkPath {
    private final String path;

    public LinkPath(final String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}
