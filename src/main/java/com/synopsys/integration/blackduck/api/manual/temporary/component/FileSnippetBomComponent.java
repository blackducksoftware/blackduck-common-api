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
import com.synopsys.integration.blackduck.api.generated.deprecated.enumeration.VersionBomComponentReviewStatusType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class FileSnippetBomComponent extends BlackDuckComponent {
    private Boolean adjusted;
    private String alternateSnippetMatchesUrl;
    private ChannelRelease channelRelease;
    private String hashId;
    private Boolean ignored;
    private LicenseDefinition license;
    private java.math.BigDecimal matchComponentRank;
    private Long matchComponentTotalReleases;
    private java.util.Date matchComponentVersionReleaseDate;
    private String matchContent;
    private Integer matchCoverage;
    private java.util.List<Integer> matchEndLine;
    private String matchFileArchiveContext;
    private String matchFileBasename;
    private String matchFileExtension;
    private String matchFilePath;
    private String matchFileSha1;
    private Long matchFileoccurences;
    private Long matchLicenseCodeSharingType;
    private java.math.BigDecimal matchScore;
    private java.util.List<Integer> matchStartLine;
    private String matchedFileContentUrl;
    private UserData overriddenBy;
    private String policyApprovalStatus;
    private ProjectData project;
    private ReleaseData release;
    private VersionBomComponentReviewStatusType reviewStatus;
    private java.util.List<Integer> sourceEndLines;
    private java.util.List<Integer> sourceStartLines;
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

    public String getAlternateSnippetMatchesUrl() {
        return alternateSnippetMatchesUrl;
    }

    public void setAlternateSnippetMatchesUrl(String alternateSnippetMatchesUrl) {
        this.alternateSnippetMatchesUrl = alternateSnippetMatchesUrl;
    }

    public ChannelRelease getChannelRelease() {
        return channelRelease;
    }

    public void setChannelRelease(ChannelRelease channelRelease) {
        this.channelRelease = channelRelease;
    }

    public String getHashId() {
        return hashId;
    }

    public void setHashId(String hashId) {
        this.hashId = hashId;
    }

    public Boolean getIgnored() {
        return ignored;
    }

    public void setIgnored(Boolean ignored) {
        this.ignored = ignored;
    }

    public LicenseDefinition getLicense() {
        return license;
    }

    public void setLicense(LicenseDefinition license) {
        this.license = license;
    }

    public java.math.BigDecimal getMatchComponentRank() {
        return matchComponentRank;
    }

    public void setMatchComponentRank(java.math.BigDecimal matchComponentRank) {
        this.matchComponentRank = matchComponentRank;
    }

    public Long getMatchComponentTotalReleases() {
        return matchComponentTotalReleases;
    }

    public void setMatchComponentTotalReleases(Long matchComponentTotalReleases) {
        this.matchComponentTotalReleases = matchComponentTotalReleases;
    }

    public java.util.Date getMatchComponentVersionReleaseDate() {
        return matchComponentVersionReleaseDate;
    }

    public void setMatchComponentVersionReleaseDate(java.util.Date matchComponentVersionReleaseDate) {
        this.matchComponentVersionReleaseDate = matchComponentVersionReleaseDate;
    }

    public String getMatchContent() {
        return matchContent;
    }

    public void setMatchContent(String matchContent) {
        this.matchContent = matchContent;
    }

    public Integer getMatchCoverage() {
        return matchCoverage;
    }

    public void setMatchCoverage(Integer matchCoverage) {
        this.matchCoverage = matchCoverage;
    }

    public java.util.List<Integer> getMatchEndLine() {
        return matchEndLine;
    }

    public void setMatchEndLine(java.util.List<Integer> matchEndLine) {
        this.matchEndLine = matchEndLine;
    }

    public String getMatchFileArchiveContext() {
        return matchFileArchiveContext;
    }

    public void setMatchFileArchiveContext(String matchFileArchiveContext) {
        this.matchFileArchiveContext = matchFileArchiveContext;
    }

    public String getMatchFileBasename() {
        return matchFileBasename;
    }

    public void setMatchFileBasename(String matchFileBasename) {
        this.matchFileBasename = matchFileBasename;
    }

    public String getMatchFileExtension() {
        return matchFileExtension;
    }

    public void setMatchFileExtension(String matchFileExtension) {
        this.matchFileExtension = matchFileExtension;
    }

    public String getMatchFilePath() {
        return matchFilePath;
    }

    public void setMatchFilePath(String matchFilePath) {
        this.matchFilePath = matchFilePath;
    }

    public String getMatchFileSha1() {
        return matchFileSha1;
    }

    public void setMatchFileSha1(String matchFileSha1) {
        this.matchFileSha1 = matchFileSha1;
    }

    public Long getMatchFileoccurences() {
        return matchFileoccurences;
    }

    public void setMatchFileoccurences(Long matchFileoccurences) {
        this.matchFileoccurences = matchFileoccurences;
    }

    public Long getMatchLicenseCodeSharingType() {
        return matchLicenseCodeSharingType;
    }

    public void setMatchLicenseCodeSharingType(Long matchLicenseCodeSharingType) {
        this.matchLicenseCodeSharingType = matchLicenseCodeSharingType;
    }

    public java.math.BigDecimal getMatchScore() {
        return matchScore;
    }

    public void setMatchScore(java.math.BigDecimal matchScore) {
        this.matchScore = matchScore;
    }

    public java.util.List<Integer> getMatchStartLine() {
        return matchStartLine;
    }

    public void setMatchStartLine(java.util.List<Integer> matchStartLine) {
        this.matchStartLine = matchStartLine;
    }

    public String getMatchedFileContentUrl() {
        return matchedFileContentUrl;
    }

    public void setMatchedFileContentUrl(String matchedFileContentUrl) {
        this.matchedFileContentUrl = matchedFileContentUrl;
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

    public VersionBomComponentReviewStatusType getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(VersionBomComponentReviewStatusType reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public java.util.List<Integer> getSourceEndLines() {
        return sourceEndLines;
    }

    public void setSourceEndLines(java.util.List<Integer> sourceEndLines) {
        this.sourceEndLines = sourceEndLines;
    }

    public java.util.List<Integer> getSourceStartLines() {
        return sourceStartLines;
    }

    public void setSourceStartLines(java.util.List<Integer> sourceStartLines) {
        this.sourceStartLines = sourceStartLines;
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
