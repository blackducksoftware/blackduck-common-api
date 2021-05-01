/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.core;

import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.core.response.UrlMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.UrlSingleResponse;
import com.synopsys.integration.rest.HttpUrl;

import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * A marker class used when a BlackDuckResponse has the '_meta' property which, for now, must be determined manually by actually performing requests against Black Duck endpoints.
 */
public class BlackDuckView extends BlackDuckResponse {
    private ResourceMetadata _meta;

    public ResourceMetadata getMeta() {
        return _meta;
    }

    public void setMeta(ResourceMetadata meta) {
        _meta = meta;
    }

    public boolean hasLink(String linkKey) {
        if (null == _meta || null == _meta.getLinks()) {
            return false;
        }

        return _meta.getLinks().stream()
                .map(ResourceLink::getRel)
                .anyMatch(linkKey::equals);
    }

    public <T extends BlackDuckResponse> UrlSingleResponse<T> metaSingleResponse(LinkSingleResponse<T> linkSingleResponse) {
        HttpUrl url = getFirstLink(linkSingleResponse.getLink());
        return new UrlSingleResponse<>(url, linkSingleResponse.getResponseClass());
    }

    public <T extends BlackDuckResponse> UrlMultipleResponses<T> metaMultipleResponses(LinkMultipleResponses<T> linkMultipleResponses) {
        HttpUrl url = getFirstLink(linkMultipleResponses.getLink());
        return new UrlMultipleResponses<>(url, linkMultipleResponses.getResponseClass());
    }

    public HttpUrl getFirstLink(String linkKey) {
        return getFirstLinkSafely(linkKey)
                   .orElseThrow(() -> new NoSuchElementException(String.format("The link key %s was not found.", linkKey)));
    }

    public <T extends BlackDuckResponse> Optional<UrlSingleResponse<T>> metaSingleResponseSafely(LinkSingleResponse<T> linkSingleResponse) {
        return getFirstLinkSafely(linkSingleResponse.getLink())
            .map(url -> new UrlSingleResponse<>(url, linkSingleResponse.getResponseClass()));
    }

    public <T extends BlackDuckResponse> Optional<UrlMultipleResponses<T>> metaMultipleResponsesSafely(LinkMultipleResponses<T> linkMultipleResponses) {
        return getFirstLinkSafely(linkMultipleResponses.getLink())
                   .map(url -> new UrlMultipleResponses<>(url, linkMultipleResponses.getResponseClass()));
    }

    public Optional<HttpUrl> getFirstLinkSafely(String linkKey) {
        return _meta.getLinks().stream()
                .filter(resourceLink -> resourceLink.getRel().equals(linkKey))
                .findFirst()
                .map(ResourceLink::getHref);
    }

    public List<HttpUrl> getLinks(String linkKey) {
        return getResourceLinks().stream()
                .filter(resourceLink -> resourceLink.getRel().equals(linkKey))
                .map(ResourceLink::getHref)
                .collect(Collectors.toList());
    }

    public ResourceMetadata getResourceMetadata() {
        return _meta;
    }

    public List<ResourceLink> getResourceLinks() {
        if (null == _meta || null == _meta.getLinks()) {
            return Collections.emptyList();
        }

        return _meta.getLinks();
    }

    public List<String> getAvailableLinks() {
        return getResourceLinks().stream()
                .map(ResourceLink::getRel)
                .collect(Collectors.toList());
    }

    public List<String> getAllowedMethods() {
        if (null == _meta || null == _meta.getAllow()) {
            return Collections.emptyList();
        }

        return _meta.getAllow();
    }

    public HttpUrl getHref() {
        return _meta.getHref();
    }

    public String getMediaType() {
        return "application/json";
    }

}
