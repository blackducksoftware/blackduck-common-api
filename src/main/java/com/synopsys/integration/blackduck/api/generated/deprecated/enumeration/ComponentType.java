package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

// ComponentType is now called ComponentVersionType
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public enum ComponentType {
    COMPONENT,
	PROJECT;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
