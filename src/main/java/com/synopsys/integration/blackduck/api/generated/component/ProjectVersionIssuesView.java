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
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class ProjectVersionIssuesView extends BlackDuckComponent {
    private String issueId;
    private String issueLink;
    private String issueStatus;
    private String issueDescription;
    private String issueAssignee;
    private String projectName;
    private String releaseVersion;
    private java.util.Date issueCreatedAt;
    private java.util.Date issueUpdatedAt;

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

    public java.util.Date getIssueCreatedAt() {
	    return issueCreatedAt;
    }

    public void setIssueCreatedAt(java.util.Date issueCreatedAt) {
	    this.issueCreatedAt = issueCreatedAt;
    }

    public java.util.Date getIssueUpdatedAt() {
	    return issueUpdatedAt;
    }

    public void setIssueUpdatedAt(java.util.Date issueUpdatedAt) {
	    this.issueUpdatedAt = issueUpdatedAt;
    }

}
