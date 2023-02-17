/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionComponentIssueView extends BlackDuckComponent {
    private String issueAssignee;
    private java.util.Date issueCreatedAt;
    private String issueDescription;
    private String issueId;
    private String issueLink;
    private String issueStatus;
    private java.util.Date issueUpdatedAt;

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

}
