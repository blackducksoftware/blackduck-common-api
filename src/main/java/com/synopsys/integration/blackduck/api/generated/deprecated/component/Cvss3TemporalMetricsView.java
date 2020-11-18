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
package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.VulnerabilityCvss3TemporalMetricsExploitabilityType;
import com.synopsys.integration.blackduck.api.generated.enumeration.VulnerabilityCvss3TemporalMetricsRemediationLevelType;
import com.synopsys.integration.blackduck.api.generated.enumeration.VulnerabilityCvss3TemporalMetricsReportConfidenceType;

@Deprecated
/**
* Cvss3TemporalMetricsView from the previous API is now called VulnerabilityCvss3TemporalMetricsView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class Cvss3TemporalMetricsView extends BlackDuckComponent {
    private BigDecimal score;
    private VulnerabilityCvss3TemporalMetricsExploitabilityType exploitability;
    private VulnerabilityCvss3TemporalMetricsRemediationLevelType remediationLevel;
    private VulnerabilityCvss3TemporalMetricsReportConfidenceType reportConfidence;

    public BigDecimal getScore() {
	    return score;
    }

    public void setScore(BigDecimal score) {
	    this.score = score;
    }

    public VulnerabilityCvss3TemporalMetricsExploitabilityType getExploitability() {
	    return exploitability;
    }

    public void setExploitability(VulnerabilityCvss3TemporalMetricsExploitabilityType exploitability) {
	    this.exploitability = exploitability;
    }

    public VulnerabilityCvss3TemporalMetricsRemediationLevelType getRemediationLevel() {
	    return remediationLevel;
    }

    public void setRemediationLevel(VulnerabilityCvss3TemporalMetricsRemediationLevelType remediationLevel) {
	    this.remediationLevel = remediationLevel;
    }

    public VulnerabilityCvss3TemporalMetricsReportConfidenceType getReportConfidence() {
	    return reportConfidence;
    }

    public void setReportConfidence(VulnerabilityCvss3TemporalMetricsReportConfidenceType reportConfidence) {
	    this.reportConfidence = reportConfidence;
    }

}
