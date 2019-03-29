/**
 * blackduck-common-api
 *
 * Copyright (c) 2019 Synopsys, Inc.
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
package com.synopsys.integration.blackduck.api.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.component.TextByteOffsetView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class OriginLicenseFileLevelDataView extends BlackDuckComponent {
    private String archivePath;
    private String downloadSha1;
    private String licenseGroupName;
    private String licenseName;
    private java.util.List<TextByteOffsetView> offsets;
    private String path;

    public String getArchivePath() {
        return archivePath;
    }

    public void setArchivePath(String archivePath) {
        this.archivePath = archivePath;
    }

    public String getDownloadSha1() {
        return downloadSha1;
    }

    public void setDownloadSha1(String downloadSha1) {
        this.downloadSha1 = downloadSha1;
    }

    public String getLicenseGroupName() {
        return licenseGroupName;
    }

    public void setLicenseGroupName(String licenseGroupName) {
        this.licenseGroupName = licenseGroupName;
    }

    public String getLicenseName() {
        return licenseName;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    public java.util.List<TextByteOffsetView> getOffsets() {
        return offsets;
    }

    public void setOffsets(java.util.List<TextByteOffsetView> offsets) {
        this.offsets = offsets;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
