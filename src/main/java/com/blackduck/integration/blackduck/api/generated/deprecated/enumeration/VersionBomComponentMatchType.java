/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.deprecated.enumeration;

import com.blackduck.integration.util.EnumUtils;

// VersionBomComponentMatchType is now called MatchType
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public enum VersionBomComponentMatchType {
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
	MANUAL_BOM_PACKAGE,
	PARTIAL_FILE,
	SBOM,
	SNIPPET,
	TRANSITIVE_DEPENDENCY_BINARY;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
