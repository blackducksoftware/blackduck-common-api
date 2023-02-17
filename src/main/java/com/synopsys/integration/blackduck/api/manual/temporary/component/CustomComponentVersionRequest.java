/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.manual.temporary.enumeration.ComponentVersionApprovalStatusType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CustomComponentVersionRequest extends BlackDuckComponent {
    private ComponentVersionApprovalStatusType approvalStatus;
    private ComplexLicenseRequest license;
    private String notes;
    private java.util.Date releasedOn;
    private String versionName;

    public ComponentVersionApprovalStatusType getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ComponentVersionApprovalStatusType approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public ComplexLicenseRequest getLicense() {
        return license;
    }

    public void setLicense(ComplexLicenseRequest license) {
        this.license = license;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public java.util.Date getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
        this.releasedOn = releasedOn;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

}
