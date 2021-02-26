/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.enumeration;

import com.synopsys.integration.util.EnumUtils;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public enum RegistrationStateType {
    Expired,
    Incomplete_install,
    Invalid,
    Network_failure,
    Not_set,
    Valid;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
