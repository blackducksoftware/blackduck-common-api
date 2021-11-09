package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

// ReportType is now called LicenseReportsReportReportType
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public enum ReportType {
    VERSION,
	VERSION_LICENSE,
	VERSION_VULNERABILITY_REMEDIATION,
	VERSION_VULNERABILITY_STATUS,
	VERSION_VULNERABILITY_UPDATE,
	VULNERABILITY_REMEDIATION,
	VULNERABILITY_STATUS,
	VULNERABILITY_UPDATE;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
