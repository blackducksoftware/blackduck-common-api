/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.enumeration;

import com.synopsys.integration.util.EnumUtils;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public enum ProjectVersionMatchedFilesItemsMatchesMatchTypeFilterValueType {
    BINARY,
	BINARY_DIRECT_DEPENDENCY,
	BINARY_TRANSITIVE_DEPENDENCY,
	FILES_ADDED_DELETED,
	FILES_EXACT,
	FILES_MODIFIED,
	FILE_DEPENDENCY,
	FILE_DEPENDENCY_DIRECT,
	FILE_DEPENDENCY_TRANSITIVE,
	FILE_EXACT,
	MANUALLY_ADDED,
	MANUALLY_IDENTIFIED,
	MANUAL_BOM_PACKAGE,
	PARTIAL,
	SBOM,
	SNIPPET,
	UNMATCHED;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
