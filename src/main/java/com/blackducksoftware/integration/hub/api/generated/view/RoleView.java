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
import com.blackducksoftware.integration.hub.api.core.LinkMultipleResponses;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.generated.view.UserView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RoleView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String ROLE_USERS_LINK = "role-users";
    public static final String INHERITED_ROLE_USERS_LINK = "inherited-role-users";

    public static final LinkMultipleResponses ROLE_USERS_LINK_RESPONSE = new LinkMultipleResponses(ROLE_USERS_LINK, UserView.class);
    public static final LinkMultipleResponses INHERITED_ROLE_USERS_LINK_RESPONSE = new LinkMultipleResponses(INHERITED_ROLE_USERS_LINK, UserView.class);

    static {
            links.put(ROLE_USERS_LINK, ROLE_USERS_LINK_RESPONSE);
            links.put(INHERITED_ROLE_USERS_LINK, INHERITED_ROLE_USERS_LINK_RESPONSE);
    }

    public String description;
    public String name;

}
