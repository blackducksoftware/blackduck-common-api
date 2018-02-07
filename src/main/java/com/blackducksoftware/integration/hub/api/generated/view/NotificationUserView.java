package com.blackducksoftware.integration.hub.api.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.blackducksoftware.integration.hub.api.core.HubView;
import com.blackducksoftware.integration.hub.api.core.LinkResponse;
import com.blackducksoftware.integration.hub.api.core.LinkSingleResponse;
import com.blackducksoftware.integration.hub.api.generated.enumeration.NotificationStateRequestStateType;
import com.blackducksoftware.integration.hub.api.generated.enumeration.NotificationType;
import com.blackducksoftware.integration.hub.api.generated.view.NotificationUserView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class NotificationUserView extends HubView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String NOTIFICATIONS_LINK = "notifications";

    public static final LinkSingleResponse NOTIFICATIONS_LINK_RESPONSE = new LinkSingleResponse(NOTIFICATIONS_LINK, NotificationUserView.class);

    static {
            links.put(NOTIFICATIONS_LINK, NOTIFICATIONS_LINK_RESPONSE);
    }

    public String content;
    public String contentType;
    public java.util.Date createdAt;
    public NotificationStateRequestStateType notificationState;
    public NotificationType type;

}
