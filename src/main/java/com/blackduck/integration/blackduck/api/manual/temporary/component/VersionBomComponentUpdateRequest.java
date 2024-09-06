/*
 * blackduck-common-api
 *
 * Copyright (c) 2024 Synopsys, Inc.
 *
 * Use subject to the terms and conditions of the Synopsys End User Software License and Maintenance Agreement. All rights reserved worldwide.
 */
package com.blackduck.integration.blackduck.api.manual.temporary.component;

import com.blackduck.integration.blackduck.api.core.BlackDuckComponent;
import com.blackduck.integration.blackduck.api.generated.deprecated.enumeration.MatchedFileUsagesType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class VersionBomComponentUpdateRequest extends BlackDuckComponent {
    private String component;
    private String componentModification;
    private Boolean componentModified;
    private String componentPurpose;
    private String componentVersion;
    private java.util.List<CustomFieldValueBulkRequestEntry> customFields;
    private java.util.List<VersionBomComponentOriginUpdateRequest> origins;
    private java.util.List<MatchedFileUsagesType> usages;

    public String getComponent() {
        return component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getComponentModification() {
        return componentModification;
    }

    public void setComponentModification(String componentModification) {
        this.componentModification = componentModification;
    }

    public Boolean getComponentModified() {
        return componentModified;
    }

    public void setComponentModified(Boolean componentModified) {
        this.componentModified = componentModified;
    }

    public String getComponentPurpose() {
        return componentPurpose;
    }

    public void setComponentPurpose(String componentPurpose) {
        this.componentPurpose = componentPurpose;
    }

    public String getComponentVersion() {
        return componentVersion;
    }

    public void setComponentVersion(String componentVersion) {
        this.componentVersion = componentVersion;
    }

    public java.util.List<CustomFieldValueBulkRequestEntry> getCustomFields() {
        return customFields;
    }

    public void setCustomFields(java.util.List<CustomFieldValueBulkRequestEntry> customFields) {
        this.customFields = customFields;
    }

    public java.util.List<VersionBomComponentOriginUpdateRequest> getOrigins() {
        return origins;
    }

    public void setOrigins(java.util.List<VersionBomComponentOriginUpdateRequest> origins) {
        this.origins = origins;
    }

    public java.util.List<MatchedFileUsagesType> getUsages() {
        return usages;
    }

    public void setUsages(java.util.List<MatchedFileUsagesType> usages) {
        this.usages = usages;
    }

}
