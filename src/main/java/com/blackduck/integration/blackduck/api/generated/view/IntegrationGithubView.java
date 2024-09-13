/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.view;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;
import com.blackduck.integration.blackduck.api.generated.enumeration.GithubConfigRepositoryType;

import java.math.BigDecimal;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class IntegrationGithubView extends BlackDuckView {
    private Boolean enabled;
    private String name;
    private GithubConfigRepositoryType repositoryType;
    private BigDecimal storageLimit;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GithubConfigRepositoryType getRepositoryType() {
        return repositoryType;
    }

    public void setRepositoryType(GithubConfigRepositoryType repositoryType) {
        this.repositoryType = repositoryType;
    }

    public BigDecimal getStorageLimit() {
        return storageLimit;
    }

    public void setStorageLimit(BigDecimal storageLimit) {
        this.storageLimit = storageLimit;
    }

}
