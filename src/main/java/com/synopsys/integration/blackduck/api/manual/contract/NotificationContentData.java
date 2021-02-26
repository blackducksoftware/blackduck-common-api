/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.contract;

import com.synopsys.integration.blackduck.api.manual.component.NotificationContentComponent;

public interface NotificationContentData<T extends NotificationContentComponent> extends NotificationViewData {
    T getContent();

    void setContent(T content);

}
