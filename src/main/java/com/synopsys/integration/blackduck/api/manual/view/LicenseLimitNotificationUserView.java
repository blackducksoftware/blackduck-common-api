/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.view;

import com.synopsys.integration.blackduck.api.manual.component.LicenseLimitNotificationContent;
import com.synopsys.integration.blackduck.api.manual.contract.NotificationContentData;

public class LicenseLimitNotificationUserView extends NotificationUserView implements NotificationContentData<LicenseLimitNotificationContent> {
    private LicenseLimitNotificationContent content;

    @Override
    public LicenseLimitNotificationContent getContent() {
        return content;
    }

    @Override
    public void setContent(LicenseLimitNotificationContent content) {
        this.content = content;
    }

}
