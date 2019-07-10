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
