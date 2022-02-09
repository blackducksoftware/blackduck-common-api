package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.ProjectVersionBomEventsItemsStatusType;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectVersionBomEventsView extends BlackDuckComponent {
    private String errorMessage;
    private String eventType;
    private String startTime;
    private ProjectVersionBomEventsItemsStatusType status;
    private java.util.Date submittedAt;
    private Object submittedBy;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ProjectVersionBomEventsItemsStatusType getStatus() {
        return status;
    }

    public void setStatus(ProjectVersionBomEventsItemsStatusType status) {
        this.status = status;
    }

    public java.util.Date getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(java.util.Date submittedAt) {
        this.submittedAt = submittedAt;
    }

    public Object getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(Object submittedBy) {
        this.submittedBy = submittedBy;
    }

}
