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

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComparisonItemsComponentView;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionComparisonItemsComponentStateType;
import com.synopsys.integration.blackduck.api.generated.enumeration.UsageType;

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
