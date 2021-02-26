/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.view;

import com.synopsys.integration.blackduck.api.manual.component.ProjectNotificationContent;
import com.synopsys.integration.blackduck.api.manual.contract.NotificationContentData;

public class ProjectNotificationUserView extends NotificationUserView implements NotificationContentData<ProjectNotificationContent> {
    private ProjectNotificationContent content;

    @Override
    public ProjectNotificationContent getContent() {
        return content;
    }

    @Override
    public void setContent(ProjectNotificationContent content) {
        this.content = content;
    }

}
