/**
 * hub-common-api
 *
 * Copyright (C) 2018 Black Duck Software, Inc.
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
package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.HubView;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.LinkStringResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.CodeLocationType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CodeLocationView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String SCANS_LINK = "scans";

    public static final LinkStringResponse SCANS_LINK_RESPONSE = new LinkStringResponse(SCANS_LINK, String.class);

    static {
        links.put(SCANS_LINK, SCANS_LINK_RESPONSE);
    }

    public java.util.Date createdAt;
    public String mappedProjectVersion;
    public String name;
    public Long scanSize;
    public CodeLocationType type;
    public java.util.Date updatedAt;
    public String url;

}
