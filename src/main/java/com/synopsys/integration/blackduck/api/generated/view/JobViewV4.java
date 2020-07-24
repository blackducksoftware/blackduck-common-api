package com.synopsys.integration.blackduck.api.generated.view;

import java.util.Optional;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.JobStatusType;

/**
* this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
* **/
public class JobViewV4 extends BlackDuckView {
    private java.util.Date scheduledAt;
    private JobStatusType status;
    private String progressData;
    private String type;
    private java.util.Date startedAt;
    private String errorText;
    private java.util.Date updatedAt;
    private java.util.Date finishedAt;

    public java.util.Date getScheduledAt() {
	    return scheduledAt;
    }

    public void setScheduledAt(java.util.Date scheduledAt) {
	    this.scheduledAt = scheduledAt;
    }

    public JobStatusType getStatus() {
	    return status;
    }

    public void setStatus(JobStatusType status) {
	    this.status = status;
    }

    public String getProgressData() {
	    return progressData;
    }

    public void setProgressData(String progressData) {
	    this.progressData = progressData;
    }

    public String getType() {
	    return type;
    }

    public void setType(String type) {
	    this.type = type;
    }

    public java.util.Date getStartedAt() {
	    return startedAt;
    }

    public void setStartedAt(java.util.Date startedAt) {
	    this.startedAt = startedAt;
    }

    public String getErrorText() {
	    return errorText;
    }

    public void setErrorText(String errorText) {
	    this.errorText = errorText;
    }

    public java.util.Date getUpdatedAt() {
	    return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
	    this.updatedAt = updatedAt;
    }

    public java.util.Date getFinishedAt() {
	    return finishedAt;
    }

    public void setFinishedAt(java.util.Date finishedAt) {
	    this.finishedAt = finishedAt;
    }

}
