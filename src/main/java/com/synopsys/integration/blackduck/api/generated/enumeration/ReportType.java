package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public enum ReportType {
    VERSION,
    VERSION_LICENSE,
    VULNERABILITY_REMEDIATION,
    VULNERABILITY_STATUS,
    VULNERABILITY_UPDATE;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
