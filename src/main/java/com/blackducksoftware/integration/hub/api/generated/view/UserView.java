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

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.generated.response.AssignedProjectView;
import com.blackducksoftware.integration.hub.api.generated.view.NotificationUserView;
import com.blackducksoftware.integration.hub.api.generated.view.RoleAssignmentView;
import com.google.gson.reflect.TypeToken;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class UserView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String PROJECTS_LINK = "projects";
    public static final String INHERITED_ROLES_LINK = "inherited-roles";
    public static final String ROLES_LINK = "roles";
    public static final String NOTIFICATIONS_LINK = "notifications";

    static {
            links.put(PROJECTS_LINK, new TypeToken<ArrayList<AssignedProjectView>>() {}.getType());
            links.put(INHERITED_ROLES_LINK, new TypeToken<ArrayList<RoleAssignmentView>>() {}.getType());
            links.put(ROLES_LINK, new TypeToken<ArrayList<RoleAssignmentView>>() {}.getType());
            links.put(NOTIFICATIONS_LINK, new TypeToken<ArrayList<NotificationUserView>>() {}.getType());
    }

    public Boolean active;
    public String email;
    public String externalUserName;
    public String firstName;
    public String lastName;
    public String type;
    public String user;
    public String userName;

}
