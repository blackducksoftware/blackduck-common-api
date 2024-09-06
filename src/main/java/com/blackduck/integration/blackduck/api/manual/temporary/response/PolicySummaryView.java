/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.response;

import com.blackduck.integration.blackduck.api.core.BlackDuckResponse;
import com.blackduck.integration.blackduck.api.generated.enumeration.ProjectVersionComponentPolicyStatusType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PolicySummaryView extends BlackDuckResponse {
    private String description;
    private String id;
    private String name;
    private ProjectVersionComponentPolicyStatusType status;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectVersionComponentPolicyStatusType getStatus() {
        return status;
    }

    public void setStatus(ProjectVersionComponentPolicyStatusType status) {
        this.status = status;
    }

}
