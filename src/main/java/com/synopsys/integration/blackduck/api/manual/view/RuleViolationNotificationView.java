/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.view;

import com.synopsys.integration.blackduck.api.manual.component.RuleViolationNotificationContent;
import com.synopsys.integration.blackduck.api.manual.contract.NotificationContentData;

public class RuleViolationNotificationView extends NotificationView implements NotificationContentData<RuleViolationNotificationContent> {
    private RuleViolationNotificationContent content;

    @Override
    public RuleViolationNotificationContent getContent() {
        return content;
    }

    @Override
    public void setContent(RuleViolationNotificationContent content) {
        this.content = content;
    }

}
