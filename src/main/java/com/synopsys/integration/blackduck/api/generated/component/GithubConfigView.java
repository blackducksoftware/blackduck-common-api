/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import java.math.BigDecimal;
import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.GithubConfigRepositoryType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class GithubConfigView extends BlackDuckComponent {
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
