package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import java.util.Optional;
import com.synopsys.integration.blackduck.api.generated.component.CommentUserView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class CommentViewV5 extends BlackDuckView {
	public static final String mediaType = "application/vnd.blackducksoftware.bill-of-materials-5+json";

    private CommentUserView user;
    private String comment;
    private String updatedAt;
    private String createdAt;
    private String commentType;

    public CommentUserView getUser() {
	return user;
    }

    public void setUser(CommentUserView user) {
	this.user = user;
    }

    public String getComment() {
	return comment;
    }

    public void setComment(String comment) {
	this.comment = comment;
    }

    public String getUpdatedAt() {
	return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
	this.updatedAt = updatedAt;
    }

    public String getCreatedAt() {
	return createdAt;
    }

    public void setCreatedAt(String createdAt) {
	this.createdAt = createdAt;
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
