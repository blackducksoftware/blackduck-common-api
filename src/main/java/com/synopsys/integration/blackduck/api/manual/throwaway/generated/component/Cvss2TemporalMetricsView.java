/**
 * blackduck-common-api
 *
 * Copyright (c) 2019 Synopsys, Inc.
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
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.Cvss2TemporalMetricsExploitabilityType;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.Cvss2TemporalMetricsReportConfidenceType;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.Cvss3TemporalMetricsRemediationLevelType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class Cvss2TemporalMetricsView extends BlackDuckComponent {
    private Cvss2TemporalMetricsExploitabilityType exploitability;
    private Cvss3TemporalMetricsRemediationLevelType remediationLevel;
    private Cvss2TemporalMetricsReportConfidenceType reportConfidence;
    private java.math.BigDecimal score;

    public Cvss2TemporalMetricsExploitabilityType getExploitability() {
        return exploitability;
    }

    public void setExploitability(Cvss2TemporalMetricsExploitabilityType exploitability) {
        this.exploitability = exploitability;
    }

    public Cvss3TemporalMetricsRemediationLevelType getRemediationLevel() {
        return remediationLevel;
    }

    public void setRemediationLevel(Cvss3TemporalMetricsRemediationLevelType remediationLevel) {
        this.remediationLevel = remediationLevel;
    }

    public Cvss2TemporalMetricsReportConfidenceType getReportConfidence() {
        return reportConfidence;
    }

    public void setReportConfidence(Cvss2TemporalMetricsReportConfidenceType reportConfidence) {
        this.reportConfidence = reportConfidence;
    }

    public java.math.BigDecimal getScore() {
        return score;
    }

    public void setScore(java.math.BigDecimal score) {
        this.score = score;
    }

}
