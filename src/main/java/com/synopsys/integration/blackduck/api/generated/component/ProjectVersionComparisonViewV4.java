/**
 * blackduck-common-api
 *
 * Copyright (c) 2020 Synopsys, Inc.
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
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseFamilyLicenseFamilyRiskRulesUsageType;
import java.util.List;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComparisonItemsComponentVersionStateType;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComparisonItemsComponentView;
import java.util.Optional;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionComparisonViewV4 extends BlackDuckComponent {

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
