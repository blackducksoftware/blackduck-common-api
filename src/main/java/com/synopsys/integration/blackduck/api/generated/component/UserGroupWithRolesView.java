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
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.HubComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.UserGroupCreatedFromType;
import com.synopsys.integration.blackduck.api.generated.view.RoleAssignmentView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class UserGroupWithRolesView extends HubComponent {
    public Boolean active;
    public UserGroupCreatedFromType createdFrom;
    public String externalName;
    public String name;
    public java.util.List<RoleAssignmentView> roles;
    public String userGroup;

}
