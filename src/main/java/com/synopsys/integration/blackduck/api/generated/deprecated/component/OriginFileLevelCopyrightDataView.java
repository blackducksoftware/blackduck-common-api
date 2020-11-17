package com.synopsys.integration.blackduck.api.generated.deprecated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

@Deprecated
/**
* OriginFileLevelCopyrightDataView from the previous API is now called OriginFileCopyrightsView
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class OriginFileLevelCopyrightDataView extends BlackDuckComponent {
    private String matchData;
    private BigDecimal startByte;
    private BigDecimal endByte;
    private String path;
    private String downloadSha1;
    private String matchDataExtra;
    private String archivePath;

    public String getMatchData() {
	    return matchData;
    }

    public void setMatchData(String matchData) {
	    this.matchData = matchData;
    }

    public BigDecimal getStartByte() {
	    return startByte;
    }

    public void setStartByte(BigDecimal startByte) {
	    this.startByte = startByte;
    }

    public BigDecimal getEndByte() {
	    return endByte;
    }

    public void setEndByte(BigDecimal endByte) {
	    this.endByte = endByte;
    }

    public String getPath() {
	    return path;
    }

    public void setPath(String path) {
	    this.path = path;
    }

    public String getDownloadSha1() {
	    return downloadSha1;
    }

    public void setDownloadSha1(String downloadSha1) {
	    this.downloadSha1 = downloadSha1;
    }

    public String getMatchDataExtra() {
	    return matchDataExtra;
    }

    public void setMatchDataExtra(String matchDataExtra) {
	    this.matchDataExtra = matchDataExtra;
    }

    public String getArchivePath() {
	    return archivePath;
    }

    public void setArchivePath(String archivePath) {
	    this.archivePath = archivePath;
    }

}
