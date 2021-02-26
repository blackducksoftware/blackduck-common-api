/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.view;

import com.synopsys.integration.blackduck.api.manual.component.BomEditNotificationContent;
import com.synopsys.integration.blackduck.api.manual.contract.NotificationContentData;

public class BomEditNotificationView extends NotificationView implements NotificationContentData<BomEditNotificationContent> {
    private BomEditNotificationContent content;

    @Override
    public BomEditNotificationContent getContent() {
        return content;
    }

    @Override
    public void setContent(BomEditNotificationContent content) {
        this.content = content;
    }

}
