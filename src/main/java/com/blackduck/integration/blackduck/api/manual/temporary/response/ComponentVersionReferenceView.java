/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.response;

import com.blackduck.integration.blackduck.api.manual.temporary.enumeration.ProjectVersionPhaseType;
import com.blackduck.integration.blackduck.api.core.BlackDuckResponse;
import com.blackduck.integration.blackduck.api.generated.enumeration.ProjectVersionDistributionType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionReferenceView extends BlackDuckResponse {
    private ProjectVersionDistributionType distribution;
    private ProjectVersionPhaseType phase;
    private String projectName;
    private Integer projectTier;
    private String projectUrl;
    private String projectVersionUrl;
    private java.util.Date releasedOn;
    private String versionName;

    public ProjectVersionDistributionType getDistribution() {
        return distribution;
    }

    public void setDistribution(ProjectVersionDistributionType distribution) {
        this.distribution = distribution;
    }

    public ProjectVersionPhaseType getPhase() {
        return phase;
    }

    public void setPhase(ProjectVersionPhaseType phase) {
        this.phase = phase;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Integer getProjectTier() {
        return projectTier;
    }

    public void setProjectTier(Integer projectTier) {
        this.projectTier = projectTier;
    }

    public String getProjectUrl() {
        return projectUrl;
    }

    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    public String getProjectVersionUrl() {
        return projectVersionUrl;
    }

    public void setProjectVersionUrl(String projectVersionUrl) {
        this.projectVersionUrl = projectVersionUrl;
    }

    public java.util.Date getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
        this.releasedOn = releasedOn;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

}
