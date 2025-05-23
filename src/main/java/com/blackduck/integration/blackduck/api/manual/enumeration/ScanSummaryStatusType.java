/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.enumeration;

public enum ScanSummaryStatusType {
    UNSTARTED,
    SCANNING,
    SAVING_SCAN_DATA,
    SCAN_DATA_SAVE_COMPLETE,
    REQUESTED_MATCH_JOB,
    MATCHING,
    BOM_VERSION_CHECK,
    BUILDING_BOM,
    COMPLETE,
    CANCELLED,
    CLONED,
    ERROR_SCANNING,
    ERROR_SAVING_SCAN_DATA,
    ERROR_MATCHING,
    ERROR_BUILDING_BOM,
    ERROR

}
