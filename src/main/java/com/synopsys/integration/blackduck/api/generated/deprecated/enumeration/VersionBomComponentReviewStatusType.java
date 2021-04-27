/*
* blackduck-common-api
*
* Copyright (c) 2021 Synopsys, Inc.
*
* Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
*/
package com.synopsys.integration.blackduck.api.generated.deprecated.enumeration;

import com.synopsys.integration.util.EnumUtils;

// VersionBomComponentReviewStatusType is now called ProjectVersionComponentReviewStatusType
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public enum VersionBomComponentReviewStatusType {
    NOT_REVIEWED,
	REVIEWED;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
