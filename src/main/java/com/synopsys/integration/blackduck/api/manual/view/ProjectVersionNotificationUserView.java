package com.synopsys.integration.blackduck.api.manual.view;

import com.synopsys.integration.blackduck.api.manual.component.ProjectNotificationContent;
import com.synopsys.integration.blackduck.api.manual.component.ProjectVersionNotificationContent;
import com.synopsys.integration.blackduck.api.manual.contract.NotificationContentData;

public class ProjectVersionNotificationUserView extends NotificationUserView implements NotificationContentData<ProjectVersionNotificationContent> {
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
