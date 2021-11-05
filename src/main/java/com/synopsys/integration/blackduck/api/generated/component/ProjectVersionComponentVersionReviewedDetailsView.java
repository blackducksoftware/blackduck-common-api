/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentVersionReviewedDetailsReviewingUserView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionComponentVersionReviewedDetailsView extends BlackDuckComponent {
    private java.util.Date reviewedAt;
    private String reviewedBy;
    private ProjectVersionComponentVersionReviewedDetailsReviewingUserView reviewingUser;

    public java.util.Date getReviewedAt() {
        return reviewedAt;
    }

    public void setReviewedAt(java.util.Date reviewedAt) {
        this.reviewedAt = reviewedAt;
    }

    public String getReviewedBy() {
        return reviewedBy;
    }

    public void setReviewedBy(String reviewedBy) {
        this.reviewedBy = reviewedBy;
    }

    public ProjectVersionComponentVersionReviewedDetailsReviewingUserView getReviewingUser() {
        return reviewingUser;
    }

    public void setReviewingUser(ProjectVersionComponentVersionReviewedDetailsReviewingUserView reviewingUser) {
        this.reviewingUser = reviewingUser;
    }

}
