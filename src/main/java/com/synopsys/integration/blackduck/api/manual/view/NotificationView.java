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
package com.synopsys.integration.blackduck.api.manual.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.enumeration.NotificationType;
import com.synopsys.integration.blackduck.api.manual.contract.NotificationViewData;

import java.util.Date;

public class NotificationView extends BlackDuckView implements NotificationViewData {
    private String contentType;
    private java.util.Date createdAt;
    private NotificationType type;

    @Override
    public boolean hasSubclasses() {
        return true;
    }

    @Override
    public Class<? extends BlackDuckResponse> getSubclass() {
        switch (type) {
            case BOM_EDIT:
                return BomEditNotificationView.class;
            case LICENSE_LIMIT:
                return LicenseLimitNotificationView.class;
            case POLICY_OVERRIDE:
                return PolicyOverrideNotificationView.class;
            case PROJECT:
                return ProjectNotificationView.class;
            case PROJECT_VERSION:
                return ProjectVersionNotificationView.class;
            case RULE_VIOLATION_CLEARED:
                return RuleViolationClearedNotificationView.class;
            case RULE_VIOLATION:
                return RuleViolationNotificationView.class;
            case VERSION_BOM_CODE_LOCATION_BOM_COMPUTED:
                return VersionBomCodeLocationBomComputedNotificationView.class;
            case VULNERABILITY:
                return VulnerabilityNotificationView.class;
            default:
                return NotificationView.class;
        }
    }

    @Override
    public String getContentType() {
        return contentType;
    }

    @Override
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    @Override
    public Date getCreatedAt() {
        return createdAt;
    }

    @Override
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public NotificationType getType() {
        return type;
    }

    @Override
    public void setType(NotificationType type) {
        this.type = type;
    }

}
