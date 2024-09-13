/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.deprecated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.component.PolicyRuleExpressionExpressionsView;
import com.blackduck.integration.blackduck.api.generated.enumeration.PolicyRuleExpressionOperatorType;

// PolicyRuleExpressionSetView from the previous API is now called PolicyRuleExpressionView
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public class PolicyRuleExpressionSetView extends BlackDuckComponent {
    private java.util.List<PolicyRuleExpressionExpressionsView> expressions;
    private PolicyRuleExpressionOperatorType operator;

    public java.util.List<PolicyRuleExpressionExpressionsView> getExpressions() {
        return expressions;
    }

    public void setExpressions(java.util.List<PolicyRuleExpressionExpressionsView> expressions) {
        this.expressions = expressions;
    }

    public PolicyRuleExpressionOperatorType getOperator() {
        return operator;
    }

    public void setOperator(PolicyRuleExpressionOperatorType operator) {
        this.operator = operator;
    }

}
