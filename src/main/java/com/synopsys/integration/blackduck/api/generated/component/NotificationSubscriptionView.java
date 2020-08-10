/**
 * blackduck-common-api
 *
 * Copyright (c) 2020 Synopsys, Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;

@Deprecated
/**
* NotificationSubscriptionView is now called NotificationSubscriptionsSubscriptionView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class NotificationSubscriptionView extends BlackDuckComponent {
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
