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
package com.synopsys.integration.blackduck.api.generated.deprecated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpressionView;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyRuleSeverityType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComponentPolicyStatusType;

@Deprecated
/**
* VersionBomPolicyRuleView from the previous API is now called ComponentPolicyRulesView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class VersionBomPolicyRuleView extends BlackDuckView {
    private String name;
    private Boolean enabled;
    private PolicyRuleSeverityType severity;
    private PolicyRuleExpressionView expression;
    private java.util.Date createdAt;
    private String createdBy;
    private java.util.Date updatedAt;
    private String updatedBy;
    private String comment;
    private String description;
    private String createdByUser;
    private String updatedByUser;
    private Boolean overridable;
    private ProjectVersionComponentPolicyStatusType policyApprovalStatus;

    public String getName() {
	    return name;
    }

    public void setName(String name) {
	    this.name = name;
    }

    public Boolean getEnabled() {
	    return enabled;
    }

    public void setEnabled(Boolean enabled) {
	    this.enabled = enabled;
    }

    public PolicyRuleSeverityType getSeverity() {
	    return severity;
    }

    public void setSeverity(PolicyRuleSeverityType severity) {
	    this.severity = severity;
    }

    public PolicyRuleExpressionView getExpression() {
	    return expression;
    }

    public void setExpression(PolicyRuleExpressionView expression) {
	    this.expression = expression;
    }

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

    public String getComment() {
	    return comment;
    }

    public void setComment(String comment) {
	    this.comment = comment;
    }

    public String getDescription() {
	    return description;
    }

    public void setDescription(String description) {
	    this.description = description;
    }

    public String getCreatedByUser() {
	    return createdByUser;
    }

    public void setCreatedByUser(String createdByUser) {
	    this.createdByUser = createdByUser;
    }

    public String getUpdatedByUser() {
	    return updatedByUser;
    }

    public void setUpdatedByUser(String updatedByUser) {
	    this.updatedByUser = updatedByUser;
    }

    public Boolean getOverridable() {
	    return overridable;
    }

    public void setOverridable(Boolean overridable) {
	    this.overridable = overridable;
    }

    public ProjectVersionComponentPolicyStatusType getPolicyApprovalStatus() {
	    return policyApprovalStatus;
    }

    public void setPolicyApprovalStatus(ProjectVersionComponentPolicyStatusType policyApprovalStatus) {
	    this.policyApprovalStatus = policyApprovalStatus;
    }

}
