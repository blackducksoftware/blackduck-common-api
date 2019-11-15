/**
 * blackduck-common-api
 *
 * Copyright (c) 2019 Synopsys, Inc.
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
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentReviewedDetailsReviewingUserView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionComponentReviewedDetailsView extends BlackDuckComponent {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-6+json";

    private ProjectVersionComponentReviewedDetailsReviewingUserView reviewingUser;
    private String reviewedAt;
    private String reviewedBy;

    public ProjectVersionComponentReviewedDetailsReviewingUserView getReviewingUser() {
	return reviewingUser;
    }

    public void setReviewingUser(ProjectVersionComponentReviewedDetailsReviewingUserView reviewingUser) {
	this.reviewingUser = reviewingUser;
    }

    public String getReviewedAt() {
	return reviewedAt;
    }

    public void setReviewedAt(String reviewedAt) {
	this.reviewedAt = reviewedAt;
    }

    public String getReviewedBy() {
	return reviewedBy;
    }

    public void setReviewedBy(String reviewedBy) {
	this.reviewedBy = reviewedBy;
    }


    public String getMediaType() {
	return mediaType;
    }

}
