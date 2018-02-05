package com.blackducksoftware.integration.hub.api.generated.view;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.HubView;
import com.blackducksoftware.integration.hub.api.generated.enumeration.NotificationStateRequestStateType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.NotificationType;
import com.blackducksoftware.integration.hub.api.generated.view.NotificationUserView;

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
    public NotificationStateRequestStateType notificationState;
    public NotificationType type;

}
