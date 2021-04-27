/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
/*
* blackduck-common-api
*
* Copyright (c) 2021 Synopsys, Inc.
*
* Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
*/
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.response.LinkBlackDuckResponse;
import com.synopsys.integration.blackduck.api.generated.component.ProjectVersionComponentVersionsComponentVersionCommentUserView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionComponentVersionsComponentVersionCommentView extends BlackDuckComponent {
    private String comment;
    private String commentType;
    private java.util.Date createdAt;
    private java.util.Date updatedAt;
    private ProjectVersionComponentVersionsComponentVersionCommentUserView user;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCommentType() {
        return commentType;
    }

    public void setCommentType(String commentType) {
        this.commentType = commentType;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ProjectVersionComponentVersionsComponentVersionCommentUserView getUser() {
        return user;
    }

    public void setUser(ProjectVersionComponentVersionsComponentVersionCommentUserView user) {
        this.user = user;
    }

}
