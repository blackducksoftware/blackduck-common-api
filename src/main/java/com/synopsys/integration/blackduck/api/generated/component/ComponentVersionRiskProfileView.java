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
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRiskProfileActivityDataView;
import com.synopsys.integration.blackduck.api.generated.component.ComponentVersionRiskProfileVersionDataView;
import com.synopsys.integration.blackduck.api.generated.view.RiskProfileView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionRiskProfileView extends BlackDuckComponent {
    private ComponentVersionRiskProfileActivityDataView activityData;
    private RiskProfileView riskData;
    private ComponentVersionRiskProfileVersionDataView versionData;

    public ComponentVersionRiskProfileActivityDataView getActivityData() {
        return activityData;
    }

    public void setActivityData(ComponentVersionRiskProfileActivityDataView activityData) {
        this.activityData = activityData;
    }

    public RiskProfileView getRiskData() {
        return riskData;
    }

    public void setRiskData(RiskProfileView riskData) {
        this.riskData = riskData;
    }

    public ComponentVersionRiskProfileVersionDataView getVersionData() {
        return versionData;
    }

    public void setVersionData(ComponentVersionRiskProfileVersionDataView versionData) {
        this.versionData = versionData;
    }

}
