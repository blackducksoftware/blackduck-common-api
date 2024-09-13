/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.core;

import com.blackduck.integration.exception.IntegrationException;
import com.blackduck.integration.rest.HttpUrl;

/**
 * This will represent a starting point for a REST conversation with Black Duck, such as '/api/codelocations' or '/api/projects'
 */
public class BlackDuckPath<T extends BlackDuckResponse> {
    private final String path;
    private final Class<T> responseClass;
    private final boolean isMultiple;

    public static <T extends BlackDuckResponse> BlackDuckPath<T> single(String path, Class<T> responseClass) {
        return new BlackDuckPath<>(path, responseClass, false);
    }

    public static <T extends BlackDuckResponse> BlackDuckPath<T> multiple(String path, Class<T> responseClass) {
        return new BlackDuckPath<>(path, responseClass, true);
    }

    public BlackDuckPath(String path, Class<T> responseClass, boolean isMultiple) {
        this.path = path;
        this.responseClass = responseClass;
        this.isMultiple = isMultiple;
    }

    public String getPath() {
        return path;
    }

    public Class<T> getResponseClass() {
        return responseClass;
    }

    public boolean isMultiple() {
        return isMultiple;
    }

    public HttpUrl getFullBlackDuckUrl(HttpUrl blackDuckUrl) {
        try {
            return blackDuckUrl.appendRelativeUrl(path);
        } catch (IntegrationException e) {
            // ejk - in this case, appending should never cause an issue as all pieces have already been vetted
            throw new IllegalArgumentException(String.format("The supplied path: %s could not be appended to the Black Duck url: %s", blackDuckUrl.string(), path), e);
        }
    }

    @Override
    public String toString() {
        return path;
    }

}
