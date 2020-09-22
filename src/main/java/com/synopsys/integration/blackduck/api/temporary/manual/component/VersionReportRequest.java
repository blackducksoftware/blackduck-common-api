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
package com.synopsys.integration.blackduck.api.temporary.manual.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.deprecated.enumeration.ReportFormatType;
import com.synopsys.integration.blackduck.api.temporary.manual.enumeration.ReportType;
import com.synopsys.integration.blackduck.api.temporary.manual.enumeration.VersionReportRequestCategoriesType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionReportRequest extends BlackDuckComponent {
    private java.util.List<VersionReportRequestCategoriesType> categories;
    private ReportFormatType reportFormat;
    private ReportType reportType;
    private String reportUrl;
    private String url;
    private String versionId;

    public java.util.List<VersionReportRequestCategoriesType> getCategories() {
        return categories;
    }

    public void setCategories(java.util.List<VersionReportRequestCategoriesType> categories) {
        this.categories = categories;
    }

    public ReportFormatType getReportFormat() {
        return reportFormat;
    }

    public void setReportFormat(ReportFormatType reportFormat) {
        this.reportFormat = reportFormat;
    }

    public ReportType getReportType() {
        return reportType;
    }

    public void setReportType(ReportType reportType) {
        this.reportType = reportType;
    }

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

}
