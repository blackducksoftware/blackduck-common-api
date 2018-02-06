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
import com.blackducksoftware.integration.hub.api.generated.enumeration.OriginSourceType;
import com.blackducksoftware.integration.hub.api.generated.response.AssignedUserGroupView;
import com.blackducksoftware.integration.hub.api.generated.view.AssignedUserView;
import com.blackducksoftware.integration.hub.api.generated.view.ProjectVersionView;
import com.google.gson.reflect.TypeToken;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String VERSIONS_LINK = "versions";
    public static final String USERGROUPS_LINK = "usergroups";
    public static final String CANONICALVERSION_LINK = "canonicalVersion";
    public static final String USERS_LINK = "users";

    static {
            links.put(VERSIONS_LINK, new TypeToken<ArrayList<ProjectVersionView>>() {}.getType());
            links.put(USERGROUPS_LINK, new TypeToken<ArrayList<AssignedUserGroupView>>() {}.getType());
            links.put(CANONICALVERSION_LINK, ProjectVersionView.class);
            links.put(USERS_LINK, new TypeToken<ArrayList<AssignedUserView>>() {}.getType());
    }

    public String description;
    public String name;
    public Boolean projectLevelAdjustments;
    public String projectOwner;
    public Integer projectTier;
    public OriginSourceType source;

}
