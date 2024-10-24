/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PolicyRuleExpressionExpressionsView extends BlackDuckComponent {
    private Boolean developerScanExpression;
    private String name;
    private String operation;
    private PolicyRuleExpressionExpressionsParametersView parameters;

    public Boolean getDeveloperScanExpression() {
        return developerScanExpression;
    }

    public void setDeveloperScanExpression(Boolean developerScanExpression) {
        this.developerScanExpression = developerScanExpression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public PolicyRuleExpressionExpressionsParametersView getParameters() {
        return parameters;
    }

    public void setParameters(PolicyRuleExpressionExpressionsParametersView parameters) {
        this.parameters = parameters;
    }

}
