/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.core;

import com.google.gson.annotations.JsonAdapter;
import com.synopsys.integration.rest.HttpUrl;

public class ResourceLink extends BlackDuckComponent {
    @JsonAdapter(HttpUrlTypeAdapter.class)
    private HttpUrl href;

    private String label;
    private String name;
    private String rel;

    public HttpUrl getHref() {
        return href;
    }

    public void setHref(HttpUrl href) {
        this.href = href;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRel() {
        return rel;
    }

    public void setRel(String rel) {
        this.rel = rel;
    }

}