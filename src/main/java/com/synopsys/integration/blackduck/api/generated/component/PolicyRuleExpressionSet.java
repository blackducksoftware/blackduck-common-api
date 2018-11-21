package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpression;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyRuleExpressionSetOperatorType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PolicyRuleExpressionSet extends BlackDuckComponent {
    private java.util.List<PolicyRuleExpression> expressions;
    private PolicyRuleExpressionSetOperatorType operator;

    public java.util.List<PolicyRuleExpression> getExpressions() {
        return expressions;
    }

    public void setExpressions(java.util.List<PolicyRuleExpression> expressions) {
        this.expressions = expressions;
    }

    public PolicyRuleExpressionSetOperatorType getOperator() {
        return operator;
    }

    public void setOperator(PolicyRuleExpressionSetOperatorType operator) {
        this.operator = operator;
    }

}
