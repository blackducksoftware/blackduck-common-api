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

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.LinkStringResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.ReportFormatType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ReportType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ReportView extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String DOWNLOAD_LINK = "download";
    public static final String CONTENT_LINK = "content";

    public static final LinkStringResponse CONTENT_LINK_RESPONSE = new LinkStringResponse(CONTENT_LINK, String.class);

    static {
        links.put(CONTENT_LINK, CONTENT_LINK_RESPONSE);
    }

    public java.util.Date createdAt;
    public String createdBy;
    public String createdByUser;
    public String fileName;
    public String fileNamePrefix;
    public Long fileSize;
    public java.util.Date finishedAt;
    public String locale;
    public ReportFormatType reportFormat;
    public ReportType reportType;
    public java.util.Date updatedAt;

}
