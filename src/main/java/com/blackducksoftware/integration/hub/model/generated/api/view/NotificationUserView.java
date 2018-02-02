package com.blackducksoftware.integration.hub.model.generated.api.view;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.model.HubView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class NotificationUserView extends HubView {
    public static final Map<String, Type> links = new HashMap<>();

    public static final String NOTIFICATIONS_LINK = "notifications";

    static {
        links.put(NOTIFICATIONS_LINK, NotificationUserView.class);
    }

    public String content;
    public String contentType;
    public java.util.Date createdAt;
    public com.blackducksoftware.integration.hub.model.generated.api.enumeration.NotificationUserNotificationStateEnum notificationState;
    public com.blackducksoftware.integration.hub.model.generated.api.enumeration.NotificationUserEnum type;

}
