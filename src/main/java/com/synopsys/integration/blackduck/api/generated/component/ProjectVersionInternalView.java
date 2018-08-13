/**
 * hub-common-api
 *
 * Copyright (C) 2018 Black Duck Software, Inc.
 * http://www.blackducksoftware.com/
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

import com.synopsys.integration.blackduck.api.core.HubComponent;
import com.synopsys.integration.blackduck.api.generated.component.PolicyStatusSummaryInternalView;
import com.synopsys.integration.blackduck.api.generated.enumeration.OriginSourceType;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicySummaryStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionDistributionType;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionPhaseType;
import com.synopsys.integration.blackduck.api.generated.view.ComplexLicenseView;
import com.synopsys.integration.blackduck.api.generated.view.RiskProfileView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionInternalView extends HubComponent {
    public java.util.Date createdAt;
    public String createdBy;
    public String createdByUser;
    public ProjectVersionDistributionType distribution;
    public ComplexLicenseView license;
    public RiskProfileView licenseRiskProfile;
    public String nickname;
    public RiskProfileView operationalRiskProfile;
    public ProjectVersionPhaseType phase;
    public PolicySummaryStatusType policyStatus;
    public java.util.List<PolicyStatusSummaryInternalView> policyStatusSummaries;
    public String releaseComments;
    public java.util.Date releasedOn;
    public RiskProfileView securityRiskProfile;
    public java.util.Date settingUpdatedAt;
    public String settingUpdatedBy;
    public String settingUpdatedByUser;
    public OriginSourceType source;
    public String versionName;

}
