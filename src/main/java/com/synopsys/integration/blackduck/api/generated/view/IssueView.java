package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class IssueView extends BlackDuckView {
    private String issueId;
    private String issueLink;
    private String issueStatus;
    private String issueDescription;
    private String issueAssignee;
    private java.util.Date issueUpdatedAt;
    private java.util.Date issueCreatedAt;

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

    public String getIssueDescription() {
	    return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
	    this.issueDescription = issueDescription;
    }

    public String getIssueAssignee() {
	    return issueAssignee;
    }

    public void setIssueAssignee(String issueAssignee) {
	    this.issueAssignee = issueAssignee;
    }

    public java.util.Date getIssueUpdatedAt() {
	    return issueUpdatedAt;
    }

    public void setIssueUpdatedAt(java.util.Date issueUpdatedAt) {
	    this.issueUpdatedAt = issueUpdatedAt;
    }

    public java.util.Date getIssueCreatedAt() {
	    return issueCreatedAt;
    }

    public void setIssueCreatedAt(java.util.Date issueCreatedAt) {
	    this.issueCreatedAt = issueCreatedAt;
    }

}
