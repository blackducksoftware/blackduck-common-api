/*
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.manual.component;

import com.synopsys.integration.blackduck.api.manual.enumeration.ComponentUnknownVersionStatus;

public class ComponentUnknownVersionContent extends NotificationContentComponent {
    private String projectName;
    private String projectVersionName;
    private String projectVersion;
    private String componentName;
    private String bomComponent;
    private String component;
    private int criticalVulnerabilityCount;
    private int highVulnerabilityCount;
    private String highVulnerabilityVersion;
    private String highVulnerabilityVersionName;
    private int mediumVulnerabilityCount;
    private String mediumVulnerabilityVersion;
    private String mediumVulnerabilityVersionName;
    private int lowVulnerabilityCount;
    private String lowVulnerabilityVersion;
    private String lowVulnerabilityVersionName;
    private ComponentUnknownVersionStatus status;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(final String projectName) {
        this.projectName = projectName;
    }

    public String getProjectVersionName() {
        return projectVersionName;
    }

    public void setProjectVersionName(final String projectVersionName) {
        this.projectVersionName = projectVersionName;
    }

    public String getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(final String projectVersion) {
        this.projectVersion = projectVersion;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(final String componentName) {
        this.componentName = componentName;
    }

    public String getBomComponent() {
        return bomComponent;
    }

    public void setBomComponent(final String bomComponent) {
        this.bomComponent = bomComponent;
    }

    public String getComponent() {
        return component;
    }

    public void setComponent(final String component) {
        this.component = component;
    }

    public int getCriticalVulnerabilityCount() {
        return criticalVulnerabilityCount;
    }

    public void setCriticalVulnerabilityCount(final int criticalVulnerabilityCount) {
        this.criticalVulnerabilityCount = criticalVulnerabilityCount;
    }

    public int getHighVulnerabilityCount() {
        return highVulnerabilityCount;
    }

    public void setHighVulnerabilityCount(final int highVulnerabilityCount) {
        this.highVulnerabilityCount = highVulnerabilityCount;
    }

    public String getHighVulnerabilityVersion() {
        return highVulnerabilityVersion;
    }

    public void setHighVulnerabilityVersion(final String highVulnerabilityVersion) {
        this.highVulnerabilityVersion = highVulnerabilityVersion;
    }

    public String getHighVulnerabilityVersionName() {
        return highVulnerabilityVersionName;
    }

    public void setHighVulnerabilityVersionName(final String highVulnerabilityVersionName) {
        this.highVulnerabilityVersionName = highVulnerabilityVersionName;
    }

    public int getMediumVulnerabilityCount() {
        return mediumVulnerabilityCount;
    }

    public void setMediumVulnerabilityCount(final int mediumVulnerabilityCount) {
        this.mediumVulnerabilityCount = mediumVulnerabilityCount;
    }

    public String getMediumVulnerabilityVersion() {
        return mediumVulnerabilityVersion;
    }

    public void setMediumVulnerabilityVersion(final String mediumVulnerabilityVersion) {
        this.mediumVulnerabilityVersion = mediumVulnerabilityVersion;
    }

    public String getMediumVulnerabilityVersionName() {
        return mediumVulnerabilityVersionName;
    }

    public void setMediumVulnerabilityVersionName(final String mediumVulnerabilityVersionName) {
        this.mediumVulnerabilityVersionName = mediumVulnerabilityVersionName;
    }

    public int getLowVulnerabilityCount() {
        return lowVulnerabilityCount;
    }

    public void setLowVulnerabilityCount(final int lowVulnerabilityCount) {
        this.lowVulnerabilityCount = lowVulnerabilityCount;
    }

    public String getLowVulnerabilityVersion() {
        return lowVulnerabilityVersion;
    }

    public void setLowVulnerabilityVersion(final String lowVulnerabilityVersion) {
        this.lowVulnerabilityVersion = lowVulnerabilityVersion;
    }

    public String getLowVulnerabilityVersionName() {
        return lowVulnerabilityVersionName;
    }

    public void setLowVulnerabilityVersionName(final String lowVulnerabilityVersionName) {
        this.lowVulnerabilityVersionName = lowVulnerabilityVersionName;
    }

    public ComponentUnknownVersionStatus getStatus() {
        return status;
    }

    public void setStatus(final ComponentUnknownVersionStatus status) {
        this.status = status;
    }
}
