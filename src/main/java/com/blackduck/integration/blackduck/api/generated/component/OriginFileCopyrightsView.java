/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

import java.math.BigDecimal;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class OriginFileCopyrightsView extends BlackDuckComponent {
    private String archivePath;
    private String downloadSha1;
    private BigDecimal endByte;
    private String matchData;
    private String matchDataExtra;
    private String path;
    private BigDecimal startByte;

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

    public BigDecimal getEndByte() {
        return endByte;
    }

    public void setEndByte(BigDecimal endByte) {
        this.endByte = endByte;
    }

    public String getMatchData() {
        return matchData;
    }

    public void setMatchData(String matchData) {
        this.matchData = matchData;
    }

    public String getMatchDataExtra() {
        return matchDataExtra;
    }

    public void setMatchDataExtra(String matchDataExtra) {
        this.matchDataExtra = matchDataExtra;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public BigDecimal getStartByte() {
        return startByte;
    }

    public void setStartByte(BigDecimal startByte) {
        this.startByte = startByte;
    }

}
