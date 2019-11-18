package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.component.CommentUserView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CommentViewV6 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-6+json";

    private String updatedAt;
    private CommentUserView user;
    private String createdAt;
    private String comment;
    private String commentType;

    public String getUpdatedAt() {
	return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
	this.updatedAt = updatedAt;
    }

    public CommentUserView getUser() {
	return user;
    }

    public void setUser(CommentUserView user) {
	this.user = user;
    }

    public String getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(String createdAt) {
	this.createdAt = createdAt;
    }

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


    public String getMediaType() {
	return mediaType;
    }

}
