/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class FileLicensesLicenseView extends BlackDuckComponent {
    private String archivePath;
    private String downloadSha1;
    private String licenseGroupName;
    private String licenseName;
    private java.util.List<FileLicensesLicenseItemsOffsetsView> offsets;
    private String path;

    public String getArchivePath() {
        return archivePath;
    }

    public void setArchivePath(String archivePath) {
        this.archivePath = archivePath;
    }

    public String getDownloadSha1() {
        return downloadSha1;
    }

    public void setDownloadSha1(String downloadSha1) {
        this.downloadSha1 = downloadSha1;
    }

    public String getLicenseGroupName() {
        return licenseGroupName;
    }

    public void setLicenseGroupName(String licenseGroupName) {
        this.licenseGroupName = licenseGroupName;
    }

    public String getLicenseName() {
        return licenseName;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    public java.util.List<FileLicensesLicenseItemsOffsetsView> getOffsets() {
        return offsets;
    }

    public void setOffsets(java.util.List<FileLicensesLicenseItemsOffsetsView> offsets) {
        this.offsets = offsets;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
