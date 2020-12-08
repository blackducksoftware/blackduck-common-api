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
package com.synopsys.integration.blackduck.api.generated.view;

import java.util.HashMap;
import java.util.Map;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.core.response.LinkMultipleResponses;
import com.synopsys.integration.blackduck.api.core.response.LinkResponse;
import com.synopsys.integration.blackduck.api.core.response.LinkSingleResponse;
import com.synopsys.integration.blackduck.api.generated.enumeration.ComponentVersionType;
import com.synopsys.integration.blackduck.api.generated.enumeration.LicenseStatusType;
import com.synopsys.integration.blackduck.api.generated.enumeration.OriginSourceType;
import com.synopsys.integration.blackduck.api.generated.response.ComponentVersionRemediatingView;
import com.synopsys.integration.blackduck.api.generated.response.ComponentVersionUpgradeGuidanceView;
import com.synopsys.integration.blackduck.api.generated.view.ComponentVersionLicenseView;
import com.synopsys.integration.blackduck.api.generated.view.ComponentView;
import com.synopsys.integration.blackduck.api.generated.view.OriginView;
import com.synopsys.integration.blackduck.api.generated.view.VulnerabilityView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ComponentVersionView extends BlackDuckView {
    public static final Map<String, LinkResponse> links = new HashMap<>();

    public static final String COMPONENT_LINK = "component";
    public static final String ORIGINS_LINK = "origins";
    public static final String REMEDIATING_LINK = "remediating";
    public static final String UPGRADE_GUIDANCE_LINK = "upgrade-guidance";
    public static final String VULNERABILITIES_LINK = "vulnerabilities";

    public static final LinkSingleResponse<ComponentView> COMPONENT_LINK_RESPONSE = new LinkSingleResponse<ComponentView>(COMPONENT_LINK, ComponentView.class);
    public static final LinkMultipleResponses<OriginView> ORIGINS_LINK_RESPONSE = new LinkMultipleResponses<OriginView>(ORIGINS_LINK, OriginView.class);
    public static final LinkSingleResponse<ComponentVersionRemediatingView> REMEDIATING_LINK_RESPONSE = new LinkSingleResponse<ComponentVersionRemediatingView>(REMEDIATING_LINK, ComponentVersionRemediatingView.class);
    public static final LinkSingleResponse<ComponentVersionUpgradeGuidanceView> UPGRADE_GUIDANCE_LINK_RESPONSE = new LinkSingleResponse<ComponentVersionUpgradeGuidanceView>(UPGRADE_GUIDANCE_LINK, ComponentVersionUpgradeGuidanceView.class);
    public static final LinkMultipleResponses<VulnerabilityView> VULNERABILITIES_LINK_RESPONSE = new LinkMultipleResponses<VulnerabilityView>(VULNERABILITIES_LINK, VulnerabilityView.class);

    static {
        links.put(COMPONENT_LINK, COMPONENT_LINK_RESPONSE);
        links.put(ORIGINS_LINK, ORIGINS_LINK_RESPONSE);
        links.put(REMEDIATING_LINK, REMEDIATING_LINK_RESPONSE);
        links.put(UPGRADE_GUIDANCE_LINK, UPGRADE_GUIDANCE_LINK_RESPONSE);
        links.put(VULNERABILITIES_LINK, VULNERABILITIES_LINK_RESPONSE);
    }

    private java.util.List<String> additionalHomepages;
    private LicenseStatusType approvalStatus;
    private ComponentVersionLicenseView license;
    private Boolean migrated;
    private String notes;
    private java.util.Date releasedOn;
    private OriginSourceType source;
    private ComponentVersionType type;
    private String versionName;

    public java.util.List<String> getAdditionalHomepages() {
        return additionalHomepages;
    }

    public void setAdditionalHomepages(java.util.List<String> additionalHomepages) {
        this.additionalHomepages = additionalHomepages;
    }

    public LicenseStatusType getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(LicenseStatusType approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public ComponentVersionLicenseView getLicense() {
        return license;
    }

    public void setLicense(ComponentVersionLicenseView license) {
        this.license = license;
    }

    public Boolean getMigrated() {
        return migrated;
    }

    public void setMigrated(Boolean migrated) {
        this.migrated = migrated;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public java.util.Date getReleasedOn() {
        return releasedOn;
    }

    public void setReleasedOn(java.util.Date releasedOn) {
        this.releasedOn = releasedOn;
    }

    public OriginSourceType getSource() {
        return source;
    }

    public void setSource(OriginSourceType source) {
        this.source = source;
    }

    public ComponentVersionType getType() {
        return type;
    }

    public void setType(ComponentVersionType type) {
        this.type = type;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

}
