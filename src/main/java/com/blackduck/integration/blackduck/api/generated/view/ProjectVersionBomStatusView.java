/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.view;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;
import com.blackduck.integration.blackduck.api.generated.enumeration.ProjectVersionBomStatusType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionBomStatusView extends BlackDuckView {
    private java.util.Date lastBomUpdateDate;
    private java.util.Date lastScanDate;
    private ProjectVersionBomStatusType status;

    public java.util.Date getLastBomUpdateDate() {
        return lastBomUpdateDate;
    }

    public void setLastBomUpdateDate(java.util.Date lastBomUpdateDate) {
        this.lastBomUpdateDate = lastBomUpdateDate;
    }

    public java.util.Date getLastScanDate() {
        return lastScanDate;
    }

    public void setLastScanDate(java.util.Date lastScanDate) {
        this.lastScanDate = lastScanDate;
    }

    public ProjectVersionBomStatusType getStatus() {
        return status;
    }

    public void setStatus(ProjectVersionBomStatusType status) {
        this.status = status;
    }

}
