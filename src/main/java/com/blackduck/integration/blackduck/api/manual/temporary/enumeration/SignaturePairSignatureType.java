/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.enumeration;

import com.blackduck.integration.util.EnumUtils;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public enum SignaturePairSignatureType {
    DEEP_NO_SIZE,
    DEEP_WITH_SIZE,
    MATCH_CLEAN_SHA1,
    MATCH_SHA1,
    SHALLOW_NO_SIZE,
    SHALLOW_WITH_SIZE,
    STRUCTURE_ONLY;

    public String prettyPrint() {
        return EnumUtils.prettyPrint(this);
    }

}
