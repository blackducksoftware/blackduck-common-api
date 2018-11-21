package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.NotificationStateRequestStateType;
import com.synopsys.integration.blackduck.api.generated.enumeration.NotificationType;
import com.synopsys.integration.blackduck.api.generated.view.NotificationUserView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class NotificationUserView extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String NOTIFICATIONS_LINK = "notifications";

    public static final LinkSingleResponse<NotificationUserView> NOTIFICATIONS_LINK_RESPONSE = new LinkSingleResponse<NotificationUserView>(NOTIFICATIONS_LINK, NotificationUserView.class);

    static {
        links.put(NOTIFICATIONS_LINK, NOTIFICATIONS_LINK_RESPONSE);
    }

    private String contentType;
    private java.util.Date createdAt;
    private NotificationStateRequestStateType notificationState;
    private NotificationType type;

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public NotificationStateRequestStateType getNotificationState() {
        return notificationState;
    }

    public void setNotificationState(NotificationStateRequestStateType notificationState) {
        this.notificationState = notificationState;
    }

    public NotificationType getType() {
        return type;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }

}
