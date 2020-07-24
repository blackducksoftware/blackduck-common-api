package com.synopsys.integration.blackduck.api.generated.component;

import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class NotificationSubscriptionsSubscriptionViewV4 extends BlackDuckComponent {
    private String subscriptionTargetReleaseName;
    private String subscriptionTarget;
    private java.util.Date createdAt;
    private String subscriptionTargetProjectName;

    public String getSubscriptionTargetReleaseName() {
	    return subscriptionTargetReleaseName;
    }

    public void setSubscriptionTargetReleaseName(String subscriptionTargetReleaseName) {
	    this.subscriptionTargetReleaseName = subscriptionTargetReleaseName;
    }

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

    public String getSubscriptionTargetProjectName() {
	    return subscriptionTargetProjectName;
    }

    public void setSubscriptionTargetProjectName(String subscriptionTargetProjectName) {
	    this.subscriptionTargetProjectName = subscriptionTargetProjectName;
    }

}
