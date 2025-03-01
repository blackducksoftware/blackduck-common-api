/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.enumeration;

import com.blackduck.integration.util.EnumUtils;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public enum RegistrationFeaturesFeatureType {
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
	FULL_SNIPPET_SCANS,
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
	SCM_INTEGRATION,
	SIGNATURE_SCANNING,
	SNIPPET;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
