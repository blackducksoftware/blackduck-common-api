/*
 * blackduck-common-api
 *
 * Copyright (c) 2023 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LiteVersionsProjectVersionView extends BlackDuckView {
    private String bomLastUpdated;
    private String integrationServerName;
    private String projectName;
    private String serverType;
    private String versionName;

    public String getBomLastUpdated() {
        return bomLastUpdated;
    }

    public void setBomLastUpdated(String bomLastUpdated) {
        this.bomLastUpdated = bomLastUpdated;
    }

    public String getIntegrationServerName() {
        return integrationServerName;
    }

    public void setIntegrationServerName(String integrationServerName) {
        this.integrationServerName = integrationServerName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

}
