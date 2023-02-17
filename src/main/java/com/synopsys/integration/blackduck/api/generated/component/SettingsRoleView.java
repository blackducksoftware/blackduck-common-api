/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class SettingsRoleView extends BlackDuckComponent {
    private Boolean policyStatus;
    private Boolean securityStatus;

    public Boolean getPolicyStatus() {
        return policyStatus;
    }

    public void setPolicyStatus(Boolean policyStatus) {
        this.policyStatus = policyStatus;
    }

    public Boolean getSecurityStatus() {
        return securityStatus;
    }

    public void setSecurityStatus(Boolean securityStatus) {
        this.securityStatus = securityStatus;
    }

}
