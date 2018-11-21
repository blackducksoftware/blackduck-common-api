package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.enumeration.PolicySummaryStatusType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class PolicyStatusSummary extends BlackDuckComponent {
    private String comment;
    private String id;
    private String name;
    private String overriddenBy;
    private PolicySummaryStatusType status;
    private String updatedBy;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOverriddenBy() {
        return overriddenBy;
    }

    public void setOverriddenBy(String overriddenBy) {
        this.overriddenBy = overriddenBy;
    }

    public PolicySummaryStatusType getStatus() {
        return status;
    }

    public void setStatus(PolicySummaryStatusType status) {
        this.status = status;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

}
