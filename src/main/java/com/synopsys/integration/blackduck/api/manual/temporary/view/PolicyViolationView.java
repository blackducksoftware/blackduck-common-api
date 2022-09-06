/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;

public class PolicyViolationView extends BlackDuckView {
	private String policyName;
	private String policySeverity;
	
	public String getPolicyName() {
		return policyName;
	}

	public String getPolicySeverity() {
		return policySeverity;
	}
}
