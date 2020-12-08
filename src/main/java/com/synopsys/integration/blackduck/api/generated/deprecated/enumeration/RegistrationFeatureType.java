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
package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

// RegistrationFeatureType is now called RegistrationFeaturesFeatureType
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public enum RegistrationFeatureType {
    BDSA,
	BINARY_ANALYSIS,
	CONNECT_AND_SHARE,
	CRYPTO_ALGORITHMS,
	CUSTOM_SIGNATURES,
	DEEP_VULNERABILITY_INTELLIGENCE,
	ISCAN,
	NOTIFICATIONS,
	OPSSIGHT,
	OSS_ATTRIBUTION,
	OSS_NOTICES_REPORTS,
	POLICY_MANAGEMENT,
	PROJECT_MANAGEMENT,
	REST_API,
	RISK_MANAGEMENT,
	SNIPPET,
	THREAT_CHECKER;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
