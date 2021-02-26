/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.view;

import com.synopsys.integration.blackduck.api.manual.component.VersionBomCodeLocationBomComputedNotificationContent;
import com.synopsys.integration.blackduck.api.manual.contract.NotificationContentData;

public class VersionBomCodeLocationBomComputedNotificationView extends NotificationView implements NotificationContentData<VersionBomCodeLocationBomComputedNotificationContent> {
    private VersionBomCodeLocationBomComputedNotificationContent content;

    @Override
    public VersionBomCodeLocationBomComputedNotificationContent getContent() {
        return content;
    }

    @Override
    public void setContent(VersionBomCodeLocationBomComputedNotificationContent content) {
        this.content = content;
    }

}
