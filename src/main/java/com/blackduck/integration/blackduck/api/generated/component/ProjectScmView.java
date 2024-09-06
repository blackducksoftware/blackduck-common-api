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
public class ProjectScmView extends BlackDuckComponent {
    private String repository;
    private String repositoryGroupId;
    private String repositoryName;
    private String scmName;
    private String scmType;
    private String scmUrl;

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public String getRepositoryGroupId() {
        return repositoryGroupId;
    }

    public void setRepositoryGroupId(String repositoryGroupId) {
        this.repositoryGroupId = repositoryGroupId;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public String getScmName() {
        return scmName;
    }

    public void setScmName(String scmName) {
        this.scmName = scmName;
    }

    public String getScmType() {
        return scmType;
    }

    public void setScmType(String scmType) {
        this.scmType = scmType;
    }

    public String getScmUrl() {
        return scmUrl;
    }

    public void setScmUrl(String scmUrl) {
        this.scmUrl = scmUrl;
    }

}
