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
package com.synopsys.integration.blackduck.api.manual.throwaway.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.LinkResponse;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.LicenseTermCategorySummaryView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.UserSummaryView;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.LicenseTermResponsibilityType;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.LicenseTermSourceType;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.view.LicenseTermAssociationView;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseTermView extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String LICENSE_TERM_LICENSES_LINK = "license-term-licenses";

    public static final LinkMultipleResponses<LicenseTermAssociationView> LICENSE_TERM_LICENSES_LINK_RESPONSE = new LinkMultipleResponses<LicenseTermAssociationView>(LICENSE_TERM_LICENSES_LINK, LicenseTermAssociationView.class);

    static {
        links.put(LICENSE_TERM_LICENSES_LINK, LICENSE_TERM_LICENSES_LINK_RESPONSE);
    }

    private LicenseTermCategorySummaryView category;
    private java.util.Date createdAt;
    private UserSummaryView createdBy;
    private Boolean deprecated;
    private String description;
    private String name;
    private LicenseTermResponsibilityType responsibility;
    private LicenseTermSourceType source;
    private java.util.Date updatedAt;
    private UserSummaryView updatedBy;

    public LicenseTermCategorySummaryView getCategory() {
        return category;
    }

    public void setCategory(LicenseTermCategorySummaryView category) {
        this.category = category;
    }

    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    public UserSummaryView getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(UserSummaryView createdBy) {
        this.createdBy = createdBy;
    }

    public Boolean getDeprecated() {
        return deprecated;
    }

    public void setDeprecated(Boolean deprecated) {
        this.deprecated = deprecated;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LicenseTermResponsibilityType getResponsibility() {
        return responsibility;
    }

    public void setResponsibility(LicenseTermResponsibilityType responsibility) {
        this.responsibility = responsibility;
    }

    public LicenseTermSourceType getSource() {
        return source;
    }

    public void setSource(LicenseTermSourceType source) {
        this.source = source;
    }

    public java.util.Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserSummaryView getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(UserSummaryView updatedBy) {
        this.updatedBy = updatedBy;
    }

}
