/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.view;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.response.LinkBlackDuckResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.manual.component.NotificationContentComponent;
import com.synopsys.integration.blackduck.api.manual.enumeration.NotificationStateRequestStateType;

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
