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
package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpressionSetView;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicySummaryStatusType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionBomPolicyRuleView extends BlackDuckView {
    private java.util.Date createdAt;
    private String createdBy;
    private String createdByUser;
    private String description;
    private Boolean enabled;
    private PolicyRuleExpressionSetView expression;
    private String name;
    private Boolean overridable;
    private PolicySummaryStatusType policyApprovalStatus;
    private String severity;
    private java.util.Date updatedAt;
    private String updatedBy;
    private String updatedByUser;

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
        this.createdByUser = createdByUser;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public PolicyRuleExpressionSetView getExpression() {
        return expression;
    }

    public void setExpression(PolicyRuleExpressionSetView expression) {
        this.expression = expression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOverridable() {
        return overridable;
    }

    public void setOverridable(Boolean overridable) {
        this.overridable = overridable;
    }

    public PolicySummaryStatusType getPolicyApprovalStatus() {
        return policyApprovalStatus;
    }

    public void setPolicyApprovalStatus(PolicySummaryStatusType policyApprovalStatus) {
        this.policyApprovalStatus = policyApprovalStatus;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedByUser() {
        return updatedByUser;
    }

    public void setUpdatedByUser(String updatedByUser) {
        this.updatedByUser = updatedByUser;
    }

}
