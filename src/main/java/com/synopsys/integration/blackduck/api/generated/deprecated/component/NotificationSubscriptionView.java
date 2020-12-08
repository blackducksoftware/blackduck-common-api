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
package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

// NotificationSubscriptionView from the previous API is now called NotificationSubscriptionsSubscriptionView
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
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
