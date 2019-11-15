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

import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentPolicyRulesItemsSeverityType;
import com.synopsys.integration.blackduck.api.generated.component.ComponentPolicyRulesItemsExpressionView;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentPolicyRulesItemsPolicyApprovalStatusType;

@Deprecated
// VersionBomPolicyRuleView is now called ComponentPolicyRulesView
//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionBomPolicyRuleView extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-4+json";

    private Boolean enabled;
    private ComponentPolicyRulesItemsExpressionView expression;
    private String updatedAt;
    private String description;
    private String name;
    private String updatedBy;
    private String updatedByUser;
    private String comment;
    private ComponentPolicyRulesItemsSeverityType severity;
    private Boolean overridable;
    private String createdBy;
    private String createdByUser;
    private String createdAt;
    private ComponentPolicyRulesItemsPolicyApprovalStatusType policyApprovalStatus;

    public Boolean getEnabled() {
	return enabled;
    }

    public void setEnabled(Boolean enabled) {
	this.enabled = enabled;
    }

    public ComponentPolicyRulesItemsExpressionView getExpression() {
	return expression;
    }

    public void setExpression(ComponentPolicyRulesItemsExpressionView expression) {
	this.expression = expression;
    }

    public String getUpdatedAt() {
	return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
	this.updatedAt = updatedAt;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
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

    public String getComment() {
	return comment;
    }

    public void setComment(String comment) {
	this.comment = comment;
    }

    public ComponentPolicyRulesItemsSeverityType getSeverity() {
	return severity;
    }

    public void setSeverity(ComponentPolicyRulesItemsSeverityType severity) {
	this.severity = severity;
    }

    public Boolean getOverridable() {
	return overridable;
    }

    public void setOverridable(Boolean overridable) {
	this.overridable = overridable;
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

    public String getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(String createdAt) {
	this.createdAt = createdAt;
    }

    public ComponentPolicyRulesItemsPolicyApprovalStatusType getPolicyApprovalStatus() {
	return policyApprovalStatus;
    }

    public void setPolicyApprovalStatus(ComponentPolicyRulesItemsPolicyApprovalStatusType policyApprovalStatus) {
	this.policyApprovalStatus = policyApprovalStatus;
    }


    public String getMediaType() {
	return mediaType;
    }

}
