package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public enum ComponentVersionApprovalStatusType {
    APPROVED,
    CONDITIONALLY_APPROVED,
    DEPRECATED,
    REJECTED,
    UNREVIEWED;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
