/*
 * blackduck-common-api
 *
 * Copyright (c) 2022 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import java.util.Date;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

public class IssueRequest extends BlackDuckComponent {
    private String issueAssignee;
    private Date issueCreatedAt;
    private String issueDescription;
    private String issueId;
    private String issueLink;
    private String issueStatus;
    private Date issueUpdatedAt;

    public String getIssueAssignee() {
        return issueAssignee;
    }

    public void setIssueAssignee(String issueAssignee) {
        this.issueAssignee = issueAssignee;
    }

    public Date getIssueCreatedAt() {
        return issueCreatedAt;
    }

    public void setIssueCreatedAt(Date issueCreatedAt) {
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

    public Date getIssueUpdatedAt() {
        return issueUpdatedAt;
    }

    public void setIssueUpdatedAt(Date issueUpdatedAt) {
        this.issueUpdatedAt = issueUpdatedAt;
    }

}
