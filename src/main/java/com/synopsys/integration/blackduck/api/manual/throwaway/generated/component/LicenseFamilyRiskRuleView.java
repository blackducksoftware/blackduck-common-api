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
package com.synopsys.integration.blackduck.api.manual.throwaway.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.MatchedFileUsagesType;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.ProjectVersionDistributionType;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.RiskCountType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseFamilyRiskRuleView extends BlackDuckComponent {
    private ProjectVersionDistributionType releaseDistribution;
    private RiskCountType riskPriority;
    private MatchedFileUsagesType usage;

    public ProjectVersionDistributionType getReleaseDistribution() {
        return releaseDistribution;
    }

    public void setReleaseDistribution(ProjectVersionDistributionType releaseDistribution) {
        this.releaseDistribution = releaseDistribution;
    }

    public RiskCountType getRiskPriority() {
        return riskPriority;
    }

    public void setRiskPriority(RiskCountType riskPriority) {
        this.riskPriority = riskPriority;
    }

    public MatchedFileUsagesType getUsage() {
        return usage;
    }

    public void setUsage(MatchedFileUsagesType usage) {
        this.usage = usage;
    }

}
