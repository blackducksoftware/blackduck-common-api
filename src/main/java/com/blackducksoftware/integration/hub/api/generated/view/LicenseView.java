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
package com.blackducksoftware.integration.hub.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.core.LinkStringResponse;
import com.blackducksoftware.integration.hub.api.generated.enumeration.LicenseCodeSharingType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.LicenseOwnershipType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.LicenseSourceType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.LicenseStatusType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String TEXT_LINK = "text";

    public static final LinkStringResponse TEXT_LINK_RESPONSE = new LinkStringResponse(TEXT_LINK, String.class);

    static {
            links.put(TEXT_LINK, TEXT_LINK_RESPONSE);
    }

    public LicenseCodeSharingType codeSharing;
    public java.util.Date createdAt;
    public String createdBy;
    public String createdByUser;
    public java.util.Date expirationDate;
    public LicenseSourceType licenseSource;
    public LicenseStatusType licenseStatus;
    public String name;
    public String notes;
    public LicenseOwnershipType ownership;
    public String spdxId;
    public java.util.Date statusUpdatedAt;
    public String statusUpdatedBy;
    public String statusUpdatedByUser;
    public java.util.Date updatedAt;
    public String updatedBy;
    public String updatedByUser;

}
