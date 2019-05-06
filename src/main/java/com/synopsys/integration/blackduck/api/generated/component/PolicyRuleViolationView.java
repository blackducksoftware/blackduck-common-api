/**
 * blackduck-common-api
 *
 * Copyright (c) 2019 Synopsys, Inc.
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

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.UserSummary;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicySummaryStatusType;
import com.synopsys.integration.blackduck.api.generated.view.PolicyRuleView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PolicyRuleViolationView extends BlackDuckComponent {
    private PolicySummaryStatusType approvalStatus;
    private String approvalStatusUrl;
    private java.util.List<UserSummary> overriddenBy;
    private PolicyRuleView policyRuleView;
    private java.util.List<UserSummary> updatedBy;

    public PolicySummaryStatusType getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(PolicySummaryStatusType approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getApprovalStatusUrl() {
        return approvalStatusUrl;
    }

    public void setApprovalStatusUrl(String approvalStatusUrl) {
        this.approvalStatusUrl = approvalStatusUrl;
    }

    public java.util.List<UserSummary> getOverriddenBy() {
        return overriddenBy;
    }

    public void setOverriddenBy(java.util.List<UserSummary> overriddenBy) {
        this.overriddenBy = overriddenBy;
    }

    public PolicyRuleView getPolicyRuleView() {
        return policyRuleView;
    }

    public void setPolicyRuleView(PolicyRuleView policyRuleView) {
        this.policyRuleView = policyRuleView;
    }

    public java.util.List<UserSummary> getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(java.util.List<UserSummary> updatedBy) {
        this.updatedBy = updatedBy;
    }

}
