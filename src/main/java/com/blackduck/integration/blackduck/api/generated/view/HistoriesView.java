/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.view;

import java.math.BigDecimal;

import com.blackduck.integration.blackduck.api.generated.component.HistoriesItemsPropertiesView;
import com.blackduck.integration.blackduck.api.core.BlackDuckView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class HistoriesView extends BlackDuckView {
    private String cronString;
    private String endTime;
    private String error;
    private String id;
    private String intervalUnit;
    private BigDecimal intervalValue;
    private String jobClass;
    private String jobDescription;
    private String jobGroup;
    private String jobId;
    private String jobName;
    private BigDecimal priority;
    private HistoriesItemsPropertiesView properties;
    private String randomizationType;
    private String randomizationUnit;
    private BigDecimal randomizationValue;
    private String scheduleType;
    private String schedulerName;
    private String startTime;
    private String status;
    private String triggerGroup;
    private String triggerId;
    private BigDecimal version;
    private String workflowStep;

    public String getCronString() {
        return cronString;
    }

    public void setCronString(String cronString) {
        this.cronString = cronString;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIntervalUnit() {
        return intervalUnit;
    }

    public void setIntervalUnit(String intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    public BigDecimal getIntervalValue() {
        return intervalValue;
    }

    public void setIntervalValue(BigDecimal intervalValue) {
        this.intervalValue = intervalValue;
    }

    public String getJobClass() {
        return jobClass;
    }

    public void setJobClass(String jobClass) {
        this.jobClass = jobClass;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public BigDecimal getPriority() {
        return priority;
    }

    public void setPriority(BigDecimal priority) {
        this.priority = priority;
    }

    public HistoriesItemsPropertiesView getProperties() {
        return properties;
    }

    public void setProperties(HistoriesItemsPropertiesView properties) {
        this.properties = properties;
    }

    public String getRandomizationType() {
        return randomizationType;
    }

    public void setRandomizationType(String randomizationType) {
        this.randomizationType = randomizationType;
    }

    public String getRandomizationUnit() {
        return randomizationUnit;
    }

    public void setRandomizationUnit(String randomizationUnit) {
        this.randomizationUnit = randomizationUnit;
    }

    public BigDecimal getRandomizationValue() {
        return randomizationValue;
    }

    public void setRandomizationValue(BigDecimal randomizationValue) {
        this.randomizationValue = randomizationValue;
    }

    public String getScheduleType() {
        return scheduleType;
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType = scheduleType;
    }

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }

    public String getTriggerId() {
        return triggerId;
    }

    public void setTriggerId(String triggerId) {
        this.triggerId = triggerId;
    }

    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    public String getWorkflowStep() {
        return workflowStep;
    }

    public void setWorkflowStep(String workflowStep) {
        this.workflowStep = workflowStep;
    }

}
