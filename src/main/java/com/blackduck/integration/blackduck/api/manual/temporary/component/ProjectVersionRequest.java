/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.enumeration.ProjectVersionDistributionType;
import com.blackduck.integration.blackduck.api.manual.temporary.enumeration.ProjectVersionPhaseType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionRequest extends BlackDuckComponent {
    private String cloneFromReleaseUrl;
    private ProjectVersionDistributionType distribution;
    private ComplexLicenseRequest license;
    private String nickname;
    private ProjectVersionPhaseType phase;
    private String releaseComments;
    private java.util.Date releasedOn;
    private String versionName;

    public String getCloneFromReleaseUrl() {
        return cloneFromReleaseUrl;
    }

    public void setCloneFromReleaseUrl(String cloneFromReleaseUrl) {
        this.cloneFromReleaseUrl = cloneFromReleaseUrl;
    }

    public ProjectVersionDistributionType getDistribution() {
        return distribution;
    }

    public void setDistribution(ProjectVersionDistributionType distribution) {
        this.distribution = distribution;
    }

    public ComplexLicenseRequest getLicense() {
        return license;
    }

    public void setLicense(ComplexLicenseRequest license) {
        this.license = license;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public ProjectVersionPhaseType getPhase() {
        return phase;
    }

    public void setPhase(ProjectVersionPhaseType phase) {
        this.phase = phase;
    }

    public String getReleaseComments() {
        return releaseComments;
    }

    public void setReleaseComments(String releaseComments) {
        this.releaseComments = releaseComments;
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
