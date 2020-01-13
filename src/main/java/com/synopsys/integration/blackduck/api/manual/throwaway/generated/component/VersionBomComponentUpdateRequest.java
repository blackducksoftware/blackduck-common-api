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
package com.synopsys.integration.blackduck.api.manual.throwaway.generated.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.CustomFieldValueBulkRequestEntry;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.component.VersionBomComponentOriginUpdateRequest;
import com.synopsys.integration.blackduck.api.manual.throwaway.generated.enumeration.MatchedFileUsagesType;

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
