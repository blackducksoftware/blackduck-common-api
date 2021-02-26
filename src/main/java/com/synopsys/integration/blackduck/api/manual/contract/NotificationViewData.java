/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.contract;

import com.synopsys.integration.blackduck.api.manual.enumeration.NotificationType;

public interface NotificationViewData {
    String getContentType();

    void setContentType(String contentType);

    java.util.Date getCreatedAt();

    void setCreatedAt(java.util.Date createdAt);

    NotificationType getType();

    void setType(NotificationType type);

}
