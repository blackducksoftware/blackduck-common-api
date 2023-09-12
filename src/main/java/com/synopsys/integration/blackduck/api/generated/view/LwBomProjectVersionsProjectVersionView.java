/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.LwBomProjectVersionsProjectVersionPolicyResultsView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LwBomProjectVersionsProjectVersionView extends BlackDuckView {
    private java.util.Date bomUpdatedAt;
    private java.util.Date createdAt;
    private String lwProjectId;
    private String name;
    private java.util.List<LwBomProjectVersionsProjectVersionPolicyResultsView> policyResults;
    private java.util.Date updatedAt;

    public java.util.Date getBomUpdatedAt() {
        return bomUpdatedAt;
    }

    public void setBomUpdatedAt(java.util.Date bomUpdatedAt) {
        this.bomUpdatedAt = bomUpdatedAt;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getLwProjectId() {
        return lwProjectId;
    }

    public void setLwProjectId(String lwProjectId) {
        this.lwProjectId = lwProjectId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<LwBomProjectVersionsProjectVersionPolicyResultsView> getPolicyResults() {
        return policyResults;
    }

    public void setPolicyResults(java.util.List<LwBomProjectVersionsProjectVersionPolicyResultsView> policyResults) {
        this.policyResults = policyResults;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
