/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Black Duck Software, Inc.
 *
 * Use subject to the terms and conditions of the Black Duck Software End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.generated.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentMigrationsItemsView extends BlackDuckComponent {
    private String detected;
    private String from;
    private String migratedObjectType;
    private String migrationType;
    private String supplementalComponentId;
    private String to;

    public String getDetected() {
        return detected;
    }

    public void setDetected(String detected) {
        this.detected = detected;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getMigratedObjectType() {
        return migratedObjectType;
    }

    public void setMigratedObjectType(String migratedObjectType) {
        this.migratedObjectType = migratedObjectType;
    }

    public String getMigrationType() {
        return migrationType;
    }

    public void setMigrationType(String migrationType) {
        this.migrationType = migrationType;
    }

    public String getSupplementalComponentId() {
        return supplementalComponentId;
    }

    public void setSupplementalComponentId(String supplementalComponentId) {
        this.supplementalComponentId = supplementalComponentId;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

}
