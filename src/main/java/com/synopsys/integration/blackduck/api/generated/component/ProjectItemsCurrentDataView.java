/*
* blackduck-common-api
*
* Copyright (c) 2021 Synopsys, Inc.
*
* Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
*/
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ProjectItemsCurrentDataView extends BlackDuckComponent {
    private String comment;
    private String componentName;
    private String componentVersion;
    private String remediationStatus;
    private String vulnerabilityId;
    private String vulnerabilitySource;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getComponentVersion() {
        return componentVersion;
    }

    public void setComponentVersion(String componentVersion) {
        this.componentVersion = componentVersion;
    }

    public String getRemediationStatus() {
        return remediationStatus;
    }

    public void setRemediationStatus(String remediationStatus) {
        this.remediationStatus = remediationStatus;
    }

    public String getVulnerabilityId() {
        return vulnerabilityId;
    }

    public void setVulnerabilityId(String vulnerabilityId) {
        this.vulnerabilityId = vulnerabilityId;
    }

    public String getVulnerabilitySource() {
        return vulnerabilitySource;
    }

    public void setVulnerabilitySource(String vulnerabilitySource) {
        this.vulnerabilitySource = vulnerabilitySource;
    }

}
