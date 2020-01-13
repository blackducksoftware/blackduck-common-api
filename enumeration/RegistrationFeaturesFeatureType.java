package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum RegistrationFeaturesFeatureType {
	CONNECT_AND_SHARE,
	DEEP_VULNERABILITY_INTELLIGENCE,
	ISCAN,
	NOTIFICATIONS,
	OSS_ATTRIBUTION,
	POLICY_MANAGEMENT,
	PROJECT_MANAGEMENT,
	REST_API,
	RISK_MANAGEMENT,
	OSS_NOTICES_REPORTS,
	THREAT_CHECKER,
	OPSSIGHT,
	BDSA,
	SNIPPET,
	CRYPTO_ALGORITHMS,
	BINARY_ANALYSIS,
	CUSTOM_SIGNATURES;

	private String mediaType = "application/vnd.blackducksoftware.status-4+json";

	public String getMediaType() {
	return mediaType;
	}

	public String prettyPrint() {
	return EnumUtils.prettyPrint(this);
	}

} 