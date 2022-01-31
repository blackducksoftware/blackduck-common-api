/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public enum MatchType {
    BINARY,
	DIRECT_DEPENDENCY_BINARY,
	FILE_DEPENDENCY,
	FILE_DEPENDENCY_DIRECT,
	FILE_DEPENDENCY_TRANSITIVE,
	FILE_EXACT,
	FILE_EXACT_FILE_MATCH,
	FILE_FILES_ADDED_DELETED_AND_MODIFIED,
	FILE_SOME_FILES_MODIFIED,
	MANUAL_BOM_COMPONENT,
	MANUAL_BOM_FILE,
	PARTIAL_FILE,
	SNIPPET,
	TRANSITIVE_DEPENDENCY_BINARY;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
