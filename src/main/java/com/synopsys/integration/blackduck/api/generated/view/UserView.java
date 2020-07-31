/**
 * blackduck-common-api
 *
 * Copyright (c) 2020 Synopsys, Inc.
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
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.response.UserProjectsView;
import com.synopsys.integration.blackduck.api.generated.view.RoleAssignmentView;
import com.synopsys.integration.blackduck.api.manual.view.NotificationUserView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class UserView extends UserViewV4 {
	public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String INHERITED_ROLES_LINK = "inherited-roles";
    public static final String NOTIFICATIONS_LINK = "notifications";
    public static final String PROJECTS_LINK = "projects";
    public static final String ROLES_LINK = "roles";

	public static final LinkMultipleResponses<RoleAssignmentView> INHERITED_ROLES_LINK_RESPONSE = new LinkMultipleResponses<RoleAssignmentView>(INHERITED_ROLES_LINK, RoleAssignmentView.class);
	public static final LinkMultipleResponses<NotificationUserView> NOTIFICATIONS_LINK_RESPONSE = new LinkMultipleResponses<NotificationUserView>(NOTIFICATIONS_LINK, NotificationUserView.class);
	public static final LinkMultipleResponses<UserProjectsView> PROJECTS_LINK_RESPONSE = new LinkMultipleResponses<UserProjectsView>(PROJECTS_LINK, UserProjectsView.class);
	public static final LinkMultipleResponses<RoleAssignmentView> ROLES_LINK_RESPONSE = new LinkMultipleResponses<RoleAssignmentView>(ROLES_LINK, RoleAssignmentView.class);

    static {
	    links.put(INHERITED_ROLES_LINK, INHERITED_ROLES_LINK_RESPONSE);
	    links.put(NOTIFICATIONS_LINK, NOTIFICATIONS_LINK_RESPONSE);
	    links.put(PROJECTS_LINK, PROJECTS_LINK_RESPONSE);
	    links.put(ROLES_LINK, ROLES_LINK_RESPONSE);
    }

}
