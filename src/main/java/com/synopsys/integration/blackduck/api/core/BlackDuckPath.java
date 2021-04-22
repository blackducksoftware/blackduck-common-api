/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.core;

import com.synopsys.integration.exception.IntegrationException;
import com.synopsys.integration.rest.HttpUrl;

/**
 * This will represent a starting point for a REST conversation with Black Duck, such as '/api/codelocations' or '/api/projects'
 */
public class BlackDuckPath {
    private final String path;

    //add multiplicity and response class
    public BlackDuckPath(final String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public HttpUrl getFullBlackDuckUrl(HttpUrl blackDuckUrl) throws IntegrationException {
        return blackDuckUrl.appendRelativeUrl(path);
    }

    @Override
    public String toString() {
        return path;
    }

}
