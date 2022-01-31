/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class NotificationSubscriptionView extends BlackDuckComponent {
    private java.util.Date createdAt;
    private String subscriptionTarget;

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getSubscriptionTarget() {
        return subscriptionTarget;
    }

    public void setSubscriptionTarget(String subscriptionTarget) {
        this.subscriptionTarget = subscriptionTarget;
    }

}
