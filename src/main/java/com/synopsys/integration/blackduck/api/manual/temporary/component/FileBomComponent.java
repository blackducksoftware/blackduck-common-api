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
import com.synopsys.integration.blackduck.api.generated.deprecated.enumeration.MatchedFileUsagesType;
import com.synopsys.integration.blackduck.api.generated.deprecated.enumeration.VersionBomComponentMatchType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class FileBomComponent extends BlackDuckComponent {
    private Boolean adjusted;
    private ChannelRelease channelRelease;
    private LicenseDefinition license;
    private String matchContent;
    private UserData overriddenBy;
    private String policyApprovalStatus;
    private ProjectData project;
    private ReleaseData release;
    private MatchedFileUsagesType usage;
    private Long versionBomComponentId;
    private Long versionBomEntryId;
    private Long versionBomFileId;
    private VersionBomComponentMatchType versionBomMatchType;

    public Boolean getAdjusted() {
        return adjusted;
    }

    public void setAdjusted(Boolean adjusted) {
        this.adjusted = adjusted;
    }

    public ChannelRelease getChannelRelease() {
        return channelRelease;
    }

    public void setChannelRelease(ChannelRelease channelRelease) {
        this.channelRelease = channelRelease;
    }

    public LicenseDefinition getLicense() {
        return license;
    }

    public void setLicense(LicenseDefinition license) {
        this.license = license;
    }

    public String getMatchContent() {
        return matchContent;
    }

    public void setMatchContent(String matchContent) {
        this.matchContent = matchContent;
    }

    public UserData getOverriddenBy() {
        return overriddenBy;
    }

    public void setOverriddenBy(UserData overriddenBy) {
        this.overriddenBy = overriddenBy;
    }

    public String getPolicyApprovalStatus() {
        return policyApprovalStatus;
    }

    public void setPolicyApprovalStatus(String policyApprovalStatus) {
        this.policyApprovalStatus = policyApprovalStatus;
    }

    public ProjectData getProject() {
        return project;
    }

    public void setProject(ProjectData project) {
        this.project = project;
    }

    public ReleaseData getRelease() {
        return release;
    }

    public void setRelease(ReleaseData release) {
        this.release = release;
    }

    public MatchedFileUsagesType getUsage() {
        return usage;
    }

    public void setUsage(MatchedFileUsagesType usage) {
        this.usage = usage;
    }

    public Long getVersionBomComponentId() {
        return versionBomComponentId;
    }

    public void setVersionBomComponentId(Long versionBomComponentId) {
        this.versionBomComponentId = versionBomComponentId;
    }

    public Long getVersionBomEntryId() {
        return versionBomEntryId;
    }

    public void setVersionBomEntryId(Long versionBomEntryId) {
        this.versionBomEntryId = versionBomEntryId;
    }

    public Long getVersionBomFileId() {
        return versionBomFileId;
    }

    public void setVersionBomFileId(Long versionBomFileId) {
        this.versionBomFileId = versionBomFileId;
    }

    public VersionBomComponentMatchType getVersionBomMatchType() {
        return versionBomMatchType;
    }

    public void setVersionBomMatchType(VersionBomComponentMatchType versionBomMatchType) {
        this.versionBomMatchType = versionBomMatchType;
    }

}
