package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.NotificationStateRequestStateType;

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
