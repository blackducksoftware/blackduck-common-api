package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

@Deprecated
/**
* NotificationSubscriptionView from the previous API is now called NotificationSubscriptionsSubscriptionView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class NotificationSubscriptionView extends BlackDuckComponent {
    private java.util.Date createdAt;
    private String subscriptionTarget;
    private String subscriptionTargetProjectName;
    private String subscriptionTargetReleaseName;

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

    public String getSubscriptionTargetProjectName() {
	    return subscriptionTargetProjectName;
    }

    public void setSubscriptionTargetProjectName(String subscriptionTargetProjectName) {
	    this.subscriptionTargetProjectName = subscriptionTargetProjectName;
    }

    public String getSubscriptionTargetReleaseName() {
	    return subscriptionTargetReleaseName;
    }

    public void setSubscriptionTargetReleaseName(String subscriptionTargetReleaseName) {
	    this.subscriptionTargetReleaseName = subscriptionTargetReleaseName;
    }

}
