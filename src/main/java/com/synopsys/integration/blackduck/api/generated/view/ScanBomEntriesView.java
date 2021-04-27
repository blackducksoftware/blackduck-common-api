/*
* blackduck-common-api
*
* Copyright (c) 2021 Synopsys, Inc.
*
* Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
*/
package com.synopsys.integration.blackduck.api.generated.view;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.core.BlackDuckView;
import com.synopsys.integration.blackduck.api.generated.component.ScanBomEntriesItemsLicenseView;

// this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class ScanBomEntriesView extends BlackDuckView {
    private String component;
    private String componentName;
    private String componentVersion;
    private String componentVersionName;
    private String externalId;
    private String externalNamespace;
    private java.util.List<String> kbFilePaths;
    private ScanBomEntriesItemsLicenseView license;
    private String matchType;

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
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

    public String getComponentVersionName() {
        return componentVersionName;
    }

    public void setComponentVersionName(String componentVersionName) {
        this.componentVersionName = componentVersionName;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getExternalNamespace() {
        return externalNamespace;
    }

    public void setExternalNamespace(String externalNamespace) {
        this.externalNamespace = externalNamespace;
    }

    public java.util.List<String> getKbFilePaths() {
        return kbFilePaths;
    }

    public void setKbFilePaths(java.util.List<String> kbFilePaths) {
        this.kbFilePaths = kbFilePaths;
    }

    public ScanBomEntriesItemsLicenseView getLicense() {
        return license;
    }

    public void setLicense(ScanBomEntriesItemsLicenseView license) {
        this.license = license;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }

}
