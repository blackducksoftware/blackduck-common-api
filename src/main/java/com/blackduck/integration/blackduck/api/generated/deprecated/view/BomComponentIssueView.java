/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.deprecated.view;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;

// BomComponentIssueView from the previous API is now called ProjectVersionIssuesView
// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
@Deprecated
public class BomComponentIssueView extends BlackDuckView {
    private String issueAssignee;
    private java.util.Date issueCreatedAt;
    private String issueDescription;
    private String issueId;
    private String issueLink;
    private String issueStatus;
    private java.util.Date issueUpdatedAt;
    private String projectName;
    private String releaseVersion;

    public String getIssueAssignee() {
        return issueAssignee;
    }

    public void setIssueAssignee(String issueAssignee) {
        this.issueAssignee = issueAssignee;
    }

    public java.util.Date getIssueCreatedAt() {
        return issueCreatedAt;
    }

    public void setIssueCreatedAt(java.util.Date issueCreatedAt) {
        this.issueCreatedAt = issueCreatedAt;
    }

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getIssueLink() {
        return issueLink;
    }

    public void setIssueLink(String issueLink) {
        this.issueLink = issueLink;
    }

    public String getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(String issueStatus) {
        this.issueStatus = issueStatus;
    }

    public java.util.Date getIssueUpdatedAt() {
        return issueUpdatedAt;
    }

    public void setIssueUpdatedAt(java.util.Date issueUpdatedAt) {
        this.issueUpdatedAt = issueUpdatedAt;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getReleaseVersion() {
        return releaseVersion;
    }

    public void setReleaseVersion(String releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

}
