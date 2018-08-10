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
package com.synopsys.integration.hub.api.generated.component;

import com.synopsys.integration.hub.api.core.HubComponent;
import com.synopsys.integration.hub.api.generated.enumeration.MatchedFileUsagesType;
import com.synopsys.integration.hub.api.generated.enumeration.PolicyStatusSummaryStatusType;
import com.synopsys.integration.hub.api.generated.enumeration.VersionBomComponentMatchType;
import com.synopsys.integration.hub.api.generated.enumeration.VersionBomComponentReviewStatusType;
import com.synopsys.integration.hub.api.generated.view.RiskProfileView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class HierarchicalVersionBomComponentView extends HubComponent {
    public RiskProfileView aggregateLicenseRiskProfile;
    public RiskProfileView aggregateOperationalRiskProfile;
    public PolicyStatusSummaryStatusType aggregatePolicyStatus;
    public RiskProfileView aggregateSecurityRiskProfile;
    public String component;
    public String componentName;
    public String componentVersion;
    public String componentVersionName;
    public RiskProfileView licenseRiskProfile;
    public java.util.List<VersionBomLicenseView> licenses;
    public java.util.List<VersionBomComponentMatchType> matchTypes;
    public Integer numberOfMatches;
    public RiskProfileView operationalRiskProfile;
    public java.util.List<VersionBomOriginView> origins;
    public PolicyStatusSummaryStatusType policyStatus;
    public VersionBomComponentReviewStatusType reviewStatus;
    public ReviewedDetails reviewedDetails;
    public RiskProfileView securityRiskProfile;
    public java.util.List<MatchedFileUsagesType> usages;

}
