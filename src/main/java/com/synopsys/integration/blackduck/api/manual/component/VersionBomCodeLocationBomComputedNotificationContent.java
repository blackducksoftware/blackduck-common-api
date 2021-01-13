/**
 * blackduck-common-api
 *
 * Copyright (c) 2021 Synopsys, Inc.
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
package com.synopsys.integration.blackduck.api.manual.component;

public class VersionBomCodeLocationBomComputedNotificationContent extends NotificationContentComponent {
    private String projectVersion;
    private String codeLocation;
    private String scanSummary;
    private String snippetScanSummary;

    public String getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
    }

    public String getCodeLocation() {
        return codeLocation;
    }

    public void setCodeLocation(String codeLocation) {
        this.codeLocation = codeLocation;
    }

    public String getScanSummary() {
        return scanSummary;
    }

    public void setScanSummary(String scanSummary) {
        this.scanSummary = scanSummary;
    }

    public String getSnippetScanSummary() {
        return snippetScanSummary;
    }

    public void setSnippetScanSummary(String snippetScanSummary) {
        this.snippetScanSummary = snippetScanSummary;
    }

}
