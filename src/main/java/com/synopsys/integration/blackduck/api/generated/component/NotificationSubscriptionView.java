package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;

@Deprecated
/**
* NotificationSubscriptionView is now called NotificationSubscriptionsSubscriptionView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class NotificationSubscriptionView extends BlackDuckComponent {
    private String subscriptionTarget;
    private java.util.Date createdAt;

    public String getSubscriptionTarget() {
	    return subscriptionTarget;
    }

    public void setSubscriptionTarget(String subscriptionTarget) {
	    this.subscriptionTarget = subscriptionTarget;
    }

    public java.util.Date getCreatedAt() {
	    return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
	    this.createdAt = createdAt;
    }

}
