/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LiteVersionMappingLwProjectVersionView extends BlackDuckComponent {
    private String branch;
    private String commitHash;
    private String lastScanStatus;
    private String lastScheduledTimestamp;
    private Boolean lwBom;
    private String lwProjectVersion;
    private String name;
    private String orgName;
    private String scmServerId;
    private String userId;

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCommitHash() {
        return commitHash;
    }

    public void setCommitHash(String commitHash) {
        this.commitHash = commitHash;
    }

    public String getLastScanStatus() {
        return lastScanStatus;
    }

    public void setLastScanStatus(String lastScanStatus) {
        this.lastScanStatus = lastScanStatus;
    }

    public String getLastScheduledTimestamp() {
        return lastScheduledTimestamp;
    }

    public void setLastScheduledTimestamp(String lastScheduledTimestamp) {
        this.lastScheduledTimestamp = lastScheduledTimestamp;
    }

    public Boolean getLwBom() {
        return lwBom;
    }

    public void setLwBom(Boolean lwBom) {
        this.lwBom = lwBom;
    }

    public String getLwProjectVersion() {
        return lwProjectVersion;
    }

    public void setLwProjectVersion(String lwProjectVersion) {
        this.lwProjectVersion = lwProjectVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getScmServerId() {
        return scmServerId;
    }

    public void setScmServerId(String scmServerId) {
        this.scmServerId = scmServerId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
