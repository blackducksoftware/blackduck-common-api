/**
 * blackduck-common-api
 *
 * Copyright (c) 2020 Synopsys, Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectCloneCategoriesType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectRequest extends BlackDuckComponent {
    private java.util.List<ProjectCloneCategoriesType> cloneCategories;
    private Boolean customSignatureEnabled;
    private String description;
    private String name;
    private Boolean projectLevelAdjustments;
    private String projectOwner;
    private Integer projectTier;
    private ProjectVersionRequest versionRequest;

    public java.util.List<ProjectCloneCategoriesType> getCloneCategories() {
        return cloneCategories;
    }

    public void setCloneCategories(java.util.List<ProjectCloneCategoriesType> cloneCategories) {
        this.cloneCategories = cloneCategories;
    }

    public Boolean getCustomSignatureEnabled() {
        return customSignatureEnabled;
    }

    public void setCustomSignatureEnabled(Boolean customSignatureEnabled) {
        this.customSignatureEnabled = customSignatureEnabled;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getProjectLevelAdjustments() {
        return projectLevelAdjustments;
    }

    public void setProjectLevelAdjustments(Boolean projectLevelAdjustments) {
        this.projectLevelAdjustments = projectLevelAdjustments;
    }

    public String getProjectOwner() {
        return projectOwner;
    }

    public void setProjectOwner(String projectOwner) {
        this.projectOwner = projectOwner;
    }

    public Integer getProjectTier() {
        return projectTier;
    }

    public void setProjectTier(Integer projectTier) {
        this.projectTier = projectTier;
    }

    public ProjectVersionRequest getVersionRequest() {
        return versionRequest;
    }

    public void setVersionRequest(ProjectVersionRequest versionRequest) {
        this.versionRequest = versionRequest;
    }

}
