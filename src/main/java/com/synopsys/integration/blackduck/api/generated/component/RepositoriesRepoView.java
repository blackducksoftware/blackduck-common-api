/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class RepositoriesRepoView extends BlackDuckComponent {
    private String branch;
    private String commitHash;
    private String lastScheduledTimestamp;
    private Boolean lwBom;
    private String name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
