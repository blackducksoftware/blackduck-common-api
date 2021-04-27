/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
/*
* blackduck-common-api
*
* Copyright (c) 2021 Synopsys, Inc.
*
* Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
*/
package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public enum RegistrationFeaturesFeatureType {
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
