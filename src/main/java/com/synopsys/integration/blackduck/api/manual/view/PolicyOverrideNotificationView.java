/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.view;

import com.synopsys.integration.blackduck.api.manual.component.PolicyOverrideNotificationContent;
import com.synopsys.integration.blackduck.api.manual.contract.NotificationContentData;

public class PolicyOverrideNotificationView extends NotificationView implements NotificationContentData<PolicyOverrideNotificationContent> {
    private PolicyOverrideNotificationContent content;

    @Override
    public PolicyOverrideNotificationContent getContent() {
        return content;
    }

    @Override
    public void setContent(PolicyOverrideNotificationContent content) {
        this.content = content;
    }

}
