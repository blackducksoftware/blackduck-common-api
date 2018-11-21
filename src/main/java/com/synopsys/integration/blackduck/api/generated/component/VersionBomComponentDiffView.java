package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.VersionBomLicenseView;
import com.synopsys.integration.blackduck.api.generated.enumeration.MatchedFileUsagesType;
import com.synopsys.integration.blackduck.api.generated.enumeration.VersionBomComponentDiffComponentStateType;
import com.synopsys.integration.blackduck.api.generated.view.VersionBomComponentView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionBomComponentDiffView extends BlackDuckComponent {
    private VersionBomComponentView component;
    private VersionBomComponentDiffComponentStateType componentState;
    private VersionBomComponentDiffComponentStateType componentVersionState;
    private java.util.List<VersionBomLicenseView> leftLicenses;
    private java.util.List<MatchedFileUsagesType> leftUsages;

    public VersionBomComponentView getComponent() {
        return component;
    }

    public void setComponent(VersionBomComponentView component) {
        this.component = component;
    }

    public VersionBomComponentDiffComponentStateType getComponentState() {
        return componentState;
    }

    public void setComponentState(VersionBomComponentDiffComponentStateType componentState) {
        this.componentState = componentState;
    }

    public VersionBomComponentDiffComponentStateType getComponentVersionState() {
        return componentVersionState;
    }

    public void setComponentVersionState(VersionBomComponentDiffComponentStateType componentVersionState) {
        this.componentVersionState = componentVersionState;
    }

    public java.util.List<VersionBomLicenseView> getLeftLicenses() {
        return leftLicenses;
    }

    public void setLeftLicenses(java.util.List<VersionBomLicenseView> leftLicenses) {
        this.leftLicenses = leftLicenses;
    }

    public java.util.List<MatchedFileUsagesType> getLeftUsages() {
        return leftUsages;
    }

    public void setLeftUsages(java.util.List<MatchedFileUsagesType> leftUsages) {
        this.leftUsages = leftUsages;
    }

}
