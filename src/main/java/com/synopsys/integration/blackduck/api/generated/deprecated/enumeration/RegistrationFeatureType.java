/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

// RegistrationFeatureType is now called RegistrationFeaturesFeatureType
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public enum RegistrationFeatureType {
    ARTIFACTORY_INTEGRATION,
	BDSA,
	BINARY_ANALYSIS,
	CONNECT_AND_SHARE,
	CONTAINER_ANALYSIS,
	CRYPTO_ALGORITHMS,
	CUSTOM_SIGNATURES,
	DEEP_VULNERABILITY_INTELLIGENCE,
	DEPENDENCY_SCANNING,
	ENHANCED_VULNERABILITY_ANALYSIS,
	ISCAN,
	MATCH_AS_A_SERVICE,
	NOTIFICATIONS,
	OPSSIGHT,
	OSS_ATTRIBUTION,
	OSS_NOTICES_REPORTS,
	POLICY_MANAGEMENT,
	PROJECT_MANAGEMENT,
	REST_API,
	RISK_MANAGEMENT,
	SIGNATURE_SCANNING,
	SNIPPET;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
