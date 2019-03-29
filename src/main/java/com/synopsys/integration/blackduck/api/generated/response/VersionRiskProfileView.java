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
package com.synopsys.integration.blackduck.api.generated.response;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.generated.view.ProjectVersionView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionRiskProfileView extends BlackDuckResponse {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String VERSION_LINK = "version";

    public static final LinkSingleResponse<ProjectVersionView> VERSION_LINK_RESPONSE = new LinkSingleResponse<ProjectVersionView>(VERSION_LINK, ProjectVersionView.class);

    static {
        links.put(VERSION_LINK, VERSION_LINK_RESPONSE);
    }

    private java.util.Date bomLastUpdatedAt;
    private Object categories;

    public java.util.Date getBomLastUpdatedAt() {
        return bomLastUpdatedAt;
    }

    public void setBomLastUpdatedAt(java.util.Date bomLastUpdatedAt) {
        this.bomLastUpdatedAt = bomLastUpdatedAt;
    }

    public Object getCategories() {
        return categories;
    }

    public void setCategories(Object categories) {
        this.categories = categories;
    }

}
