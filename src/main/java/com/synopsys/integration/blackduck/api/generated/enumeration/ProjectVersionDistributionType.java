package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

@Deprecated
/**
* ProjectVersionDistributionType is now called LicenseFamilyLicenseFamilyRiskRulesReleaseDistributionType
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public enum ProjectVersionDistributionType {
	EXTERNAL,
	SAAS,
	INTERNAL,
	OPENSOURCE;

	public String prettyPrint() {
	    return EnumUtils.prettyPrint(this);
	}

}
