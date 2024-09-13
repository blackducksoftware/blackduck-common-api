/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.view;

import com.blackduck.integration.blackduck.api.core.response.LinkBlackDuckResponse;
import com.blackduck.integration.blackduck.api.core.response.LinkSingleResponse;
import com.blackduck.integration.blackduck.api.manual.component.NotificationContentComponent;
import com.blackduck.integration.blackduck.api.manual.enumeration.NotificationStateRequestStateType;

import java.util.HashMap;
import java.util.Map;

public class NotificationUserView<T extends NotificationContentComponent> extends NotificationView<T> {
    public static final Map<String, LinkBlackDuckResponse> links = new HashMap<>();

    public static final String NOTIFICATIONS_LINK = "notifications";

    public static final LinkSingleResponse<NotificationUserView> NOTIFICATIONS_LINK_RESPONSE = new LinkSingleResponse<>(
        NotificationUserView.NOTIFICATIONS_LINK, NotificationUserView.class);

    static {
        NotificationUserView.links.put(
            NotificationUserView.NOTIFICATIONS_LINK, NotificationUserView.NOTIFICATIONS_LINK_RESPONSE);
    }

    private NotificationStateRequestStateType notificationState;

    public NotificationStateRequestStateType getNotificationState() {
        return notificationState;
    }

    public void setNotificationState(NotificationStateRequestStateType notificationState) {
        this.notificationState = notificationState;
    }

}
