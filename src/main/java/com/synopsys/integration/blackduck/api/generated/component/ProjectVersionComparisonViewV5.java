package com.synopsys.integration.blackduck.api.generated.component;

import java.util.List;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComparisonItemsComponentView;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseFamilyLicenseFamilyRiskRulesUsageType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComparisonItemsComponentVersionStateType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionComparisonViewV5 extends BlackDuckComponent {
    private java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> leftUsages;
    private ProjectVersionComparisonItemsComponentView component;
    private java.util.List<String> leftLicenses;
    private ProjectVersionComparisonItemsComponentVersionStateType componentVersionState;
    private ProjectVersionComparisonItemsComponentVersionStateType componentState;

    public java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> getLeftUsages() {
	    return leftUsages;
    }

    public void setLeftUsages(java.util.List<LicenseFamilyLicenseFamilyRiskRulesUsageType> leftUsages) {
	    this.leftUsages = leftUsages;
    }

    public ProjectVersionComparisonItemsComponentView getComponent() {
	    return component;
    }

    public void setComponent(ProjectVersionComparisonItemsComponentView component) {
	    this.component = component;
    }

    public java.util.List<String> getLeftLicenses() {
	    return leftLicenses;
    }

    public void setLeftLicenses(java.util.List<String> leftLicenses) {
	    this.leftLicenses = leftLicenses;
    }

    public ProjectVersionComparisonItemsComponentVersionStateType getComponentVersionState() {
	    return componentVersionState;
    }

    public void setComponentVersionState(ProjectVersionComparisonItemsComponentVersionStateType componentVersionState) {
	    this.componentVersionState = componentVersionState;
    }

    public ProjectVersionComparisonItemsComponentVersionStateType getComponentState() {
	    return componentState;
    }

    public void setComponentState(ProjectVersionComparisonItemsComponentVersionStateType componentState) {
	    this.componentState = componentState;
    }

}
