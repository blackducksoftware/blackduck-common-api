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

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpressionView;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyRuleSeverityType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PolicyRuleViewV5 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.policy-5+json";

    private String name;
    private String description;
    private PolicyRuleSeverityType severity;
    private Boolean overridable;
    private Boolean enabled;
    private PolicyRuleExpressionView expression;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getDescription() {
	return description;
    }

    public void setDescription(String description) {
	this.description = description;
    }

    public PolicyRuleSeverityType getSeverity() {
	return severity;
    }

    public void setSeverity(PolicyRuleSeverityType severity) {
	this.severity = severity;
    }

    public Boolean getOverridable() {
	return overridable;
    }

    public void setOverridable(Boolean overridable) {
	this.overridable = overridable;
    }

    public Boolean getEnabled() {
	return enabled;
    }

    public void setEnabled(Boolean enabled) {
	this.enabled = enabled;
    }

    public PolicyRuleExpressionView getExpression() {
	return expression;
    }

    public void setExpression(PolicyRuleExpressionView expression) {
	this.expression = expression;
    }


    public String getMediaType() {
	return mediaType;
    }

}
