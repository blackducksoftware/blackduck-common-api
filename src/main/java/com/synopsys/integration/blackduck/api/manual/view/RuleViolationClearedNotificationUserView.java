/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.view;

import com.synopsys.integration.blackduck.api.manual.component.RuleViolationClearedNotificationContent;
import com.synopsys.integration.blackduck.api.manual.contract.NotificationContentData;

public class RuleViolationClearedNotificationUserView extends NotificationUserView implements NotificationContentData<RuleViolationClearedNotificationContent> {
    private RuleViolationClearedNotificationContent content;

    @Override
    public RuleViolationClearedNotificationContent getContent() {
        return content;
    }

    @Override
    public void setContent(RuleViolationClearedNotificationContent content) {
        this.content = content;
    }

}
