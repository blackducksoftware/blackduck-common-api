/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.response;

import com.blackduck.integration.blackduck.api.core.BlackDuckResponse;
import com.blackduck.integration.blackduck.api.generated.component.CweCommonConsequencesView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CweView extends BlackDuckResponse {
    private java.util.List<CweCommonConsequencesView> commonConsequences;
    private String description;
    private String extendedDescription;
    private String id;
    private String name;

    public java.util.List<CweCommonConsequencesView> getCommonConsequences() {
        return commonConsequences;
    }

    public void setCommonConsequences(java.util.List<CweCommonConsequencesView> commonConsequences) {
        this.commonConsequences = commonConsequences;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExtendedDescription() {
        return extendedDescription;
    }

    public void setExtendedDescription(String extendedDescription) {
        this.extendedDescription = extendedDescription;
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

}
