/**
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
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
package com.synopsys.integration.blackduck.api.manual.view;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.manual.component.NotificationContentComponent;
import com.synopsys.integration.blackduck.api.manual.enumeration.NotificationStateRequestStateType;

public class NotificationUserView<T extends NotificationContentComponent> extends NotificationView<T> {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String NOTIFICATIONS_LINK = "notifications";

    public static final LinkSingleResponse<NotificationUserView> NOTIFICATIONS_LINK_RESPONSE = new LinkSingleResponse<>(
        NotificationUserView.NOTIFICATIONS_LINK, NotificationUserView.class);

    static {
        NotificationUserView.links.put(
            NotificationUserView.NOTIFICATIONS_LINK, NotificationUserView.NOTIFICATIONS_LINK_RESPONSE);
    }

    private NotificationStateRequestStateType notificationState;

    @Override
    public Class<? extends BlackDuckResponse> getSubclass() {
        switch (getType()) {
            case BOM_EDIT:
                return BomEditNotificationUserView.class;
            case LICENSE_LIMIT:
                return LicenseLimitNotificationUserView.class;
            case PROJECT:
                return ProjectNotificationUserView.class;
            case PROJECT_VERSION:
                return ProjectVersionNotificationUserView.class;
            case POLICY_OVERRIDE:
                return PolicyOverrideNotificationUserView.class;
            case RULE_VIOLATION_CLEARED:
                return RuleViolationClearedNotificationUserView.class;
            case RULE_VIOLATION:
                return RuleViolationNotificationUserView.class;
            case VERSION_BOM_CODE_LOCATION_BOM_COMPUTED:
                return VersionBomCodeLocationBomComputedNotificationUserView.class;
            case VULNERABILITY:
                return VulnerabilityNotificationUserView.class;
            default:
                return NotificationUserView.class;
        }
    }

    public NotificationStateRequestStateType getNotificationState() {
        return notificationState;
    }

    public void setNotificationState(NotificationStateRequestStateType notificationState) {
        this.notificationState = notificationState;
    }

}
