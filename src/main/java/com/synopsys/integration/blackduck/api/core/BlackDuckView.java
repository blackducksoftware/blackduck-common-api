/**
 * blackduck-common-api
 *
 * Copyright (c) 2019 Synopsys, Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.blackduck.api.core;

import com.synopsys.integration.blackduck.api.manual.component.ResourceLink;
import com.synopsys.integration.blackduck.api.manual.component.ResourceMetadata;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * A marker class used when a BlackDuckResponse has the '_meta' property which, for now, must be determined manually by actually performing requests against Hub endpoints.
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

    public Optional<String> getFirstLink(String linkKey) {
        if (null == _meta || null == _meta.getLinks()) {
            return Optional.empty();
        }

        return _meta.getLinks().stream()
                       .filter(resourceLink -> resourceLink.getRel().equals(linkKey))
                       .findFirst()
                       .map(ResourceLink::getHref);
    }

    public List<String> getLinks(String linkKey) {
        return getResourceLinks().stream()
                       .map(ResourceLink::getHref)
                       .collect(Collectors.toList());
    }

    public Optional<ResourceMetadata> getResourceMetadata() {
        if (null == _meta) {
            return Optional.empty();
        }

        return Optional.of(_meta);
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

    public Optional<String> getHref() {
        if (null == _meta || null == _meta.getHref()) {
            return Optional.empty();
        }

        return Optional.of(_meta.getHref());
    }

}
