/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.generated.enumeration.ProjectVersionComparisonItemsComponentStateType;
import com.blackduck.integration.blackduck.api.generated.enumeration.UsageType;
import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionComparisonItemsView extends BlackDuckComponent {
    private ProjectVersionComparisonItemsComponentView component;
    private ProjectVersionComparisonItemsComponentStateType componentState;
    private ProjectVersionComparisonItemsComponentStateType componentVersionState;
    private java.util.List<String> leftLicenses;
    private java.util.List<UsageType> leftUsages;

    public ProjectVersionComparisonItemsComponentView getComponent() {
        return component;
    }

    public void setComponent(ProjectVersionComparisonItemsComponentView component) {
        this.component = component;
    }

    public ProjectVersionComparisonItemsComponentStateType getComponentState() {
        return componentState;
    }

    public void setComponentState(ProjectVersionComparisonItemsComponentStateType componentState) {
        this.componentState = componentState;
    }

    public ProjectVersionComparisonItemsComponentStateType getComponentVersionState() {
        return componentVersionState;
    }

    public void setComponentVersionState(ProjectVersionComparisonItemsComponentStateType componentVersionState) {
        this.componentVersionState = componentVersionState;
    }

    public java.util.List<String> getLeftLicenses() {
        return leftLicenses;
    }

    public void setLeftLicenses(java.util.List<String> leftLicenses) {
        this.leftLicenses = leftLicenses;
    }

    public java.util.List<UsageType> getLeftUsages() {
        return leftUsages;
    }

    public void setLeftUsages(java.util.List<UsageType> leftUsages) {
        this.leftUsages = leftUsages;
    }

}
