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
package com.synopsys.integration.blackduck.api.manual.temporary.component;

import com.synopsys.integration.blackduck.api.core.BlackDuckComponent;
import com.synopsys.integration.blackduck.api.generated.deprecated.component.CompositePathWithArchiveContext;
import com.synopsys.integration.blackduck.api.manual.temporary.enumeration.SourceEntryFileBomMatchType;
import com.synopsys.integration.blackduck.api.manual.temporary.enumeration.SourceEntryType;

//this file should not be edited - if changes are necessary, the generator should be updated, then this file should be re-created
public class SourceEntryView extends BlackDuckComponent {
    private java.util.List<PolicyStatusSummary> activePolicies;
    private Integer activePolicyCount;
    private Boolean anyMatchPresent;
    private Long compositeId;
    private CompositePathWithArchiveContext compositePath;
    private DeclaredComponentPath declaredComponentPath;
    private SourceEntryFileBomMatchType fileBomMatchType;
    private java.util.List<FileBomComponent> fileDependencyBomComponents;
    private FileBomComponent fileMatchBomComponent;
    private LicenseDefinition fileMatchComponentLicense;
    private String fileMatchComponentName;
    private String fileMatchComponentUsage;
    private Boolean fileMatchPresent;
    private SignaturePair fileSignaturePair;
    private java.util.List<FileSnippetBomComponent> fileSnippetBomComponents;
    private String name;
    private java.util.List<FileBomComponent> partialFileMatchBomComponents;
    private String policyApprovalStatus;
    private java.util.List<UserDataView> policyOverriddenBySet;
    private String scanId;
    private Long size;
    private Boolean sourceUploaded;
    private SourceEntryType type;
    private String uri;

    public java.util.List<PolicyStatusSummary> getActivePolicies() {
        return activePolicies;
    }

    public void setActivePolicies(java.util.List<PolicyStatusSummary> activePolicies) {
        this.activePolicies = activePolicies;
    }

    public Integer getActivePolicyCount() {
        return activePolicyCount;
    }

    public void setActivePolicyCount(Integer activePolicyCount) {
        this.activePolicyCount = activePolicyCount;
    }

    public Boolean getAnyMatchPresent() {
        return anyMatchPresent;
    }

    public void setAnyMatchPresent(Boolean anyMatchPresent) {
        this.anyMatchPresent = anyMatchPresent;
    }

    public Long getCompositeId() {
        return compositeId;
    }

    public void setCompositeId(Long compositeId) {
        this.compositeId = compositeId;
    }

    public CompositePathWithArchiveContext getCompositePath() {
        return compositePath;
    }

    public void setCompositePath(CompositePathWithArchiveContext compositePath) {
        this.compositePath = compositePath;
    }

    public DeclaredComponentPath getDeclaredComponentPath() {
        return declaredComponentPath;
    }

    public void setDeclaredComponentPath(DeclaredComponentPath declaredComponentPath) {
        this.declaredComponentPath = declaredComponentPath;
    }

    public SourceEntryFileBomMatchType getFileBomMatchType() {
        return fileBomMatchType;
    }

    public void setFileBomMatchType(SourceEntryFileBomMatchType fileBomMatchType) {
        this.fileBomMatchType = fileBomMatchType;
    }

    public java.util.List<FileBomComponent> getFileDependencyBomComponents() {
        return fileDependencyBomComponents;
    }

    public void setFileDependencyBomComponents(java.util.List<FileBomComponent> fileDependencyBomComponents) {
        this.fileDependencyBomComponents = fileDependencyBomComponents;
    }

    public FileBomComponent getFileMatchBomComponent() {
        return fileMatchBomComponent;
    }

    public void setFileMatchBomComponent(FileBomComponent fileMatchBomComponent) {
        this.fileMatchBomComponent = fileMatchBomComponent;
    }

    public LicenseDefinition getFileMatchComponentLicense() {
        return fileMatchComponentLicense;
    }

    public void setFileMatchComponentLicense(LicenseDefinition fileMatchComponentLicense) {
        this.fileMatchComponentLicense = fileMatchComponentLicense;
    }

    public String getFileMatchComponentName() {
        return fileMatchComponentName;
    }

    public void setFileMatchComponentName(String fileMatchComponentName) {
        this.fileMatchComponentName = fileMatchComponentName;
    }

    public String getFileMatchComponentUsage() {
        return fileMatchComponentUsage;
    }

    public void setFileMatchComponentUsage(String fileMatchComponentUsage) {
        this.fileMatchComponentUsage = fileMatchComponentUsage;
    }

    public Boolean getFileMatchPresent() {
        return fileMatchPresent;
    }

    public void setFileMatchPresent(Boolean fileMatchPresent) {
        this.fileMatchPresent = fileMatchPresent;
    }

    public SignaturePair getFileSignaturePair() {
        return fileSignaturePair;
    }

    public void setFileSignaturePair(SignaturePair fileSignaturePair) {
        this.fileSignaturePair = fileSignaturePair;
    }

    public java.util.List<FileSnippetBomComponent> getFileSnippetBomComponents() {
        return fileSnippetBomComponents;
    }

    public void setFileSnippetBomComponents(java.util.List<FileSnippetBomComponent> fileSnippetBomComponents) {
        this.fileSnippetBomComponents = fileSnippetBomComponents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public java.util.List<FileBomComponent> getPartialFileMatchBomComponents() {
        return partialFileMatchBomComponents;
    }

    public void setPartialFileMatchBomComponents(java.util.List<FileBomComponent> partialFileMatchBomComponents) {
        this.partialFileMatchBomComponents = partialFileMatchBomComponents;
    }

    public String getPolicyApprovalStatus() {
        return policyApprovalStatus;
    }

    public void setPolicyApprovalStatus(String policyApprovalStatus) {
        this.policyApprovalStatus = policyApprovalStatus;
    }

    public java.util.List<UserDataView> getPolicyOverriddenBySet() {
        return policyOverriddenBySet;
    }

    public void setPolicyOverriddenBySet(java.util.List<UserDataView> policyOverriddenBySet) {
        this.policyOverriddenBySet = policyOverriddenBySet;
    }

    public String getScanId() {
        return scanId;
    }

    public void setScanId(String scanId) {
        this.scanId = scanId;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Boolean getSourceUploaded() {
        return sourceUploaded;
    }

    public void setSourceUploaded(Boolean sourceUploaded) {
        this.sourceUploaded = sourceUploaded;
    }

    public SourceEntryType getType() {
        return type;
    }

    public void setType(SourceEntryType type) {
        this.type = type;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

}
