/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.core;

import com.blackduck.integration.rest.HttpUrl;
import com.google.gson.annotations.JsonAdapter;

public class ResourceMetadata extends BlackDuckComponent {
    private java.util.List<String> allow;

    @JsonAdapter(HttpUrlTypeAdapter.class)
    private HttpUrl href;

    private java.util.List<ResourceLink> links;

    public java.util.List<String> getAllow() {
        return allow;
    }

    public void setAllow(java.util.List<String> allow) {
        this.allow = allow;
    }

    public HttpUrl getHref() {
        return href;
    }

    public void setHref(HttpUrl href) {
        this.href = href;
    }

    public java.util.List<ResourceLink> getLinks() {
        return links;
    }

    public void setLinks(java.util.List<ResourceLink> links) {
        this.links = links;
    }

}