/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.view;

import com.synopsys.integration.blackduck.api.manual.component.ProjectNotificationContent;
import com.synopsys.integration.blackduck.api.manual.component.ProjectVersionNotificationContent;
import com.synopsys.integration.blackduck.api.manual.contract.NotificationContentData;

public class ProjectVersionNotificationView extends NotificationView implements NotificationContentData<ProjectVersionNotificationContent> {
    private ProjectVersionNotificationContent content;

    @Override
    public ProjectVersionNotificationContent getContent() {
        return content;
    }

    @Override
    public void setContent(ProjectVersionNotificationContent content) {
        this.content = content;
    }

}
