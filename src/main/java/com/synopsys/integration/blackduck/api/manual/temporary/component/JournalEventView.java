/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.deprecated.component.JournalObjectView;
import com.synopsys.integration.blackduck.api.generated.deprecated.component.JournalTriggerView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class JournalEventView extends BlackDuckComponent {
    private String action;
    private Object currentData;
    private String eventId;
    private JournalObjectView objectData;
    private Object originalData;
    private java.util.Date timestamp;
    private JournalTriggerView triggerData;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Object getCurrentData() {
        return currentData;
    }

    public void setCurrentData(Object currentData) {
        this.currentData = currentData;
    }

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public JournalObjectView getObjectData() {
        return objectData;
    }

    public void setObjectData(JournalObjectView objectData) {
        this.objectData = objectData;
    }

    public Object getOriginalData() {
        return originalData;
    }

    public void setOriginalData(Object originalData) {
        this.originalData = originalData;
    }

    public java.util.Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    public JournalTriggerView getTriggerData() {
        return triggerData;
    }

    public void setTriggerData(JournalTriggerView triggerData) {
        this.triggerData = triggerData;
    }

}
