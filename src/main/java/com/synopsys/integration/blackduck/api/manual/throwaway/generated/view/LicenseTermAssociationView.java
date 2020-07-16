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
package com.synopsys.integration.blackduck.api.manual.throwaway.generated.view;

import java.util.HashMap;
import java.util.Map;

import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.LicenseTermResponsibilityType;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.LicenseTermSourceType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class LicenseTermAssociationView extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String LICENSE_LINK = "license";
    public static final String LICENSE_TERM_LINK = "license-term";

    public static final LinkSingleResponse<LicenseView> LICENSE_LINK_RESPONSE = new LinkSingleResponse<LicenseView>(LICENSE_LINK, LicenseView.class);
    public static final LinkSingleResponse<LicenseTermView> LICENSE_TERM_LINK_RESPONSE = new LinkSingleResponse<LicenseTermView>(LICENSE_TERM_LINK, LicenseTermView.class);

    static {
        links.put(LICENSE_LINK, LICENSE_LINK_RESPONSE);
        links.put(LICENSE_TERM_LINK, LICENSE_TERM_LINK_RESPONSE);
    }

    private LicenseTermSourceType associationSource;
    private Boolean deactivated;
    private Boolean deprecated;
    private String description;
    private Boolean fulfillmentRequired;
    private String name;
    private LicenseTermResponsibilityType responsibility;

    public LicenseTermSourceType getAssociationSource() {
        return associationSource;
    }

    public void setAssociationSource(LicenseTermSourceType associationSource) {
        this.associationSource = associationSource;
    }

    public Boolean getDeactivated() {
        return deactivated;
    }

    public void setDeactivated(Boolean deactivated) {
        this.deactivated = deactivated;
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

    public Boolean getFulfillmentRequired() {
        return fulfillmentRequired;
    }

    public void setFulfillmentRequired(Boolean fulfillmentRequired) {
        this.fulfillmentRequired = fulfillmentRequired;
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

}
