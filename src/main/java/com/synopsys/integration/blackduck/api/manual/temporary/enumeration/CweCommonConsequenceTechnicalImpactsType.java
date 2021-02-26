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
public enum CweCommonConsequenceTechnicalImpactsType {
    ALTER_EXECUTION_LOGIC,
    BYPASS_PROTECTION,
    DOS_AMPLIFICATION,
    DOS_CRASH_EXIT_RESTART,
    DOS_INSTABILITY,
    DOS_RESOURCE_CONSUMPTION_CPU,
    DOS_RESOURCE_CONSUMPTION_MEM,
    DOS_RESOURCE_CONSUMPTION_OTHER,
    EXECUTE_UNAUTHORIZED_CODE,
    GAIN_PRIVILEGES,
    HIDE_ACTIVITIES,
    MODIFY_APPLICATION_DATA,
    MODIFY_FILES_OR_DIRECTORIES,
    MODIFY_MEMORY,
    OTHER,
    QUALITY_DEGREDATION,
    READ_APPLICATION_DATA,
    READ_FILES_OR_DIRECTORIES,
    READ_MEMORY,
    UNEXPECTED_STATE,
    VARIES_BY_CONTEXT;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
