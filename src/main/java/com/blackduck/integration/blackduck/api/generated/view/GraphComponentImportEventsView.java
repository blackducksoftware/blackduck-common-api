/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.view;

import com.blackduck.integration.blackduck.api.core.BlackDuckView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class GraphComponentImportEventsView extends BlackDuckView {
    private String componentName;
    private String componentVersionName;
    private String event;
    private String externalId;
    private String failureReason;
    private String importComponentName;
    private String importComponentVersionName;
    private String protexLicenseName;

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getComponentVersionName() {
        return componentVersionName;
    }

    public void setComponentVersionName(String componentVersionName) {
        this.componentVersionName = componentVersionName;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getFailureReason() {
        return failureReason;
    }

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    public String getImportComponentName() {
        return importComponentName;
    }

    public void setImportComponentName(String importComponentName) {
        this.importComponentName = importComponentName;
    }

    public String getImportComponentVersionName() {
        return importComponentVersionName;
    }

    public void setImportComponentVersionName(String importComponentVersionName) {
        this.importComponentVersionName = importComponentVersionName;
    }

    public String getProtexLicenseName() {
        return protexLicenseName;
    }

    public void setProtexLicenseName(String protexLicenseName) {
        this.protexLicenseName = protexLicenseName;
    }

}
