/**
 * blackduck-common-api
 *
 * Copyright (C) 2019 Black Duck Software, Inc.
 * http://www.blackducksoftware.com/
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
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ResourceLink;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ResourceMetadata extends BlackDuckComponent {
    private java.util.List<String> allow;
    private String href;
    private java.util.List<ResourceLink> links;

    public java.util.List<String> getAllow() {
        return allow;
    }

    public void setAllow(java.util.List<String> allow) {
        this.allow = allow;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public java.util.List<ResourceLink> getLinks() {
        return links;
    }

    public void setLinks(java.util.List<ResourceLink> links) {
        this.links = links;
    }

}
