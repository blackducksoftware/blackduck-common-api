/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionBomStatusView extends BlackDuckComponent {
    private String errorMessage;
    private java.util.List<AuditEventCount> eventCounts;
    private Boolean upToDate;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public java.util.List<AuditEventCount> getEventCounts() {
        return eventCounts;
    }

    public void setEventCounts(java.util.List<AuditEventCount> eventCounts) {
        this.eventCounts = eventCounts;
    }

    public Boolean getUpToDate() {
        return upToDate;
    }

    public void setUpToDate(Boolean upToDate) {
        this.upToDate = upToDate;
    }

}
