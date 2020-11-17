package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.FileLicensesLicenseItemsOffsetsView;

@Deprecated
/**
* OriginLicenseFileLevelDataView from the previous API is now called FileLicensesLicenseView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class OriginLicenseFileLevelDataView extends BlackDuckComponent {
    private String path;
    private java.util.List<FileLicensesLicenseItemsOffsetsView> offsets;
    private String licenseName;
    private String licenseGroupName;
    private String downloadSha1;
    private String archivePath;

    public String getPath() {
	    return path;
    }

    public void setPath(String path) {
	    this.path = path;
    }

    public java.util.List<FileLicensesLicenseItemsOffsetsView> getOffsets() {
	    return offsets;
    }

    public void setOffsets(java.util.List<FileLicensesLicenseItemsOffsetsView> offsets) {
	    this.offsets = offsets;
    }

    public String getLicenseName() {
	    return licenseName;
    }

    public void setLicenseName(String licenseName) {
	    this.licenseName = licenseName;
    }

    public String getLicenseGroupName() {
	    return licenseGroupName;
    }

    public void setLicenseGroupName(String licenseGroupName) {
	    this.licenseGroupName = licenseGroupName;
    }

    public String getDownloadSha1() {
	    return downloadSha1;
    }

    public void setDownloadSha1(String downloadSha1) {
	    this.downloadSha1 = downloadSha1;
    }

    public String getArchivePath() {
	    return archivePath;
    }

    public void setArchivePath(String archivePath) {
	    this.archivePath = archivePath;
    }

}
