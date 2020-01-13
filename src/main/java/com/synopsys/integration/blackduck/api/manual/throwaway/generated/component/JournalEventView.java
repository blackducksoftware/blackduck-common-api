/**
 * blackduck-common-api
 *
 * Copyright (c) 2020 Synopsys, Inc.
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.synopsys.integration.blackduck.api.manual.throwaway.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.JournalObjectView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.JournalTriggerView;

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
