/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpressionExpressionsView;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyRuleExpressionOperatorType;

// PolicyRuleExpressionView from the previous API is now called PolicyRuleExpressionExpressionsView
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PolicyRuleExpressionView extends BlackDuckComponent {
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
