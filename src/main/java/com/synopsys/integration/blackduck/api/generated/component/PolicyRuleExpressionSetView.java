package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.PolicyRuleExpressionView;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicyRuleExpressionSetOperatorType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PolicyRuleExpressionSetView extends BlackDuckComponent {
    private java.util.List<PolicyRuleExpressionView> expressions;
    private PolicyRuleExpressionSetOperatorType operator;

    public java.util.List<PolicyRuleExpressionView> getExpressions() {
        return expressions;
    }

    public void setExpressions(java.util.List<PolicyRuleExpressionView> expressions) {
        this.expressions = expressions;
    }

    public PolicyRuleExpressionSetOperatorType getOperator() {
        return operator;
    }

    public void setOperator(PolicyRuleExpressionSetOperatorType operator) {
        this.operator = operator;
    }

}
