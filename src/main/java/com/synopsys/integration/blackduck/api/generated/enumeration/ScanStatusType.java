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
public enum ScanStatusType {
    BOM_VERSION_CHECK,
	BUILDING_BOM,
	CANCELLED,
	CLONED,
	COMPLETE,
	ERROR,
	ERROR_BUILDING_BOM,
	ERROR_MATCHING,
	ERROR_SAVING_SCAN_DATA,
	ERROR_SCANNING,
	IDENTICAL_RESCAN,
	MATCHING,
	REQUESTED_MATCH_JOB,
	SAVING_SCAN_DATA,
	SCANNING,
	SCAN_DATA_SAVE_COMPLETE,
	SKIPPED,
	UNSTARTED;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
