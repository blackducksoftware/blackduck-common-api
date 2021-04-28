/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkBlackDuckResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.JobStatusType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class JobView extends BlackDuckView {
    private String errorText;
    private java.util.Date finishedAt;
    private String progressData;
    private java.util.Date scheduledAt;
    private java.util.Date startedAt;
    private JobStatusType status;
    private String type;
    private java.util.Date updatedAt;

    public String getErrorText() {
        return errorText;
    }

    public void setErrorText(String errorText) {
        this.errorText = errorText;
    }

    public java.util.Date getFinishedAt() {
        return finishedAt;
    }

    public void setFinishedAt(java.util.Date finishedAt) {
        this.finishedAt = finishedAt;
    }

    public String getProgressData() {
        return progressData;
    }

    public void setProgressData(String progressData) {
        this.progressData = progressData;
    }

    public java.util.Date getScheduledAt() {
        return scheduledAt;
    }

    public void setScheduledAt(java.util.Date scheduledAt) {
        this.scheduledAt = scheduledAt;
    }

    public java.util.Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    public JobStatusType getStatus() {
        return status;
    }

    public void setStatus(JobStatusType status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
