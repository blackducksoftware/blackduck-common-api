package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.OriginFileLicensesFuzzyItemsOffsetsView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class OriginFileLicensesFuzzyView extends BlackDuckComponent {
    private String path;
    private java.util.List<OriginFileLicensesFuzzyItemsOffsetsView> offsets;
    private String licenseGroupName;
    private String downloadSha1;
    private String archivePath;

    public String getPath() {
	    return path;
    }

    public void setPath(String path) {
	    this.path = path;
    }

    public java.util.List<OriginFileLicensesFuzzyItemsOffsetsView> getOffsets() {
	    return offsets;
    }

    public void setOffsets(java.util.List<OriginFileLicensesFuzzyItemsOffsetsView> offsets) {
	    this.offsets = offsets;
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
