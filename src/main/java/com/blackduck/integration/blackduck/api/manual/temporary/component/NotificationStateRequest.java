/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.component;

import com.blackduck.integration.blackduck.api.manual.temporary.enumeration.NotificationStateRequestStateType;
import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class NotificationStateRequest extends BlackDuckComponent {
    private NotificationStateRequestStateType state;

    public NotificationStateRequestStateType getState() {
        return state;
    }

    public void setState(NotificationStateRequestStateType state) {
        this.state = state;
    }

}
