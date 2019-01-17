/**
 * blackduck-common-api
 *
 * Copyright (C) 2019 Black Duck Software, Inc.
 * http://www.blackducksoftware.com/
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
package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionPolicyViolationDetails;
import com.synopsys.integration.blackduck.api.generated.component.NameValuePairView;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicySummaryStatusType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionBomPolicyStatusView extends BlackDuckView {
    private ComponentVersionPolicyViolationDetails componentVersionPolicyViolationDetails;
    private java.util.List<NameValuePairView> componentVersionStatusCounts;
    private PolicySummaryStatusType overallStatus;
    private java.util.Date updatedAt;

    public ComponentVersionPolicyViolationDetails getComponentVersionPolicyViolationDetails() {
        return componentVersionPolicyViolationDetails;
    }

    public void setComponentVersionPolicyViolationDetails(ComponentVersionPolicyViolationDetails componentVersionPolicyViolationDetails) {
        this.componentVersionPolicyViolationDetails = componentVersionPolicyViolationDetails;
    }

    public java.util.List<NameValuePairView> getComponentVersionStatusCounts() {
        return componentVersionStatusCounts;
    }

    public void setComponentVersionStatusCounts(java.util.List<NameValuePairView> componentVersionStatusCounts) {
        this.componentVersionStatusCounts = componentVersionStatusCounts;
    }

    public PolicySummaryStatusType getOverallStatus() {
        return overallStatus;
    }

    public void setOverallStatus(PolicySummaryStatusType overallStatus) {
        this.overallStatus = overallStatus;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
