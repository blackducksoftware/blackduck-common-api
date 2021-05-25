package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

// VersionBomComponentMatchType is now called MatchType
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public enum VersionBomComponentMatchType {
    BINARY,
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
	SNIPPET;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
