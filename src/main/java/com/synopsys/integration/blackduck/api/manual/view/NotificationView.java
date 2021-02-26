/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.manual.enumeration.NotificationType;
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
